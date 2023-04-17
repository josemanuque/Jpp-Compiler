// DO NOT EDIT
// Generated by JFlex 1.9.0 http://jflex.de/
// source: src/ParserLexer/yylex.jflex

package ParserLexer;
import java_cup.runtime.*;


@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int CADENA = 2;
  public static final int CARACTER = 4;
  public static final int COMENTARIO = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\3\1\4\22\0\1\3"+
    "\1\5\1\6\1\7\1\10\2\0\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\11\23"+
    "\2\0\1\24\1\25\1\26\1\0\1\27\5\30\1\31"+
    "\2\30\1\32\11\30\1\33\7\30\1\34\1\35\1\36"+
    "\1\37\1\40\1\0\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\30\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\30\1\60\1\61\1\62\1\63"+
    "\1\30\1\64\3\30\1\65\1\0\1\66\1\67\u0181\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\2\17\1\20\1\21\1\22\1\1\1\23\1\24\1\25"+
    "\1\26\15\23\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\1\1\2\1\46\1\47\1\50\1\17\1\51"+
    "\1\52\2\0\1\53\1\54\1\55\3\23\1\56\4\23"+
    "\1\57\10\23\1\60\1\61\1\62\1\63\2\0\1\64"+
    "\7\23\1\65\1\66\1\23\1\67\10\23\1\70\1\71"+
    "\1\72\2\23\1\73\4\23\1\74\2\23\1\75\1\76"+
    "\1\77\5\23\1\100\6\23\1\101\1\102\1\103\4\23"+
    "\1\104\1\23\1\105\4\23\1\106\1\107\1\23\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[159];
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
    "\0\0\0\70\0\160\0\250\0\340\0\340\0\u0118\0\u0150"+
    "\0\340\0\340\0\340\0\340\0\340\0\340\0\u0188\0\u01c0"+
    "\0\340\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348"+
    "\0\u0380\0\u03b8\0\340\0\340\0\340\0\u03f0\0\u0428\0\u0460"+
    "\0\u0498\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620"+
    "\0\u0658\0\u0690\0\340\0\340\0\340\0\u06c8\0\u06c8\0\340"+
    "\0\340\0\340\0\u0700\0\340\0\340\0\340\0\340\0\340"+
    "\0\u0738\0\u0770\0\u07a8\0\340\0\340\0\340\0\u07e0\0\340"+
    "\0\u0818\0\u0850\0\u0268\0\340\0\340\0\340\0\u0888\0\u08c0"+
    "\0\u08f8\0\u03b8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u03b8\0\u0a10"+
    "\0\u0a48\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\340"+
    "\0\340\0\340\0\340\0\u0818\0\u0bd0\0\u0850\0\u0c08\0\u0c40"+
    "\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u03b8\0\u03b8\0\u0d90"+
    "\0\u03b8\0\u0dc8\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18"+
    "\0\u0f50\0\u03b8\0\u03b8\0\u03b8\0\u0f88\0\u0fc0\0\u03b8\0\u0ff8"+
    "\0\u1030\0\u1068\0\u10a0\0\u03b8\0\u10d8\0\u1110\0\u03b8\0\u03b8"+
    "\0\u03b8\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u1228\0\u03b8\0\u1260"+
    "\0\u1298\0\u12d0\0\u1308\0\u1340\0\u1378\0\u03b8\0\u03b8\0\u03b8"+
    "\0\u13b0\0\u13e8\0\u1420\0\u1458\0\u03b8\0\u1490\0\u03b8\0\u14c8"+
    "\0\u1500\0\u1538\0\u1570\0\u03b8\0\u03b8\0\u15a8\0\u03b8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\3\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\5\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\4\32\1\33"+
    "\1\5\1\34\1\35\2\32\1\36\1\37\1\40\1\41"+
    "\1\42\2\32\1\43\2\32\1\44\1\45\1\32\1\46"+
    "\1\47\1\50\1\51\1\32\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\56\1\61\1\56\1\62\26\56"+
    "\1\63\32\56\1\64\1\65\1\66\1\64\1\67\1\64"+
    "\1\5\2\64\1\70\23\64\1\71\32\64\40\72\1\73"+
    "\27\72\72\0\1\6\112\0\1\74\56\0\1\75\70\0"+
    "\1\76\5\0\1\77\63\0\1\100\3\0\1\77\104\0"+
    "\1\101\47\0\1\102\1\0\2\103\64\0\1\102\1\0"+
    "\2\25\71\0\1\104\67\0\1\105\67\0\1\106\42\0"+
    "\2\31\1\6\1\31\1\7\63\31\22\0\2\32\4\0"+
    "\4\32\4\0\25\32\25\0\2\32\4\0\4\32\4\0"+
    "\16\32\1\107\1\32\1\110\4\32\25\0\2\32\4\0"+
    "\4\32\4\0\10\32\1\111\14\32\25\0\2\32\4\0"+
    "\4\32\4\0\16\32\1\112\6\32\25\0\2\32\4\0"+
    "\4\32\4\0\13\32\1\113\11\32\25\0\2\32\4\0"+
    "\4\32\4\0\1\32\1\114\11\32\1\115\2\32\1\116"+
    "\6\32\25\0\2\32\4\0\4\32\4\0\6\32\1\117"+
    "\6\32\1\120\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\1\32\1\121\23\32\25\0\2\32\4\0\4\32\4\0"+
    "\16\32\1\122\6\32\25\0\2\32\4\0\4\32\4\0"+
    "\20\32\1\123\4\32\25\0\2\32\4\0\4\32\4\0"+
    "\5\32\1\124\17\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\125\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\20\32\1\126\4\32\25\0\2\32\4\0\4\32\4\0"+
    "\10\32\1\127\14\32\3\0\2\56\1\0\1\56\1\0"+
    "\1\56\1\0\26\56\1\0\32\56\6\0\1\130\67\0"+
    "\1\131\2\0\1\132\56\0\40\72\1\0\27\72\21\0"+
    "\1\133\70\0\2\77\46\0\1\134\15\0\1\134\17\0"+
    "\1\135\51\0\2\136\66\0\2\32\4\0\4\32\4\0"+
    "\16\32\1\137\6\32\25\0\2\32\4\0\4\32\4\0"+
    "\5\32\1\140\17\32\25\0\2\32\4\0\4\32\4\0"+
    "\1\32\1\141\23\32\25\0\2\32\4\0\4\32\4\0"+
    "\11\32\1\142\7\32\1\143\3\32\25\0\2\32\4\0"+
    "\4\32\4\0\13\32\1\144\11\32\25\0\2\32\4\0"+
    "\4\32\4\0\16\32\1\145\6\32\25\0\2\32\4\0"+
    "\4\32\4\0\20\32\1\146\4\32\25\0\2\32\4\0"+
    "\4\32\4\0\22\32\1\147\2\32\25\0\2\32\4\0"+
    "\4\32\4\0\11\32\1\150\13\32\25\0\2\32\4\0"+
    "\4\32\4\0\22\32\1\151\2\32\25\0\2\32\4\0"+
    "\4\32\4\0\11\32\1\152\13\32\25\0\2\32\4\0"+
    "\4\32\4\0\1\32\1\153\20\32\1\154\2\32\25\0"+
    "\2\32\4\0\4\32\4\0\20\32\1\155\4\32\25\0"+
    "\2\32\4\0\4\32\4\0\23\32\1\156\1\32\25\0"+
    "\2\32\4\0\4\32\4\0\11\32\1\157\13\32\24\0"+
    "\1\6\70\0\2\32\4\0\4\32\4\0\13\32\1\160"+
    "\11\32\25\0\2\32\4\0\4\32\4\0\1\32\1\161"+
    "\23\32\25\0\2\32\4\0\4\32\4\0\20\32\1\162"+
    "\4\32\25\0\2\32\4\0\4\32\4\0\6\32\1\163"+
    "\16\32\25\0\2\32\4\0\4\32\4\0\5\32\1\164"+
    "\17\32\25\0\2\32\4\0\4\32\4\0\21\32\1\165"+
    "\3\32\25\0\2\32\4\0\4\32\4\0\1\32\1\166"+
    "\23\32\25\0\2\32\4\0\4\32\4\0\15\32\1\167"+
    "\7\32\25\0\2\32\4\0\4\32\4\0\15\32\1\170"+
    "\7\32\25\0\2\32\4\0\4\32\4\0\4\32\1\171"+
    "\20\32\25\0\2\32\4\0\4\32\4\0\23\32\1\172"+
    "\1\32\25\0\2\32\4\0\4\32\4\0\11\32\1\173"+
    "\13\32\25\0\2\32\4\0\4\32\4\0\5\32\1\174"+
    "\17\32\25\0\2\32\4\0\4\32\4\0\13\32\1\175"+
    "\11\32\25\0\2\32\4\0\4\32\4\0\5\32\1\176"+
    "\17\32\25\0\2\32\4\0\4\32\4\0\12\32\1\177"+
    "\12\32\25\0\2\32\4\0\4\32\4\0\5\32\1\200"+
    "\17\32\25\0\2\32\4\0\4\32\4\0\22\32\1\201"+
    "\2\32\25\0\2\32\4\0\4\32\4\0\22\32\1\202"+
    "\2\32\25\0\2\32\4\0\1\32\1\203\1\204\1\32"+
    "\4\0\25\32\25\0\2\32\4\0\4\32\4\0\20\32"+
    "\1\205\4\32\25\0\2\32\4\0\4\32\4\0\15\32"+
    "\1\206\7\32\25\0\2\32\4\0\4\32\4\0\5\32"+
    "\1\207\17\32\25\0\2\32\4\0\4\32\4\0\1\32"+
    "\1\210\23\32\25\0\2\32\4\0\1\32\1\211\1\212"+
    "\1\213\4\0\25\32\25\0\2\32\4\0\4\32\4\0"+
    "\13\32\1\214\11\32\25\0\2\32\4\0\4\32\4\0"+
    "\15\32\1\215\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\15\32\1\216\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\7\32\1\217\15\32\25\0\2\32\4\0\4\32\4\0"+
    "\15\32\1\220\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\13\32\1\221\11\32\25\0\2\32\4\0\4\32\4\0"+
    "\15\32\1\222\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\223\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\16\32\1\224\6\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\225\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\16\32\1\226\6\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\227\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\20\32\1\230\4\32\25\0\2\32\4\0\4\32\4\0"+
    "\1\32\1\231\23\32\25\0\2\32\4\0\4\32\4\0"+
    "\1\32\1\232\23\32\25\0\2\32\4\0\4\32\4\0"+
    "\11\32\1\233\13\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\234\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\22\32\1\235\2\32\25\0\2\32\4\0\4\32\4\0"+
    "\15\32\1\236\7\32\25\0\2\32\4\0\4\32\4\0"+
    "\7\32\1\237\15\32\3\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5600];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\2\11\2\1\6\11\2\1\1\11\11\1"+
    "\3\11\15\1\3\11\2\1\3\11\1\1\5\11\3\1"+
    "\3\11\1\1\1\11\1\1\2\0\3\11\21\1\4\11"+
    "\2\0\102\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[159];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
   //Código de usuario
    StringBuffer string = new StringBuffer(); // para manejar los strings

    private Symbol symbol(int type) {
        return new Symbol(type, yyline+1, yycolumn+1, yytext());
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }

    private void yyerror(String error) {
        System.err.println("Error Léxico: " + error + " en la línea " + (yyline+1) + " y columna " + (yycolumn+1));
    }

    private void checkChar(StringBuffer s) {
        if (s.length() > 1){
            yyerror("Más de un Caracter para tipo char");
        }
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(sym.EOF);
            }  // fall though
            case 160: break;
            case CADENA: {
              yyerror("String sin cierre"); return symbol(sym.EOF);
            }  // fall though
            case 161: break;
            case CARACTER: {
              yyerror("Char sin cierre"); return symbol(sym.EOF);
            }  // fall though
            case 162: break;
            case COMENTARIO: {
              yyerror("Comentario sin cierre"); return symbol(sym.EOF);
            }  // fall though
            case 163: break;
            default:
          { return new java_cup.runtime.Symbol(sym.EOF); }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
          // fall through
          case 73: break;
          case 2:
            { System.out.println("Error léxico: "+yytext()+" en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1));
            }
          // fall through
          case 74: break;
          case 3:
            { return symbol(sym.EXCLAMACION);
            }
          // fall through
          case 75: break;
          case 4:
            { string.setLength(0); yybegin(CADENA);
            }
          // fall through
          case 76: break;
          case 5:
            { return symbol(sym.OR);
            }
          // fall through
          case 77: break;
          case 6:
            { return symbol(sym.FINEXP);
            }
          // fall through
          case 78: break;
          case 7:
            { string.setLength(0); yybegin(CARACTER);
            }
          // fall through
          case 79: break;
          case 8:
            { return symbol(sym.LPARENT);
            }
          // fall through
          case 80: break;
          case 9:
            { return symbol(sym.RPARENT);
            }
          // fall through
          case 81: break;
          case 10:
            { return symbol(sym.TIMES);
            }
          // fall through
          case 82: break;
          case 11:
            { return symbol(sym.PLUS);
            }
          // fall through
          case 83: break;
          case 12:
            { return symbol(sym.COMA);
            }
          // fall through
          case 84: break;
          case 13:
            { return symbol(sym.MINUS);
            }
          // fall through
          case 85: break;
          case 14:
            { return symbol(sym.DIV);
            }
          // fall through
          case 86: break;
          case 15:
            { return symbol(sym.ENTERO, Integer.parseInt(yytext()));
            }
          // fall through
          case 87: break;
          case 16:
            { return symbol(sym.MENOR_QUE);
            }
          // fall through
          case 88: break;
          case 17:
            { return symbol(sym.EQUIV);
            }
          // fall through
          case 89: break;
          case 18:
            { return symbol(sym.MAYOR_QUE);
            }
          // fall through
          case 90: break;
          case 19:
            { return symbol(sym.ID, yytext());
            }
          // fall through
          case 91: break;
          case 20:
            { return symbol(sym.LPARENT_CUAD);
            }
          // fall through
          case 92: break;
          case 21:
            { return symbol(sym.RPARENT_CUAD);
            }
          // fall through
          case 93: break;
          case 22:
            { return symbol(sym.AND);
            }
          // fall through
          case 94: break;
          case 23:
            { return symbol(sym.INIBLOQUE);
            }
          // fall through
          case 95: break;
          case 24:
            { return symbol(sym.FINBLOQUE);
            }
          // fall through
          case 96: break;
          case 25:
            { return symbol(sym.MODULE);
            }
          // fall through
          case 97: break;
          case 26:
            { string.append(yytext());
            }
          // fall through
          case 98: break;
          case 27:
            { string.append("\t");
            }
          // fall through
          case 99: break;
          case 28:
            { string.append("\n");
            }
          // fall through
          case 100: break;
          case 29:
            { string.append("\r");
            }
          // fall through
          case 101: break;
          case 30:
            { yybegin(YYINITIAL); return symbol(sym.CADENA, string.toString());
            }
          // fall through
          case 102: break;
          case 31:
            { string.append("\\");
            }
          // fall through
          case 103: break;
          case 32:
            { string.append(yytext()); checkChar(string);
            }
          // fall through
          case 104: break;
          case 33:
            { string.append("\t"); checkChar(string);
            }
          // fall through
          case 105: break;
          case 34:
            { string.append("\n"); checkChar(string);
            }
          // fall through
          case 106: break;
          case 35:
            { string.append("\r"); checkChar(string);
            }
          // fall through
          case 107: break;
          case 36:
            { yybegin(YYINITIAL); return symbol(sym.CARACTER, string.toString());
            }
          // fall through
          case 108: break;
          case 37:
            { string.append("\\"); checkChar(string);
            }
          // fall through
          case 109: break;
          case 38:
            { return symbol(sym.DIF);
            }
          // fall through
          case 110: break;
          case 39:
            { return symbol(sym.POWER);
            }
          // fall through
          case 111: break;
          case 40:
            { return symbol(sym.PLUS_UN);
            }
          // fall through
          case 112: break;
          case 41:
            { return symbol(sym.MINUS_UN);
            }
          // fall through
          case 113: break;
          case 42:
            { string.setLength(0); yybegin(COMENTARIO);
            }
          // fall through
          case 114: break;
          case 43:
            { return symbol(sym.MENOR_IGUAL);
            }
          // fall through
          case 115: break;
          case 44:
            { return symbol(sym.DEQUIV);
            }
          // fall through
          case 116: break;
          case 45:
            { return symbol(sym.MAYOR_IGUAL);
            }
          // fall through
          case 117: break;
          case 46:
            { return symbol(sym.DO);
            }
          // fall through
          case 118: break;
          case 47:
            { return symbol(sym.IF);
            }
          // fall through
          case 119: break;
          case 48:
            { string.append("\"");
            }
          // fall through
          case 120: break;
          case 49:
            { string.append("\""); checkChar(string);
            }
          // fall through
          case 121: break;
          case 50:
            { string.append("\'"); checkChar(string);
            }
          // fall through
          case 122: break;
          case 51:
            { yybegin(YYINITIAL);
            }
          // fall through
          case 123: break;
          case 52:
            { return symbol(sym.DECIMAL, new Float(yytext().substring(0,yylength()-1)));
            }
          // fall through
          case 124: break;
          case 53:
            { return symbol(sym.FOR);
            }
          // fall through
          case 125: break;
          case 54:
            { return symbol(sym.INT);
            }
          // fall through
          case 126: break;
          case 55:
            { return symbol(sym.NOT);
            }
          // fall through
          case 127: break;
          case 56:
            { return symbol(sym.CHAR);
            }
          // fall through
          case 128: break;
          case 57:
            { return symbol(sym.ELIF);
            }
          // fall through
          case 129: break;
          case 58:
            { return symbol(sym.ELSE);
            }
          // fall through
          case 130: break;
          case 59:
            { return symbol(sym.MAIN);
            }
          // fall through
          case 131: break;
          case 60:
            { return symbol(sym.TRUE);
            }
          // fall through
          case 132: break;
          case 61:
            { return symbol(sym.BREAK);
            }
          // fall through
          case 133: break;
          case 62:
            { return symbol(sym.FALSE);
            }
          // fall through
          case 134: break;
          case 63:
            { return symbol(sym.FLOAT);
            }
          // fall through
          case 135: break;
          case 64:
            { return symbol(sym.WHILE);
            }
          // fall through
          case 136: break;
          case 65:
            { return symbol(sym.RETURN);
            }
          // fall through
          case 137: break;
          case 66:
            { return symbol(sym.STRING);
            }
          // fall through
          case 138: break;
          case 67:
            { return symbol(sym.BOOLEAN);
            }
          // fall through
          case 139: break;
          case 68:
            { return symbol(sym.READ_INT);
            }
          // fall through
          case 140: break;
          case 69:
            { return symbol(sym.PRINT_INT);
            }
          // fall through
          case 141: break;
          case 70:
            { return symbol(sym.READ_FLOAT);
            }
          // fall through
          case 142: break;
          case 71:
            { return symbol(sym.PRINT_FLOAT);
            }
          // fall through
          case 143: break;
          case 72:
            { return symbol(sym.PRINT_STRING);
            }
          // fall through
          case 144: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
