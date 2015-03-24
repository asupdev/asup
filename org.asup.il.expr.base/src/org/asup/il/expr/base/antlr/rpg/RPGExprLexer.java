// $ANTLR 3.5.1 RPGExpr.g 2015-03-23 18:16:07

  package org.asup.il.expr.base.antlr.rpg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RPGExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int A=4;
	public static final int ALL=5;
	public static final int AND=6;
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
	public static final int FLOAT=23;
	public static final int G=24;
	public static final int GT=25;
	public static final int GTEQ=26;
	public static final int H=27;
	public static final int HEX=28;
	public static final int HexDigit=29;
	public static final int I=30;
	public static final int IN=31;
	public static final int INDICATOR=32;
	public static final int INNR=33;
	public static final int INNU=34;
	public static final int INTEGER=35;
	public static final int J=36;
	public static final int K=37;
	public static final int L=38;
	public static final int LETTER=39;
	public static final int LT=40;
	public static final int LTEQ=41;
	public static final int M=42;
	public static final int MINUS=43;
	public static final int MOD=44;
	public static final int MULT=45;
	public static final int N=46;
	public static final int NE=47;
	public static final int NOT=48;
	public static final int O=49;
	public static final int OR=50;
	public static final int P=51;
	public static final int PLUS=52;
	public static final int POINT=53;
	public static final int POW=54;
	public static final int Q=55;
	public static final int QUALIFIED=56;
	public static final int R=57;
	public static final int S=58;
	public static final int SIGN_MINUS=59;
	public static final int SIGN_PLUS=60;
	public static final int SPECIAL=61;
	public static final int SP_VALUE=62;
	public static final int STRING=63;
	public static final int T=64;
	public static final int TERM=65;
	public static final int U=66;
	public static final int USER_FUNCTION=67;
	public static final int UnicodeEscape=68;
	public static final int V=69;
	public static final int W=70;
	public static final int WS=71;
	public static final int X=72;
	public static final int Y=73;
	public static final int Z=74;

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

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
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
	// $ANTLR end "T__77"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:214:2: ( ( H I V A L ) | ( L O V A L ) | ( Z E R O S ) | ( Z E R O ) | ( B L A N K ) | ( B L A N K S ) | ( O N ) | ( O F F ) | ( O M I T ) | ( N U L L ) | ( S T A T U S ) | ( P A R M S ) | ( M S ) | ( N E X T ) )
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
					// RPGExpr.g:214:4: ( H I V A L )
					{
					// RPGExpr.g:214:4: ( H I V A L )
					// RPGExpr.g:214:6: H I V A L
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
					// RPGExpr.g:216:3: ( L O V A L )
					{
					// RPGExpr.g:216:3: ( L O V A L )
					// RPGExpr.g:216:5: L O V A L
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
					// RPGExpr.g:218:3: ( Z E R O S )
					{
					// RPGExpr.g:218:3: ( Z E R O S )
					// RPGExpr.g:218:5: Z E R O S
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
					// RPGExpr.g:220:3: ( Z E R O )
					{
					// RPGExpr.g:220:3: ( Z E R O )
					// RPGExpr.g:220:5: Z E R O
					{
					mZ(); 

					mE(); 

					mR(); 

					mO(); 

					}

					}
					break;
				case 5 :
					// RPGExpr.g:222:3: ( B L A N K )
					{
					// RPGExpr.g:222:3: ( B L A N K )
					// RPGExpr.g:222:5: B L A N K
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
					// RPGExpr.g:224:3: ( B L A N K S )
					{
					// RPGExpr.g:224:3: ( B L A N K S )
					// RPGExpr.g:224:5: B L A N K S
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
					// RPGExpr.g:226:3: ( O N )
					{
					// RPGExpr.g:226:3: ( O N )
					// RPGExpr.g:226:5: O N
					{
					mO(); 

					mN(); 

					}

					}
					break;
				case 8 :
					// RPGExpr.g:228:3: ( O F F )
					{
					// RPGExpr.g:228:3: ( O F F )
					// RPGExpr.g:228:5: O F F
					{
					mO(); 

					mF(); 

					mF(); 

					}

					}
					break;
				case 9 :
					// RPGExpr.g:230:3: ( O M I T )
					{
					// RPGExpr.g:230:3: ( O M I T )
					// RPGExpr.g:230:5: O M I T
					{
					mO(); 

					mM(); 

					mI(); 

					mT(); 

					}

					}
					break;
				case 10 :
					// RPGExpr.g:232:3: ( N U L L )
					{
					// RPGExpr.g:232:3: ( N U L L )
					// RPGExpr.g:232:5: N U L L
					{
					mN(); 

					mU(); 

					mL(); 

					mL(); 

					}

					}
					break;
				case 11 :
					// RPGExpr.g:234:3: ( S T A T U S )
					{
					// RPGExpr.g:234:3: ( S T A T U S )
					// RPGExpr.g:234:5: S T A T U S
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
					// RPGExpr.g:236:3: ( P A R M S )
					{
					// RPGExpr.g:236:3: ( P A R M S )
					// RPGExpr.g:236:5: P A R M S
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
					// RPGExpr.g:238:3: ( M S )
					{
					// RPGExpr.g:238:3: ( M S )
					// RPGExpr.g:238:5: M S
					{
					mM(); 

					mS(); 

					}

					}
					break;
				case 14 :
					// RPGExpr.g:240:3: ( N E X T )
					{
					// RPGExpr.g:240:3: ( N E X T )
					// RPGExpr.g:240:5: N E X T
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
			// RPGExpr.g:243:5: ( '||' | ( O R ) )
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
					// RPGExpr.g:243:8: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// RPGExpr.g:243:15: ( O R )
					{
					// RPGExpr.g:243:15: ( O R )
					// RPGExpr.g:243:16: O R
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
			// RPGExpr.g:244:6: ( '&&' | ( A N D ) )
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
					// RPGExpr.g:244:9: '&&'
					{
					match("&&"); 

					}
					break;
				case 2 :
					// RPGExpr.g:244:16: ( A N D )
					{
					// RPGExpr.g:244:16: ( A N D )
					// RPGExpr.g:244:17: A N D
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
			// RPGExpr.g:245:5: ( '!' | ( N O T ) )
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
					// RPGExpr.g:245:7: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// RPGExpr.g:245:14: ( N O T )
					{
					// RPGExpr.g:245:14: ( N O T )
					// RPGExpr.g:245:15: N O T
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
			// RPGExpr.g:247:4: ( '=' | '==' )
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
					// RPGExpr.g:247:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// RPGExpr.g:247:13: '=='
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
			// RPGExpr.g:248:4: ( '!=' | '<>' )
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
					// RPGExpr.g:248:6: '!='
					{
					match("!="); 

					}
					break;
				case 2 :
					// RPGExpr.g:248:13: '<>'
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
			// RPGExpr.g:249:4: ( '<' )
			// RPGExpr.g:249:6: '<'
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
			// RPGExpr.g:250:6: ( '<=' )
			// RPGExpr.g:250:8: '<='
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
			// RPGExpr.g:251:4: ( '>' )
			// RPGExpr.g:251:6: '>'
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
			// RPGExpr.g:252:6: ( '>=' )
			// RPGExpr.g:252:8: '>='
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
			// RPGExpr.g:254:6: ( '+' )
			// RPGExpr.g:254:8: '+'
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
			// RPGExpr.g:255:7: ( '-' )
			// RPGExpr.g:255:9: '-'
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
			// RPGExpr.g:256:6: ( '*' )
			// RPGExpr.g:256:8: '*'
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
			// RPGExpr.g:257:5: ( '/' )
			// RPGExpr.g:257:7: '/'
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
			// RPGExpr.g:258:5: ( '%' )
			// RPGExpr.g:258:7: '%'
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

	// $ANTLR start "BI_FUN"
	public final void mBI_FUN() throws RecognitionException {
		try {
			int _type = BI_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:262:9: ( '%' TERM )
			// RPGExpr.g:262:11: '%' TERM
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

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:277:5: ( MULT I N )
			// RPGExpr.g:278:2: MULT I N
			{
			mMULT(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INNR"
	public final void mINNR() throws RecognitionException {
		try {
			int _type = INNR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:281:6: ( MULT I N ( '0' .. '9' ) ( '0' .. '9' ) )
			// RPGExpr.g:282:2: MULT I N ( '0' .. '9' ) ( '0' .. '9' )
			{
			mMULT(); 

			mI(); 

			mN(); 

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INNR"

	// $ANTLR start "INNU"
	public final void mINNU() throws RecognitionException {
		try {
			int _type = INNU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:285:6: (| MULT I N U ( '1' .. '8' ) | MULT I N H ( '1' .. '8' ) | MULT I N M R | MULT I N O ( A | G | V | F ) | MULT I N L ( '1' .. '9' ) | MULT I N L R | MULT I N R T )
			int alt7=8;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='*') ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2=='I'||LA7_2=='i') ) {
					int LA7_3 = input.LA(3);
					if ( (LA7_3=='N'||LA7_3=='n') ) {
						switch ( input.LA(4) ) {
						case 'U':
						case 'u':
							{
							alt7=2;
							}
							break;
						case 'H':
						case 'h':
							{
							alt7=3;
							}
							break;
						case 'M':
						case 'm':
							{
							alt7=4;
							}
							break;
						case 'O':
						case 'o':
							{
							alt7=5;
							}
							break;
						case 'L':
						case 'l':
							{
							int LA7_9 = input.LA(5);
							if ( ((LA7_9 >= '1' && LA7_9 <= '9')) ) {
								alt7=6;
							}
							else if ( (LA7_9=='R'||LA7_9=='r') ) {
								alt7=7;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 'R':
						case 'r':
							{
							alt7=8;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 4, input);
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
								new NoViableAltException("", 7, 3, input);
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
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				alt7=1;
			}

			switch (alt7) {
				case 1 :
					// RPGExpr.g:286:2: 
					{
					}
					break;
				case 2 :
					// RPGExpr.g:287:2: MULT I N U ( '1' .. '8' )
					{
					mMULT(); 

					mI(); 

					mN(); 

					mU(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '8') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// RPGExpr.g:289:2: MULT I N H ( '1' .. '8' )
					{
					mMULT(); 

					mI(); 

					mN(); 

					mH(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '8') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// RPGExpr.g:291:2: MULT I N M R
					{
					mMULT(); 

					mI(); 

					mN(); 

					mM(); 

					mR(); 

					}
					break;
				case 5 :
					// RPGExpr.g:293:2: MULT I N O ( A | G | V | F )
					{
					mMULT(); 

					mI(); 

					mN(); 

					mO(); 

					if ( input.LA(1)=='A'||(input.LA(1) >= 'F' && input.LA(1) <= 'G')||input.LA(1)=='V'||input.LA(1)=='a'||(input.LA(1) >= 'f' && input.LA(1) <= 'g')||input.LA(1)=='v' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 6 :
					// RPGExpr.g:295:2: MULT I N L ( '1' .. '9' )
					{
					mMULT(); 

					mI(); 

					mN(); 

					mL(); 

					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 7 :
					// RPGExpr.g:297:2: MULT I N L R
					{
					mMULT(); 

					mI(); 

					mN(); 

					mL(); 

					mR(); 

					}
					break;
				case 8 :
					// RPGExpr.g:299:2: MULT I N R T
					{
					mMULT(); 

					mI(); 

					mN(); 

					mR(); 

					mT(); 

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
	// $ANTLR end "INNU"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:303:5: ( A L L )
			// RPGExpr.g:304:2: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RPGExpr.g:308:5: ( ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\'' )
			// RPGExpr.g:308:9: ( 'X\\'' | 'x\\'' ) ( HexDigit )+ '\\''
			{
			// RPGExpr.g:308:9: ( 'X\\'' | 'x\\'' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='X') ) {
				alt8=1;
			}
			else if ( (LA8_0=='x') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// RPGExpr.g:308:10: 'X\\''
					{
					match("X'"); 

					}
					break;
				case 2 :
					// RPGExpr.g:308:16: 'x\\''
					{
					match("x'"); 

					}
					break;

			}

			// RPGExpr.g:308:23: ( HexDigit )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
					alt9=1;
				}

				switch (alt9) {
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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

			// RPGExpr.g:314:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// RPGExpr.g:314:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// RPGExpr.g:316:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\'') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='\'') ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '\uFFFF')) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// RPGExpr.g:316:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// RPGExpr.g:317:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
					break loop10;
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
			// RPGExpr.g:326:2: ( ( '0' .. '9' )+ )
			// RPGExpr.g:326:4: ( '0' .. '9' )+
			{
			// RPGExpr.g:326:4: ( '0' .. '9' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
			// RPGExpr.g:330:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// RPGExpr.g:330:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// RPGExpr.g:330:4: ( '0' .. '9' )*
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
					break loop12;
				}
			}

			mDIGIT_SPECIAL(); 

			// RPGExpr.g:330:30: ( '0' .. '9' )+
			int cnt13=0;
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
			// RPGExpr.g:334:3: ( '#' (~ '#' )* '#' )
			// RPGExpr.g:334:5: '#' (~ '#' )* '#'
			{
			match('#'); 
			// RPGExpr.g:334:9: (~ '#' )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\"')||(LA14_0 >= '$' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
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
					break loop14;
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
			// RPGExpr.g:338:2: ( ( T R U E ) | ( F A L S E ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='T'||LA15_0=='t') ) {
				alt15=1;
			}
			else if ( (LA15_0=='F'||LA15_0=='f') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// RPGExpr.g:338:4: ( T R U E )
					{
					// RPGExpr.g:338:4: ( T R U E )
					// RPGExpr.g:338:5: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}

					}
					break;
				case 2 :
					// RPGExpr.g:339:4: ( F A L S E )
					{
					// RPGExpr.g:339:4: ( F A L S E )
					// RPGExpr.g:339:5: F A L S E
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
			// RPGExpr.g:344:2: ( LETTER ( LETTER | DIGIT )* )
			// RPGExpr.g:344:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// RPGExpr.g:344:11: ( LETTER | DIGIT )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='$'||(LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||(LA16_0 >= 'a' && LA16_0 <= 'z')||LA16_0=='\u00A3'||LA16_0=='\u00A7') ) {
					alt16=1;
				}

				switch (alt16) {
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
					break loop16;
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
			// RPGExpr.g:348:3: ( '.' )
			// RPGExpr.g:348:5: '.'
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
			// RPGExpr.g:352:3: ( ( '0' .. '9' ) )
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
			// RPGExpr.g:356:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '_' ) )
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
			// RPGExpr.g:360:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
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
			// RPGExpr.g:365:2: ( '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape ) )
			// RPGExpr.g:365:4: '\\\\' ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			{
			match('\\'); 
			// RPGExpr.g:366:4: ( 'n' | 'r' | 't' | '\\'' | '\\\\' | UnicodeEscape )
			int alt17=6;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt17=1;
				}
				break;
			case 'r':
				{
				alt17=2;
				}
				break;
			case 't':
				{
				alt17=3;
				}
				break;
			case '\'':
				{
				alt17=4;
				}
				break;
			case '\\':
				{
				alt17=5;
				}
				break;
			case 'u':
				{
				alt17=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// RPGExpr.g:367:5: 'n'
					{
					match('n'); 
					}
					break;
				case 2 :
					// RPGExpr.g:368:4: 'r'
					{
					match('r'); 
					}
					break;
				case 3 :
					// RPGExpr.g:369:4: 't'
					{
					match('t'); 
					}
					break;
				case 4 :
					// RPGExpr.g:370:4: '\\''
					{
					match('\''); 
					}
					break;
				case 5 :
					// RPGExpr.g:371:4: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 6 :
					// RPGExpr.g:372:4: UnicodeEscape
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
			// RPGExpr.g:377:6: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// RPGExpr.g:377:12: 'u' HexDigit HexDigit HexDigit HexDigit
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
			// RPGExpr.g:381:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
			// RPGExpr.g:384:3: ( ( ',' | '.' ) )
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
			// RPGExpr.g:389:11: ( ( 'a' | 'A' ) )
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
			// RPGExpr.g:390:11: ( ( 'b' | 'B' ) )
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
			// RPGExpr.g:391:11: ( ( 'c' | 'C' ) )
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
			// RPGExpr.g:392:11: ( ( 'd' | 'D' ) )
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
			// RPGExpr.g:393:11: ( ( 'e' | 'E' ) )
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
			// RPGExpr.g:394:11: ( ( 'f' | 'F' ) )
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
			// RPGExpr.g:395:11: ( ( 'g' | 'G' ) )
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
			// RPGExpr.g:396:11: ( ( 'h' | 'H' ) )
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
			// RPGExpr.g:397:11: ( ( 'i' | 'I' ) )
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
			// RPGExpr.g:398:11: ( ( 'j' | 'J' ) )
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
			// RPGExpr.g:399:11: ( ( 'k' | 'K' ) )
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
			// RPGExpr.g:400:11: ( ( 'l' | 'L' ) )
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
			// RPGExpr.g:401:11: ( ( 'm' | 'M' ) )
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
			// RPGExpr.g:402:11: ( ( 'n' | 'N' ) )
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
			// RPGExpr.g:403:11: ( ( 'o' | 'O' ) )
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
			// RPGExpr.g:404:11: ( ( 'p' | 'P' ) )
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
			// RPGExpr.g:405:11: ( ( 'q' | 'Q' ) )
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
			// RPGExpr.g:406:11: ( ( 'r' | 'R' ) )
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
			// RPGExpr.g:407:11: ( ( 's' | 'S' ) )
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
			// RPGExpr.g:408:11: ( ( 't' | 'T' ) )
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
			// RPGExpr.g:409:11: ( ( 'u' | 'U' ) )
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
			// RPGExpr.g:410:11: ( ( 'v' | 'V' ) )
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
			// RPGExpr.g:411:11: ( ( 'w' | 'W' ) )
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
			// RPGExpr.g:412:11: ( ( 'x' | 'X' ) )
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
			// RPGExpr.g:413:11: ( ( 'y' | 'Y' ) )
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
			// RPGExpr.g:414:11: ( ( 'z' | 'Z' ) )
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
			// RPGExpr.g:420:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// RPGExpr.g:420:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// RPGExpr.g:1:8: ( T__75 | T__76 | T__77 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS )
		int alt18=32;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// RPGExpr.g:1:10: T__75
				{
				mT__75(); 

				}
				break;
			case 2 :
				// RPGExpr.g:1:16: T__76
				{
				mT__76(); 

				}
				break;
			case 3 :
				// RPGExpr.g:1:22: T__77
				{
				mT__77(); 

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
				// RPGExpr.g:1:93: BI_FUN
				{
				mBI_FUN(); 

				}
				break;
			case 20 :
				// RPGExpr.g:1:100: IN
				{
				mIN(); 

				}
				break;
			case 21 :
				// RPGExpr.g:1:103: INNR
				{
				mINNR(); 

				}
				break;
			case 22 :
				// RPGExpr.g:1:108: INNU
				{
				mINNU(); 

				}
				break;
			case 23 :
				// RPGExpr.g:1:113: ALL
				{
				mALL(); 

				}
				break;
			case 24 :
				// RPGExpr.g:1:117: HEX
				{
				mHEX(); 

				}
				break;
			case 25 :
				// RPGExpr.g:1:121: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// RPGExpr.g:1:128: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 27 :
				// RPGExpr.g:1:136: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// RPGExpr.g:1:142: DATETIME
				{
				mDATETIME(); 

				}
				break;
			case 29 :
				// RPGExpr.g:1:151: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 30 :
				// RPGExpr.g:1:159: TERM
				{
				mTERM(); 

				}
				break;
			case 31 :
				// RPGExpr.g:1:164: POINT
				{
				mPOINT(); 

				}
				break;
			case 32 :
				// RPGExpr.g:1:170: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\1\31\3\uffff\11\42\2\uffff\1\42\1\66\1\uffff\1\70\1\72\2\uffff\1\73\1"+
		"\uffff\1\75\1\uffff\2\42\1\uffff\1\100\1\101\1\uffff\2\42\3\uffff\4\42"+
		"\1\110\2\42\1\15\5\42\1\110\2\42\15\uffff\6\42\1\uffff\1\110\3\42\1\66"+
		"\2\42\1\16\1\136\1\137\4\42\1\110\1\42\3\110\2\42\3\uffff\1\151\1\42\4"+
		"\110\1\42\1\110\1\uffff\1\151\2\110";
	static final String DFA18_eofS =
		"\155\uffff";
	static final String DFA18_minS =
		"\1\11\3\uffff\1\111\1\117\1\105\1\114\1\106\1\105\1\124\1\101\1\123\2"+
		"\uffff\1\114\1\75\1\uffff\2\75\2\uffff\1\111\1\uffff\1\44\1\uffff\2\47"+
		"\1\uffff\1\54\1\60\1\uffff\1\122\1\101\3\uffff\2\126\1\122\1\101\1\44"+
		"\1\106\1\111\1\44\1\114\1\130\1\124\1\101\1\122\1\44\1\104\1\114\7\uffff"+
		"\1\116\5\uffff\1\125\1\114\2\101\1\117\1\116\1\uffff\1\44\1\124\1\114"+
		"\1\124\1\44\1\124\1\115\2\44\1\60\1\105\1\123\2\114\1\44\1\113\3\44\1"+
		"\125\1\123\3\uffff\1\44\1\105\4\44\1\123\1\44\1\uffff\3\44";
	static final String DFA18_maxS =
		"\1\u00a7\3\uffff\1\151\1\157\1\145\1\154\1\162\1\165\1\164\1\141\1\163"+
		"\2\uffff\1\156\1\75\1\uffff\1\76\1\75\2\uffff\1\151\1\uffff\1\u00a7\1"+
		"\uffff\2\47\1\uffff\2\71\1\uffff\1\162\1\141\3\uffff\2\166\1\162\1\141"+
		"\1\u00a7\1\146\1\151\1\u00a7\1\154\1\170\1\164\1\141\1\162\1\u00a7\1\144"+
		"\1\154\7\uffff\1\156\5\uffff\1\165\1\154\2\141\1\157\1\156\1\uffff\1\u00a7"+
		"\1\164\1\154\1\164\1\u00a7\1\164\1\155\2\u00a7\1\165\1\145\1\163\2\154"+
		"\1\u00a7\1\153\3\u00a7\1\165\1\163\3\uffff\1\u00a7\1\145\4\u00a7\1\163"+
		"\1\u00a7\1\uffff\3\u00a7";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\11\uffff\1\5\1\6\2\uffff\1\10\2\uffff\1\16\1\17\1"+
		"\uffff\1\21\1\uffff\1\26\2\uffff\1\31\2\uffff\1\34\2\uffff\1\36\1\33\1"+
		"\40\20\uffff\1\11\1\7\1\13\1\12\1\15\1\14\1\20\1\uffff\1\22\1\23\1\30"+
		"\1\32\1\37\6\uffff\1\4\25\uffff\1\27\1\24\1\25\10\uffff\1\35\3\uffff";
	static final String DFA18_specialS =
		"\155\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\44\1\uffff\2\44\22\uffff\1\44\1\20\1\uffff\1\37\1\42\1\30\1\16\1\34"+
			"\1\1\1\2\1\26\1\24\1\43\1\25\1\36\1\27\12\35\1\3\1\uffff\1\22\1\21\1"+
			"\23\2\uffff\1\17\1\7\3\42\1\41\1\42\1\4\3\42\1\5\1\14\1\11\1\10\1\13"+
			"\2\42\1\12\1\40\3\42\1\32\1\42\1\6\4\uffff\1\42\1\uffff\1\17\1\7\3\42"+
			"\1\41\1\42\1\4\3\42\1\5\1\14\1\11\1\10\1\13\2\42\1\12\1\40\3\42\1\33"+
			"\1\42\1\6\1\uffff\1\15\46\uffff\1\42\3\uffff\1\42",
			"",
			"",
			"",
			"\1\45\37\uffff\1\45",
			"\1\46\37\uffff\1\46",
			"\1\47\37\uffff\1\47",
			"\1\50\37\uffff\1\50",
			"\1\52\6\uffff\1\53\1\51\3\uffff\1\54\23\uffff\1\52\6\uffff\1\53\1\51"+
			"\3\uffff\1\54",
			"\1\56\11\uffff\1\57\5\uffff\1\55\17\uffff\1\56\11\uffff\1\57\5\uffff"+
			"\1\55",
			"\1\60\37\uffff\1\60",
			"\1\61\37\uffff\1\61",
			"\1\62\37\uffff\1\62",
			"",
			"",
			"\1\64\1\uffff\1\63\35\uffff\1\64\1\uffff\1\63",
			"\1\65",
			"",
			"\1\67\1\65",
			"\1\71",
			"",
			"",
			"\1\74\37\uffff\1\74",
			"",
			"\1\76\34\uffff\32\76\4\uffff\1\76\1\uffff\32\76\50\uffff\1\76\3\uffff"+
			"\1\76",
			"",
			"\1\77",
			"\1\77",
			"",
			"\1\43\1\uffff\1\43\1\uffff\12\35",
			"\12\43",
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
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\111\37\uffff\1\111",
			"\1\112\37\uffff\1\112",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\113\37\uffff\1\113",
			"\1\114\37\uffff\1\114",
			"\1\115\37\uffff\1\115",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\120\37\uffff\1\120",
			"\1\121\37\uffff\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122\37\uffff\1\122",
			"",
			"",
			"",
			"",
			"",
			"\1\123\37\uffff\1\123",
			"\1\124\37\uffff\1\124",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"\1\130\37\uffff\1\130",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\12\140\16\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff\1\31\2\uffff"+
			"\1\31\22\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff\1\31\2\uffff\1"+
			"\31",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\42\13\uffff\12\42\7\uffff\22\42\1\145\7\42\4\uffff\1\42\1\uffff\22"+
			"\42\1\145\7\42\50\uffff\1\42\3\uffff\1\42",
			"\1\146\37\uffff\1\146",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"",
			"",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\152\37\uffff\1\152",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\22\42\1\153\7\42\4\uffff\1\42\1\uffff\22"+
			"\42\1\153\7\42\50\uffff\1\42\3\uffff\1\42",
			"\1\154\37\uffff\1\154",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42",
			"\1\42\13\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42\50\uffff"+
			"\1\42\3\uffff\1\42"
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__75 | T__76 | T__77 | SPECIAL | OR | AND | NOT | EQ | NE | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | BI_FUN | IN | INNR | INNU | ALL | HEX | STRING | INTEGER | FLOAT | DATETIME | BOOLEAN | TERM | POINT | WS );";
		}
	}

}
