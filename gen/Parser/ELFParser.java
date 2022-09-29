// Generated from /Users/michaelchung/Documents/410/DSL Project/Project1Group16/src/Parser/ELFParser.g4 by ANTLR 4.10.1
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
		GETPATH=8, DELETE=9, DELETEALLFROM=10, MOVE=11, MOVEALLFROM=12, COPY=13, 
		COPYALLFROM=14, RENAME=15, TO=16, IF=17, WHERE=18, RECURSIVELY=19, NAME=20, 
		IS=21, CONTAINS=22, PREFIX=23, SUFFIX=24, DATE=25, BEFORE=26, ON=27, AFTER=28, 
		INFOLDER=29, ATPATH=30, CREATED=31, MODIFIED=32, BY=33, AND=34, AS=35, 
		COMMA=36, SEMICOLON=37, EQUALS=38, WS=39, VAR_TEXT=40, TEXT=41;
	public static final int
		RULE_program = 0, RULE_path = 1, RULE_statement = 2, RULE_statementType = 3, 
		RULE_get = 4, RULE_type = 5, RULE_getType = 6, RULE_getCondition = 7, 
		RULE_command = 8, RULE_commandChoice = 9, RULE_delete = 10, RULE_deleteChoice = 11, 
		RULE_move = 12, RULE_moveChoice = 13, RULE_copy = 14, RULE_copyChoice = 15, 
		RULE_rename = 16, RULE_commandCondition = 17, RULE_getClause = 18, RULE_commandClause = 19, 
		RULE_nameClause = 20, RULE_nameCondition = 21, RULE_modifiedClause = 22, 
		RULE_dateClause = 23, RULE_dateCondition = 24, RULE_folderClause = 25, 
		RULE_pathClause = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "path", "statement", "statementType", "get", "type", "getType", 
			"getCondition", "command", "commandChoice", "delete", "deleteChoice", 
			"move", "moveChoice", "copy", "copyChoice", "rename", "commandCondition", 
			"getClause", "commandClause", "nameClause", "nameCondition", "modifiedClause", 
			"dateClause", "dateCondition", "folderClause", "pathClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'path'", null, null, null, "'get file'", "'get all files'", "'get folder'", 
			null, null, null, null, null, null, null, null, null, "'if'", "'where'", 
			"'recursively'", "'name'", null, null, null, null, "'date'", null, null, 
			null, null, null, "'created'", "'modified'", null, "'AND'", null, "','", 
			"';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PATH", "FILE", "FILES", "FOLDER", "GETFILE", "GETFILES", "GETFOLDER", 
			"GETPATH", "DELETE", "DELETEALLFROM", "MOVE", "MOVEALLFROM", "COPY", 
			"COPYALLFROM", "RENAME", "TO", "IF", "WHERE", "RECURSIVELY", "NAME", 
			"IS", "CONTAINS", "PREFIX", "SUFFIX", "DATE", "BEFORE", "ON", "AFTER", 
			"INFOLDER", "ATPATH", "CREATED", "MODIFIED", "BY", "AND", "AS", "COMMA", 
			"SEMICOLON", "EQUALS", "WS", "VAR_TEXT", "TEXT"
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
			setState(54);
			path();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER) | (1L << DELETE) | (1L << DELETEALLFROM) | (1L << MOVE) | (1L << MOVEALLFROM) | (1L << COPY) | (1L << COPYALLFROM) | (1L << RENAME))) != 0)) {
				{
				{
				setState(55);
				statement();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
			setState(63);
			match(PATH);
			setState(64);
			match(EQUALS);
			setState(65);
			match(GETPATH);
			setState(66);
			match(TEXT);
			setState(67);
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
		public StatementTypeContext statementType() {
			return getRuleContext(StatementTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ELFParser.SEMICOLON, 0); }
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
			setState(69);
			statementType();
			setState(70);
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

	public static class StatementTypeContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StatementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterStatementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitStatementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitStatementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementTypeContext statementType() throws RecognitionException {
		StatementTypeContext _localctx = new StatementTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementType);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FILES:
			case FOLDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				get();
				}
				break;
			case DELETE:
			case DELETEALLFROM:
			case MOVE:
			case MOVEALLFROM:
			case COPY:
			case COPYALLFROM:
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				command();
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

	public static class GetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR_TEXT() { return getToken(ELFParser.VAR_TEXT, 0); }
		public TerminalNode EQUALS() { return getToken(ELFParser.EQUALS, 0); }
		public GetTypeContext getType() {
			return getRuleContext(GetTypeContext.class,0);
		}
		public GetConditionContext getCondition() {
			return getRuleContext(GetConditionContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			type();
			setState(77);
			match(VAR_TEXT);
			setState(78);
			match(EQUALS);
			setState(79);
			getType();
			setState(80);
			getCondition();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(ELFParser.FILE, 0); }
		public TerminalNode FILES() { return getToken(ELFParser.FILES, 0); }
		public TerminalNode FOLDER() { return getToken(ELFParser.FOLDER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class GetTypeContext extends ParserRuleContext {
		public TerminalNode GETFILE() { return getToken(ELFParser.GETFILE, 0); }
		public TerminalNode GETFILES() { return getToken(ELFParser.GETFILES, 0); }
		public TerminalNode RECURSIVELY() { return getToken(ELFParser.RECURSIVELY, 0); }
		public TerminalNode GETFOLDER() { return getToken(ELFParser.GETFOLDER, 0); }
		public GetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterGetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitGetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitGetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetTypeContext getType() throws RecognitionException {
		GetTypeContext _localctx = new GetTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_getType);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETFILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(GETFILE);
				}
				break;
			case GETFILES:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(GETFILES);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECURSIVELY) {
					{
					setState(86);
					match(RECURSIVELY);
					}
				}

				}
				break;
			case GETFOLDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(GETFOLDER);
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

	public static class GetConditionContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ELFParser.WHERE, 0); }
		public List<GetClauseContext> getClause() {
			return getRuleContexts(GetClauseContext.class);
		}
		public GetClauseContext getClause(int i) {
			return getRuleContext(GetClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ELFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ELFParser.COMMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(ELFParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ELFParser.AND, i);
		}
		public GetConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterGetCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitGetCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitGetCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetConditionContext getCondition() throws RecognitionException {
		GetConditionContext _localctx = new GetConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(WHERE);
			setState(93);
			getClause();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				match(AND);
				setState(96);
				getClause();
				}
				}
				setState(101);
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
		public CommandChoiceContext commandChoice() {
			return getRuleContext(CommandChoiceContext.class,0);
		}
		public CommandConditionContext commandCondition() {
			return getRuleContext(CommandConditionContext.class,0);
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
		enterRule(_localctx, 16, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			commandChoice();
			setState(103);
			commandCondition();
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

	public static class CommandChoiceContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public CommandChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCommandChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCommandChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCommandChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandChoiceContext commandChoice() throws RecognitionException {
		CommandChoiceContext _localctx = new CommandChoiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commandChoice);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
			case DELETEALLFROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				delete();
				}
				break;
			case MOVE:
			case MOVEALLFROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				move();
				}
				break;
			case COPY:
			case COPYALLFROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				copy();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				rename();
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

	public static class DeleteContext extends ParserRuleContext {
		public DeleteChoiceContext deleteChoice() {
			return getRuleContext(DeleteChoiceContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			deleteChoice();
			setState(112);
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

	public static class DeleteChoiceContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ELFParser.DELETE, 0); }
		public TerminalNode DELETEALLFROM() { return getToken(ELFParser.DELETEALLFROM, 0); }
		public DeleteChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterDeleteChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitDeleteChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitDeleteChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteChoiceContext deleteChoice() throws RecognitionException {
		DeleteChoiceContext _localctx = new DeleteChoiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deleteChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==DELETEALLFROM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MoveContext extends ParserRuleContext {
		public MoveChoiceContext moveChoice() {
			return getRuleContext(MoveChoiceContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			moveChoice();
			setState(117);
			match(VAR_TEXT);
			setState(118);
			match(TO);
			setState(119);
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

	public static class MoveChoiceContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(ELFParser.MOVE, 0); }
		public TerminalNode MOVEALLFROM() { return getToken(ELFParser.MOVEALLFROM, 0); }
		public MoveChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterMoveChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitMoveChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitMoveChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveChoiceContext moveChoice() throws RecognitionException {
		MoveChoiceContext _localctx = new MoveChoiceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moveChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==MOVE || _la==MOVEALLFROM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CopyContext extends ParserRuleContext {
		public CopyChoiceContext copyChoice() {
			return getRuleContext(CopyChoiceContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			copyChoice();
			setState(124);
			match(VAR_TEXT);
			setState(125);
			match(TO);
			setState(126);
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

	public static class CopyChoiceContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(ELFParser.COPY, 0); }
		public TerminalNode COPYALLFROM() { return getToken(ELFParser.COPYALLFROM, 0); }
		public CopyChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCopyChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCopyChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCopyChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyChoiceContext copyChoice() throws RecognitionException {
		CopyChoiceContext _localctx = new CopyChoiceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_copyChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==COPY || _la==COPYALLFROM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ELFParser.RENAME, 0); }
		public TerminalNode VAR_TEXT() { return getToken(ELFParser.VAR_TEXT, 0); }
		public TerminalNode TO() { return getToken(ELFParser.TO, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(RENAME);
			setState(131);
			match(VAR_TEXT);
			setState(132);
			match(TO);
			setState(133);
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

	public static class CommandConditionContext extends ParserRuleContext {
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
		public List<TerminalNode> AND() { return getTokens(ELFParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ELFParser.AND, i);
		}
		public CommandConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterCommandCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitCommandCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitCommandCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandConditionContext commandCondition() throws RecognitionException {
		CommandConditionContext _localctx = new CommandConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commandCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(135);
				match(IF);
				setState(136);
				commandClause();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					match(AND);
					setState(139);
					commandClause();
					}
					}
					setState(144);
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

	public static class GetClauseContext extends ParserRuleContext {
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public ModifiedClauseContext modifiedClause() {
			return getRuleContext(ModifiedClauseContext.class,0);
		}
		public DateClauseContext dateClause() {
			return getRuleContext(DateClauseContext.class,0);
		}
		public FolderClauseContext folderClause() {
			return getRuleContext(FolderClauseContext.class,0);
		}
		public PathClauseContext pathClause() {
			return getRuleContext(PathClauseContext.class,0);
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
		enterRule(_localctx, 36, RULE_getClause);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				nameClause();
				}
				break;
			case MODIFIED:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				modifiedClause();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				dateClause();
				}
				break;
			case INFOLDER:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				folderClause();
				}
				break;
			case ATPATH:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
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

	public static class CommandClauseContext extends ParserRuleContext {
		public FolderClauseContext folderClause() {
			return getRuleContext(FolderClauseContext.class,0);
		}
		public PathClauseContext pathClause() {
			return getRuleContext(PathClauseContext.class,0);
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
		enterRule(_localctx, 38, RULE_commandClause);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFOLDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				folderClause();
				}
				break;
			case ATPATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
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
		public NameConditionContext nameCondition() {
			return getRuleContext(NameConditionContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_nameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(NAME);
			setState(159);
			nameCondition();
			setState(160);
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

	public static class NameConditionContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(ELFParser.IS, 0); }
		public TerminalNode CONTAINS() { return getToken(ELFParser.CONTAINS, 0); }
		public TerminalNode PREFIX() { return getToken(ELFParser.PREFIX, 0); }
		public TerminalNode SUFFIX() { return getToken(ELFParser.SUFFIX, 0); }
		public NameConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterNameCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitNameCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitNameCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameConditionContext nameCondition() throws RecognitionException {
		NameConditionContext _localctx = new NameConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nameCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << CONTAINS) | (1L << PREFIX) | (1L << SUFFIX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ModifiedClauseContext extends ParserRuleContext {
		public TerminalNode MODIFIED() { return getToken(ELFParser.MODIFIED, 0); }
		public TerminalNode BY() { return getToken(ELFParser.BY, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public ModifiedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterModifiedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitModifiedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitModifiedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiedClauseContext modifiedClause() throws RecognitionException {
		ModifiedClauseContext _localctx = new ModifiedClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifiedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(MODIFIED);
			setState(165);
			match(BY);
			setState(166);
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
		public TerminalNode MODIFIED() { return getToken(ELFParser.MODIFIED, 0); }
		public DateConditionContext dateCondition() {
			return getRuleContext(DateConditionContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_dateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DATE);
			setState(169);
			match(MODIFIED);
			setState(170);
			dateCondition();
			setState(171);
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

	public static class DateConditionContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(ELFParser.BEFORE, 0); }
		public TerminalNode ON() { return getToken(ELFParser.ON, 0); }
		public TerminalNode AFTER() { return getToken(ELFParser.AFTER, 0); }
		public DateConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterDateCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitDateCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitDateCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateConditionContext dateCondition() throws RecognitionException {
		DateConditionContext _localctx = new DateConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dateCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEFORE) | (1L << ON) | (1L << AFTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 50, RULE_folderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(INFOLDER);
			setState(176);
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
		enterRule(_localctx, 52, RULE_pathClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ATPATH);
			setState(179);
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
		"\u0004\u0001)\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006X\b\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007b\b\u0007\n\u0007"+
		"\f\u0007e\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tn\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u008d\b\u0011\n\u0011"+
		"\f\u0011\u0090\t\u0011\u0003\u0011\u0092\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0099\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u009d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\u0006\u0001\u0000\u0002\u0004\u0001\u0000\t\n\u0001\u0000"+
		"\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u0015\u0018\u0001\u0000\u001a"+
		"\u001c\u00aa\u00006\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004E\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000"+
		"\u000e\\\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012"+
		"m\u0001\u0000\u0000\u0000\u0014o\u0001\u0000\u0000\u0000\u0016r\u0001"+
		"\u0000\u0000\u0000\u0018t\u0001\u0000\u0000\u0000\u001ay\u0001\u0000\u0000"+
		"\u0000\u001c{\u0001\u0000\u0000\u0000\u001e\u0080\u0001\u0000\u0000\u0000"+
		" \u0082\u0001\u0000\u0000\u0000\"\u0091\u0001\u0000\u0000\u0000$\u0098"+
		"\u0001\u0000\u0000\u0000&\u009c\u0001\u0000\u0000\u0000(\u009e\u0001\u0000"+
		"\u0000\u0000*\u00a2\u0001\u0000\u0000\u0000,\u00a4\u0001\u0000\u0000\u0000"+
		".\u00a8\u0001\u0000\u0000\u00000\u00ad\u0001\u0000\u0000\u00002\u00af"+
		"\u0001\u0000\u0000\u00004\u00b2\u0001\u0000\u0000\u00006:\u0003\u0002"+
		"\u0001\u000079\u0003\u0004\u0002\u000087\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0000\u0000"+
		"\u0001>\u0001\u0001\u0000\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0005"+
		"&\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005)\u0000\u0000CD\u0005%\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005"+
		"%\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HK\u0003\b\u0004\u0000IK\u0003"+
		"\u0010\b\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LM\u0003\n\u0005\u0000MN\u0005(\u0000\u0000NO"+
		"\u0005&\u0000\u0000OP\u0003\f\u0006\u0000PQ\u0003\u000e\u0007\u0000Q\t"+
		"\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u000b\u0001\u0000"+
		"\u0000\u0000T[\u0005\u0005\u0000\u0000UW\u0005\u0006\u0000\u0000VX\u0005"+
		"\u0013\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000Y[\u0005\u0007\u0000\u0000ZT\u0001\u0000\u0000"+
		"\u0000ZU\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\r\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0012\u0000\u0000]c\u0003$\u0012\u0000^_\u0005$"+
		"\u0000\u0000_`\u0005\"\u0000\u0000`b\u0003$\u0012\u0000a^\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u000f\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000fg\u0003\u0012\t\u0000gh\u0003\"\u0011\u0000h\u0011\u0001\u0000"+
		"\u0000\u0000in\u0003\u0014\n\u0000jn\u0003\u0018\f\u0000kn\u0003\u001c"+
		"\u000e\u0000ln\u0003 \u0010\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0013"+
		"\u0001\u0000\u0000\u0000op\u0003\u0016\u000b\u0000pq\u0005(\u0000\u0000"+
		"q\u0015\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000s\u0017\u0001"+
		"\u0000\u0000\u0000tu\u0003\u001a\r\u0000uv\u0005(\u0000\u0000vw\u0005"+
		"\u0010\u0000\u0000wx\u0005(\u0000\u0000x\u0019\u0001\u0000\u0000\u0000"+
		"yz\u0007\u0002\u0000\u0000z\u001b\u0001\u0000\u0000\u0000{|\u0003\u001e"+
		"\u000f\u0000|}\u0005(\u0000\u0000}~\u0005\u0010\u0000\u0000~\u007f\u0005"+
		"(\u0000\u0000\u007f\u001d\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0003"+
		"\u0000\u0000\u0081\u001f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000f"+
		"\u0000\u0000\u0083\u0084\u0005(\u0000\u0000\u0084\u0085\u0005\u0010\u0000"+
		"\u0000\u0085\u0086\u0005)\u0000\u0000\u0086!\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u0011\u0000\u0000\u0088\u008e\u0003&\u0013\u0000\u0089\u008a"+
		"\u0005$\u0000\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b\u008d\u0003"+
		"&\u0013\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092#\u0001\u0000\u0000\u0000\u0093\u0099\u0003(\u0014\u0000"+
		"\u0094\u0099\u0003,\u0016\u0000\u0095\u0099\u0003.\u0017\u0000\u0096\u0099"+
		"\u00032\u0019\u0000\u0097\u0099\u00034\u001a\u0000\u0098\u0093\u0001\u0000"+
		"\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0099%\u0001\u0000\u0000\u0000\u009a\u009d\u00032\u0019\u0000"+
		"\u009b\u009d\u00034\u001a\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\'\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0014\u0000\u0000\u009f\u00a0\u0003*\u0015\u0000\u00a0\u00a1\u0005"+
		")\u0000\u0000\u00a1)\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0004\u0000"+
		"\u0000\u00a3+\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005 \u0000\u0000\u00a5"+
		"\u00a6\u0005!\u0000\u0000\u00a6\u00a7\u0005)\u0000\u0000\u00a7-\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0019\u0000\u0000\u00a9\u00aa\u0005"+
		" \u0000\u0000\u00aa\u00ab\u00030\u0018\u0000\u00ab\u00ac\u0005)\u0000"+
		"\u0000\u00ac/\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0005\u0000\u0000"+
		"\u00ae1\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u001d\u0000\u0000\u00b0"+
		"\u00b1\u0005)\u0000\u0000\u00b13\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001e\u0000\u0000\u00b3\u00b4\u0005)\u0000\u0000\u00b45\u0001\u0000\u0000"+
		"\u0000\n:JWZcm\u008e\u0091\u0098\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}