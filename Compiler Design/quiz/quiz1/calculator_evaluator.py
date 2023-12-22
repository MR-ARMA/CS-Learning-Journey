from antlr4 import *
from CalculatorLexer import CalculatorLexer
from CalculatorParser import CalculatorParser


class MyListener(ParseTreeListener):
    def enterExpr(self, ctx):
        print("Enter expression:", ctx.getText())

def parse_input(input_string):
    input_stream = InputStream(input_string)
    lexer = CalculatorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CalculatorParser(stream)

    tree = parser.expr()
    walker = ParseTreeWalker()
    walker.walk(MyListener(), tree)

if __name__ == '__main__':
    input_string = "3*2+6-(7/9)+7^3*9-10"
    parse_input(input_string)
