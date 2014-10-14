// $ANTLR 3.5.1 RPGExpr.g 2014-10-14 10:37:15

  package org.asup.il.expr.base.antlr.rpg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RPGExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int A=4;
	public static final int AND=5;
	public static final int ARRAY_INDICATOR=6;
	public static final int B=7;
	public static final int BI_FUN=8;
	public static final int BI_FUNCTION=9;
	public static final int BLOCK=10;
	public static final int BOOLEAN=11;
	public static final int C=12;
	public static final int CHAR_SPECIAL=13;
	public static final int D=14;
	public static final int DATETIME=15;
	public static final int DIGIT=16;
	public static final int DIGIT_SPECIAL=17;
	public static final int DIV=18;
	public static final int E=19;
	public static final int EQ=20;
	public static final int EscapeSequence=21;
	public static final int F=22;
	public static final int FILLER=23;
	public static final int FLOAT=24;
	public static final int G=25;
	public static final int GT=26;
	public static final int GTEQ=27;
	public static final int H=28;
	public static final int HEX=29;
	public static final int HexDigit=30;
	public static final int I=31;
	public static final int INDICATOR=32;
	public static final int INTEGER=33;
	public static final int J=34;
	public static final int K=35;
	public static final int L=36;
	public static final int LETTER=37;
	public static final int LT=38;
	public static final int LTEQ=39;
	public static final int M=40;
	public static final int MINUS=41;
	public static final int MOD=42;
	public static final int MULT=43;
	public static final int N=44;
	public static final int NE=45;
	public static final int NEGATE=46;
	public static final int NOT=47;
	public static final int O=48;
	public static final int OR=49;
	public static final int P=50;
	public static final int PLUS=51;
	public static final int POINT=52;
	public static final int POW=53;
	public static final int Q=54;
	public static final int QUALIFIED=55;
	public static final int R=56;
	public static final int S=57;
	public static final int SPECIAL=58;
	public static final int SP_VALUE=59;
	public static final int STRING=60;
	public static final int T=61;
	public static final int TERM=62;
	public static final int U=63;
	public static final int USER_FUNCTION=64;
	public static final int UnicodeEscape=65;
	public static final int V=66;
	public static final int W=67;
	public static final int WS=68;
	public static final int X=69;
	public static final int Y=70;
	public static final int Z=71;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RPGExprLexer() {} 
	public RPGExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RPGExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "RPGExpr.g"; }

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:11:7: ( '(' )
			// RPGExpr.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:12:7: ( ')' )
			// RPGExpr.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:13:7: ( ':' )
			// RPGExpr.g:13:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:145:2: ( ( H I V A L ) | ( L O V A L ) | ( Z E R O S ) | ( Z E R O ) | ( B L A N K ) | ( B L A N K S ) | ( O N ) | ( O F F ) | ( O M I T ) | ( N U L L ) | ( S T A T U S ) | ( P A R M S ) | ( M S ) | ( N E X T ) )
			int alt1=14;
			switch ( input.LA(1) ) {
			case 'H':
			case 'h':
				{
				alt1=1;
				}
				break;
			case 'L':
			case 'l':
				{
				alt1=2;
				}
				break;
			case 'Z':
			case 'z':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='E'||LA1_3=='e') ) {
					int LA1_10 = input.LA(3);
					if ( (LA1_10=='R'||LA1_10=='r') ) {
						int LA1_17 = input.LA(4);
						if ( (LA1_17=='O'||LA1_17=='o') ) {
							int LA1_19 = input.LA(5);
							if ( (LA1_19=='S'||LA1_19=='s') ) {
								alt1=3;
							}

							else {
								alt1=4;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'B':
			case 'b':
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4=='L'||LA1_4=='l') ) {
					int LA1_11 = input.LA(3);
					if ( (LA1_11=='A'||LA1_11=='a') ) {
						int LA1_18 = input.LA(4);
						if ( (LA1_18=='N'||LA1_18=='n') ) {
							int LA1_20 = input.LA(5);
							if ( (LA1_20=='K'||LA1_20=='k') ) {
								int LA1_23 = input.LA(6);
								if ( (LA1_23=='S'||LA1_23=='s') ) {
									alt1=6;
								}

								else {
									alt1=5;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 20, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'O':
			case 'o':
				{
				switch ( input.LA(2) ) {
				case 'N':
				case 'n':
					{
					alt1=7;
					}
					break;
				case 'F':
				case 'f':
					{
					alt1=8;
					}
					break;
				case 'M':
				case 'm':
					{
					alt1=9;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'N':
			case 'n':
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6=='U'||LA1_6=='u') ) {
					alt1=10;
				}
				else if ( (LA1_6=='E'||LA1_6=='e') ) {
					alt1=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
			case 's':
				{
				alt1=11;
				}
				break;
			case 'P':
			case 'p':
				{
				alt1=12;
				}
				break;
			case 'M':
			case 'm':
				{
				alt1=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// RPGExpr.g:145:4: ( H I V A L )
					{
					// RPGExpr.g:145:4: ( H I V A L )
					// RPGExpr.g:145:6: H I V A L
					{
					mH(); 

					mI(); 

					mV(); 

					mA(); 

					mL(); 

					}

					}
					break;
				case 2 :
					// RPGExpr.g:147:3: ( L O V A L )
					{
					// RPGExpr.g:147:3: ( L O V A L )
					// RPGExpr.g:147:5: L O V A L
					{
					mL(); 

					mO(); 

					mV(); 

					mA(); 

					mL(); 

					}

					}
					break;
				case 3 :
					// RPGExpr.g:149:3: ( Z E R O S )
					{
					// RPGExpr.g:149:3: ( Z E R O S )
					// RPGExpr.g:149:5: Z E R O S
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					mS(); 

					}

					}
					break;
				case 4 :
					// RPGExpr.g:151:3: ( Z E R O )
					{
					// RPGExpr.g:151:3: ( Z E R O )
					// RPGExpr.g:151:5: Z E R O
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					}

					}
					break;
				case 5 :
					// RPGExpr.g:153:3: ( B L A N K )
					{
					// RPGExpr.g:153:3: ( B L A N K )
					// RPGExpr.g:153:5: B L A N K
					{
					mB(); 

					mL(); 

					mA(); 

					mN(); 

					mK(); 

					}

					}
					break;
				case 6 :
					// RPGExpr.g:155:3: ( B L A N K S )
					{
					// RPGExpr.g:155:3: ( B L A N K S )
					// RPGExpr.g:155:5: B L A N K S
					{
					mB(); 

					mL(); 

					mA(); 

					mN(); 

					mK(); 

					mS(); 

					}

					}
					break;
				case 7 :
					// RPGExpr.g:157:3: ( O N )
					{
					// RPGExpr.g:157:3: ( O N )
					// RPGExpr.g:157:5: O N
					{
					mO(); 

					mN(); 

					}

					}
					break;
				case 8 :
					// RPGExpr.g:159:3: ( O F F )
					{
					// RPGExpr.g:159:3: ( O F F )
					// RPGExpr.g:159:5: O F F
					{
					mO(); 

					mF(); 

					mF(); 

					}

					}
					break;
				case 9 :
					// RPGExpr.g:161:3: ( O M I T )
					{
					// RPGExpr.g:161:3: ( O M I T )
					// RPGExpr.g:161:5: O M I T
					{
					mO(); 

					mM(); 

					mI(); 

					mT(); 

					}

					}
					break;
				case 10 :
					// RPGExpr.g:163:3: ( N U L L )
					{
					// RPGExpr.g:163:3: ( N U L L )
					// RPGExpr.g:163:5: N U L L
					{
					mN(); 

					mU(); 

					mL(); 

					mL(); 

					}

					}
					break;
				case 11 :
					// RPGExpr.g:165:3: ( S T A T U S )
					{
					// RPGExpr.g:165:3: ( S T A T U S )
					// RPGExpr.g:165:5: S T A T U S
					{
					mS(); 

					mT(); 

					mA(); 

					mT(); 

					mU(); 

					mS(); 

					}

					}
					break;
				case 12 :
					// RPGExpr.g:167:3: ( P A R M S )
					{
					// RPGExpr.g:167:3: ( P A R M S )
					// RPGExpr.g:167:5: P A R M S
					{
					mP(); 

					mA(); 

					mR(); 

					mM(); 

					mS(); 

					}

					}
					break;
				case 13 :
					// RPGExpr.g:169:3: ( M S )
					{
					// RPGExpr.g:169:3: ( M S )
					// RPGExpr.g:169:5: M S
					{
					mM(); 

					mS(); 

					}

					}
					break;
				case 14 :
					// RPGExpr.g:171:3: ( N E X T )
					{
					// RPGExpr.g:171:3: ( N E X T )
					// RPGExpr.g:171:5: N E X T
					{
					mN(); 

					mE(); 

					mX(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:175:5: ( '||' | ( O R ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='|') ) {
				alt2=1;
			}
			else if ( (LA2_0=='O'||LA2_0=='o') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// RPGExpr.g:175:8: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// RPGExpr.g:175:15: ( O R )
					{
					// RPGExpr.g:175:15: ( O R )
					// RPGExpr.g:175:16: O R
					{
					mO(); 

					mR(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:176:6: ( '&&' | ( A N D ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='&') ) {
				alt3=1;
			}
			else if ( (LA3_0=='A'||LA3_0=='a') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// RPGExpr.g:176:9: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// RPGExpr.g:176:16: ( A N D )
					{
					// RPGExpr.g:176:16: ( A N D )
					// RPGExpr.g:176:17: A N D
					{
					mA(); 

					mN(); 

					mD(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:177:5: ( '!' | ( N O T ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!') ) {
				alt4=1;
			}
			else if ( (LA4_0=='N'||LA4_0=='n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// RPGExpr.g:177:7: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// RPGExpr.g:177:14: ( N O T )
					{
					// RPGExpr.g:177:14: ( N O T )
					// RPGExpr.g:177:15: N O T
					{
					mN(); 

					mO(); 

					mT(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:179:4: ( '=' | '==' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='=') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='=') ) {
					alt5=2;
				}

				else {
					alt5=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// RPGExpr.g:179:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// RPGExpr.g:179:13: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:180:4: ( '!=' | '<>' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='!') ) {
				alt6=1;
			}
			else if ( (LA6_0=='<') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// RPGExpr.g:180:6: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// RPGExpr.g:180:13: '<>'
					{
					match("<>"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:181:4: ( '<' )
			// RPGExpr.g:181:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:182:6: ( '<=' )
			// RPGExpr.g:182:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:183:4: ( '>' )
			// RPGExpr.g:183:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:184:6: ( '>=' )
			// RPGExpr.g:184:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:186:6: ( '+' )
			// RPGExpr.g:186:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:187:7: ( '-' )
			// RPGExpr.g:187:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:188:6: ( '*' )
			// RPGExpr.g:188:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:189:5: ( '/' )
			// RPGExpr.g:189:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:190:5: ( '%' )
			// RPGExpr.g:190:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "POW"
	public final void mPOW() throws RecognitionException {
		try {
			int _type = POW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:191:5: ( '**' )
			// RPGExpr.g:191:7: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POW"

	// $ANTLR start "FILLER"
	public final void mFILLER() throws RecognitionException {
		try {
			int _type = FILLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:193:8: ( '*ALL' )
			// RPGExpr.g:193:10: '*ALL'
			{
			match("*ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILLER"

	// $ANTLR start "BI_FUN"
	public final void mBI_FUN() throws RecognitionException {
		try {
			int _type = BI_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:196:9: ( '%' TERM )
			// RPGExpr.g:196:11: '%' TERM
			{
			match('%'); 
			mTERM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BI_FUN"

	// $ANTLR start "INDICATOR"
	public final void mINDICATOR() throws RecognitionException {
		try {
			int _type = INDICATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:199:11: ( ( '*IN' ( LETTER | DIGIT )* ) )
			// RPGExpr.g:199:13: ( '*IN' ( LETTER | DIGIT )* )
			{
			// RPGExpr.g:199:13: ( '*IN' ( LETTER | DIGIT )* )
			// RPGExpr.g:199:14: '*IN' ( LETTER | DIGIT )*
			{
			match("*IN"); 

			// RPGExpr.g:199:20: ( LETTER | DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='$'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')||LA7_0=='\u00A3'||LA7_0=='\u00A7') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// RPGExpr.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDICATOR"

	// $ANTLR start "ARRAY_INDICATOR"
	public final void mARRAY_INDICATOR() throws RecognitionException {
		try {
			int _type = ARRAY_INDICATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:202:17: ( '*IN(' ( LETTER | DIGIT )* ')' )
			// RPGExpr.g:202:19: '*IN(' ( LETTER | DIGIT )* ')'
			{
			match("*IN("); 

			// RPGExpr.g:202:26: ( LETTER | DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='$'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')||LA8_0=='\u00A3'||LA8_0=='\u00A7') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// RPGExpr.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY_INDICATOR"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:205:5: ( ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\'' )
			// RPGExpr.g:205:9: ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\''
			{
			// RPGExpr.g:205:9: ( 'X\\'' | 'x\\'' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='X') ) {
				alt9=1;
			}
			else if ( (LA9_0=='x') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// RPGExpr.g:205:10: 'X\\''
					{
					match("X'"); 

					}
					break;
				case 2 :
					// RPGExpr.g:205:16: 'x\\''
					{
					match("x'"); 

					}
					break;

			}

			// RPGExpr.g:205:23: ( HexDigit )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// RPGExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// RPGExpr.g:209:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// RPGExpr.g:209:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// RPGExpr.g:211:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\'') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='\'') ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '&')||(LA11_0 >= '(' && LA11_0 <= '\uFFFF')) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// RPGExpr.g:211:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// RPGExpr.g:212:4: c=~ ( '\\'' | '\\r' | '\\n' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c);
					}
					break;

				default :
					break loop11;
				}
			}

			match('\''); 
			 setText(b.toString()); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:219:2: ( ( '0' .. '9' )+ )
			// RPGExpr.g:219:4: ( '0' .. '9' )+
			{
			// RPGExpr.g:219:4: ( '0' .. '9' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// RPGExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:223:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// RPGExpr.g:223:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// RPGExpr.g:223:4: ( '0' .. '9' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// RPGExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			mDIGIT_SPECIAL(); 

			// RPGExpr.g:223:30: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// RPGExpr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DATETIME"
	public final void mDATETIME() throws RecognitionException {
		try {
			int _type = DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:227:3: ( '#' (~ '#' )* '#' )
			// RPGExpr.g:227:5: '#' (~ '#' )* '#'
			{
			match('#'); 
			// RPGExpr.g:227:9: (~ '#' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\"')||(LA15_0 >= '$' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// RPGExpr.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop15;
				}
			}

			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATETIME"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:231:2: ( ( T R U E ) | ( F A L S E ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='T'||LA16_0=='t') ) {
				alt16=1;
			}
			else if ( (LA16_0=='F'||LA16_0=='f') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// RPGExpr.g:231:4: ( T R U E )
					{
					// RPGExpr.g:231:4: ( T R U E )
					// RPGExpr.g:231:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// RPGExpr.g:232:4: ( F A L S E )
					{
					// RPGExpr.g:232:4: ( F A L S E )
					// RPGExpr.g:232:5: F A L S E
					{
					mF(); 

					mA(); 

					mL(); 

					mS(); 

					mE(); 

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:236:2: ( LETTER ( LETTER | DIGIT )* )
			// RPGExpr.g:236:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// RPGExpr.g:236:11: ( LETTER | DIGIT )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='$'||(LA17_0 >= '0' && LA17_0 <= '9')||(LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'a' && LA17_0 <= 'z')||LA17_0=='\u00A3'||LA17_0=='\u00A7') ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// RPGExpr.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERM"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:240:3: ( '.' )
			// RPGExpr.g:240:5: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// RPGExpr.g:244:3: ( ( '0' .. '9' ) )
			// RPGExpr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// RPGExpr.g:248:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '_' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='$'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_SPECIAL"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// RPGExpr.g:252:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// RPGExpr.g:257:2: ( '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape ) )
			// RPGExpr.g:257:4: '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			{
			match('\\'); 
			// RPGExpr.g:258:4: ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			int alt18=6;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt18=1;
				}
				break;
			case 'r':
				{
				alt18=2;
				}
				break;
			case 't':
				{
				alt18=3;
				}
				break;
			case '\'':
				{
				alt18=4;
				}
				break;
			case '\\':
				{
				alt18=5;
				}
				break;
			case 'u':
				{
				alt18=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// RPGExpr.g:259:5: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// RPGExpr.g:260:4: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// RPGExpr.g:261:4: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// RPGExpr.g:262:4: '\\''
					{
					match('\''); 
					}
					break;
				case 5 :
					// RPGExpr.g:263:4: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 6 :
					// RPGExpr.g:264:4: UnicodeEscape
					{
					mUnicodeEscape(); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// RPGExpr.g:269:6: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// RPGExpr.g:269:12: 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// RPGExpr.g:273:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// RPGExpr.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "DIGIT_SPECIAL"
	public final void mDIGIT_SPECIAL() throws RecognitionException {
		try {
			// RPGExpr.g:276:3: ( ( ',' | '.' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)==','||input.LA(1)=='.' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT_SPECIAL"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// RPGExpr.g:281:11: ( ( 'a' | 'A' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// RPGExpr.g:282:11: ( ( 'b' | 'B' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// RPGExpr.g:283:11: ( ( 'c' | 'C' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// RPGExpr.g:284:11: ( ( 'd' | 'D' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// RPGExpr.g:285:11: ( ( 'e' | 'E' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// RPGExpr.g:286:11: ( ( 'f' | 'F' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// RPGExpr.g:287:11: ( ( 'g' | 'G' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// RPGExpr.g:288:11: ( ( 'h' | 'H' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// RPGExpr.g:289:11: ( ( 'i' | 'I' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// RPGExpr.g:290:11: ( ( 'j' | 'J' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// RPGExpr.g:291:11: ( ( 'k' | 'K' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// RPGExpr.g:292:11: ( ( 'l' | 'L' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// RPGExpr.g:293:11: ( ( 'm' | 'M' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// RPGExpr.g:294:11: ( ( 'n' | 'N' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// RPGExpr.g:295:11: ( ( 'o' | 'O' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// RPGExpr.g:296:11: ( ( 'p' | 'P' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// RPGExpr.g:297:11: ( ( 'q' | 'Q' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// RPGExpr.g:298:11: ( ( 'r' | 'R' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// RPGExpr.g:299:11: ( ( 's' | 'S' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// RPGExpr.g:300:11: ( ( 't' | 'T' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// RPGExpr.g:301:11: ( ( 'u' | 'U' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// RPGExpr.g:302:11: ( ( 'v' | 'V' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// RPGExpr.g:303:11: ( ( 'w' | 'W' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// RPGExpr.g:304:11: ( ( 'x' | 'X' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// RPGExpr.g:305:11: ( ( 'y' | 'Y' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// RPGExpr.g:306:11: ( ( 'z' | 'Z' ) )
			// RPGExpr.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:312:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// RPGExpr.g:312:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// RPGExpr.g:1:8: ( T__72 | T__73 | T__74 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | POW | FILLER | BI_FUN | INDICATOR | ARRAY_INDICATOR | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS )
		int alt19=32;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// RPGExpr.g:1:10: T__72
				{
				mT__72(); 

				}
				break;
			case 2 :
				// RPGExpr.g:1:16: T__73
				{
				mT__73(); 

				}
				break;
			case 3 :
				// RPGExpr.g:1:22: T__74
				{
				mT__74(); 

				}
				break;
			case 4 :
				// RPGExpr.g:1:28: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 5 :
				// RPGExpr.g:1:36: OR
				{
				mOR(); 

				}
				break;
			case 6 :
				// RPGExpr.g:1:39: AND
				{
				mAND(); 

				}
				break;
			case 7 :
				// RPGExpr.g:1:43: NOT
				{
				mNOT(); 

				}
				break;
			case 8 :
				// RPGExpr.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 9 :
				// RPGExpr.g:1:50: NE
				{
				mNE(); 

				}
				break;
			case 10 :
				// RPGExpr.g:1:53: LT
				{
				mLT(); 

				}
				break;
			case 11 :
				// RPGExpr.g:1:56: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 12 :
				// RPGExpr.g:1:61: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// RPGExpr.g:1:64: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 14 :
				// RPGExpr.g:1:69: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// RPGExpr.g:1:74: MINUS
				{
				mMINUS(); 

				}
				break;
			case 16 :
				// RPGExpr.g:1:80: MULT
				{
				mMULT(); 

				}
				break;
			case 17 :
				// RPGExpr.g:1:85: DIV
				{
				mDIV(); 

				}
				break;
			case 18 :
				// RPGExpr.g:1:89: MOD
				{
				mMOD(); 

				}
				break;
			case 19 :
				// RPGExpr.g:1:93: POW
				{
				mPOW(); 

				}
				break;
			case 20 :
				// RPGExpr.g:1:97: FILLER
				{
				mFILLER(); 

				}
				break;
			case 21 :
				// RPGExpr.g:1:104: BI_FUN
				{
				mBI_FUN(); 

				}
				break;
			case 22 :
				// RPGExpr.g:1:111: INDICATOR
				{
				mINDICATOR(); 

				}
				break;
			case 23 :
				// RPGExpr.g:1:121: ARRAY_INDICATOR
				{
				mARRAY_INDICATOR(); 

				}
				break;
			case 24 :
				// RPGExpr.g:1:137: HEX
				{
				mHEX(); 

				}
				break;
			case 25 :
				// RPGExpr.g:1:141: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// RPGExpr.g:1:148: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 27 :
				// RPGExpr.g:1:156: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// RPGExpr.g:1:162: DATETIME
				{
				mDATETIME(); 

				}
				break;
			case 29 :
				// RPGExpr.g:1:171: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 30 :
				// RPGExpr.g:1:179: TERM
				{
				mTERM(); 

				}
				break;
			case 31 :
				// RPGExpr.g:1:184: POINT
				{
				mPOINT(); 

				}
				break;
			case 32 :
				// RPGExpr.g:1:190: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA19_eotS =
		"\4\uffff\11\41\2\uffff\1\41\1\64\1\uffff\1\66\1\70\2\uffff\1\74\1\uffff"+
		"\1\75\2\41\1\uffff\1\100\1\101\1\uffff\2\41\3\uffff\4\41\1\110\2\41\1"+
		"\15\5\41\1\110\1\41\17\uffff\6\41\1\uffff\1\110\3\41\1\64\2\41\1\16\1"+
		"\136\4\41\1\110\1\41\3\110\2\41\2\uffff\1\147\1\41\4\110\1\41\1\110\1"+
		"\uffff\1\147\2\110";
	static final String DFA19_eofS =
		"\153\uffff";
	static final String DFA19_minS =
		"\1\11\3\uffff\1\111\1\117\1\105\1\114\1\106\1\105\1\124\1\101\1\123\2"+
		"\uffff\1\116\1\75\1\uffff\2\75\2\uffff\1\52\1\uffff\1\44\2\47\1\uffff"+
		"\1\54\1\60\1\uffff\1\122\1\101\3\uffff\2\126\1\122\1\101\1\44\1\106\1"+
		"\111\1\44\1\114\1\130\1\124\1\101\1\122\1\44\1\104\10\uffff\1\116\6\uffff"+
		"\1\125\1\114\2\101\1\117\1\116\1\uffff\1\44\1\124\1\114\1\124\1\44\1\124"+
		"\1\115\1\44\1\50\1\105\1\123\2\114\1\44\1\113\3\44\1\125\1\123\2\uffff"+
		"\1\44\1\105\4\44\1\123\1\44\1\uffff\3\44";
	static final String DFA19_maxS =
		"\1\u00a7\3\uffff\1\151\1\157\1\145\1\154\1\162\1\165\1\164\1\141\1\163"+
		"\2\uffff\1\156\1\75\1\uffff\1\76\1\75\2\uffff\1\111\1\uffff\1\u00a7\2"+
		"\47\1\uffff\2\71\1\uffff\1\162\1\141\3\uffff\2\166\1\162\1\141\1\u00a7"+
		"\1\146\1\151\1\u00a7\1\154\1\170\1\164\1\141\1\162\1\u00a7\1\144\10\uffff"+
		"\1\116\6\uffff\1\165\1\154\2\141\1\157\1\156\1\uffff\1\u00a7\1\164\1\154"+
		"\1\164\1\u00a7\1\164\1\155\1\u00a7\1\50\1\145\1\163\2\154\1\u00a7\1\153"+
		"\3\u00a7\1\165\1\163\2\uffff\1\u00a7\1\145\4\u00a7\1\163\1\u00a7\1\uffff"+
		"\3\u00a7";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\1\3\11\uffff\1\5\1\6\2\uffff\1\10\2\uffff\1\16\1\17\1"+
		"\uffff\1\21\3\uffff\1\31\2\uffff\1\34\2\uffff\1\36\1\33\1\40\17\uffff"+
		"\1\11\1\7\1\13\1\12\1\15\1\14\1\23\1\24\1\uffff\1\20\1\22\1\25\1\30\1"+
		"\32\1\37\6\uffff\1\4\24\uffff\1\27\1\26\10\uffff\1\35\3\uffff";
	static final String DFA19_specialS =
		"\153\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\43\1\uffff\2\43\22\uffff\1\43\1\20\1\uffff\1\36\1\41\1\30\1\16\1\33"+
			"\1\1\1\2\1\26\1\24\1\42\1\25\1\35\1\27\12\34\1\3\1\uffff\1\22\1\21\1"+
			"\23\2\uffff\1\17\1\7\3\41\1\40\1\41\1\4\3\41\1\5\1\14\1\11\1\10\1\13"+
			"\2\41\1\12\1\37\3\41\1\31\1\41\1\6\4\uffff\1\41\1\uffff\1\17\1\7\3\41"+
			"\1\40\1\41\1\4\3\41\1\5\1\14\1\11\1\10\1\13\2\41\1\12\1\37\3\41\1\32"+
			"\1\41\1\6\1\uffff\1\15\46\uffff\1\41\3\uffff\1\41",
			"",
			"",
			"",
			"\1\44\37\uffff\1\44",
			"\1\45\37\uffff\1\45",
			"\1\46\37\uffff\1\46",
			"\1\47\37\uffff\1\47",
			"\1\51\6\uffff\1\52\1\50\3\uffff\1\53\23\uffff\1\51\6\uffff\1\52\1\50"+
			"\3\uffff\1\53",
			"\1\55\11\uffff\1\56\5\uffff\1\54\17\uffff\1\55\11\uffff\1\56\5\uffff"+
			"\1\54",
			"\1\57\37\uffff\1\57",
			"\1\60\37\uffff\1\60",
			"\1\61\37\uffff\1\61",
			"",
			"",
			"\1\62\37\uffff\1\62",
			"\1\63",
			"",
			"\1\65\1\63",
			"\1\67",
			"",
			"",
			"\1\71\26\uffff\1\72\7\uffff\1\73",
			"",
			"\1\76\34\uffff\32\76\4\uffff\1\76\1\uffff\32\76\50\uffff\1\76\3\uffff"+
			"\1\76",
			"\1\77",
			"\1\77",
			"",
			"\1\42\1\uffff\1\42\1\uffff\12\34",
			"\12\42",
			"",
			"\1\102\37\uffff\1\102",
			"\1\103\37\uffff\1\103",
			"",
			"",
			"",
			"\1\104\37\uffff\1\104",
			"\1\105\37\uffff\1\105",
			"\1\106\37\uffff\1\106",
			"\1\107\37\uffff\1\107",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\111\37\uffff\1\111",
			"\1\112\37\uffff\1\112",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\113\37\uffff\1\113",
			"\1\114\37\uffff\1\114",
			"\1\115\37\uffff\1\115",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\120\37\uffff\1\120",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122\37\uffff\1\122",
			"\1\123\37\uffff\1\123",
			"\1\124\37\uffff\1\124",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\135",
			"\1\137\37\uffff\1\137",
			"\1\140\37\uffff\1\140",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\41\13\uffff\12\41\7\uffff\22\41\1\143\7\41\4\uffff\1\41\1\uffff\22"+
			"\41\1\143\7\41\50\uffff\1\41\3\uffff\1\41",
			"\1\144\37\uffff\1\144",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\145\37\uffff\1\145",
			"\1\146\37\uffff\1\146",
			"",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\150\37\uffff\1\150",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\22\41\1\151\7\41\4\uffff\1\41\1\uffff\22"+
			"\41\1\151\7\41\50\uffff\1\41\3\uffff\1\41",
			"\1\152\37\uffff\1\152",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41",
			"\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41\50\uffff"+
			"\1\41\3\uffff\1\41"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__72 | T__73 | T__74 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | POW | FILLER | BI_FUN | INDICATOR | ARRAY_INDICATOR | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS );";
		}
	}

}
