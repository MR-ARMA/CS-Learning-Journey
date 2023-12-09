// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//HWs//HW_2//gen//main.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mainParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mainParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(mainParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(mainParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(mainParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(mainParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rule_minus}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRule_minus(mainParser.Rule_minusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rule_minus}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRule_minus(mainParser.Rule_minusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rule_plus}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRule_plus(mainParser.Rule_plusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rule_plus}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRule_plus(mainParser.Rule_plusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rule3}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRule3(mainParser.Rule3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code rule3}
	 * labeled alternative in {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRule3(mainParser.Rule3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(mainParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(mainParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(mainParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(mainParser.FactContext ctx);
}