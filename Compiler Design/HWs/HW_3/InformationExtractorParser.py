# Generated from InformationExtractor.g4 by ANTLR 4.13.1
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
        4,1,8,81,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,
        1,0,1,0,1,0,1,0,1,0,1,0,4,0,21,8,0,11,0,12,0,22,1,0,1,0,1,1,4,1,
        28,8,1,11,1,12,1,29,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,
        1,3,1,3,1,3,1,4,4,4,47,8,4,11,4,12,4,48,1,4,1,4,4,4,53,8,4,11,4,
        12,4,54,1,5,4,5,58,8,5,11,5,12,5,59,1,5,1,5,4,5,64,8,5,11,5,12,5,
        65,1,5,1,5,4,5,70,8,5,11,5,12,5,71,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,
        6,0,0,7,0,2,4,6,8,10,12,0,0,85,0,20,1,0,0,0,2,27,1,0,0,0,4,31,1,
        0,0,0,6,39,1,0,0,0,8,46,1,0,0,0,10,57,1,0,0,0,12,73,1,0,0,0,14,21,
        3,2,1,0,15,21,3,4,2,0,16,21,3,6,3,0,17,21,3,8,4,0,18,21,3,10,5,0,
        19,21,3,12,6,0,20,14,1,0,0,0,20,15,1,0,0,0,20,16,1,0,0,0,20,17,1,
        0,0,0,20,18,1,0,0,0,20,19,1,0,0,0,21,22,1,0,0,0,22,20,1,0,0,0,22,
        23,1,0,0,0,23,24,1,0,0,0,24,25,5,0,0,1,25,1,1,0,0,0,26,28,5,7,0,
        0,27,26,1,0,0,0,28,29,1,0,0,0,29,27,1,0,0,0,29,30,1,0,0,0,30,3,1,
        0,0,0,31,32,5,6,0,0,32,33,5,1,0,0,33,34,5,6,0,0,34,35,5,2,0,0,35,
        36,5,6,0,0,36,37,5,1,0,0,37,38,5,6,0,0,38,5,1,0,0,0,39,40,5,7,0,
        0,40,41,5,7,0,0,41,42,5,7,0,0,42,43,5,7,0,0,43,44,5,7,0,0,44,7,1,
        0,0,0,45,47,5,7,0,0,46,45,1,0,0,0,47,48,1,0,0,0,48,46,1,0,0,0,48,
        49,1,0,0,0,49,50,1,0,0,0,50,52,5,1,0,0,51,53,5,7,0,0,52,51,1,0,0,
        0,53,54,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,9,1,0,0,0,56,58,5,
        7,0,0,57,56,1,0,0,0,58,59,1,0,0,0,59,57,1,0,0,0,59,60,1,0,0,0,60,
        61,1,0,0,0,61,63,5,1,0,0,62,64,5,7,0,0,63,62,1,0,0,0,64,65,1,0,0,
        0,65,63,1,0,0,0,65,66,1,0,0,0,66,67,1,0,0,0,67,69,5,1,0,0,68,70,
        5,7,0,0,69,68,1,0,0,0,70,71,1,0,0,0,71,69,1,0,0,0,71,72,1,0,0,0,
        72,11,1,0,0,0,73,74,5,3,0,0,74,75,5,4,0,0,75,76,5,5,0,0,76,77,5,
        6,0,0,77,78,5,1,0,0,78,79,5,6,0,0,79,13,1,0,0,0,8,20,22,29,48,54,
        59,65,71
    ]

class InformationExtractorParser ( Parser ):

    grammarFileName = "InformationExtractor.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'.'", "'@'", "'http'", "'s'", "'://'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "ID", "DIGIT", "WS" ]

    RULE_startRule = 0
    RULE_nationalNumber = 1
    RULE_email = 2
    RULE_postalCode = 3
    RULE_decimalNumber = 4
    RULE_softwareVersion = 5
    RULE_websiteAddress = 6

    ruleNames =  [ "startRule", "nationalNumber", "email", "postalCode", 
                   "decimalNumber", "softwareVersion", "websiteAddress" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    ID=6
    DIGIT=7
    WS=8

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

        def EOF(self):
            return self.getToken(InformationExtractorParser.EOF, 0)

        def nationalNumber(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.NationalNumberContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.NationalNumberContext,i)


        def email(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.EmailContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.EmailContext,i)


        def postalCode(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.PostalCodeContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.PostalCodeContext,i)


        def decimalNumber(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.DecimalNumberContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.DecimalNumberContext,i)


        def softwareVersion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.SoftwareVersionContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.SoftwareVersionContext,i)


        def websiteAddress(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(InformationExtractorParser.WebsiteAddressContext)
            else:
                return self.getTypedRuleContext(InformationExtractorParser.WebsiteAddressContext,i)


        def getRuleIndex(self):
            return InformationExtractorParser.RULE_startRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStartRule" ):
                listener.enterStartRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStartRule" ):
                listener.exitStartRule(self)




    def startRule(self):

        localctx = InformationExtractorParser.StartRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_startRule)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 14
                    self.nationalNumber()
                    pass

                elif la_ == 2:
                    self.state = 15
                    self.email()
                    pass

                elif la_ == 3:
                    self.state = 16
                    self.postalCode()
                    pass

                elif la_ == 4:
                    self.state = 17
                    self.decimalNumber()
                    pass

                elif la_ == 5:
                    self.state = 18
                    self.softwareVersion()
                    pass

                elif la_ == 6:
                    self.state = 19
                    self.websiteAddress()
                    pass


                self.state = 22 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 200) != 0)):
                    break

            self.state = 24
            self.match(InformationExtractorParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NationalNumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.DIGIT)
            else:
                return self.getToken(InformationExtractorParser.DIGIT, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_nationalNumber

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNationalNumber" ):
                listener.enterNationalNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNationalNumber" ):
                listener.exitNationalNumber(self)




    def nationalNumber(self):

        localctx = InformationExtractorParser.NationalNumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_nationalNumber)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 26
                    self.match(InformationExtractorParser.DIGIT)

                else:
                    raise NoViableAltException(self)
                self.state = 29 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EmailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.ID)
            else:
                return self.getToken(InformationExtractorParser.ID, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_email

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEmail" ):
                listener.enterEmail(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEmail" ):
                listener.exitEmail(self)




    def email(self):

        localctx = InformationExtractorParser.EmailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_email)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(InformationExtractorParser.ID)
            self.state = 32
            self.match(InformationExtractorParser.T__0)
            self.state = 33
            self.match(InformationExtractorParser.ID)
            self.state = 34
            self.match(InformationExtractorParser.T__1)
            self.state = 35
            self.match(InformationExtractorParser.ID)
            self.state = 36
            self.match(InformationExtractorParser.T__0)
            self.state = 37
            self.match(InformationExtractorParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PostalCodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.DIGIT)
            else:
                return self.getToken(InformationExtractorParser.DIGIT, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_postalCode

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPostalCode" ):
                listener.enterPostalCode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPostalCode" ):
                listener.exitPostalCode(self)




    def postalCode(self):

        localctx = InformationExtractorParser.PostalCodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_postalCode)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(InformationExtractorParser.DIGIT)
            self.state = 40
            self.match(InformationExtractorParser.DIGIT)
            self.state = 41
            self.match(InformationExtractorParser.DIGIT)
            self.state = 42
            self.match(InformationExtractorParser.DIGIT)
            self.state = 43
            self.match(InformationExtractorParser.DIGIT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DecimalNumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.DIGIT)
            else:
                return self.getToken(InformationExtractorParser.DIGIT, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_decimalNumber

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDecimalNumber" ):
                listener.enterDecimalNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDecimalNumber" ):
                listener.exitDecimalNumber(self)




    def decimalNumber(self):

        localctx = InformationExtractorParser.DecimalNumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_decimalNumber)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 45
                self.match(InformationExtractorParser.DIGIT)
                self.state = 48 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==7):
                    break

            self.state = 50
            self.match(InformationExtractorParser.T__0)
            self.state = 52 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 51
                    self.match(InformationExtractorParser.DIGIT)

                else:
                    raise NoViableAltException(self)
                self.state = 54 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SoftwareVersionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.DIGIT)
            else:
                return self.getToken(InformationExtractorParser.DIGIT, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_softwareVersion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSoftwareVersion" ):
                listener.enterSoftwareVersion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSoftwareVersion" ):
                listener.exitSoftwareVersion(self)




    def softwareVersion(self):

        localctx = InformationExtractorParser.SoftwareVersionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_softwareVersion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 56
                self.match(InformationExtractorParser.DIGIT)
                self.state = 59 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==7):
                    break

            self.state = 61
            self.match(InformationExtractorParser.T__0)
            self.state = 63 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 62
                self.match(InformationExtractorParser.DIGIT)
                self.state = 65 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==7):
                    break

            self.state = 67
            self.match(InformationExtractorParser.T__0)
            self.state = 69 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 68
                    self.match(InformationExtractorParser.DIGIT)

                else:
                    raise NoViableAltException(self)
                self.state = 71 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WebsiteAddressContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(InformationExtractorParser.ID)
            else:
                return self.getToken(InformationExtractorParser.ID, i)

        def getRuleIndex(self):
            return InformationExtractorParser.RULE_websiteAddress

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWebsiteAddress" ):
                listener.enterWebsiteAddress(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWebsiteAddress" ):
                listener.exitWebsiteAddress(self)




    def websiteAddress(self):

        localctx = InformationExtractorParser.WebsiteAddressContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_websiteAddress)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(InformationExtractorParser.T__2)
            self.state = 74
            self.match(InformationExtractorParser.T__3)
            self.state = 75
            self.match(InformationExtractorParser.T__4)
            self.state = 76
            self.match(InformationExtractorParser.ID)
            self.state = 77
            self.match(InformationExtractorParser.T__0)
            self.state = 78
            self.match(InformationExtractorParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





