package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserTParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(ParserTParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParserTParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(ParserTParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#content_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_block(ParserTParser.Content_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ParserTParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#for_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_operation(ParserTParser.For_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(ParserTParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(ParserTParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(ParserTParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(ParserTParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(ParserTParser.RaizContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSen(ParserTParser.SenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(ParserTParser.LogContext ctx);
}