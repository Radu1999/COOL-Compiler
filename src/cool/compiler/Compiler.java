package cool.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;


public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }
        
        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;
        
        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;
        
        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);
            
            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);
                

            // Test lexer only.
//            tokenStream.fill();
//            List<Token> tokens = tokenStream.getTokens();
//            tokens.stream().forEach(token -> {
//                var text = token.getText();
//                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
//
//                System.out.println(text + " : " + name);
//                //System.out.println(token);
//            });

            
            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);
            
            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;
                
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                                        line + ":" + (charPositionInLine + 1) + ", ";
                    
                    Token token = (Token)offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;
                    
                    System.err.println(newMsg);
                    errors = true;
                }
            };
            
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            
            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));
                    
            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }
            
            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }
        
        // TODO Print tree

        var astConstructionVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                return new Program(ctx.classes.stream().map(arg -> (ClassDefinition) visit(arg)).collect(Collectors.toList()),
                        ctx.start);
            }

            @Override
            public ASTNode visitClass_def(CoolParser.Class_defContext ctx) {
                return new ClassDefinition(ctx.name.getText(), ctx.base,
                        ctx.body.stream()
                                .map(element -> (ClassContent) visit(element)).collect(Collectors.toList()),
                        ctx.name);
            }

            @Override
            public ASTNode visitAttributeDef(CoolParser.AttributeDefContext ctx) {
                return new Attribute(ctx.name, ctx.type, ctx.value != null ? (Expression) visit(ctx.value) : null);
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return new Int(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitBool(CoolParser.BoolContext ctx) {
                return new Bool(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitString(CoolParser.StringContext ctx) {
                return new Bool(ctx.STRING().getSymbol());
            }

            @Override
            public ASTNode visitMethod_def(CoolParser.Method_defContext ctx) {
                return new Method(ctx.name, ctx.return_, ctx.body.stream().map(expr -> (Expression) visit(expr)).collect(Collectors.toList()),
                    ctx.params.stream().map(param -> (Formal) visit(param)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitFormal_param(CoolParser.Formal_paramContext ctx) {
                return new Formal(ctx.name, ctx.type);
            }

            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return new Id(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitMultDiv(CoolParser.MultDivContext ctx) {
                return new MultDiv((Expression) visit(ctx.left), (Expression) visit(ctx.right),
                        ctx.op);
            }

            @Override
            public ASTNode visitPlusMinus(CoolParser.PlusMinusContext ctx) {
                return new PlusMinus((Expression) visit(ctx.left), (Expression) visit(ctx.right),
                        ctx.op);
            }

            @Override
            public ASTNode visitExpr_paren(CoolParser.Expr_parenContext ctx) {
                return new Paren((Expression) visit(ctx.expr()), ctx.start);
            }

            @Override
            public ASTNode visitNeg(CoolParser.NegContext ctx) {
                return new Neg((Expression) visit(ctx.expr()), ctx.start);
            }

            @Override
            public ASTNode visitRelational(CoolParser.RelationalContext ctx) {
                return new Relational((Expression) visit(ctx.left),  (Expression) visit(ctx.right), ctx.op);
            }

            @Override
            public ASTNode visitNot(CoolParser.NotContext ctx) {
                return new Not((Expression) visit(ctx.expr()), ctx.start);
            }

            @Override
            public ASTNode visitAssign(CoolParser.AssignContext ctx) {
                return new Assign(ctx.name, (Expression) visit(ctx.expr()), ctx.start);
            }

            @Override
            public ASTNode visitIsvoid(CoolParser.IsvoidContext ctx) {
                return new IsVoid((Expression) visit(ctx.expr()), ctx.start);
            }

            @Override
            public ASTNode visitNew(CoolParser.NewContext ctx) {
                return new New(ctx.TYPE().getSymbol());
            }

            @Override
            public ASTNode visitImplDispatch(CoolParser.ImplDispatchContext ctx) {
                return new ImplicitDispatch(ctx.name, ctx.params
                                                        .stream()
                                                        .map(param -> (Expression) visit(param))
                                                        .collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitExplDispatch(CoolParser.ExplDispatchContext ctx) {
                    return new ExplicitDispatch((Expression) visit(ctx.caller), ctx.realCaller, ctx.name,
                                ctx.params.stream().map(param -> (Expression) visit(param)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitIf(CoolParser.IfContext ctx) {
                return new If((Expression) visit(ctx.cond), (Expression) visit(ctx.thenBranch), (Expression) visit(ctx.elseBranch), ctx.start);
            }

            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                return new While((Expression) visit(ctx.cond), (Expression) visit(ctx.body), ctx.start);
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                return new Let(ctx.members.stream().map(member -> (VariableDef) visit(member)).collect(Collectors.toList()),
                        (Expression) visit(ctx.body), ctx.start);
            }

            @Override
            public ASTNode visitVariable_def(CoolParser.Variable_defContext ctx) {
                return new VariableDef(ctx.name, ctx.type, (Expression) visit(ctx.expr()));
            }

            @Override
            public ASTNode visitCase_option(CoolParser.Case_optionContext ctx) {
                return new CaseOption(ctx.name, ctx.type, (Expression) visit(ctx.body));
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                return new Case((Expression) visit(ctx.var),
                               ctx.options.stream().map(option -> (CaseOption) visit(option)).collect(Collectors.toList()),
                               ctx.start);
            }
        };

        var ast = astConstructionVisitor.visit(globalTree);
        var printVisitor = new ASTVisitor<Void>() {
            int indent = 0;
            @Override
            public Void visit(If iff) {
                printIndent("if");
                indent++;
                iff.cond.accept(this);
                iff.thenBranch.accept(this);
                iff.elseBranch.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(While whilee) {
                printIndent("while");
                indent++;
                whilee.cond.accept(this);
                whilee.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Program program) {
                printIndent("program");
                indent++;
                for(var classDef : program.classDefs) {
                    classDef.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public  Void visit(ClassDefinition classDefinition) {
                String baseName = classDefinition.baseName != null ? classDefinition.baseName.getText() : "";
                printIndent("class");
                indent++;
                printIndent(classDefinition.name);
                if(baseName.length() > 0) {
                    printIndent(baseName);
                }
                for(var classContent : classDefinition.content) {
                    classContent.accept(this);
                }
                indent--;
                return null;
            }
            @Override
            public Void visit(Int intt) {
                printIndent(intt.token.getText());
                return null;
            }

            @Override
            public Void visit(Attribute id) {
                printIndent("attribute");
                indent++;
                printIndent(id.name.getText());
                printIndent(id.type.getText());
                if(id.value != null) {
                    id.value.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Bool bool) {
                printIndent(bool.token.getText());
                return null;
            }

            @Override
            public Void visit(Assign assign) {
                printIndent("<-");
                indent++;
                printIndent(assign.name.getText());
                assign.expr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Stringg stringg) {
                printIndent(stringg.token.getText());
                return null;
            }

            @Override
            public Void visit(Neg neg) {
                printIndent("~");
                indent++;
                neg.expr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Relational relational) {
                printIndent(relational.token.getText());
                indent++;
                relational.leftExpr.accept(this);
                relational.rightExpr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Method method) {
                printIndent("method");
                indent++;
                printIndent(method.name.getText());
                for(Formal param : method.params) {
                    param.accept(this);
                }
                printIndent(method.retType.getText());
                for(Expression expr : method.body) {
                    expr.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Formal formal) {
                printIndent("formal");
                indent++;
                printIndent(formal.name.getText());
                printIndent(formal.type.getText());
                indent--;
                return null;
            }

            @Override
            public Void visit(Id id) {
                printIndent(id.token.getText());
                return null;
            }

            @Override
            public Void visit(PlusMinus plusMinus) {
                printIndent(plusMinus.token.getText());
                indent++;
                plusMinus.leftExpr.accept(this);
                plusMinus.rightExpr.accept(this);
                indent--;
                return null;
            }

            public Void visit(MultDiv multDiv) {
                printIndent(multDiv.token.getText());
                indent++;
                multDiv.leftExpr.accept(this);
                multDiv.rightExpr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Paren paren) {
                paren.expr.accept(this);
                return null;
            }

            @Override
            public Void visit(Not not) {
                printIndent("not");
                indent++;
                not.expr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(New neww) {
                printIndent("new");
                indent++;
                printIndent(neww.token.getText());
                indent--;
                return null;
            }

            @Override
            public Void visit(IsVoid isVoid) {
                printIndent("isvoid");
                indent++;
                isVoid.expr.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(ImplicitDispatch implicitDispatch) {
                printIndent("implicit dispatch");
                indent++;
                printIndent(implicitDispatch.name.getText());
                for(Expression param : implicitDispatch.params) {
                    param.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(ExplicitDispatch explicitDispatch) {
                printIndent(".");
                indent++;
                explicitDispatch.caller.accept(this);
                if(explicitDispatch.realCaller != null) {
                    printIndent(explicitDispatch.realCaller.getText());
                }
                printIndent(explicitDispatch.name.getText());
                for(Expression param : explicitDispatch.params) {
                    param.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(VariableDef variableDef) {
                printIndent("local");
                indent++;
                printIndent(variableDef.name.getText());
                printIndent(variableDef.type.getText());
                if(variableDef.expr != null) {
                    variableDef.expr.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Let let) {
                printIndent("let");
                indent++;
                for(VariableDef variableDef : let.localVars) {
                    variableDef.accept(this);
                }
                let.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(CaseOption caseOption) {
                printIndent("case branch");
                indent++;
                printIndent(caseOption.name.getText());
                printIndent(caseOption.type.getText());
                caseOption.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Case casee) {
                printIndent("case");
                indent++;
                casee.var.accept(this);
                for(CaseOption caseOption : casee.options) {
                    caseOption.accept(this);
                }
                indent--;
                return null;
            }

            void printIndent(String str) {
                for (int i = 0; i < indent; i++)
                    System.out.print("  ");
                System.out.println(str);
            }
        };
        ast.accept(printVisitor);
    }
}
