// Generated from pas.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pasParser}.
 */
public interface pasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pasParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pasParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pasParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pasParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pasParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(pasParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(pasParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(pasParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(pasParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(pasParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(pasParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(pasParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(pasParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(pasParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(pasParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(pasParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(pasParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(pasParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(pasParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(pasParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(pasParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void enterStatementPart(pasParser.StatementPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#statementPart}.
	 * @param ctx the parse tree
	 */
	void exitStatementPart(pasParser.StatementPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(pasParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(pasParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pasParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pasParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(pasParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(pasParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallStatement(pasParser.ProcedureCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#procedureCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallStatement(pasParser.ProcedureCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pasParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pasParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pasParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pasParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pasParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pasParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(pasParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(pasParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(pasParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(pasParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pasParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pasParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(pasParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(pasParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pasParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pasParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pasParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pasParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(pasParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(pasParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(pasParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(pasParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pasParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(pasParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pasParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(pasParser.MultiplyingOperatorContext ctx);
}