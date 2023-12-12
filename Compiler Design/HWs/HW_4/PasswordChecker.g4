// PasswordChecker
grammar PasswordChecker;


// Parser rules
startRule : password EOF;

password : (PASSWORD_VALID | PASSWORD_INVALID);

// Lexer rules
PASSWORD_VALID : 'true';
PASSWORD_INVALID : 'false';

// Skip whitespace
WS : [ \t\r\n]+ -> skip;

