// Generated from E:/CPL/COOL Compiler/src/cool/lexer\CoolLexer.g4 by ANTLR 4.10.1

    package cool.lexer;	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, WS=2, IF=3, THEN=4, ELSE=5, FI=6, CASE=7, OF=8, ESAC=9, WHILE=10, 
		LOOP=11, POOL=12, CLASS=13, INHERITS=14, BOOL=15, LINE_COMMENT=16, BLOCK_COMMENT=17, 
		LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, SEMI=22, COLON=23, COMMA=24, 
		ASSIGN=25, DOT=26, AT=27, PLUS=28, MINUS=29, MULT=30, DIV=31, IN=32, ISVOID=33, 
		NOT=34, NEW=35, RARROW=36, NEG=37, LET=38, TYPE=39, ID=40, NAME=41, EQUAL=42, 
		LT=43, LE=44, INT=45, STRING=46, INVALID=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", 
			"POOL", "CLASS", "INHERITS", "UPPER_LETTER", "LOWER_LETTER", "LETTER", 
			"BOOL", "LINE_COMMENT", "BLOCK_COMMENT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COLON", "COMMA", "ASSIGN", "DOT", "AT", "NEW_LINE", 
			"PLUS", "MINUS", "MULT", "DIV", "IN", "ISVOID", "NOT", "NEW", "RARROW", 
			"NEG", "LET", "TYPE", "ID", "NAME", "EQUAL", "LT", "LE", "DIGIT", "INT", 
			"STRING", "INVALID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'if'", "'then'", "'else'", "'fi'", "'case'", "'of'", 
			"'esac'", "'while'", "'loop'", "'pool'", "'class'", "'inherits'", null, 
			null, null, "'('", "')'", "'{'", "'}'", "';'", "':'", "','", "'<-'", 
			"'.'", "'@'", "'+'", "'-'", "'*'", "'/'", "'in'", "'isvoid'", "'not'", 
			"'new'", "'=>'", "'~'", "'let'", null, null, null, "'='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "WS", "IF", "THEN", "ELSE", "FI", "CASE", "OF", "ESAC", 
			"WHILE", "LOOP", "POOL", "CLASS", "INHERITS", "BOOL", "LINE_COMMENT", 
			"BLOCK_COMMENT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COLON", 
			"COMMA", "ASSIGN", "DOT", "AT", "PLUS", "MINUS", "MULT", "DIV", "IN", 
			"ISVOID", "NOT", "NEW", "RARROW", "NEG", "LET", "TYPE", "ID", "NAME", 
			"EQUAL", "LT", "LE", "INT", "STRING", "INVALID"
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

	    
	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18:
			BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			INVALID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BLOCK_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		case 1:
			raiseError("EOF in comment");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 raiseError("EOF in string constant"); 
			break;
		case 3:
			 raiseError("Unterminated string constant"); 
			break;
		case 4:

			        String str = getText();
			        str = str.substring(1, str.length() - 1);
			        String[] replaceables = {"\n", "\t", "\b", "\f"};
			        for(String replaceable : replaceables) {
			            str = str.replace("\\" + replaceable, replaceable);
			        }
			        str = str.replaceAll("\\\\(?!\\\\)", "");
			        if(str.length() > 1024) {
			            raiseError("String constant too long");
			        } else if (str.contains("\0")) {
			            raiseError("String contains null character");
			        } else {
			            setText(str);
			        }
			    
			break;
		}
	}
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 raiseError("Invalid character: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000/\u0153\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0004\u0000i\b\u0000\u000b\u0000"+
		"\f\u0000j\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ba\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c0\b\u0011\n\u0011"+
		"\f\u0011\u00c3\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c7\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00cf\b\u0012\n\u0012\f\u0012\u00d2\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00da"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u00f2"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0005)\u011c\b)\n)\f)\u011f\t)\u0001"+
		"*\u0001*\u0003*\u0123\b*\u0001*\u0001*\u0001*\u0005*\u0128\b*\n*\f*\u012b"+
		"\t*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00040\u013a\b0\u000b0\f0\u013b\u00011\u00011\u0001"+
		"1\u00011\u00051\u0142\b1\n1\f1\u0145\t1\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u014d\b1\u00011\u00011\u00012\u00012\u00012\u0003\u00c1"+
		"\u00d0\u0143\u00003\u0001\u0002\u0003\u0003\u0005\u0004\u0007\u0005\t"+
		"\u0006\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015\f\u0017\r\u0019"+
		"\u000e\u001b\u0000\u001d\u0000\u001f\u0000!\u000f#\u0010%\u0011\'\u0012"+
		")\u0013+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b;\u0000"+
		"=\u001c?\u001dA\u001eC\u001fE G!I\"K#M$O%Q&S\'U(W)Y*[+],_\u0000a-c.e/"+
		"\u0001\u0000\u0005\u0003\u0000\t\n\f\r  \u0001\u0000AZ\u0001\u0000az\u0002"+
		"\u0000AZaz\u0001\u000009\u015f\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000!\u0001\u0000"+
		"\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000"+
		"+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001"+
		"\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000"+
		"\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000"+
		"\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001"+
		"h\u0001\u0000\u0000\u0000\u0003n\u0001\u0000\u0000\u0000\u0005q\u0001"+
		"\u0000\u0000\u0000\u0007v\u0001\u0000\u0000\u0000\t{\u0001\u0000\u0000"+
		"\u0000\u000b~\u0001\u0000\u0000\u0000\r\u0083\u0001\u0000\u0000\u0000"+
		"\u000f\u0086\u0001\u0000\u0000\u0000\u0011\u008b\u0001\u0000\u0000\u0000"+
		"\u0013\u0091\u0001\u0000\u0000\u0000\u0015\u0096\u0001\u0000\u0000\u0000"+
		"\u0017\u009b\u0001\u0000\u0000\u0000\u0019\u00a1\u0001\u0000\u0000\u0000"+
		"\u001b\u00aa\u0001\u0000\u0000\u0000\u001d\u00ac\u0001\u0000\u0000\u0000"+
		"\u001f\u00ae\u0001\u0000\u0000\u0000!\u00b9\u0001\u0000\u0000\u0000#\u00bb"+
		"\u0001\u0000\u0000\u0000%\u00ca\u0001\u0000\u0000\u0000\'\u00db\u0001"+
		"\u0000\u0000\u0000)\u00dd\u0001\u0000\u0000\u0000+\u00df\u0001\u0000\u0000"+
		"\u0000-\u00e1\u0001\u0000\u0000\u0000/\u00e3\u0001\u0000\u0000\u00001"+
		"\u00e5\u0001\u0000\u0000\u00003\u00e7\u0001\u0000\u0000\u00005\u00e9\u0001"+
		"\u0000\u0000\u00007\u00ec\u0001\u0000\u0000\u00009\u00ee\u0001\u0000\u0000"+
		"\u0000;\u00f1\u0001\u0000\u0000\u0000=\u00f5\u0001\u0000\u0000\u0000?"+
		"\u00f7\u0001\u0000\u0000\u0000A\u00f9\u0001\u0000\u0000\u0000C\u00fb\u0001"+
		"\u0000\u0000\u0000E\u00fd\u0001\u0000\u0000\u0000G\u0100\u0001\u0000\u0000"+
		"\u0000I\u0107\u0001\u0000\u0000\u0000K\u010b\u0001\u0000\u0000\u0000M"+
		"\u010f\u0001\u0000\u0000\u0000O\u0112\u0001\u0000\u0000\u0000Q\u0114\u0001"+
		"\u0000\u0000\u0000S\u0118\u0001\u0000\u0000\u0000U\u0122\u0001\u0000\u0000"+
		"\u0000W\u012c\u0001\u0000\u0000\u0000Y\u012f\u0001\u0000\u0000\u0000["+
		"\u0131\u0001\u0000\u0000\u0000]\u0133\u0001\u0000\u0000\u0000_\u0136\u0001"+
		"\u0000\u0000\u0000a\u0139\u0001\u0000\u0000\u0000c\u013d\u0001\u0000\u0000"+
		"\u0000e\u0150\u0001\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0006\u0000\u0000"+
		"\u0000m\u0002\u0001\u0000\u0000\u0000no\u0005i\u0000\u0000op\u0005f\u0000"+
		"\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0005t\u0000\u0000rs\u0005h\u0000"+
		"\u0000st\u0005e\u0000\u0000tu\u0005n\u0000\u0000u\u0006\u0001\u0000\u0000"+
		"\u0000vw\u0005e\u0000\u0000wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000"+
		"yz\u0005e\u0000\u0000z\b\u0001\u0000\u0000\u0000{|\u0005f\u0000\u0000"+
		"|}\u0005i\u0000\u0000}\n\u0001\u0000\u0000\u0000~\u007f\u0005c\u0000\u0000"+
		"\u007f\u0080\u0005a\u0000\u0000\u0080\u0081\u0005s\u0000\u0000\u0081\u0082"+
		"\u0005e\u0000\u0000\u0082\f\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"o\u0000\u0000\u0084\u0085\u0005f\u0000\u0000\u0085\u000e\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005s\u0000\u0000\u0088"+
		"\u0089\u0005a\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u0010\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005w\u0000\u0000\u008c\u008d\u0005h\u0000"+
		"\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f"+
		"\u0090\u0005e\u0000\u0000\u0090\u0012\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005l\u0000\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u0094\u0005o"+
		"\u0000\u0000\u0094\u0095\u0005p\u0000\u0000\u0095\u0014\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005p\u0000\u0000\u0097\u0098\u0005o\u0000\u0000\u0098"+
		"\u0099\u0005o\u0000\u0000\u0099\u009a\u0005l\u0000\u0000\u009a\u0016\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005c\u0000\u0000\u009c\u009d\u0005l\u0000"+
		"\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005s\u0000\u0000\u009f"+
		"\u00a0\u0005s\u0000\u0000\u00a0\u0018\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005i\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005h"+
		"\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u00a6\u0005r\u0000\u0000"+
		"\u00a6\u00a7\u0005i\u0000\u0000\u00a7\u00a8\u0005t\u0000\u0000\u00a8\u00a9"+
		"\u0005s\u0000\u0000\u00a9\u001a\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007"+
		"\u0001\u0000\u0000\u00ab\u001c\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007"+
		"\u0002\u0000\u0000\u00ad\u001e\u0001\u0000\u0000\u0000\u00ae\u00af\u0007"+
		"\u0003\u0000\u0000\u00af \u0001\u0000\u0000\u0000\u00b0\u00b1\u0005t\u0000"+
		"\u0000\u00b1\u00b2\u0005r\u0000\u0000\u00b2\u00b3\u0005u\u0000\u0000\u00b3"+
		"\u00ba\u0005e\u0000\u0000\u00b4\u00b5\u0005f\u0000\u0000\u00b5\u00b6\u0005"+
		"a\u0000\u0000\u00b6\u00b7\u0005l\u0000\u0000\u00b7\u00b8\u0005s\u0000"+
		"\u0000\u00b8\u00ba\u0005e\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b4\u0001\u0000\u0000\u0000\u00ba\"\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005-\u0000\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u00c1\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\t\u0000\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003;\u001d"+
		"\u0000\u00c5\u00c7\u0005\u0000\u0000\u0001\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0006\u0011\u0000\u0000\u00c9$\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005(\u0000\u0000\u00cb\u00cc\u0005*\u0000\u0000\u00cc\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\t\u0000\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"*\u0000\u0000\u00d4\u00d5\u0005)\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00da\u0006\u0012\u0001\u0000\u00d7\u00d8\u0005\u0000\u0000"+
		"\u0001\u00d8\u00da\u0006\u0012\u0002\u0000\u00d9\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da&\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005(\u0000\u0000\u00dc(\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005)\u0000\u0000\u00de*\u0001\u0000\u0000\u0000\u00df\u00e0\u0005{"+
		"\u0000\u0000\u00e0,\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005}\u0000\u0000"+
		"\u00e2.\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005;\u0000\u0000\u00e40"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005:\u0000\u0000\u00e62\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005,\u0000\u0000\u00e84\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005<\u0000\u0000\u00ea\u00eb\u0005-\u0000\u0000\u00eb6"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005.\u0000\u0000\u00ed8\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005@\u0000\u0000\u00ef:\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0005\r\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\n\u0000\u0000\u00f4<\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005+\u0000\u0000\u00f6>\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005-"+
		"\u0000\u0000\u00f8@\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005*\u0000\u0000"+
		"\u00faB\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005/\u0000\u0000\u00fcD"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005i\u0000\u0000\u00fe\u00ff\u0005"+
		"n\u0000\u0000\u00ffF\u0001\u0000\u0000\u0000\u0100\u0101\u0005i\u0000"+
		"\u0000\u0101\u0102\u0005s\u0000\u0000\u0102\u0103\u0005v\u0000\u0000\u0103"+
		"\u0104\u0005o\u0000\u0000\u0104\u0105\u0005i\u0000\u0000\u0105\u0106\u0005"+
		"d\u0000\u0000\u0106H\u0001\u0000\u0000\u0000\u0107\u0108\u0005n\u0000"+
		"\u0000\u0108\u0109\u0005o\u0000\u0000\u0109\u010a\u0005t\u0000\u0000\u010a"+
		"J\u0001\u0000\u0000\u0000\u010b\u010c\u0005n\u0000\u0000\u010c\u010d\u0005"+
		"e\u0000\u0000\u010d\u010e\u0005w\u0000\u0000\u010eL\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005=\u0000\u0000\u0110\u0111\u0005>\u0000\u0000\u0111"+
		"N\u0001\u0000\u0000\u0000\u0112\u0113\u0005~\u0000\u0000\u0113P\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005l\u0000\u0000\u0115\u0116\u0005e\u0000"+
		"\u0000\u0116\u0117\u0005t\u0000\u0000\u0117R\u0001\u0000\u0000\u0000\u0118"+
		"\u011d\u0003\u001b\r\u0000\u0119\u011c\u0003_/\u0000\u011a\u011c\u0003"+
		"U*\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011eT\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0003\u001f\u000f\u0000"+
		"\u0121\u0123\u0005_\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0129\u0001\u0000\u0000\u0000\u0124"+
		"\u0128\u0003\u001f\u000f\u0000\u0125\u0128\u0005_\u0000\u0000\u0126\u0128"+
		"\u0003_/\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012aV\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0003\u001d\u000e\u0000\u012d\u012e\u0003U*\u0000\u012e"+
		"X\u0001\u0000\u0000\u0000\u012f\u0130\u0005=\u0000\u0000\u0130Z\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005<\u0000\u0000\u0132\\\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005<\u0000\u0000\u0134\u0135\u0005=\u0000\u0000"+
		"\u0135^\u0001\u0000\u0000\u0000\u0136\u0137\u0007\u0004\u0000\u0000\u0137"+
		"`\u0001\u0000\u0000\u0000\u0138\u013a\u0003_/\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013cb\u0001\u0000"+
		"\u0000\u0000\u013d\u0143\u0005\"\u0000\u0000\u013e\u013f\u0005\\\u0000"+
		"\u0000\u013f\u0142\u0005\"\u0000\u0000\u0140\u0142\t\u0000\u0000\u0000"+
		"\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u014c\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u014d\u0005\"\u0000\u0000\u0147"+
		"\u0148\u0005\u0000\u0000\u0001\u0148\u014d\u00061\u0003\u0000\u0149\u014a"+
		"\u0003;\u001d\u0000\u014a\u014b\u00061\u0004\u0000\u014b\u014d\u0001\u0000"+
		"\u0000\u0000\u014c\u0146\u0001\u0000\u0000\u0000\u014c\u0147\u0001\u0000"+
		"\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u00061\u0005\u0000\u014fd\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\t\u0000\u0000\u0000\u0151\u0152\u00062\u0006\u0000\u0152"+
		"f\u0001\u0000\u0000\u0000\u0011\u0000j\u00b9\u00c1\u00c6\u00d0\u00d9\u00f1"+
		"\u011b\u011d\u0122\u0127\u0129\u013b\u0141\u0143\u014c\u0007\u0006\u0000"+
		"\u0000\u0001\u0012\u0000\u0001\u0012\u0001\u00011\u0002\u00011\u0003\u0001"+
		"1\u0004\u00012\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}