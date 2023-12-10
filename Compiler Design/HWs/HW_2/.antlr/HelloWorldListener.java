// Generated from c://Users//admin//Desktop//CS-Learning-Journey//Compiler Design//HWs//HW_2//HelloWorld.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(HelloWorldParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(HelloWorldParser.SContext ctx);
}