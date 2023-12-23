// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//HWs//HW_3//InformationExtractor.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InformationExtractorParser}.
 */
public interface InformationExtractorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(InformationExtractorParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(InformationExtractorParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#nationalNumber}.
	 * @param ctx the parse tree
	 */
	void enterNationalNumber(InformationExtractorParser.NationalNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#nationalNumber}.
	 * @param ctx the parse tree
	 */
	void exitNationalNumber(InformationExtractorParser.NationalNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(InformationExtractorParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(InformationExtractorParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#postalCode}.
	 * @param ctx the parse tree
	 */
	void enterPostalCode(InformationExtractorParser.PostalCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#postalCode}.
	 * @param ctx the parse tree
	 */
	void exitPostalCode(InformationExtractorParser.PostalCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#decimalNumber}.
	 * @param ctx the parse tree
	 */
	void enterDecimalNumber(InformationExtractorParser.DecimalNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#decimalNumber}.
	 * @param ctx the parse tree
	 */
	void exitDecimalNumber(InformationExtractorParser.DecimalNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#softwareVersion}.
	 * @param ctx the parse tree
	 */
	void enterSoftwareVersion(InformationExtractorParser.SoftwareVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#softwareVersion}.
	 * @param ctx the parse tree
	 */
	void exitSoftwareVersion(InformationExtractorParser.SoftwareVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InformationExtractorParser#websiteAddress}.
	 * @param ctx the parse tree
	 */
	void enterWebsiteAddress(InformationExtractorParser.WebsiteAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link InformationExtractorParser#websiteAddress}.
	 * @param ctx the parse tree
	 */
	void exitWebsiteAddress(InformationExtractorParser.WebsiteAddressContext ctx);
}