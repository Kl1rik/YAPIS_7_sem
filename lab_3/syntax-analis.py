import sys
from antlr4 import *

from MathLangLexer import MathLangLexer
from MathLangParser import MathLangParser

example_code_1 = """
func myFunc(a, b) {
    return a + b;
}

if (a > b) {
    a = a - b;
} else {
    a = a + b;
};
"""


example_code_2 = """

func myFunc(a, b) {
    return a + b;
}

if (a > b) {
    a = a - b;
} else {
    a = a + b;asdaasd
}

"""



class MathLangErrorListener(ErrorNode):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(f"Ошибка синтаксиса в строке {line}, колонка {column}: {msg}")
        
        print(f"Неправильный символ: {offendingSymbol}")

def main():
    
    
    print("Выберите фрагмент кода (1/2)")
    choice_code = int(input())
    if choice_code == 1:
        input_stream = InputStream(example_code_1)
    elif choice_code == 2:
        input_stream = InputStream(example_code_2)

    
    lexer = MathLangLexer(input_stream)
    stream = CommonTokenStream(lexer)

    
    parser = MathLangParser(stream)

   
    parser.removeErrorListeners()  
    parser.addErrorListener(MathLangErrorListener())  

    
    try:
        tree = parser.program()  
        print("Дерево разбора:")
        print(tree.toStringTree(recog=parser))  
    except Exception as e:
        print("Ошибка разбора:", str(e))

if __name__ == '__main__':
    main()
