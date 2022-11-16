// Generated from E:/CPL/COOL Compiler/src/cool/parser\CoolParser.g4 by ANTLR 4.10.1

    package cool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, WS=2, IF=3, THEN=4, ELSE=5, FI=6, CASE=7, OF=8, ESAC=9, WHILE=10, 
		LOOP=11, POOL=12, CLASS=13, INHERITS=14, BOOL=15, LINE_COMMENT=16, LPAREN=17, 
		RPAREN=18, LBRACE=19, RBRACE=20, SEMI=21, COLON=22, COMMA=23, ASSIGN=24, 
		DOT=25, AT=26, PLUS=27, MINUS=28, MULT=29, DIV=30, IN=31, ISVOID=32, NOT=33, 
		NEW=34, RARROW=35, NEG=36, LET=37, TYPE=38, ID=39, NAME=40, EQUAL=41, 
		LT=42, LE=43, INT=44, STRING=45, INVALID_COMMENT=46, BLOCK_COMMENT=47, 
		INVALID=48;
	public static final int
		RULE_class_body = 0, RULE_attributeDef = 1, RULE_class_def = 2, RULE_variable_def = 3, 
		RULE_formal_param = 4, RULE_method_def = 5, RULE_program = 6, RULE_case_option = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"class_body", "attributeDef", "class_def", "variable_def", "formal_param", 
			"method_def", "program", "case_option", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'if'", "'then'", "'else'", "'fi'", "'case'", "'of'", 
			"'esac'", "'while'", "'loop'", "'pool'", "'class'", "'inherits'", null, 
			null, "'('", "')'", "'{'", "'}'", "';'", "':'", "','", "'<-'", "'.'", 
			"'@'", "'+'", "'-'", "'*'", "'/'", "'in'", "'isvoid'", "'not'", "'new'", 
			"'=>'", "'~'", "'let'", null, null, null, "'='", "'<'", "'<='", null, 
			null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "WS", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", 
			"WHILE", "LOOP", "POOL", "CLASS", "INHERITS", "BOOL", "LINE_COMMENT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COLON", "COMMA", "ASSIGN", 
			"DOT", "AT", "PLUS", "MINUS", "MULT", "DIV", "IN", "ISVOID", "NOT", "NEW", 
			"RARROW", "NEG", "LET", "TYPE", "ID", "NAME", "EQUAL", "LT", "LE", "INT", 
			"STRING", "INVALID_COMMENT", "BLOCK_COMMENT", "INVALID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public AttributeDefContext attributeDef() {
			return getRuleContext(AttributeDefContext.class,0);
		}
		public Method_defContext method_def() {
			return getRuleContext(Method_defContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class_body);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				attributeDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				method_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDefContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAttributeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAttributeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAttributeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDefContext attributeDef() throws RecognitionException {
		AttributeDefContext _localctx = new AttributeDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attributeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((AttributeDefContext)_localctx).name = match(ID);
			setState(23);
			match(COLON);
			setState(24);
			((AttributeDefContext)_localctx).type = match(TYPE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(25);
				match(ASSIGN);
				setState(26);
				((AttributeDefContext)_localctx).value = expr(0);
				}
			}

			setState(29);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public Token name;
		public Token base;
		public Class_bodyContext class_body;
		public List<Class_bodyContext> body = new ArrayList<Class_bodyContext>();
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<Class_bodyContext> class_body() {
			return getRuleContexts(Class_bodyContext.class);
		}
		public Class_bodyContext class_body(int i) {
			return getRuleContext(Class_bodyContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(CLASS);
			setState(32);
			((Class_defContext)_localctx).name = match(TYPE);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(33);
				match(INHERITS);
				setState(34);
				((Class_defContext)_localctx).base = match(TYPE);
				}
			}

			setState(37);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(38);
				((Class_defContext)_localctx).class_body = class_body();
				((Class_defContext)_localctx).body.add(((Class_defContext)_localctx).class_body);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RBRACE);
			setState(45);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_defContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterVariable_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitVariable_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitVariable_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_defContext variable_def() throws RecognitionException {
		Variable_defContext _localctx = new Variable_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((Variable_defContext)_localctx).name = match(ID);
			setState(48);
			match(COLON);
			setState(49);
			((Variable_defContext)_localctx).type = match(TYPE);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(50);
				match(ASSIGN);
				setState(51);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_paramContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((Formal_paramContext)_localctx).name = match(ID);
			setState(55);
			match(COLON);
			setState(56);
			((Formal_paramContext)_localctx).type = match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_defContext extends ParserRuleContext {
		public Token name;
		public Formal_paramContext formal_param;
		public List<Formal_paramContext> params = new ArrayList<Formal_paramContext>();
		public Token return_;
		public ExprContext expr;
		public List<ExprContext> body = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public List<Formal_paramContext> formal_param() {
			return getRuleContexts(Formal_paramContext.class);
		}
		public Formal_paramContext formal_param(int i) {
			return getRuleContext(Formal_paramContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public Method_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMethod_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMethod_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMethod_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_defContext method_def() throws RecognitionException {
		Method_defContext _localctx = new Method_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((Method_defContext)_localctx).name = match(ID);
			setState(59);
			match(LPAREN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				((Method_defContext)_localctx).formal_param = formal_param();
				((Method_defContext)_localctx).params.add(((Method_defContext)_localctx).formal_param);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					((Method_defContext)_localctx).formal_param = formal_param();
					((Method_defContext)_localctx).params.add(((Method_defContext)_localctx).formal_param);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(RPAREN);
			setState(71);
			match(COLON);
			setState(72);
			((Method_defContext)_localctx).return_ = match(TYPE);
			setState(73);
			match(LBRACE);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << BOOL) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << NEG) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(74);
				((Method_defContext)_localctx).expr = expr(0);
				((Method_defContext)_localctx).body.add(((Method_defContext)_localctx).expr);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(RBRACE);
			setState(81);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Class_defContext class_def;
		public List<Class_defContext> classes = new ArrayList<Class_defContext>();
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(83);
				((ProgramContext)_localctx).class_def = class_def();
				((ProgramContext)_localctx).classes.add(((ProgramContext)_localctx).class_def);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_optionContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public ExprContext body;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode RARROW() { return getToken(CoolParser.RARROW, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_optionContext case_option() throws RecognitionException {
		Case_optionContext _localctx = new Case_optionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((Case_optionContext)_localctx).name = match(ID);
			setState(92);
			match(COLON);
			setState(93);
			((Case_optionContext)_localctx).type = match(TYPE);
			setState(94);
			match(RARROW);
			setState(95);
			((Case_optionContext)_localctx).body = expr(0);
			setState(96);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Neg_exprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Neg_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNeg_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNeg_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNeg_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExprContext {
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public NewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public PlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExprContext {
		public ExprContext op;
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_braceContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public Expr_braceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterExpr_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitExpr_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitExpr_brace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplDispatchContext extends ExprContext {
		public Token name;
		public ExprContext expr;
		public List<ExprContext> params = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ImplDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterImplDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitImplDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitImplDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_callContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public Method_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public ExprContext cond;
		public ExprContext body;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_parenContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public Expr_parenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterExpr_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitExpr_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitExpr_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegContext extends ExprContext {
		public TerminalNode NEG() { return getToken(CoolParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CoolParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplDispatchContext extends ExprContext {
		public ExprContext caller;
		public Token realCaller;
		public Token name;
		public ExprContext expr;
		public List<ExprContext> params = new ArrayList<ExprContext>();
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ExplDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterExplDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitExplDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitExplDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExprContext {
		public Variable_defContext variable_def;
		public List<Variable_defContext> members = new ArrayList<Variable_defContext>();
		public ExprContext body;
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public List<Variable_defContext> variable_def() {
			return getRuleContexts(Variable_defContext.class);
		}
		public Variable_defContext variable_def(int i) {
			return getRuleContext(Variable_defContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> body = new ArrayList<ExprContext>();
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExprContext {
		public ExprContext cond;
		public ExprContext thenBranch;
		public ExprContext elseBranch;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExprContext {
		public ExprContext var;
		public Case_optionContext case_option;
		public List<Case_optionContext> options = new ArrayList<Case_optionContext>();
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Case_optionContext> case_option() {
			return getRuleContexts(Case_optionContext.class);
		}
		public Case_optionContext case_option(int i) {
			return getRuleContext(Case_optionContext.class,i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public Token name;
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ImplDispatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				((ImplDispatchContext)_localctx).name = match(ID);
				setState(100);
				match(LPAREN);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << BOOL) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << NEG) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(101);
					((ImplDispatchContext)_localctx).expr = expr(0);
					((ImplDispatchContext)_localctx).params.add(((ImplDispatchContext)_localctx).expr);
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(102);
						match(COMMA);
						setState(103);
						((ImplDispatchContext)_localctx).expr = expr(0);
						((ImplDispatchContext)_localctx).params.add(((ImplDispatchContext)_localctx).expr);
						}
						}
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(111);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(IF);
				setState(113);
				((IfContext)_localctx).cond = expr(0);
				setState(114);
				match(THEN);
				setState(115);
				((IfContext)_localctx).thenBranch = expr(0);
				setState(116);
				match(ELSE);
				setState(117);
				((IfContext)_localctx).elseBranch = expr(0);
				setState(118);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(WHILE);
				setState(121);
				((WhileContext)_localctx).cond = expr(0);
				setState(122);
				match(LOOP);
				setState(123);
				((WhileContext)_localctx).body = expr(0);
				setState(124);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(NEG);
				setState(131);
				expr(15);
				}
				break;
			case 9:
				{
				_localctx = new Expr_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LPAREN);
				setState(133);
				expr(0);
				setState(134);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new Expr_braceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(LBRACE);
				setState(137);
				expr(0);
				setState(138);
				match(RBRACE);
				}
				break;
			case 11:
				{
				_localctx = new Neg_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(MINUS);
				setState(141);
				expr(12);
				}
				break;
			case 12:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				((AssignContext)_localctx).name = match(ID);
				setState(143);
				match(ASSIGN);
				setState(144);
				expr(8);
				}
				break;
			case 13:
				{
				_localctx = new Method_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(ID);
				setState(146);
				match(LPAREN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << BOOL) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << NEG) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(147);
							expr(0);
							setState(148);
							match(COMMA);
							}
							} 
						}
						setState(154);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(155);
					expr(0);
					}
				}

				setState(158);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(NOT);
				setState(160);
				expr(6);
				}
				break;
			case 15:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(ISVOID);
				setState(162);
				((IsvoidContext)_localctx).op = expr(5);
				}
				break;
			case 16:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(NEW);
				setState(164);
				match(TYPE);
				}
				break;
			case 17:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(CASE);
				setState(166);
				((CaseContext)_localctx).var = expr(0);
				setState(167);
				match(OF);
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					((CaseContext)_localctx).case_option = case_option();
					((CaseContext)_localctx).options.add(((CaseContext)_localctx).case_option);
					}
					}
					setState(171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(173);
				match(ESAC);
				}
				break;
			case 18:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(LET);
				setState(176);
				((LetContext)_localctx).variable_def = variable_def();
				((LetContext)_localctx).members.add(((LetContext)_localctx).variable_def);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					((LetContext)_localctx).variable_def = variable_def();
					((LetContext)_localctx).members.add(((LetContext)_localctx).variable_def);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(IN);
				setState(185);
				((LetContext)_localctx).body = expr(2);
				}
				break;
			case 19:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(LBRACE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << BOOL) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << NEG) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					{
					setState(188);
					((BlockContext)_localctx).expr = expr(0);
					((BlockContext)_localctx).body.add(((BlockContext)_localctx).expr);
					setState(189);
					match(SEMI);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(200);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((MultDivContext)_localctx).right = expr(12);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(203);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((PlusMinusContext)_localctx).right = expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(206);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((RelationalContext)_localctx).right = expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExplDispatchContext(new ExprContext(_parentctx, _parentState));
						((ExplDispatchContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(209);
							match(AT);
							setState(210);
							((ExplDispatchContext)_localctx).realCaller = match(TYPE);
							}
						}

						setState(213);
						match(DOT);
						setState(214);
						((ExplDispatchContext)_localctx).name = match(ID);
						setState(215);
						match(LPAREN);
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << WHILE) | (1L << BOOL) | (1L << LPAREN) | (1L << LBRACE) | (1L << MINUS) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << NEG) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
							{
							setState(216);
							((ExplDispatchContext)_localctx).expr = expr(0);
							((ExplDispatchContext)_localctx).params.add(((ExplDispatchContext)_localctx).expr);
							setState(221);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(217);
								match(COMMA);
								setState(218);
								((ExplDispatchContext)_localctx).expr = expr(0);
								((ExplDispatchContext)_localctx).params.add(((ExplDispatchContext)_localctx).expr);
								}
								}
								setState(223);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(226);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t"+
		"\u0005\u0003\u0005E\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006U\b\u0006\n\u0006"+
		"\f\u0006X\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bi\b\b\n\b\f\bl\t\b\u0003\bn\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a\t\b\u0001\b"+
		"\u0003\b\u009d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00aa\b\b\u000b\b\f\b\u00ab"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b4\b\b\n\b"+
		"\f\b\u00b7\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00c0\b\b\n\b\f\b\u00c3\t\b\u0001\b\u0003\b\u00c6\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00dc\b\b\n\b\f\b\u00df\t\b\u0003\b\u00e1\b\b\u0001"+
		"\b\u0005\b\u00e4\b\b\n\b\f\b\u00e7\t\b\u0001\b\u0000\u0001\u0010\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000\u001d\u001e"+
		"\u0001\u0000\u001b\u001c\u0001\u0000)+\u0108\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n:\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000"+
		"\u0000\u0010\u00c5\u0001\u0000\u0000\u0000\u0012\u0015\u0003\u0002\u0001"+
		"\u0000\u0013\u0015\u0003\n\u0005\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\'\u0000\u0000\u0017\u0018\u0005\u0016\u0000\u0000\u0018"+
		"\u001b\u0005&\u0000\u0000\u0019\u001a\u0005\u0018\u0000\u0000\u001a\u001c"+
		"\u0003\u0010\b\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0015\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\r"+
		"\u0000\u0000 #\u0005&\u0000\u0000!\"\u0005\u000e\u0000\u0000\"$\u0005"+
		"&\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%)\u0005\u0013\u0000\u0000&(\u0003\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0014\u0000\u0000-.\u0005\u0015\u0000\u0000.\u0005"+
		"\u0001\u0000\u0000\u0000/0\u0005\'\u0000\u000001\u0005\u0016\u0000\u0000"+
		"14\u0005&\u0000\u000023\u0005\u0018\u0000\u000035\u0003\u0010\b\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0007\u0001\u0000"+
		"\u0000\u000067\u0005\'\u0000\u000078\u0005\u0016\u0000\u000089\u0005&"+
		"\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\'\u0000\u0000;D\u0005"+
		"\u0011\u0000\u0000<A\u0003\b\u0004\u0000=>\u0005\u0017\u0000\u0000>@\u0003"+
		"\b\u0004\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0012\u0000\u0000GH\u0005\u0016"+
		"\u0000\u0000HI\u0005&\u0000\u0000IM\u0005\u0013\u0000\u0000JL\u0003\u0010"+
		"\b\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0005\u0015\u0000\u0000"+
		"R\u000b\u0001\u0000\u0000\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0000\u0000\u0001Z\r\u0001\u0000\u0000\u0000[\\\u0005\'\u0000"+
		"\u0000\\]\u0005\u0016\u0000\u0000]^\u0005&\u0000\u0000^_\u0005#\u0000"+
		"\u0000_`\u0003\u0010\b\u0000`a\u0005\u0015\u0000\u0000a\u000f\u0001\u0000"+
		"\u0000\u0000bc\u0006\b\uffff\uffff\u0000cd\u0005\'\u0000\u0000dm\u0005"+
		"\u0011\u0000\u0000ej\u0003\u0010\b\u0000fg\u0005\u0017\u0000\u0000gi\u0003"+
		"\u0010\b\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000me\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o\u00c6\u0005\u0012\u0000\u0000pq\u0005"+
		"\u0003\u0000\u0000qr\u0003\u0010\b\u0000rs\u0005\u0004\u0000\u0000st\u0003"+
		"\u0010\b\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005"+
		"\u0006\u0000\u0000w\u00c6\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000"+
		"yz\u0003\u0010\b\u0000z{\u0005\u000b\u0000\u0000{|\u0003\u0010\b\u0000"+
		"|}\u0005\f\u0000\u0000}\u00c6\u0001\u0000\u0000\u0000~\u00c6\u0005\'\u0000"+
		"\u0000\u007f\u00c6\u0005,\u0000\u0000\u0080\u00c6\u0005\u000f\u0000\u0000"+
		"\u0081\u00c6\u0005-\u0000\u0000\u0082\u0083\u0005$\u0000\u0000\u0083\u00c6"+
		"\u0003\u0010\b\u000f\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0003"+
		"\u0010\b\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u00c6\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008a\u0003\u0010"+
		"\b\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u00c6\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u00c6\u0003\u0010\b\f"+
		"\u008e\u008f\u0005\'\u0000\u0000\u008f\u0090\u0005\u0018\u0000\u0000\u0090"+
		"\u00c6\u0003\u0010\b\b\u0091\u0092\u0005\'\u0000\u0000\u0092\u009c\u0005"+
		"\u0011\u0000\u0000\u0093\u0094\u0003\u0010\b\u0000\u0094\u0095\u0005\u0017"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0010"+
		"\b\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00c6\u0005\u0012\u0000"+
		"\u0000\u009f\u00a0\u0005!\u0000\u0000\u00a0\u00c6\u0003\u0010\b\u0006"+
		"\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00c6\u0003\u0010\b\u0005\u00a3"+
		"\u00a4\u0005\"\u0000\u0000\u00a4\u00c6\u0005&\u0000\u0000\u00a5\u00a6"+
		"\u0005\u0007\u0000\u0000\u00a6\u00a7\u0003\u0010\b\u0000\u00a7\u00a9\u0005"+
		"\b\u0000\u0000\u00a8\u00aa\u0003\u000e\u0007\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\t\u0000\u0000\u00ae\u00c6\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005%\u0000\u0000\u00b0\u00b5\u0003\u0006\u0003\u0000"+
		"\u00b1\u00b2\u0005\u0017\u0000\u0000\u00b2\u00b4\u0003\u0006\u0003\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\u001f\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0002\u00ba"+
		"\u00c6\u0001\u0000\u0000\u0000\u00bb\u00c1\u0005\u0013\u0000\u0000\u00bc"+
		"\u00bd\u0003\u0010\b\u0000\u00bd\u00be\u0005\u0015\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\u0014\u0000\u0000\u00c5b\u0001"+
		"\u0000\u0000\u0000\u00c5p\u0001\u0000\u0000\u0000\u00c5x\u0001\u0000\u0000"+
		"\u0000\u00c5~\u0001\u0000\u0000\u0000\u00c5\u007f\u0001\u0000\u0000\u0000"+
		"\u00c5\u0080\u0001\u0000\u0000\u0000\u00c5\u0081\u0001\u0000\u0000\u0000"+
		"\u00c5\u0082\u0001\u0000\u0000\u0000\u00c5\u0084\u0001\u0000\u0000\u0000"+
		"\u00c5\u0088\u0001\u0000\u0000\u0000\u00c5\u008c\u0001\u0000\u0000\u0000"+
		"\u00c5\u008e\u0001\u0000\u0000\u0000\u00c5\u0091\u0001\u0000\u0000\u0000"+
		"\u00c5\u009f\u0001\u0000\u0000\u0000\u00c5\u00a1\u0001\u0000\u0000\u0000"+
		"\u00c5\u00a3\u0001\u0000\u0000\u0000\u00c5\u00a5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00af\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c6\u00e5\u0001\u0000\u0000\u0000\u00c7\u00c8\n\u000b\u0000\u0000\u00c8"+
		"\u00c9\u0007\u0000\u0000\u0000\u00c9\u00e4\u0003\u0010\b\f\u00ca\u00cb"+
		"\n\n\u0000\u0000\u00cb\u00cc\u0007\u0001\u0000\u0000\u00cc\u00e4\u0003"+
		"\u0010\b\u000b\u00cd\u00ce\n\t\u0000\u0000\u00ce\u00cf\u0007\u0002\u0000"+
		"\u0000\u00cf\u00e4\u0003\u0010\b\n\u00d0\u00d3\n\u0016\u0000\u0000\u00d1"+
		"\u00d2\u0005\u001a\u0000\u0000\u00d2\u00d4\u0005&\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0019\u0000\u0000\u00d6\u00d7"+
		"\u0005\'\u0000\u0000\u00d7\u00e0\u0005\u0011\u0000\u0000\u00d8\u00dd\u0003"+
		"\u0010\b\u0000\u00d9\u00da\u0005\u0017\u0000\u0000\u00da\u00dc\u0003\u0010"+
		"\b\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005\u0012\u0000"+
		"\u0000\u00e3\u00c7\u0001\u0000\u0000\u0000\u00e3\u00ca\u0001\u0000\u0000"+
		"\u0000\u00e3\u00cd\u0001\u0000\u0000\u0000\u00e3\u00d0\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0011\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u0016\u0014\u001b#)4ADMVjm"+
		"\u0098\u009c\u00ab\u00b5\u00c1\u00c5\u00d3\u00dd\u00e0\u00e3\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}