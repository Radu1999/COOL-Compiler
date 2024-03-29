lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;	
}

@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

WS
    :   [ \n\f\r\t]+ -> skip
    ;

/* if
 */
IF : 'if';

THEN : 'then';

ELSE : 'else';

FI : 'fi';

/* case */
CASE : 'case';
OF : 'of';
ESAC : 'esac';

/* while */
WHILE : 'while';
LOOP : 'loop';
POOL : 'pool';

/* For class definition */
CLASS: 'class';
INHERITS: 'inherits';

/* Identifier.
 */
fragment UPPER_LETTER: [A-Z];
fragment LOWER_LETTER: [a-z];
fragment LETTER: [a-zA-Z];


/* Bool */
BOOL : 'true' | 'false';

/* Line comment */
LINE_COMMENT: '--' (.)*? (NEW_LINE | EOF) -> skip;

/* Parenthesis */
LPAREN : '(';

RPAREN : ')';

LBRACE : '{';

RBRACE : '}';


/* Punctuation */
SEMI : ';';

COLON: ':';

COMMA : ',';

ASSIGN : '<-';

DOT : '.';

AT : '@';

fragment NEW_LINE : '\r'? '\n';

/* Operators */
PLUS : '+';

MINUS : '-';

MULT : '*';

DIV : '/';

IN: 'in';

ISVOID: 'isvoid';

NOT : 'not';

NEW : 'new';

RARROW: '=>';

NEG: '~';

LET : 'let';

TYPE : UPPER_LETTER (DIGIT | ID)*;
ID : (LETTER | '_')(LETTER | '_' | DIGIT)*;


NAME: LOWER_LETTER ID;


/* Comparators */
EQUAL : '=';

LT : '<';

LE : '<=';

/* Integer */
fragment DIGIT : [0-9];
INT : DIGIT+;






/* String */
STRING : '"' ('\\"' | '\\' NEW_LINE  | .)*? ('"' | EOF  { raiseError(" EOF in string constant "); }
        | NEW_LINE { raiseError(" Unterminated string constant "); })
    {
        String str = getText();
        str = str.substring(1, str.length() - 1);
        str = str.replace("\\\r\n", "\r\n")
                .replace("\\\n", "\n")
                .replace("\\n", "\n")
                .replace("\\t", "\t");
        str = str.replaceAll("\\\\(?!\\\\)", "");
        if(str.length() > 1024) {
            raiseError("String constant too long");
        } else if (str.contains("\0")) {
            raiseError("String contains null character");
        } else {
            setText(str);
        }
    };

INVALID_COMMENT: '*)' { raiseError("Unmatched *)"); };

/* Multiline comment */
BLOCK_COMMENT: '(*' (BLOCK_COMMENT | .)*? ('*)' {skip();} |  EOF {raiseError("EOF in comment");});

INVALID: . { raiseError("Invalid character: " + getText()); };