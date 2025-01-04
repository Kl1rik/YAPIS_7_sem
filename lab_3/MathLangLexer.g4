
lexer grammar MathLangLexer;
    
    PLUS: '+';
    MINUS: '-';
    MULT: '*';
    DIV: '/';
    MOD: '%';
    POW: '^';
    ASSIGN: '=';
    LPAREN: '(';
    RPAREN: ')';
    LBRACE: '{'; 
    RBRACE: '}';
    COLON: ':';
    COMMA: ',';
    SEMI: ';';
    FUNC: 'func';
    RETURN: 'return'; 
    GT: '>';
    LT: '<';
    EQ: '==';
    NEQ: '!=';
    GTE: '>=';
    LTE: '<=';
    
    IF: 'if';
    ELSE: 'else';
    SWITCH: 'switch';
    CASE: 'case';
    DEFAULT: 'default';
    FOR: 'for';
    WHILE: 'while';
    ID: [a-zA-Z_][a-zA-Z0-9_]*;
    INT_LITERAL: [0-9]+;
    FLOAT_LITERAL: [0-9]+'.'[0-9]+;
    
    
    WS: [ \t]+ -> skip;  
    NEWLINE: [\r\n]+ -> skip; 
    
    
