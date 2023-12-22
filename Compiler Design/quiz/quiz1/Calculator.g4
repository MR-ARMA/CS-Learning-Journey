grammar Calculator;

// Parser rules

expr:     primaryExpr
    |      expr op=(MUL|DIV) expr
    |      expr op=(ADD|SUB) expr
    |      expr POW expr
    |      LPAREN expr RPAREN
    ;

primaryExpr:   INT
    |     ID
    ;

// Lexical rules

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^' ;
LPAREN : '(' ;
RPAREN : ')' ;

INT : [0-9]+ ;
ID : [a-zA-Z]+ ;

// Skip whitespace
WS : [ \t\r\n]+ -> skip ;
