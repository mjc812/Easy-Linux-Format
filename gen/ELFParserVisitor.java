// Generated from /Users/michaelchung/Documents/410/Project1Group16/src/Parser/ELFParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ELFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ELFParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ELFParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ELFParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(ELFParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ELFParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ELFParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(ELFParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ELFParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(ELFParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(ELFParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy(ELFParser.CopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#getClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetClause(ELFParser.GetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#commandClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandClause(ELFParser.CommandClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#propertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyClause(ELFParser.PropertyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#locationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationClause(ELFParser.LocationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#nameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameClause(ELFParser.NameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#touchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTouchedClause(ELFParser.TouchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#dateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateClause(ELFParser.DateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#folderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolderClause(ELFParser.FolderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#pathClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathClause(ELFParser.PathClauseContext ctx);
}