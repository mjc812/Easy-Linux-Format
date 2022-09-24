// Generated from /Users/michaelchung/Documents/410/ELF/src/Parser/ELFParser.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ELFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PATH=1, FILE=2, FILES=3, FOLDER=4, GETFILE=5, GETFILES=6, GETFOLDER=7, 
		GETPATH=8, DELETE=9, MOVE=10, COPY=11, TO=12, IF=13, WHERE=14, RECURSIVELY=15, 
		NAME=16, NAMECONDITION=17, DATE=18, DATECONDITION=19, INFOLDER=20, ATPATH=21, 
		TOUCHED=22, BY=23, LOGIC=24, COMMA=25, SEMICOLON=26, EQUALS=27, WS=28, 
		VAR_TEXT=29, TEXT=30;
	public static final int
		RULE_program = 0, RULE_path = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_get = 4, RULE_command = 5, RULE_delete = 6, RULE_move = 7, RULE_copy = 8, 
		RULE_getClause = 9, RULE_commandClause = 10, RULE_propertyClause = 11, 
		RULE_locationClause = 12, RULE_nameClause = 13, RULE_touchedClause = 14, 
		RULE_dateClause = 15, RULE_folderClause = 16, RULE_pathClause = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "path", "statement", "assignment", "get", "command", "delete", 
			"move", "copy", "getClause", "commandClause", "propertyClause", "locationClause", 
			"nameClause", "touchedClause", "dateClause", "folderClause", "pathClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'path'", null, null, null, "'get file'", "'get all files'", "'get folder'", 
			null, null, null, null, null, "'if'", "'where'", "'recursively'", "'name'", 
			null, "'date'", null, null, null, null, null, null, "','", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PATH", "FILE", "FILES", "FOLDER", "GETFILE", "GETFILES", "GETFOLDER", 
			"GETPATH", "DELETE", "MOVE", "COPY", "TO", "IF", "WHERE", "RECURSIVELY", 
			"NAME", "NAMECONDITION", "DATE", "DATECONDITION", "INFOLDER", "ATPATH", 
			"TOUCHED", "BY", "LOGIC", "COMMA", "SEMICOLON", "EQUALS", "WS", "VAR_TEXT", 
			"TEXT"
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
	public String getGrammarFileName() { return "ELFParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ELFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ELFParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			path();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER) | (1L << DELETE) | (1L << MOVE) | (1L << COPY))) != 0)) {
				{
				{
				setState(37);
				statement();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(ELFParser.PATH, 0); }
		public TerminalNode EQUALS() { return getToken(ELFParser.EQUALS, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ELFParser.SEMICOLON, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PATH);
			setState(46);
			match(EQUALS);
			setState(47);
			match(TEXT);
			setState(48);
			match(SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ELFParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FILES:
			case FOLDER:
				{
				setState(50);
				assignment();
				}
				break;
			case DELETE:
			case MOVE:
			case COPY:
				{
				setState(51);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			match(SEMICOLON);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ELFParser.EQUALS, 0); }
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public TerminalNode FILE() { return getToken(ELFParser.FILE, 0); }
		public TerminalNode FILES() { return getToken(ELFParser.FILES, 0); }
		public TerminalNode FOLDER() { return getToken(ELFParser.FOLDER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			match(EQUALS);
			setState(58);
			get();
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

	public static class GetContext extends ParserRuleContext {
		public List<GetClauseContext> getClause() {
			return getRuleContexts(GetClauseContext.class);
		}
		public GetClauseContext getClause(int i) {
			return getRuleContext(GetClauseContext.class,i);
		}
		public TerminalNode GETFILE() { return getToken(ELFParser.GETFILE, 0); }
		public TerminalNode GETFILES() { return getToken(ELFParser.GETFILES, 0); }
		public TerminalNode GETFOLDER() { return getToken(ELFParser.GETFOLDER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ELFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ELFParser.COMMA, i);
		}
		public List<TerminalNode> LOGIC() { return getTokens(ELFParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(ELFParser.LOGIC, i);
		}
		public TerminalNode RECURSIVELY() { return getToken(ELFParser.RECURSIVELY, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETFILE:
				{
				setState(60);
				match(GETFILE);
				}
				break;
			case GETFILES:
				{
				setState(61);
				match(GETFILES);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECURSIVELY) {
					{
					setState(62);
					match(RECURSIVELY);
					}
				}

				}
				break;
			case GETFOLDER:
				{
				setState(65);
				match(GETFOLDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68);
			getClause();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(LOGIC);
				setState(71);
				getClause();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommandContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public TerminalNode IF() { return getToken(ELFParser.IF, 0); }
		public List<CommandClauseContext> commandClause() {
			return getRuleContexts(CommandClauseContext.class);
		}
		public CommandClauseContext commandClause(int i) {
			return getRuleContext(CommandClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ELFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ELFParser.COMMA, i);
		}
		public List<TerminalNode> LOGIC() { return getTokens(ELFParser.LOGIC); }
		public TerminalNode LOGIC(int i) {
			return getToken(ELFParser.LOGIC, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(77);
				delete();
				}
				break;
			case MOVE:
				{
				setState(78);
				move();
				}
				break;
			case COPY:
				{
				setState(79);
				copy();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(82);
				match(IF);
				setState(83);
				commandClause();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					match(LOGIC);
					setState(86);
					commandClause();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ELFParser.DELETE, 0); }
		public TerminalNode VAR_TEXT() { return getToken(ELFParser.VAR_TEXT, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DELETE);
			setState(95);
			match(VAR_TEXT);
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(ELFParser.MOVE, 0); }
		public List<TerminalNode> VAR_TEXT() { return getTokens(ELFParser.VAR_TEXT); }
		public TerminalNode VAR_TEXT(int i) {
			return getToken(ELFParser.VAR_TEXT, i);
		}
		public TerminalNode TO() { return getToken(ELFParser.TO, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(MOVE);
			setState(98);
			match(VAR_TEXT);
			setState(99);
			match(TO);
			setState(100);
			match(VAR_TEXT);
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

	public static class CopyContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(ELFParser.COPY, 0); }
		public List<TerminalNode> VAR_TEXT() { return getTokens(ELFParser.VAR_TEXT); }
		public TerminalNode VAR_TEXT(int i) {
			return getToken(ELFParser.VAR_TEXT, i);
		}
		public TerminalNode TO() { return getToken(ELFParser.TO, 0); }
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCopy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCopy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCopy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(COPY);
			setState(103);
			match(VAR_TEXT);
			setState(104);
			match(TO);
			setState(105);
			match(VAR_TEXT);
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

	public static class GetClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ELFParser.WHERE, 0); }
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public LocationClauseContext locationClause() {
			return getRuleContext(LocationClauseContext.class,0);
		}
		public GetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterGetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitGetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitGetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetClauseContext getClause() throws RecognitionException {
		GetClauseContext _localctx = new GetClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_getClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHERE);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case DATE:
			case TOUCHED:
				{
				setState(108);
				propertyClause();
				}
				break;
			case INFOLDER:
			case ATPATH:
				{
				setState(109);
				locationClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CommandClauseContext extends ParserRuleContext {
		public PropertyClauseContext propertyClause() {
			return getRuleContext(PropertyClauseContext.class,0);
		}
		public CommandClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCommandClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCommandClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCommandClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandClauseContext commandClause() throws RecognitionException {
		CommandClauseContext _localctx = new CommandClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commandClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			propertyClause();
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

	public static class PropertyClauseContext extends ParserRuleContext {
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public TouchedClauseContext touchedClause() {
			return getRuleContext(TouchedClauseContext.class,0);
		}
		public DateClauseContext dateClause() {
			return getRuleContext(DateClauseContext.class,0);
		}
		public PropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterPropertyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitPropertyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitPropertyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyClauseContext propertyClause() throws RecognitionException {
		PropertyClauseContext _localctx = new PropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyClause);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				nameClause();
				}
				break;
			case TOUCHED:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				touchedClause();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				dateClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LocationClauseContext extends ParserRuleContext {
		public FolderClauseContext folderClause() {
			return getRuleContext(FolderClauseContext.class,0);
		}
		public PathClauseContext pathClause() {
			return getRuleContext(PathClauseContext.class,0);
		}
		public LocationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterLocationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitLocationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitLocationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationClauseContext locationClause() throws RecognitionException {
		LocationClauseContext _localctx = new LocationClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_locationClause);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFOLDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				folderClause();
				}
				break;
			case ATPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				pathClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NameClauseContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ELFParser.NAME, 0); }
		public TerminalNode NAMECONDITION() { return getToken(ELFParser.NAMECONDITION, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public NameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterNameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitNameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameClauseContext nameClause() throws RecognitionException {
		NameClauseContext _localctx = new NameClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(NAME);
			setState(124);
			match(NAMECONDITION);
			setState(125);
			match(TEXT);
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

	public static class TouchedClauseContext extends ParserRuleContext {
		public TerminalNode TOUCHED() { return getToken(ELFParser.TOUCHED, 0); }
		public TerminalNode BY() { return getToken(ELFParser.BY, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public TouchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_touchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterTouchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitTouchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitTouchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TouchedClauseContext touchedClause() throws RecognitionException {
		TouchedClauseContext _localctx = new TouchedClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_touchedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(TOUCHED);
			setState(128);
			match(BY);
			setState(129);
			match(TEXT);
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

	public static class DateClauseContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(ELFParser.DATE, 0); }
		public TerminalNode TOUCHED() { return getToken(ELFParser.TOUCHED, 0); }
		public TerminalNode DATECONDITION() { return getToken(ELFParser.DATECONDITION, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public DateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterDateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitDateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitDateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateClauseContext dateClause() throws RecognitionException {
		DateClauseContext _localctx = new DateClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(DATE);
			setState(132);
			match(TOUCHED);
			setState(133);
			match(DATECONDITION);
			setState(134);
			match(TEXT);
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

	public static class FolderClauseContext extends ParserRuleContext {
		public TerminalNode INFOLDER() { return getToken(ELFParser.INFOLDER, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public FolderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterFolderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitFolderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitFolderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderClauseContext folderClause() throws RecognitionException {
		FolderClauseContext _localctx = new FolderClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_folderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(INFOLDER);
			setState(137);
			match(TEXT);
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

	public static class PathClauseContext extends ParserRuleContext {
		public TerminalNode ATPATH() { return getToken(ELFParser.ATPATH, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public PathClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterPathClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitPathClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitPathClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathClauseContext pathClause() throws RecognitionException {
		PathClauseContext _localctx = new PathClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pathClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ATPATH);
			setState(140);
			match(TEXT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004@\b\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004"+
		"L\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005X\b"+
		"\u0005\n\u0005\f\u0005[\t\u0005\u0003\u0005]\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0003\to\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bv\b\u000b\u0001\f\u0001\f\u0003\fz\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0001\u0001\u0000\u0002\u0004\u008a\u0000$\u0001\u0000"+
		"\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000"+
		"\u00068\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nP\u0001\u0000"+
		"\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000"+
		"\u0010f\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014p"+
		"\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018y\u0001\u0000"+
		"\u0000\u0000\u001a{\u0001\u0000\u0000\u0000\u001c\u007f\u0001\u0000\u0000"+
		"\u0000\u001e\u0083\u0001\u0000\u0000\u0000 \u0088\u0001\u0000\u0000\u0000"+
		"\"\u008b\u0001\u0000\u0000\u0000$(\u0003\u0002\u0001\u0000%\'\u0003\u0004"+
		"\u0002\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005\u001b\u0000\u0000/0\u0005"+
		"\u001e\u0000\u000001\u0005\u001a\u0000\u00001\u0003\u0001\u0000\u0000"+
		"\u000025\u0003\u0006\u0003\u000035\u0003\n\u0005\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005\u001a"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0007\u0000\u0000\u0000"+
		"9:\u0005\u001b\u0000\u0000:;\u0003\b\u0004\u0000;\u0007\u0001\u0000\u0000"+
		"\u0000<C\u0005\u0005\u0000\u0000=?\u0005\u0006\u0000\u0000>@\u0005\u000f"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000AC\u0005\u0007\u0000\u0000B<\u0001\u0000\u0000\u0000"+
		"B=\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DJ\u0003\u0012\t\u0000EF\u0005\u0019\u0000\u0000FG\u0005\u0018\u0000"+
		"\u0000GI\u0003\u0012\t\u0000HE\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\t\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MQ\u0003\f\u0006\u0000NQ\u0003\u000e"+
		"\u0007\u0000OQ\u0003\u0010\b\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\\\u0001\u0000\u0000\u0000RS\u0005"+
		"\r\u0000\u0000SY\u0003\u0014\n\u0000TU\u0005\u0019\u0000\u0000UV\u0005"+
		"\u0018\u0000\u0000VX\u0003\u0014\n\u0000WT\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\R\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005"+
		"\t\u0000\u0000_`\u0005\u001d\u0000\u0000`\r\u0001\u0000\u0000\u0000ab"+
		"\u0005\n\u0000\u0000bc\u0005\u001d\u0000\u0000cd\u0005\f\u0000\u0000d"+
		"e\u0005\u001d\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\u000b"+
		"\u0000\u0000gh\u0005\u001d\u0000\u0000hi\u0005\f\u0000\u0000ij\u0005\u001d"+
		"\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kn\u0005\u000e\u0000\u0000"+
		"lo\u0003\u0016\u000b\u0000mo\u0003\u0018\f\u0000nl\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000o\u0013\u0001\u0000\u0000\u0000pq\u0003\u0016"+
		"\u000b\u0000q\u0015\u0001\u0000\u0000\u0000rv\u0003\u001a\r\u0000sv\u0003"+
		"\u001c\u000e\u0000tv\u0003\u001e\u000f\u0000ur\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0017\u0001\u0000"+
		"\u0000\u0000wz\u0003 \u0010\u0000xz\u0003\"\u0011\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0019\u0001\u0000\u0000\u0000"+
		"{|\u0005\u0010\u0000\u0000|}\u0005\u0011\u0000\u0000}~\u0005\u001e\u0000"+
		"\u0000~\u001b\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0016\u0000\u0000"+
		"\u0080\u0081\u0005\u0017\u0000\u0000\u0081\u0082\u0005\u001e\u0000\u0000"+
		"\u0082\u001d\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0012\u0000\u0000"+
		"\u0084\u0085\u0005\u0016\u0000\u0000\u0085\u0086\u0005\u0013\u0000\u0000"+
		"\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u001f\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0014\u0000\u0000\u0089\u008a\u0005\u001e\u0000\u0000"+
		"\u008a!\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0015\u0000\u0000\u008c"+
		"\u008d\u0005\u001e\u0000\u0000\u008d#\u0001\u0000\u0000\u0000\u000b(4"+
		"?BJPY\\nuy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}