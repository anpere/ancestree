// Generated from family.g4 by ANTLR 4.5.1

package familyParser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class familyLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CHAR=6, NEWLINE=7, DIGIT=8, 
    PLUS=9;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "CHAR", "NEWLINE", "DIGIT", 
    "PLUS"
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


  public familyLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "family.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\61\b\1\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
      "\b\5\b\'\n\b\5\b)\n\b\3\t\6\t,\n\t\r\t\16\t-\3\n\3\n\2\2\13\3\3\5"+
      "\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\4\4\2C\\c|\3\2\62;\63\2\3"+
      "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
      "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2"+
      "\2\2\7\32\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r!\3\2\2\2\17(\3\2\2"+
      "\2\21+\3\2\2\2\23/\3\2\2\2\25\26\7\f\2\2\26\4\3\2\2\2\27\30\7U\2\2"+
      "\30\31\7<\2\2\31\6\3\2\2\2\32\33\7E\2\2\33\34\7<\2\2\34\b\3\2\2\2"+
      "\35\36\7.\2\2\36\n\3\2\2\2\37 \7\'\2\2 \f\3\2\2\2!\"\t\2\2\2\"\16"+
      "\3\2\2\2#)\7\f\2\2$&\7\17\2\2%\'\7\f\2\2&%\3\2\2\2&\'\3\2\2\2\')\3"+
      "\2\2\2(#\3\2\2\2($\3\2\2\2)\20\3\2\2\2*,\t\3\2\2+*\3\2\2\2,-\3\2\2"+
      "\2-+\3\2\2\2-.\3\2\2\2.\22\3\2\2\2/\60\7-\2\2\60\24\3\2\2\2\6\2&("+
      "-\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}