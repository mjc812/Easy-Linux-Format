// Generated from /Users/michaelchung/Documents/410/DSL Project/Project1Group16/src/Parser/ELFParser.g4 by ANTLR 4.10.1
package Parser;
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
	 * Visit a parse tree produced by {@link ELFParser#statementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementType(ELFParser.StatementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(ELFParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ELFParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#getType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetType(ELFParser.GetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#getCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCondition(ELFParser.GetConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ELFParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#commandChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandChoice(ELFParser.CommandChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(ELFParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#deleteChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteChoice(ELFParser.DeleteChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(ELFParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#moveChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveChoice(ELFParser.MoveChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy(ELFParser.CopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#copyChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyChoice(ELFParser.CopyChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(ELFParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#commandCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandCondition(ELFParser.CommandConditionContext ctx);
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
	 * Visit a parse tree produced by {@link ELFParser#nameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameClause(ELFParser.NameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#nameCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameCondition(ELFParser.NameConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#modifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiedClause(ELFParser.ModifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#dateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateClause(ELFParser.DateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ELFParser#dateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateCondition(ELFParser.DateConditionContext ctx);
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