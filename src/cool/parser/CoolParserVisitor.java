// Generated from E:/CPL/COOL Compiler/src/cool/parser\CoolParser.g4 by ANTLR 4.10.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(CoolParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#attributeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDef(CoolParser.AttributeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(CoolParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#variable_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_def(CoolParser.Variable_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(CoolParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#method_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_def(CoolParser.Method_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg_expr}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_expr(CoolParser.Neg_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(CoolParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(CoolParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CoolParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CoolParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_brace}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_brace(CoolParser.Expr_braceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplDispatch(CoolParser.ImplDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method_call}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(CoolParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(CoolParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_paren(CoolParser.Expr_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CoolParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(CoolParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CoolParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(CoolParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplDispatch(CoolParser.ExplDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(CoolParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(CoolParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CoolParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(CoolParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(CoolParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CoolParser.AssignContext ctx);
}