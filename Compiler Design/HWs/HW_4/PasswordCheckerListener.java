// Generated from PasswordChecker.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PasswordCheckerParser}.
 */
public interface PasswordCheckerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PasswordCheckerParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(PasswordCheckerParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasswordCheckerParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(PasswordCheckerParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PasswordCheckerParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(PasswordCheckerParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PasswordCheckerParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(PasswordCheckerParser.PasswordContext ctx);
}