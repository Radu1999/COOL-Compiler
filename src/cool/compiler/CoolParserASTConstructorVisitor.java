package cool.compiler;

import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;

import java.util.stream.Collectors;

public class CoolParserASTConstructorVisitor extends CoolParserBaseVisitor<ASTNode> {
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
        return new VariableDef(ctx.name, ctx.type, ctx.expr() != null? (Expression) visit(ctx.expr()) : null);
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

    @Override
    public ASTNode visitBlock(CoolParser.BlockContext ctx) {
        return new Block(ctx.body.stream().map(expr -> (Expression) visit(expr)).collect(Collectors.toList()), ctx.start);
    }
}
