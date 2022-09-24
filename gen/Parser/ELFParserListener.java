// Generated from /Users/michaelchung/Documents/410/ELF/src/Parser/ELFParser.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link ELFParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ELFParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ELFParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link ELFParser#propertyClause}.
	 * @param ctx the parse tree
	 */
	void enterPropertyClause(ELFParser.PropertyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#propertyClause}.
	 * @param ctx the parse tree
	 */
	void exitPropertyClause(ELFParser.PropertyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ELFParser#locationClause}.
	 * @param ctx the parse tree
	 */
	void enterLocationClause(ELFParser.LocationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#locationClause}.
	 * @param ctx the parse tree
	 */
	void exitLocationClause(ELFParser.LocationClauseContext ctx);
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
	 * Enter a parse tree produced by {@link ELFParser#touchedClause}.
	 * @param ctx the parse tree
	 */
	void enterTouchedClause(ELFParser.TouchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ELFParser#touchedClause}.
	 * @param ctx the parse tree
	 */
	void exitTouchedClause(ELFParser.TouchedClauseContext ctx);
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