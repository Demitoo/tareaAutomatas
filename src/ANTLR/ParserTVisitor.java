package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link ParserTParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(@NotNull ParserTParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(@NotNull ParserTParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(@NotNull ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#content_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_block(@NotNull ParserTParser.Content_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull ParserTParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull ParserTParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(@NotNull ParserTParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(@NotNull ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull ParserTParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull ParserTParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull ParserTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(@NotNull ParserTParser.RaizContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(@NotNull ParserTParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ParserTParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(@NotNull ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull ParserTParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSen(@NotNull ParserTParser.SenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull ParserTParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#for_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_operation(@NotNull ParserTParser.For_operationContext ctx);
}