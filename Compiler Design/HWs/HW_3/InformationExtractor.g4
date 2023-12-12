grammar InformationExtractor;

// Parser rules

startRule : (nationalNumber | email | postalCode | decimalNumber | softwareVersion | websiteAddress)+ EOF ;

nationalNumber : DIGIT+ ;

email : ID '.' ID '@' ID '.' ID ;

postalCode : DIGIT DIGIT DIGIT DIGIT DIGIT ;

decimalNumber : DIGIT+ '.' DIGIT+ ;

softwareVersion : DIGIT+ '.' DIGIT+ '.' DIGIT+ ;

websiteAddress : 'http' 's' '://' ID '.' ID ;

// Lexer rules

ID : [a-zA-Z]+ ;

DIGIT : [0-9] ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
