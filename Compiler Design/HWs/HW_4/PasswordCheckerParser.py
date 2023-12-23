# Generated from PasswordChecker.g4 by ANTLR 4.13.1
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
        4,1,3,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,1,1,
        0,1,2,7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,
        0,0,7,8,7,0,0,0,8,3,1,0,0,0,0
    ]

class PasswordCheckerParser ( Parser ):

    grammarFileName = "PasswordChecker.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'true'", "'false'" ]

    symbolicNames = [ "<INVALID>", "PASSWORD_VALID", "PASSWORD_INVALID", 
                      "WS" ]

    RULE_startRule = 0
    RULE_password = 1

    ruleNames =  [ "startRule", "password" ]

    EOF = Token.EOF
    PASSWORD_VALID=1
    PASSWORD_INVALID=2
    WS=3

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def password(self):
            return self.getTypedRuleContext(PasswordCheckerParser.PasswordContext,0)


        def EOF(self):
            return self.getToken(PasswordCheckerParser.EOF, 0)

        def getRuleIndex(self):
            return PasswordCheckerParser.RULE_startRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStartRule" ):
                listener.enterStartRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStartRule" ):
                listener.exitStartRule(self)




    def startRule(self):

        localctx = PasswordCheckerParser.StartRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_startRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.password()
            self.state = 5
            self.match(PasswordCheckerParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PasswordContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PASSWORD_VALID(self):
            return self.getToken(PasswordCheckerParser.PASSWORD_VALID, 0)

        def PASSWORD_INVALID(self):
            return self.getToken(PasswordCheckerParser.PASSWORD_INVALID, 0)

        def getRuleIndex(self):
            return PasswordCheckerParser.RULE_password

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPassword" ):
                listener.enterPassword(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPassword" ):
                listener.exitPassword(self)




    def password(self):

        localctx = PasswordCheckerParser.PasswordContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_password)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            _la = self._input.LA(1)
            if not(_la==1 or _la==2):
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





