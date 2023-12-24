# Generated from operation.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .operationParser import operationParser
else:
    from operationParser import operationParser

# This class defines a complete listener for a parse tree produced by operationParser.
class operationListener(ParseTreeListener):

    # Enter a parse tree produced by operationParser#start.
    def enterStart(self, ctx:operationParser.StartContext):
        pass

    # Exit a parse tree produced by operationParser#start.
    def exitStart(self, ctx:operationParser.StartContext):
        pass


    # Enter a parse tree produced by operationParser#prog.
    def enterProg(self, ctx:operationParser.ProgContext):
        pass

    # Exit a parse tree produced by operationParser#prog.
    def exitProg(self, ctx:operationParser.ProgContext):
        pass


    # Enter a parse tree produced by operationParser#assign.
    def enterAssign(self, ctx:operationParser.AssignContext):
        pass

    # Exit a parse tree produced by operationParser#assign.
    def exitAssign(self, ctx:operationParser.AssignContext):
        pass


    # Enter a parse tree produced by operationParser#expr.
    def enterExpr(self, ctx:operationParser.ExprContext):
        pass

    # Exit a parse tree produced by operationParser#expr.
    def exitExpr(self, ctx:operationParser.ExprContext):
        pass


    # Enter a parse tree produced by operationParser#term.
    def enterTerm(self, ctx:operationParser.TermContext):
        pass

    # Exit a parse tree produced by operationParser#term.
    def exitTerm(self, ctx:operationParser.TermContext):
        pass


    # Enter a parse tree produced by operationParser#factor.
    def enterFactor(self, ctx:operationParser.FactorContext):
        pass

    # Exit a parse tree produced by operationParser#factor.
    def exitFactor(self, ctx:operationParser.FactorContext):
        pass


    # Enter a parse tree produced by operationParser#number.
    def enterNumber(self, ctx:operationParser.NumberContext):
        pass

    # Exit a parse tree produced by operationParser#number.
    def exitNumber(self, ctx:operationParser.NumberContext):
        pass



del operationParser