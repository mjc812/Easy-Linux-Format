// Generated from /Users/michaelchung/Documents/410/Project1Group16/src/Parser/ELFParser.g4 by ANTLR 4.10.1
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
		public TerminalNode GETPATH() { return getToken(ELFParser.GETPATH, 0); }
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
			match(GETPATH);
			setState(48);
			match(TEXT);
			setState(49);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FILES:
			case FOLDER:
				{
				setState(51);
				assignment();
				}
				break;
			case DELETE:
			case MOVE:
			case COPY:
				{
				setState(52);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(55);
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
		public TerminalNode VAR_TEXT() { return getToken(ELFParser.VAR_TEXT, 0); }
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
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			match(VAR_TEXT);
			setState(59);
			match(EQUALS);
			setState(60);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETFILE:
				{
				setState(62);
				match(GETFILE);
				}
				break;
			case GETFILES:
				{
				setState(63);
				match(GETFILES);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECURSIVELY) {
					{
					setState(64);
					match(RECURSIVELY);
					}
				}

				}
				break;
			case GETFOLDER:
				{
				setState(67);
				match(GETFOLDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			getClause();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				match(LOGIC);
				setState(73);
				getClause();
				}
				}
				setState(78);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				{
				setState(79);
				delete();
				}
				break;
			case MOVE:
				{
				setState(80);
				move();
				}
				break;
			case COPY:
				{
				setState(81);
				copy();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(84);
				match(IF);
				setState(85);
				commandClause();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(86);
					match(COMMA);
					setState(87);
					match(LOGIC);
					setState(88);
					commandClause();
					}
					}
					setState(93);
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
			setState(96);
			match(DELETE);
			setState(97);
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
			setState(99);
			match(MOVE);
			setState(100);
			match(VAR_TEXT);
			setState(101);
			match(TO);
			setState(102);
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
			setState(104);
			match(COPY);
			setState(105);
			match(VAR_TEXT);
			setState(106);
			match(TO);
			setState(107);
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
			setState(109);
			match(WHERE);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case DATE:
			case TOUCHED:
				{
				setState(110);
				propertyClause();
				}
				break;
			case INFOLDER:
			case ATPATH:
				{
				setState(111);
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
			setState(114);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				nameClause();
				}
				break;
			case TOUCHED:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				touchedClause();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFOLDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				folderClause();
				}
				break;
			case ATPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
			setState(125);
			match(NAME);
			setState(126);
			match(NAMECONDITION);
			setState(127);
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
			setState(129);
			match(TOUCHED);
			setState(130);
			match(BY);
			setState(131);
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
			setState(133);
			match(DATE);
			setState(134);
			match(TOUCHED);
			setState(135);
			match(DATECONDITION);
			setState(136);
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
			setState(138);
			match(INFOLDER);
			setState(139);
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
			setState(141);
			match(ATPATH);
			setState(142);
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
		"\u0004\u0001\u001e\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0004\u0003"+
		"\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0003"+
		"\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bx\b\u000b\u0001\f\u0001\f\u0003"+
		"\f|\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001"+
		"\u0000\u0002\u0004\u008c\u0000$\u0001\u0000\u0000\u0000\u0002-\u0001\u0000"+
		"\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000"+
		"\bD\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\f`\u0001\u0000"+
		"\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000"+
		"\u0012m\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016w"+
		"\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a}\u0001\u0000"+
		"\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000\u001e\u0085\u0001\u0000"+
		"\u0000\u0000 \u008a\u0001\u0000\u0000\u0000\"\u008d\u0001\u0000\u0000"+
		"\u0000$(\u0003\u0002\u0001\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0005\u001b\u0000\u0000/0\u0005\b\u0000\u000001\u0005\u001e"+
		"\u0000\u000012\u0005\u001a\u0000\u00002\u0003\u0001\u0000\u0000\u0000"+
		"36\u0003\u0006\u0003\u000046\u0003\n\u0005\u000053\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u001a\u0000"+
		"\u00008\u0005\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000:;\u0005"+
		"\u001d\u0000\u0000;<\u0005\u001b\u0000\u0000<=\u0003\b\u0004\u0000=\u0007"+
		"\u0001\u0000\u0000\u0000>E\u0005\u0005\u0000\u0000?A\u0005\u0006\u0000"+
		"\u0000@B\u0005\u000f\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CE\u0005\u0007\u0000\u0000D>\u0001"+
		"\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FL\u0003\u0012\t\u0000GH\u0005\u0019\u0000\u0000"+
		"HI\u0005\u0018\u0000\u0000IK\u0003\u0012\t\u0000JG\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\t\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OS\u0003\f"+
		"\u0006\u0000PS\u0003\u000e\u0007\u0000QS\u0003\u0010\b\u0000RO\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S^\u0001"+
		"\u0000\u0000\u0000TU\u0005\r\u0000\u0000U[\u0003\u0014\n\u0000VW\u0005"+
		"\u0019\u0000\u0000WX\u0005\u0018\u0000\u0000XZ\u0003\u0014\n\u0000YV\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^T\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u000b\u0001"+
		"\u0000\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005\u001d\u0000\u0000b\r"+
		"\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000de\u0005\u001d\u0000\u0000"+
		"ef\u0005\f\u0000\u0000fg\u0005\u001d\u0000\u0000g\u000f\u0001\u0000\u0000"+
		"\u0000hi\u0005\u000b\u0000\u0000ij\u0005\u001d\u0000\u0000jk\u0005\f\u0000"+
		"\u0000kl\u0005\u001d\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mp\u0005"+
		"\u000e\u0000\u0000nq\u0003\u0016\u000b\u0000oq\u0003\u0018\f\u0000pn\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0013\u0001\u0000\u0000"+
		"\u0000rs\u0003\u0016\u000b\u0000s\u0015\u0001\u0000\u0000\u0000tx\u0003"+
		"\u001a\r\u0000ux\u0003\u001c\u000e\u0000vx\u0003\u001e\u000f\u0000wt\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u0017\u0001\u0000\u0000\u0000y|\u0003 \u0010\u0000z|\u0003\"\u0011\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0019\u0001\u0000"+
		"\u0000\u0000}~\u0005\u0010\u0000\u0000~\u007f\u0005\u0011\u0000\u0000"+
		"\u007f\u0080\u0005\u001e\u0000\u0000\u0080\u001b\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0016\u0000\u0000\u0082\u0083\u0005\u0017\u0000\u0000"+
		"\u0083\u0084\u0005\u001e\u0000\u0000\u0084\u001d\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0012\u0000\u0000\u0086\u0087\u0005\u0016\u0000\u0000"+
		"\u0087\u0088\u0005\u0013\u0000\u0000\u0088\u0089\u0005\u001e\u0000\u0000"+
		"\u0089\u001f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0014\u0000\u0000"+
		"\u008b\u008c\u0005\u001e\u0000\u0000\u008c!\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005\u0015\u0000\u0000\u008e\u008f\u0005\u001e\u0000\u0000\u008f"+
		"#\u0001\u0000\u0000\u0000\u000b(5ADLR[^pw{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}