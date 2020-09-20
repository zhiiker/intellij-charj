/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.phodal.charj.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.phodal.charj.lexer.CharjTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_CharjLexer.flex</tt>
 */
public class _CharjLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\2\2\1\1\2\22\0\1\1\3\0\1\41\2\0\1\42\1\43\1\44\1\4\1\0\1\37\2"+
    "\0\1\3\12\6\1\33\1\34\1\0\1\40\3\0\1\5\1\62\1\5\1\45\1\46\1\47\1\63\1\5\1"+
    "\56\1\5\1\51\2\5\1\57\1\54\2\5\1\55\1\60\1\64\1\61\1\5\1\53\1\5\1\52\1\5\4"+
    "\0\1\50\1\0\1\21\1\11\1\25\1\32\1\10\1\16\1\23\1\30\1\13\1\5\1\27\1\17\1\7"+
    "\1\14\1\20\1\26\1\5\1\12\1\22\1\15\1\24\2\5\1\31\2\5\1\35\1\0\1\36\7\0\1\1"+
    "\32\0\1\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\11\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\4\4"+
    "\1\17\1\0\5\4\1\20\1\21\2\4\1\22\4\4"+
    "\1\23\1\4\1\24\1\4\1\25\1\0\2\4\1\26"+
    "\3\4\1\27\3\4\1\30\2\4\1\31\1\4\1\32"+
    "\1\33\2\4\1\34\1\35\2\4\1\36\6\4\1\37"+
    "\2\4\1\40\4\4\1\41\1\42\1\4\1\43\1\44"+
    "\3\4\1\45\1\4\1\46\3\4\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[102];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\65\0\65"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\65\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e"+
    "\0\u04c3\0\u04f8\0\u052d\0\324\0\u0562\0\u0597\0\324\0\u05cc"+
    "\0\u0601\0\u0636\0\u066b\0\65\0\u06a0\0\324\0\u06d5\0\324"+
    "\0\u070a\0\u073f\0\u0774\0\324\0\u07a9\0\u07de\0\u0813\0\324"+
    "\0\u0848\0\u087d\0\u08b2\0\324\0\u08e7\0\u091c\0\324\0\u0951"+
    "\0\324\0\65\0\u0986\0\u09bb\0\324\0\324\0\u09f0\0\u0a25"+
    "\0\324\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\324"+
    "\0\u0b98\0\u0bcd\0\324\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\324"+
    "\0\324\0\u0cd6\0\324\0\324\0\u0d0b\0\u0d40\0\u0d75\0\324"+
    "\0\u0daa\0\324\0\u0ddf\0\u0e14\0\u0e49\0\324";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[102];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\2\1\6\1\7"+
    "\2\5\1\10\1\5\1\11\1\12\1\5\1\13\1\5"+
    "\1\14\3\5\1\15\4\5\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\10\5"+
    "\1\31\1\5\1\32\2\5\1\33\1\5\66\0\2\3"+
    "\65\0\1\34\1\35\65\0\26\5\12\0\20\5\5\0"+
    "\3\5\1\36\10\5\1\37\11\5\12\0\20\5\5\0"+
    "\7\5\1\40\2\5\1\41\13\5\12\0\20\5\5\0"+
    "\2\5\1\42\4\5\1\43\1\5\1\44\14\5\12\0"+
    "\20\5\5\0\23\5\1\45\2\5\12\0\20\5\5\0"+
    "\12\5\1\46\11\5\1\47\1\5\12\0\20\5\5\0"+
    "\17\5\1\50\6\5\12\0\20\5\5\0\10\5\1\51"+
    "\15\5\12\0\20\5\5\0\14\5\1\52\5\5\1\53"+
    "\3\5\12\0\20\5\33\0\1\54\36\0\26\5\12\0"+
    "\1\5\1\55\16\5\5\0\26\5\12\0\12\5\1\56"+
    "\5\5\5\0\26\5\12\0\14\5\1\57\3\5\5\0"+
    "\26\5\12\0\17\5\1\60\2\34\1\0\62\34\4\35"+
    "\1\61\60\35\5\0\2\5\1\62\23\5\12\0\20\5"+
    "\5\0\10\5\1\63\15\5\12\0\20\5\5\0\25\5"+
    "\1\64\12\0\20\5\5\0\6\5\1\65\6\5\1\66"+
    "\10\5\12\0\20\5\5\0\21\5\1\67\4\5\12\0"+
    "\20\5\5\0\10\5\1\70\4\5\1\71\10\5\12\0"+
    "\20\5\5\0\3\5\1\72\22\5\12\0\20\5\5\0"+
    "\13\5\1\73\12\5\12\0\20\5\5\0\10\5\1\74"+
    "\15\5\12\0\20\5\5\0\5\5\1\75\20\5\12\0"+
    "\20\5\5\0\20\5\1\76\5\5\12\0\20\5\5\0"+
    "\16\5\1\77\7\5\12\0\20\5\5\0\26\5\12\0"+
    "\2\5\1\100\15\5\5\0\26\5\12\0\15\5\1\101"+
    "\2\5\3\35\1\102\1\61\60\35\5\0\4\5\1\103"+
    "\21\5\12\0\20\5\5\0\20\5\1\104\5\5\12\0"+
    "\20\5\5\0\11\5\1\105\14\5\12\0\20\5\5\0"+
    "\3\5\1\106\22\5\12\0\20\5\5\0\13\5\1\107"+
    "\12\5\12\0\20\5\5\0\10\5\1\110\15\5\12\0"+
    "\20\5\5\0\7\5\1\111\16\5\12\0\20\5\5\0"+
    "\14\5\1\112\11\5\12\0\20\5\5\0\6\5\1\113"+
    "\10\5\1\114\6\5\12\0\20\5\5\0\22\5\1\115"+
    "\3\5\12\0\20\5\5\0\26\5\12\0\3\5\1\116"+
    "\14\5\5\0\3\5\1\117\22\5\12\0\20\5\5\0"+
    "\23\5\1\120\2\5\12\0\20\5\5\0\5\5\1\121"+
    "\20\5\12\0\20\5\5\0\14\5\1\122\11\5\12\0"+
    "\20\5\5\0\10\5\1\123\15\5\12\0\20\5\5\0"+
    "\7\5\1\124\16\5\12\0\20\5\5\0\20\5\1\125"+
    "\5\5\12\0\20\5\5\0\14\5\1\126\11\5\12\0"+
    "\20\5\5\0\26\5\12\0\4\5\1\127\13\5\5\0"+
    "\5\5\1\130\20\5\12\0\20\5\5\0\10\5\1\131"+
    "\15\5\12\0\20\5\5\0\7\5\1\132\16\5\12\0"+
    "\20\5\5\0\16\5\1\133\7\5\12\0\20\5\5\0"+
    "\10\5\1\134\15\5\12\0\20\5\5\0\16\5\1\135"+
    "\7\5\12\0\20\5\5\0\26\5\12\0\1\5\1\136"+
    "\16\5\5\0\20\5\1\137\5\5\12\0\20\5\5\0"+
    "\3\5\1\140\22\5\12\0\20\5\5\0\26\5\12\0"+
    "\5\5\1\141\12\5\5\0\3\5\1\142\22\5\12\0"+
    "\20\5\5\0\26\5\12\0\6\5\1\143\11\5\5\0"+
    "\26\5\12\0\7\5\1\144\10\5\5\0\26\5\12\0"+
    "\10\5\1\145\7\5\5\0\26\5\12\0\1\146\17\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3710];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\11\11\5\1\1\0\16\1\1\11"+
    "\4\1\1\0\20\1\1\11\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[102];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _CharjLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CharjLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 40: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 41: break;
          case 3: 
            { return SLASH;
            } 
            // fall through
          case 42: break;
          case 4: 
            { return IDENTIFIER;
            } 
            // fall through
          case 43: break;
          case 5: 
            { return COLON;
            } 
            // fall through
          case 44: break;
          case 6: 
            { return SEMICOLON;
            } 
            // fall through
          case 45: break;
          case 7: 
            { return OPEN_BRACE;
            } 
            // fall through
          case 46: break;
          case 8: 
            { return CLOSE_BRACE;
            } 
            // fall through
          case 47: break;
          case 9: 
            { return COMMA;
            } 
            // fall through
          case 48: break;
          case 10: 
            { return EQUAL;
            } 
            // fall through
          case 49: break;
          case 11: 
            { return DOLLAR;
            } 
            // fall through
          case 50: break;
          case 12: 
            { return QUOTA;
            } 
            // fall through
          case 51: break;
          case 13: 
            { return LPAREN;
            } 
            // fall through
          case 52: break;
          case 14: 
            { return RPAREN;
            } 
            // fall through
          case 53: break;
          case 15: 
            { return COMMENT;
            } 
            // fall through
          case 54: break;
          case 16: 
            { return IN_KEYWORD;
            } 
            // fall through
          case 55: break;
          case 17: 
            { return IF_KEYWORD;
            } 
            // fall through
          case 56: break;
          case 18: 
            { return FX_KEYWORD;
            } 
            // fall through
          case 57: break;
          case 19: 
            { return DOUBLE_COLON;
            } 
            // fall through
          case 58: break;
          case 20: 
            { return IN;
            } 
            // fall through
          case 59: break;
          case 21: 
            { return GT;
            } 
            // fall through
          case 60: break;
          case 22: 
            { return END_KEYWORD;
            } 
            // fall through
          case 61: break;
          case 23: 
            { return INT_KEYWORD;
            } 
            // fall through
          case 62: break;
          case 24: 
            { return OUT_KEYWORD;
            } 
            // fall through
          case 63: break;
          case 25: 
            { return PKG_KEYWORD;
            } 
            // fall through
          case 64: break;
          case 26: 
            { return SUB;
            } 
            // fall through
          case 65: break;
          case 27: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 66: break;
          case 28: 
            { return ELIF_KEYWORD;
            } 
            // fall through
          case 67: break;
          case 29: 
            { return ELSE_KEYWORD;
            } 
            // fall through
          case 68: break;
          case 30: 
            { return THEN_KEYWORD;
            } 
            // fall through
          case 69: break;
          case 31: 
            { return MATCH_KEYWORD;
            } 
            // fall through
          case 70: break;
          case 32: 
            { return FLOAT_KEYWORD;
            } 
            // fall through
          case 71: break;
          case 33: 
            { return MEMBER_PLACEHOLDER;
            } 
            // fall through
          case 72: break;
          case 34: 
            { return IMPORT_KEYWORD;
            } 
            // fall through
          case 73: break;
          case 35: 
            { return STRING_KEYWORD;
            } 
            // fall through
          case 74: break;
          case 36: 
            { return STRUCT_KEYWORD;
            } 
            // fall through
          case 75: break;
          case 37: 
            { return PACKAGE_KEYWORD;
            } 
            // fall through
          case 76: break;
          case 38: 
            { return INSTANCE_KEYWORD;
            } 
            // fall through
          case 77: break;
          case 39: 
            { return DEF_KEYWORD;
            } 
            // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
