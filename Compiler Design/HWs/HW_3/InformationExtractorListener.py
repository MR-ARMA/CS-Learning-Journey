# Generated from InformationExtractor.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .InformationExtractorParser import InformationExtractorParser
else:
    from InformationExtractorParser import InformationExtractorParser

# This class defines a complete listener for a parse tree produced by InformationExtractorParser.
class InformationExtractorListener(ParseTreeListener):

    # Enter a parse tree produced by InformationExtractorParser#startRule.
    def enterStartRule(self, ctx:InformationExtractorParser.StartRuleContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#startRule.
    def exitStartRule(self, ctx:InformationExtractorParser.StartRuleContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#nationalNumber.
    def enterNationalNumber(self, ctx:InformationExtractorParser.NationalNumberContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#nationalNumber.
    def exitNationalNumber(self, ctx:InformationExtractorParser.NationalNumberContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#email.
    def enterEmail(self, ctx:InformationExtractorParser.EmailContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#email.
    def exitEmail(self, ctx:InformationExtractorParser.EmailContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#postalCode.
    def enterPostalCode(self, ctx:InformationExtractorParser.PostalCodeContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#postalCode.
    def exitPostalCode(self, ctx:InformationExtractorParser.PostalCodeContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#decimalNumber.
    def enterDecimalNumber(self, ctx:InformationExtractorParser.DecimalNumberContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#decimalNumber.
    def exitDecimalNumber(self, ctx:InformationExtractorParser.DecimalNumberContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#softwareVersion.
    def enterSoftwareVersion(self, ctx:InformationExtractorParser.SoftwareVersionContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#softwareVersion.
    def exitSoftwareVersion(self, ctx:InformationExtractorParser.SoftwareVersionContext):
        pass


    # Enter a parse tree produced by InformationExtractorParser#websiteAddress.
    def enterWebsiteAddress(self, ctx:InformationExtractorParser.WebsiteAddressContext):
        pass

    # Exit a parse tree produced by InformationExtractorParser#websiteAddress.
    def exitWebsiteAddress(self, ctx:InformationExtractorParser.WebsiteAddressContext):
        pass



del InformationExtractorParser