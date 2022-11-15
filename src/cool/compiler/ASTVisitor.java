package cool.compiler;

public interface ASTVisitor<T> {
    T visit(If iff);
    T visit(While whilee);
    T visit(Program program);

    T visit(Int intt);

    T visit(Attribute id);

    T visit(Bool bool);

    T visit(Assign assign);

    T visit(Stringg stringg);

    T visit(Neg neg);

    T visit(Relational relational);

    T visit(ClassDefinition classDefinition);

    T visit(Method method);

    T visit(Formal formal);

    T visit(Id id);

    T visit(PlusMinus plusMinus);

    T visit(MultDiv multDiv);

    T visit(Paren paren);

    T visit(Not not);
}
