parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}


class_body: attributeDef
            | method_def;

attributeDef: name=ID COLON type=TYPE (ASSIGN value=expr)? SEMI;

class_def: CLASS name=TYPE (INHERITS base=TYPE)? LBRACE (body+=class_body)*  RBRACE SEMI;

variable_def:
    ID COLON TYPE (ASSIGN expr)?;

formal_param:
    name=ID COLON type=TYPE;

method_def:
    name=ID LPAREN (params += formal_param (COMMA params += formal_param)*)? RPAREN COLON return=TYPE LBRACE body=expr RBRACE SEMI;

program
    :   (classes += class_def)* EOF
    ;

case_option: ID COLON TYPE RARROW body=expr SEMI;

expr
    :	IF cond=expr THEN thenBranch=expr ELSE elseBranch=expr FI	# if
    |   WHILE cond=expr LOOP body=expr POOL                         # while
    |	ID                                                          # id
    |	INT                                                         # int
    |   BOOL                                                        # bool
    |   STRING                                                      # string
    |   NEG expr                                                    # neg
    |   LPAREN expr RPAREN                                          # expr_paren
    |   LBRACE expr RBRACE                                          # expr_brace
    |   MINUS expr                                                  # neg_expr
    |   left=expr op=(MULT | DIV) right=expr                        # multDiv
    |   left=expr op=(PLUS | MINUS) right=expr                      # plusMinus
    |   left=expr op=(LT | LE | EQUAL) right=expr                   # relational
    |   ID ASSIGN expr                                              # assign
    |   ID LPAREN ((expr COMMA)*expr)? RPAREN                       # method_call
    |   NOT expr                                                    # not
    |   ISVOID op=expr                                              # isvoid
    |   NEW TYPE                                                    # new
    |   CASE var=expr OF (options+=case_option)+ ESAC               # case
    |   LET members+=variable_def (COMMA members+=variable_def)* IN body=expr # let
    ;


