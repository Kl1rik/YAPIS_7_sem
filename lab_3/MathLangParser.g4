   parser grammar MathLangParser;
    
    options {
      tokenVocab = MathLangLexer;
    }
    
    // Стартовое правило (программа может содержать функции и выражения)
    program: (function_definition | statement)+;
    
    // Правило для подпрограмм
    function_definition
        : FUNC ID LPAREN parameters? RPAREN  LBRACE block RBRACE  
        ;
    
    // Параметры функции
    parameters
        : ID (COMMA ID)*  # ParameterList
        ;
    
    block
        : statement*   # BlockStatement
        ;
    
    // Выражение
    expr
        : expr PLUS expr   # AddExpr
        | expr MINUS expr  # SubtractExpr
        | expr MULT expr   # MultiplyExpr
        | expr DIV expr    # DivideExpr
        | expr MOD expr    # ModExpr
        | expr POW expr    # PowExpr
        | expr GT expr    # GTExpr
        | expr LT expr    # LTExpr
        | expr EQ expr    # EQExpr
        | expr NEQ expr    # NEQExpr
        | expr GTE expr    # GTEExpr
        | expr LTE expr     # LTEExpr
        | LPAREN expr RPAREN  # ParenExpr
        | function_call         # FunctionCallExpr
        | if_statement             # IfStatement
        | switch_statement         # SwitchStatement
        | for_statement            # ForStatement
        | while_statement          # WhileStatement
        | INT_LITERAL        # IntLiteral
        | FLOAT_LITERAL      # FloatLiteral
        | ID                 # VarExpr
        ;
        
    // Правило для условных операторов if-else
    if_statement
        : IF LPAREN expr RPAREN LBRACE block RBRACE (ELSE LBRACE block RBRACE)? # IfElseStatement
        ;
    
    // Правило для switch-case
    switch_statement
        : SWITCH LPAREN expr RPAREN LBRACE case_block RBRACE 
        ;
    
    case_block
        : (CASE expr COLON block)* (DEFAULT COLON block)?  # CaseBlock
        ;
    
    update
        : ID (PLUS EQ expr | MINUS EQ expr | PLUS PLUS | MINUS MINUS)? 
        ;
        
    // Правило для цикла for
    for_statement
        : FOR LPAREN assignment expr SEMI update RPAREN LBRACE block RBRACE 
        ;
    
    // Правило для цикла while
    while_statement
        : WHILE LPAREN expr RPAREN LBRACE block RBRACE 
        ;
        
    
    // Вызов функции
    function_call
        : ID LPAREN argument_list? RPAREN  # FunctionCall
        ;
        
    // Аргументы функции
    argument_list
        : expr (COMMA expr)*  # ArgumentList
        ;
    
    // Оператор присваивания
    assignment
        : ID ASSIGN expr SEMI  # AssignmentStmt
        ;
    
    return_statement
        : RETURN expr SEMI 
        ;
    // Стейтмент (операторы в блоке)
    statement
        : assignment         # AssignmentStatement
        | expr SEMI          # ExpressionStatement
        | return_statement   # ReturnStatement 
        ;