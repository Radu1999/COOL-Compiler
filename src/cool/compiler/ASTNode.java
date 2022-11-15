package cool.compiler;

import org.antlr.v4.runtime.Token;

import java.util.List;

public abstract class ASTNode {
    // Reținem un token descriptiv, pentru a putea afișa ulterior
    // informații legate de linia și coloana eventualelor erori semantice.
    Token token;

    ASTNode(Token token) {
        this.token = token;
    }

    public abstract <T> T accept(ASTVisitor<T> visitor);
}


abstract class Expression extends ASTNode {
    Expression(Token token) {
        super(token);
    }
}

abstract class ClassContent extends  ASTNode {

    ClassContent(Token token) {
        super(token);
    }
}
class ClassDefinition extends ASTNode {
    String name;
    Token baseName;
    List<ClassContent> content;
    ClassDefinition(String name, Token baseName, List<ClassContent> content, Token token) {
        super(token);
        this.name = name;
        this.baseName = baseName;
        this.content = content;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Program extends ASTNode {
    List<ClassDefinition> classDefs;

    Program(List<ClassDefinition> defs, Token token) {
        super(token);
        this.classDefs = defs;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}



class If extends Expression {
    Expression cond;
    Expression thenBranch;
    Expression elseBranch;

    If(Expression cond,
       Expression thenBranch,
       Expression elseBranch,
       Token start) {
        super(start);
        this.cond = cond;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class While extends Expression {
    Expression cond;
    Expression body;

    While(Expression cond,
       Expression body,
       Token start) {
        super(start);
        this.cond = cond;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Attribute extends ClassContent {
    Token name;
    Token type;
    Expression value;

    public Attribute(Token name, Token type, Expression value) {
        super(name);
        this.name = name;
        this.type = type;
        this.value = value;
    }


    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Method extends  ClassContent {
    Token name;
    Token retType;

    Expression body;

    List<Formal> params;

    Method(Token name, Token retType, Expression body, List<Formal> params) {
        super(name);
        this.retType = retType;
        this.body = body;
        this.name = name;
        this.params = params;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Formal extends ASTNode {
    Token type;
    Token name;
    Formal(Token name, Token type) {
        super(name);
        this.name = name;
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Int extends Expression {
    Int(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Id extends Expression {
    Id(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Stringg extends Expression {
    Stringg(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


class Bool extends Expression {
    Bool(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Assign extends Expression {
    Token name;
    Expression expr;

    Assign(Token name, Expression expr, Token token) {
        super(token);
        this.name = name;
        this.expr = expr;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Neg extends Expression {
    Expression expr;
    Neg(Expression expr, Token token) {
        super(token);
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Relational extends Expression {
    Expression leftExpr;
    Expression rightExpr;

    Relational(Expression leftExpr, Expression rightExpr, Token token) {
        super(token);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class PlusMinus extends Expression {
    Expression leftExpr;
    Expression rightExpr;

    PlusMinus(Expression leftExpr, Expression rightExpr, Token token) {
        super(token);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class MultDiv extends Expression {
    Expression leftExpr;
    Expression rightExpr;

    MultDiv(Expression leftExpr, Expression rightExpr, Token token) {
        super(token);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Paren extends Expression {
    Expression expr;

    Paren(Expression e, Token token) {
        super(token);
        this.expr = e;
    }
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Not extends Expression {
    Expression expr;
    Not(Expression expr, Token token) {
        super(token);
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

