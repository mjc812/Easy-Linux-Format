// Generated from C:/Users/eliza/OneDrive/Documents/UBC/CPSC-410/Project1Group16/src/Parser\ELFParser.g4 by ANTLR 4.10.1
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
		INFOLDER=29, ATPATH=30, OWNED=31, MODIFIED=32, BY=33, AND=34, AS=35, COMMA=36, 
		SEMICOLON=37, EQUALS=38, WS=39, VAR_TEXT=40, TEXT=41;
	public static final int
		RULE_program = 0, RULE_path = 1, RULE_statement = 2, RULE_statementType = 3, 
		RULE_get = 4, RULE_type = 5, RULE_getType = 6, RULE_command = 7, RULE_delete = 8, 
		RULE_deleteChoice = 9, RULE_move = 10, RULE_moveChoice = 11, RULE_copy = 12, 
		RULE_copyChoice = 13, RULE_rename = 14, RULE_getClause = 15, RULE_commandClause = 16, 
		RULE_nameClause = 17, RULE_nameCondition = 18, RULE_ownedClause = 19, 
		RULE_dateClause = 20, RULE_dateCondition = 21, RULE_folderClause = 22, 
		RULE_pathClause = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "path", "statement", "statementType", "get", "type", "getType", 
			"command", "delete", "deleteChoice", "move", "moveChoice", "copy", "copyChoice", 
			"rename", "getClause", "commandClause", "nameClause", "nameCondition", 
			"ownedClause", "dateClause", "dateCondition", "folderClause", "pathClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'path'", null, null, null, "'get file'", "'get all files'", "'get folder'", 
			null, null, null, null, null, null, null, null, null, "'if'", "'where'", 
			"'recursively'", "'name'", null, null, null, null, "'date'", null, null, 
			null, null, null, "'owned'", "'modified'", null, "'AND'", null, "','", 
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
			"INFOLDER", "ATPATH", "OWNED", "MODIFIED", "BY", "AND", "AS", "COMMA", 
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
			setState(48);
			path();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE) | (1L << FILES) | (1L << FOLDER) | (1L << DELETE) | (1L << DELETEALLFROM) | (1L << MOVE) | (1L << MOVEALLFROM) | (1L << COPY) | (1L << COPYALLFROM) | (1L << RENAME))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(PATH);
			setState(58);
			match(EQUALS);
			setState(59);
			match(GETPATH);
			setState(60);
			match(TEXT);
			setState(61);
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
			setState(63);
			statementType();
			setState(64);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE:
			case FILES:
			case FOLDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
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
				setState(67);
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
		public TerminalNode WHERE() { return getToken(ELFParser.WHERE, 0); }
		public List<GetClauseContext> getClause() {
			return getRuleContexts(GetClauseContext.class);
		}
		public GetClauseContext getClause(int i) {
			return getRuleContext(GetClauseContext.class,i);
		}
		public TerminalNode RECURSIVELY() { return getToken(ELFParser.RECURSIVELY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ELFParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ELFParser.COMMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(ELFParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ELFParser.AND, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			match(VAR_TEXT);
			setState(72);
			match(EQUALS);
			setState(73);
			getType();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVELY) {
				{
				setState(74);
				match(RECURSIVELY);
				}
			}

			setState(77);
			match(WHERE);
			setState(78);
			getClause();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				match(AND);
				setState(81);
				getClause();
				}
				}
				setState(86);
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
			setState(87);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GETFILE) | (1L << GETFILES) | (1L << GETFOLDER))) != 0)) ) {
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
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
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
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
			case DELETEALLFROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				delete();
				}
				break;
			case MOVE:
			case MOVEALLFROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				move();
				}
				break;
			case COPY:
			case COPYALLFROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				copy();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
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
		enterRule(_localctx, 16, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			deleteChoice();
			setState(98);
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
		enterRule(_localctx, 18, RULE_deleteChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 20, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			moveChoice();
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
		enterRule(_localctx, 22, RULE_moveChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 24, RULE_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			copyChoice();
			setState(110);
			match(VAR_TEXT);
			setState(111);
			match(TO);
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
		enterRule(_localctx, 26, RULE_copyChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		public TerminalNode AS() { return getToken(ELFParser.AS, 0); }
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
		enterRule(_localctx, 28, RULE_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(RENAME);
			setState(117);
			match(VAR_TEXT);
			setState(118);
			match(AS);
			setState(119);
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

	public static class GetClauseContext extends ParserRuleContext {
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public OwnedClauseContext ownedClause() {
			return getRuleContext(OwnedClauseContext.class,0);
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
		enterRule(_localctx, 30, RULE_getClause);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				nameClause();
				}
				break;
			case OWNED:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				ownedClause();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				dateClause();
				}
				break;
			case INFOLDER:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				folderClause();
				}
				break;
			case ATPATH:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
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
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public OwnedClauseContext ownedClause() {
			return getRuleContext(OwnedClauseContext.class,0);
		}
		public DateClauseContext dateClause() {
			return getRuleContext(DateClauseContext.class,0);
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
		enterRule(_localctx, 32, RULE_commandClause);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				nameClause();
				}
				break;
			case OWNED:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				ownedClause();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
		enterRule(_localctx, 34, RULE_nameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NAME);
			setState(134);
			nameCondition();
			setState(135);
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
		enterRule(_localctx, 36, RULE_nameCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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

	public static class OwnedClauseContext extends ParserRuleContext {
		public TerminalNode OWNED() { return getToken(ELFParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(ELFParser.BY, 0); }
		public TerminalNode TEXT() { return getToken(ELFParser.TEXT, 0); }
		public OwnedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).enterOwnedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ELFParserListener ) ((ELFParserListener)listener).exitOwnedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ELFParserVisitor ) return ((ELFParserVisitor<? extends T>)visitor).visitOwnedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnedClauseContext ownedClause() throws RecognitionException {
		OwnedClauseContext _localctx = new OwnedClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ownedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(OWNED);
			setState(140);
			match(BY);
			setState(141);
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
		enterRule(_localctx, 40, RULE_dateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(DATE);
			setState(144);
			match(MODIFIED);
			setState(145);
			dateCondition();
			setState(146);
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
		enterRule(_localctx, 42, RULE_dateCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 44, RULE_folderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INFOLDER);
			setState(151);
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
		enterRule(_localctx, 46, RULE_pathClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ATPATH);
			setState(154);
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
		"\u0004\u0001)\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004L\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007`\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u007f\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0084\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0007\u0001\u0000\u0002\u0004\u0001\u0000\u0005\u0007\u0001"+
		"\u0000\t\n\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u0015\u0018"+
		"\u0001\u0000\u001a\u001c\u0091\u00000\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000"+
		"\u0000\bF\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\fY\u0001"+
		"\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000"+
		"\u0000\u0012d\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016"+
		"k\u0001\u0000\u0000\u0000\u0018m\u0001\u0000\u0000\u0000\u001ar\u0001"+
		"\u0000\u0000\u0000\u001ct\u0001\u0000\u0000\u0000\u001e~\u0001\u0000\u0000"+
		"\u0000 \u0083\u0001\u0000\u0000\u0000\"\u0085\u0001\u0000\u0000\u0000"+
		"$\u0089\u0001\u0000\u0000\u0000&\u008b\u0001\u0000\u0000\u0000(\u008f"+
		"\u0001\u0000\u0000\u0000*\u0094\u0001\u0000\u0000\u0000,\u0096\u0001\u0000"+
		"\u0000\u0000.\u0099\u0001\u0000\u0000\u000004\u0003\u0002\u0001\u0000"+
		"13\u0003\u0004\u0002\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001"+
		"\u0001\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0005&\u0000\u0000"+
		";<\u0005\b\u0000\u0000<=\u0005)\u0000\u0000=>\u0005%\u0000\u0000>\u0003"+
		"\u0001\u0000\u0000\u0000?@\u0003\u0006\u0003\u0000@A\u0005%\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BE\u0003\b\u0004\u0000CE\u0003\u000e\u0007"+
		"\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0007\u0001"+
		"\u0000\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005(\u0000\u0000HI\u0005"+
		"&\u0000\u0000IK\u0003\f\u0006\u0000JL\u0005\u0013\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MN\u0005\u0012\u0000\u0000NT\u0003\u001e\u000f\u0000OP\u0005$\u0000\u0000"+
		"PQ\u0005\"\u0000\u0000QS\u0003\u001e\u000f\u0000RO\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\t\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0007\u0000"+
		"\u0000\u0000X\u000b\u0001\u0000\u0000\u0000YZ\u0007\u0001\u0000\u0000"+
		"Z\r\u0001\u0000\u0000\u0000[`\u0003\u0010\b\u0000\\`\u0003\u0014\n\u0000"+
		"]`\u0003\u0018\f\u0000^`\u0003\u001c\u000e\u0000_[\u0001\u0000\u0000\u0000"+
		"_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0003\u0012\t\u0000bc\u0005(\u0000"+
		"\u0000c\u0011\u0001\u0000\u0000\u0000de\u0007\u0002\u0000\u0000e\u0013"+
		"\u0001\u0000\u0000\u0000fg\u0003\u0016\u000b\u0000gh\u0005(\u0000\u0000"+
		"hi\u0005\u0010\u0000\u0000ij\u0005(\u0000\u0000j\u0015\u0001\u0000\u0000"+
		"\u0000kl\u0007\u0003\u0000\u0000l\u0017\u0001\u0000\u0000\u0000mn\u0003"+
		"\u001a\r\u0000no\u0005(\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0005"+
		"(\u0000\u0000q\u0019\u0001\u0000\u0000\u0000rs\u0007\u0004\u0000\u0000"+
		"s\u001b\u0001\u0000\u0000\u0000tu\u0005\u000f\u0000\u0000uv\u0005(\u0000"+
		"\u0000vw\u0005#\u0000\u0000wx\u0005)\u0000\u0000x\u001d\u0001\u0000\u0000"+
		"\u0000y\u007f\u0003\"\u0011\u0000z\u007f\u0003&\u0013\u0000{\u007f\u0003"+
		"(\u0014\u0000|\u007f\u0003,\u0016\u0000}\u007f\u0003.\u0017\u0000~y\u0001"+
		"\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u001f\u0001"+
		"\u0000\u0000\u0000\u0080\u0084\u0003\"\u0011\u0000\u0081\u0084\u0003&"+
		"\u0013\u0000\u0082\u0084\u0003(\u0014\u0000\u0083\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084!\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0014\u0000\u0000"+
		"\u0086\u0087\u0003$\u0012\u0000\u0087\u0088\u0005)\u0000\u0000\u0088#"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0005\u0000\u0000\u008a%\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u001f\u0000\u0000\u008c\u008d\u0005"+
		"!\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\'\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0019\u0000\u0000\u0090\u0091\u0005 \u0000\u0000"+
		"\u0091\u0092\u0003*\u0015\u0000\u0092\u0093\u0005)\u0000\u0000\u0093)"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0006\u0000\u0000\u0095+\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u001d\u0000\u0000\u0097\u0098\u0005"+
		")\u0000\u0000\u0098-\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001e\u0000"+
		"\u0000\u009a\u009b\u0005)\u0000\u0000\u009b/\u0001\u0000\u0000\u0000\u0007"+
		"4DKT_~\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}