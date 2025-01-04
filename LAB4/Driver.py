import antlr4
from antlr4 import *
from BytecodeCompiler import MyLanguageBytecodeCompiler
from gen.MyLanguageParserLexer import MyLanguageParserLexer as MyLanguageLexer
from gen.MyLanguageParserParser import MyLanguageParserParser as MyLanguageParser
from SemanticAnalyzer import SemanticAnalyzer
from Compiler import MyLanguageCompiler
import subprocess

def analyze_code(code):
    input_stream = InputStream(code)
    lexer = MyLanguageLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = MyLanguageParser(token_stream)
    tree = parser.program()
    print(tree.toStringTree(recog=parser))
    analyzer = SemanticAnalyzer()
    try:
        analyzer.visit(tree)

        return True,  "Semantic analysis successful!", tree # Success
    except Exception as e:
        return False, str(e), tree # Failure

def compile_to_bytecode(input_code):
    input_stream = InputStream(input_code)
    lexer = MyLanguageLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = MyLanguageParser(token_stream)
    tree = parser.program()

    compiler = MyLanguageBytecodeCompiler()
    bytecode = compiler.compile(tree)

    return bytecode



with open("example0.txt", "r") as f:
    code = f.read()
    success, message, tree = analyze_code(code)
    print(message)
    compiler = MyLanguageCompiler()
    compiled_code = compiler.visit(tree)
    with open("Ccode.c", "w") as text_file:
        text_file.write(compiled_code)

    subprocess.run(["clang", "-c", "Ccode.c", "-o", "Ccode.o"], check = True)
    subprocess.run(["clang", "Ccode.o", "-o", "Ccode.exe"], check = True)
    
    'print(compiled_code)'
    
    '''with open("Bytecode.txt", "w") as byte_file:
        byte_list = ''.join(str(x) for x in compile_to_bytecode(code)) 
        byte_file.write(byte_list)
    
        print(compile_to_bytecode(code))'''



'''with open("example1.txt", "r") as f:
    code = f.read()
    success, message = analyze_code(code)
    print(message)

with open("example2.txt", "r") as f:
    code = f.read()
    success, message = analyze_code(code)
    print(message)'''