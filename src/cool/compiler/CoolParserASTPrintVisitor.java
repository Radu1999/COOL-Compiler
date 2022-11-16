package cool.compiler;

public class CoolParserASTPrintVisitor implements ASTVisitor<Void>{
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

    @Override
    public Void visit(Block block) {
        printIndent("block");
        indent++;
        if(block.body != null)
            for(Expression expr : block.body) {
                expr.accept(this);
            }
        indent--;
        return null;
    }

    void printIndent(String str) {
        for (int i = 0; i < indent; i++)
            System.out.print("  ");
        System.out.println(str);
    }
}
