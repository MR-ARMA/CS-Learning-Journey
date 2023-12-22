# Generated from Calculator.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,10,29,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,0,1,0,1,0,3,0,11,8,0,1,0,
        1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,5,0,22,8,0,10,0,12,0,25,9,0,1,1,
        1,1,1,1,0,1,0,2,0,2,0,3,1,0,1,2,1,0,3,4,1,0,8,9,30,0,10,1,0,0,0,
        2,26,1,0,0,0,4,5,6,0,-1,0,5,11,3,2,1,0,6,7,5,6,0,0,7,8,3,0,0,0,8,
        9,5,7,0,0,9,11,1,0,0,0,10,4,1,0,0,0,10,6,1,0,0,0,11,23,1,0,0,0,12,
        13,10,4,0,0,13,14,7,0,0,0,14,22,3,0,0,5,15,16,10,3,0,0,16,17,7,1,
        0,0,17,22,3,0,0,4,18,19,10,2,0,0,19,20,5,5,0,0,20,22,3,0,0,3,21,
        12,1,0,0,0,21,15,1,0,0,0,21,18,1,0,0,0,22,25,1,0,0,0,23,21,1,0,0,
        0,23,24,1,0,0,0,24,1,1,0,0,0,25,23,1,0,0,0,26,27,7,2,0,0,27,3,1,
        0,0,0,3,10,21,23
    ]

class CalculatorParser ( Parser ):

    grammarFileName = "Calculator.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'^'", "'('", 
                     "')'" ]

    symbolicNames = [ "<INVALID>", "MUL", "DIV", "ADD", "SUB", "POW", "LPAREN", 
                      "RPAREN", "INT", "ID", "WS" ]

    RULE_expr = 0
    RULE_primaryExpr = 1

    ruleNames =  [ "expr", "primaryExpr" ]

    EOF = Token.EOF
    MUL=1
    DIV=2
    ADD=3
    SUB=4
    POW=5
    LPAREN=6
    RPAREN=7
    INT=8
    ID=9
    WS=10

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.op = None # Token

        def primaryExpr(self):
            return self.getTypedRuleContext(CalculatorParser.PrimaryExprContext,0)


        def LPAREN(self):
            return self.getToken(CalculatorParser.LPAREN, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CalculatorParser.ExprContext)
            else:
                return self.getTypedRuleContext(CalculatorParser.ExprContext,i)


        def RPAREN(self):
            return self.getToken(CalculatorParser.RPAREN, 0)

        def MUL(self):
            return self.getToken(CalculatorParser.MUL, 0)

        def DIV(self):
            return self.getToken(CalculatorParser.DIV, 0)

        def ADD(self):
            return self.getToken(CalculatorParser.ADD, 0)

        def SUB(self):
            return self.getToken(CalculatorParser.SUB, 0)

        def POW(self):
            return self.getToken(CalculatorParser.POW, 0)

        def getRuleIndex(self):
            return CalculatorParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = CalculatorParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 0
        self.enterRecursionRule(localctx, 0, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8, 9]:
                self.state = 5
                self.primaryExpr()
                pass
            elif token in [6]:
                self.state = 6
                self.match(CalculatorParser.LPAREN)
                self.state = 7
                self.expr(0)
                self.state = 8
                self.match(CalculatorParser.RPAREN)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 23
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 21
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                    if la_ == 1:
                        localctx = CalculatorParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 12
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 13
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==1 or _la==2):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 14
                        self.expr(5)
                        pass

                    elif la_ == 2:
                        localctx = CalculatorParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 15
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 16
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==3 or _la==4):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 17
                        self.expr(4)
                        pass

                    elif la_ == 3:
                        localctx = CalculatorParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 18
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 19
                        self.match(CalculatorParser.POW)
                        self.state = 20
                        self.expr(3)
                        pass

             
                self.state = 25
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class PrimaryExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(CalculatorParser.INT, 0)

        def ID(self):
            return self.getToken(CalculatorParser.ID, 0)

        def getRuleIndex(self):
            return CalculatorParser.RULE_primaryExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrimaryExpr" ):
                listener.enterPrimaryExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrimaryExpr" ):
                listener.exitPrimaryExpr(self)




    def primaryExpr(self):

        localctx = CalculatorParser.PrimaryExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_primaryExpr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            _la = self._input.LA(1)
            if not(_la==8 or _la==9):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[0] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 2)
         




