// Generated from family.g4 by ANTLR 4.5.1

package familyParser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class familyParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CHAR=6, NEWLINE=7, DIGIT=8, 
    PLUS=9;
  public static final int
    RULE_root = 0, RULE_tree = 1, RULE_person = 2, RULE_spouse = 3, RULE_children = 4, 
    RULE_name = 5, RULE_comment = 6;
  public static final String[] ruleNames = {
    "root", "tree", "person", "spouse", "children", "name", "comment"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'\n'", "'S:'", "'C:'", "','", "'%'", null, null, null, "'+'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, "CHAR", "NEWLINE", "DIGIT", "PLUS"
  };
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
  public String getGrammarFileName() { return "family.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }

  public familyParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public TreeContext tree() {
      return getRuleContext(TreeContext.class,0);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(14);
      tree();
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

  public static class TreeContext extends ParserRuleContext {
    public List<PersonContext> person() {
      return getRuleContexts(PersonContext.class);
    }
    public PersonContext person(int i) {
      return getRuleContext(PersonContext.class,i);
    }
    public TreeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tree; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterTree(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitTree(this);
    }
  }

  public final TreeContext tree() throws RecognitionException {
    TreeContext _localctx = new TreeContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_tree);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(17); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(16);
        person();
        }
        }
        setState(19); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==CHAR );
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

  public static class PersonContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class,0);
    }
    public SpouseContext spouse() {
      return getRuleContext(SpouseContext.class,0);
    }
    public ChildrenContext children() {
      return getRuleContext(ChildrenContext.class,0);
    }
    public PersonContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_person; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterPerson(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitPerson(this);
    }
  }

  public final PersonContext person() throws RecognitionException {
    PersonContext _localctx = new PersonContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_person);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(21);
      name();
      setState(23);
      _la = _input.LA(1);
      if (_la==T__1) {
        {
        setState(22);
        spouse();
        }
      }

      setState(26);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(25);
        children();
        }
      }

      setState(28);
      match(T__0);
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

  public static class SpouseContext extends ParserRuleContext {
    public NameContext name() {
      return getRuleContext(NameContext.class,0);
    }
    public SpouseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_spouse; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterSpouse(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitSpouse(this);
    }
  }

  public final SpouseContext spouse() throws RecognitionException {
    SpouseContext _localctx = new SpouseContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_spouse);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(30);
      match(T__1);
      setState(31);
      name();
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

  public static class ChildrenContext extends ParserRuleContext {
    public List<NameContext> name() {
      return getRuleContexts(NameContext.class);
    }
    public NameContext name(int i) {
      return getRuleContext(NameContext.class,i);
    }
    public ChildrenContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_children; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterChildren(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitChildren(this);
    }
  }

  public final ChildrenContext children() throws RecognitionException {
    ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_children);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(33);
      match(T__2);
      setState(34);
      name();
      setState(39);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__3) {
        {
        {
        setState(35);
        match(T__3);
        setState(36);
        name();
        }
        }
        setState(41);
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

  public static class NameContext extends ParserRuleContext {
    public List<TerminalNode> CHAR() { return getTokens(familyParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(familyParser.CHAR, i);
    }
    public NameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_name; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterName(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitName(this);
    }
  }

  public final NameContext name() throws RecognitionException {
    NameContext _localctx = new NameContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_name);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(42);
        match(CHAR);
        }
        }
        setState(45); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==CHAR );
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

  public static class CommentContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(familyParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof familyListener ) ((familyListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_comment);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(47);
      match(T__4);
      setState(49); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(48);
          _la = _input.LA(1);
          if ( _la <= 0 || (_la==T__0) ) {
          _errHandler.recoverInline(this);
          } else {
            consume();
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(51); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(53);
      match(NEWLINE);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13:\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\6\3\24\n"+
      "\3\r\3\16\3\25\3\4\3\4\5\4\32\n\4\3\4\5\4\35\n\4\3\4\3\4\3\5\3\5\3"+
      "\5\3\6\3\6\3\6\3\6\7\6(\n\6\f\6\16\6+\13\6\3\7\6\7.\n\7\r\7\16\7/"+
      "\3\b\3\b\6\b\64\n\b\r\b\16\b\65\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2"+
      "\3\3\2\3\38\2\20\3\2\2\2\4\23\3\2\2\2\6\27\3\2\2\2\b \3\2\2\2\n#\3"+
      "\2\2\2\f-\3\2\2\2\16\61\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\24\5"+
      "\6\4\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
      "\5\3\2\2\2\27\31\5\f\7\2\30\32\5\b\5\2\31\30\3\2\2\2\31\32\3\2\2\2"+
      "\32\34\3\2\2\2\33\35\5\n\6\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2"+
      "\2\2\36\37\7\3\2\2\37\7\3\2\2\2 !\7\4\2\2!\"\5\f\7\2\"\t\3\2\2\2#"+
      "$\7\5\2\2$)\5\f\7\2%&\7\6\2\2&(\5\f\7\2\'%\3\2\2\2(+\3\2\2\2)\'\3"+
      "\2\2\2)*\3\2\2\2*\13\3\2\2\2+)\3\2\2\2,.\7\b\2\2-,\3\2\2\2./\3\2\2"+
      "\2/-\3\2\2\2/\60\3\2\2\2\60\r\3\2\2\2\61\63\7\7\2\2\62\64\n\2\2\2"+
      "\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
      "\2\2\678\7\t\2\28\17\3\2\2\2\b\25\31\34)/\65";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}