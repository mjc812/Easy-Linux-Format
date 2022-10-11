// Generated from C:/Users/eliza/OneDrive/Documents/UBC/CPSC-410/Project1Group16/src/Parser\ELFParser.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ELFParser}.
 */
public interface ELFParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ELFParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ELFParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ELFParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(ELFParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(ELFParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ELFParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ELFParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#statementType}.
	 * @param ctx the parse tree
	 */
	void enterStatementType(ELFParser.StatementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#statementType}.
	 * @param ctx the parse tree
	 */
	void exitStatementType(ELFParser.StatementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(ELFParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(ELFParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ELFParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ELFParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#getType}.
	 * @param ctx the parse tree
	 */
	void enterGetType(ELFParser.GetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#getType}.
	 * @param ctx the parse tree
	 */
	void exitGetType(ELFParser.GetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ELFParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ELFParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(ELFParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(ELFParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#deleteChoice}.
	 * @param ctx the parse tree
	 */
	void enterDeleteChoice(ELFParser.DeleteChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#deleteChoice}.
	 * @param ctx the parse tree
	 */
	void exitDeleteChoice(ELFParser.DeleteChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(ELFParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(ELFParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#moveChoice}.
	 * @param ctx the parse tree
	 */
	void enterMoveChoice(ELFParser.MoveChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#moveChoice}.
	 * @param ctx the parse tree
	 */
	void exitMoveChoice(ELFParser.MoveChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#copy}.
	 * @param ctx the parse tree
	 */
	void enterCopy(ELFParser.CopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#copy}.
	 * @param ctx the parse tree
	 */
	void exitCopy(ELFParser.CopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#copyChoice}.
	 * @param ctx the parse tree
	 */
	void enterCopyChoice(ELFParser.CopyChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#copyChoice}.
	 * @param ctx the parse tree
	 */
	void exitCopyChoice(ELFParser.CopyChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(ELFParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(ELFParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#getClause}.
	 * @param ctx the parse tree
	 */
	void enterGetClause(ELFParser.GetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#getClause}.
	 * @param ctx the parse tree
	 */
	void exitGetClause(ELFParser.GetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#commandClause}.
	 * @param ctx the parse tree
	 */
	void enterCommandClause(ELFParser.CommandClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#commandClause}.
	 * @param ctx the parse tree
	 */
	void exitCommandClause(ELFParser.CommandClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#nameClause}.
	 * @param ctx the parse tree
	 */
	void enterNameClause(ELFParser.NameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#nameClause}.
	 * @param ctx the parse tree
	 */
	void exitNameClause(ELFParser.NameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#nameCondition}.
	 * @param ctx the parse tree
	 */
	void enterNameCondition(ELFParser.NameConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#nameCondition}.
	 * @param ctx the parse tree
	 */
	void exitNameCondition(ELFParser.NameConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#ownedClause}.
	 * @param ctx the parse tree
	 */
	void enterOwnedClause(ELFParser.OwnedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#ownedClause}.
	 * @param ctx the parse tree
	 */
	void exitOwnedClause(ELFParser.OwnedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void enterDateClause(ELFParser.DateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#dateClause}.
	 * @param ctx the parse tree
	 */
	void exitDateClause(ELFParser.DateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#dateCondition}.
	 * @param ctx the parse tree
	 */
	void enterDateCondition(ELFParser.DateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#dateCondition}.
	 * @param ctx the parse tree
	 */
	void exitDateCondition(ELFParser.DateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#folderClause}.
	 * @param ctx the parse tree
	 */
	void enterFolderClause(ELFParser.FolderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#folderClause}.
	 * @param ctx the parse tree
	 */
	void exitFolderClause(ELFParser.FolderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#pathClause}.
	 * @param ctx the parse tree
	 */
	void enterPathClause(ELFParser.PathClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#pathClause}.
	 * @param ctx the parse tree
	 */
	void exitPathClause(ELFParser.PathClauseContext ctx);
}