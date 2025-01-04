grammar MyLanguageParser;

program
	: functionDecl* block
	;

block
	: BEGIN statement* END
	| LBRACE statement* RBRACE
	| LPAREN exprList? RPAREN
	;

statement
	: varDecl   	 
	| assignment               	 
	| ifStatement              	 
	| functionCall             	 
	| RETURN expr SEMI
	;

varDecl
	: type ID ASSIGN INT_LIT SEMI
	| type ID SEMI
	| type ID ASSIGN functionCall
	;

assignment
	: ID ASSIGN expr SEMI
	| ID ASSIGN ID SEMI
	| ID ASSIGN functionCall
	;

ifStatement
	: IF expr THEN block ELSE block
	;

functionDecl
	: FUNCTION type ID LPAREN (paramList)? RPAREN block
	;

functionCall
	: ID LPAREN (exprList)? RPAREN SEMI
	;

paramList
	: param (COMMA param)*
	;

param
	: type ID
	| ID
	| INT_LIT
	;

exprList
	: expr (COMMA expr)*
	;

expr
	: expr operand expr
	| LPAREN expr RPAREN
    | ID ASSIGN functionCall
	| ID LPAREN paramList RPAREN
	| INT_LIT
	| ID
	| ID LPAREN expr RPAREN
	| functionCall
	;
    
type
	: DOCUMENT
	| NODE
	| ATTRIBUTE
	| INT
	;
	
operand
    : PLUS
    | MINUS
    | GT
    | LS
    | MULT
    | DIV
    ;

DOCUMENT: 'document';
NODE: 'node';
ATTRIBUTE: 'attribute';
FUNCTION: 'function';
IF: 'if';
THEN: 'then';
ELSE: 'else';
BEGIN: 'begin';
END: 'end';
RETURN: 'return';

INT: 'int';
STRING: 'str';
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
LS: '<';
GT: '>';
DIV: '/';
MULT: '*';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';
COMMA: ',';


ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT_LIT: [0-9]+;
STR_LIT: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;


