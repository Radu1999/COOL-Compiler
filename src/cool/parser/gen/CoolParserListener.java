// Generated from E:/CPL/COOL Compiler/src/cool/parser\CoolParser.g4 by ANTLR 4.10.1

    package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(CoolParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(CoolParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#attributeDef}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDef(CoolParser.AttributeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#attributeDef}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDef(CoolParser.AttributeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(CoolParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(CoolParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#variable_def}.
	 * @param ctx the parse tree
	 */
	void enterVariable_def(CoolParser.Variable_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#variable_def}.
	 * @param ctx the parse tree
	 */
	void exitVariable_def(CoolParser.Variable_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(CoolParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(CoolParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#method_def}.
	 * @param ctx the parse tree
	 */
	void enterMethod_def(CoolParser.Method_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#method_def}.
	 * @param ctx the parse tree
	 */
	void exitMethod_def(CoolParser.Method_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 */
	void enterCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#case_option}.
	 * @param ctx the parse tree
	 */
	void exitCase_option(CoolParser.Case_optionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg_expr}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg_expr(CoolParser.Neg_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg_expr}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg_expr(CoolParser.Neg_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(CoolParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(CoolParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(CoolParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(CoolParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(CoolParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(CoolParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(CoolParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(CoolParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_brace}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_brace(CoolParser.Expr_braceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_brace}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_brace(CoolParser.Expr_braceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImplDispatch(CoolParser.ImplDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImplDispatch(CoolParser.ImplDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_call}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(CoolParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_call}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(CoolParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoolParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoolParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_paren(CoolParser.Expr_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_paren(CoolParser.Expr_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CoolParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CoolParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(CoolParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(CoolParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CoolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CoolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CoolParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CoolParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExplDispatch(CoolParser.ExplDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explDispatch}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExplDispatch(CoolParser.ExplDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelational(CoolParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelational(CoolParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CoolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CoolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoolParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoolParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(CoolParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(CoolParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CoolParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CoolParser.AssignContext ctx);
}