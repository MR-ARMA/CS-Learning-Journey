# Generated from .//HelloWorld.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .HelloWorldParser import HelloWorldParser
else:
    from HelloWorldParser import HelloWorldParser

# This class defines a complete listener for a parse tree produced by HelloWorldParser.
class HelloWorldListener(ParseTreeListener):

    # Enter a parse tree produced by HelloWorldParser#s.
    def enterS(self, ctx:HelloWorldParser.SContext):
        pass

    # Exit a parse tree produced by HelloWorldParser#s.
    def exitS(self, ctx:HelloWorldParser.SContext):
        pass



del HelloWorldParser