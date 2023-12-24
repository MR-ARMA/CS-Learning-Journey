grammar operation;



start: prog EOF;



prog: prog assign | assign;

assign: Id ':=' expr (NEWLINE | EOF);

expr:	expr '+' term
    |	expr '-' term
    |	term
    ;

term:	term '*' factor
    |	term '/' factor
    |	factor
    ;

factor:
    '(' expr ')'
    | Id
    | number
    | String
    ;

number  : INT | FLOAT;



/* Lexical Rules */
Id      : LETTER(LETTER|DIGIT)*;   /*    */

INT     : DIGIT+;

FLOAT:
    DIGIT+ '.' DIGIT*
    | '.' DIGIT+ ;

String  :
        '"' (ESC|.)*?;

fragment
        DIGIT: [0-9];
fragment
        LETTER: [a-zA-Z];
fragment
        ESC : '\\"' | '\\\\' ;

WS: [ \t\r]+ -> skip ;
NEWLINE: '\n' ;
RELOP: '<=' | '<' ;