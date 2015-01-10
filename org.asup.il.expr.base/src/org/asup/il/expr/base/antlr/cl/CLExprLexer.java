// $ANTLR 3.5.1 CLExpr.g 2015-01-10 10:51:41

  package org.asup.il.expr.base.antlr.cl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AND=5;
	public static final int B=6;
	public static final int BCAT=7;
	public static final int BINARY_FUN=8;
	public static final int C=9;
	public static final int CAT=10;
	public static final int CHAR_SPECIAL=11;
	public static final int CLOSE_BRACE=12;
	public static final int D=13;
	public static final int DIGIT=14;
	public static final int DIGIT_SPECIAL=15;
	public static final int DIV=16;
	public static final int E=17;
	public static final int EQ=18;
	public static final int F=19;
	public static final int FLOAT=20;
	public static final int G=21;
	public static final int GT=22;
	public static final int GTEQ=23;
	public static final int H=24;
	public static final int I=25;
	public static final int INTEGER=26;
	public static final int J=27;
	public static final int K=28;
	public static final int L=29;
	public static final int LETTER=30;
	public static final int LT=31;
	public static final int LTEQ=32;
	public static final int M=33;
	public static final int MINUS=34;
	public static final int MULT=35;
	public static final int N=36;
	public static final int NE=37;
	public static final int NEGATE=38;
	public static final int NG=39;
	public static final int NL=40;
	public static final int NOT=41;
	public static final int O=42;
	public static final int OPEN_BRACE=43;
	public static final int OR=44;
	public static final int P=45;
	public static final int PLUS=46;
	public static final int Q=47;
	public static final int R=48;
	public static final int S=49;
	public static final int SST_FUN=50;
	public static final int STRING=51;
	public static final int SWITCH_FUN=52;
	public static final int SWITCH_VALUE=53;
	public static final int T=54;
	public static final int TCAT=55;
	public static final int TERM=56;
	public static final int U=57;
	public static final int V=58;
	public static final int VAR=59;
	public static final int W=60;
	public static final int WS=61;
	public static final int X=62;
	public static final int Y=63;
	public static final int Z=64;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLExprLexer() {} 
	public CLExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "CLExpr.g"; }

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:186:5: ( '&' TERM )
			// CLExpr.g:187:2: '&' TERM
			{
			match('&'); 
			mTERM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// CLExpr.g:191:2: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
			// CLExpr.g:191:4: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
			{
			match('\''); 
			 StringBuilder b = new StringBuilder(); 
			// CLExpr.g:193:2: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\'') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='\'') ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// CLExpr.g:193:4: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\'');
					}
					break;
				case 2 :
					// CLExpr.g:194:4: c=~ ( '\\'' | '\\r' | '\\n' )
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
					break loop1;
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

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:200:5: ( '!' | ( '*' O R ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!') ) {
				alt2=1;
			}
			else if ( (LA2_0=='*') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// CLExpr.g:200:8: '!'
					{
					match('!'); 
					}
					break;
				case 2 :
					// CLExpr.g:200:14: ( '*' O R )
					{
					// CLExpr.g:200:14: ( '*' O R )
					// CLExpr.g:200:15: '*' O R
					{
					match('*'); 
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
			// CLExpr.g:201:6: ( '&' | ( '*' A N D ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='&') ) {
				alt3=1;
			}
			else if ( (LA3_0=='*') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// CLExpr.g:201:9: '&'
					{
					match('&'); 
					}
					break;
				case 2 :
					// CLExpr.g:201:15: ( '*' A N D )
					{
					// CLExpr.g:201:15: ( '*' A N D )
					// CLExpr.g:201:16: '*' A N D
					{
					match('*'); 
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
			// CLExpr.g:202:5: ( ( '*' N O T ) )
			// CLExpr.g:202:7: ( '*' N O T )
			{
			// CLExpr.g:202:7: ( '*' N O T )
			// CLExpr.g:202:8: '*' N O T
			{
			match('*'); 
			mN(); 

			mO(); 

			mT(); 

			}

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
			// CLExpr.g:203:4: ( '=' | ( '*' E Q ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='=') ) {
				alt4=1;
			}
			else if ( (LA4_0=='*') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CLExpr.g:203:6: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// CLExpr.g:203:13: ( '*' E Q )
					{
					// CLExpr.g:203:13: ( '*' E Q )
					// CLExpr.g:203:14: '*' E Q
					{
					match('*'); 
					mE(); 

					mQ(); 

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
	// $ANTLR end "EQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:204:4: ( '>' | ( '*' G T ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='>') ) {
				alt5=1;
			}
			else if ( (LA5_0=='*') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// CLExpr.g:204:6: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// CLExpr.g:204:12: ( '*' G T )
					{
					// CLExpr.g:204:12: ( '*' G T )
					// CLExpr.g:204:13: '*' G T
					{
					match('*'); 
					mG(); 

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
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:205:4: ( '<' | ( '*' L T ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='<') ) {
				alt6=1;
			}
			else if ( (LA6_0=='*') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// CLExpr.g:205:8: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// CLExpr.g:205:14: ( '*' L T )
					{
					// CLExpr.g:205:14: ( '*' L T )
					// CLExpr.g:205:15: '*' L T
					{
					match('*'); 
					mL(); 

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
	// $ANTLR end "LT"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:206:6: ( '*' G E )
			// CLExpr.g:206:8: '*' G E
			{
			match('*'); 
			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:207:6: ( '*' L E )
			// CLExpr.g:207:8: '*' L E
			{
			match('*'); 
			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:208:8: ( '^=' | '*' N E )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='^') ) {
				alt7=1;
			}
			else if ( (LA7_0=='*') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// CLExpr.g:208:11: '^='
					{
					match("^="); 

					}
					break;
				case 2 :
					// CLExpr.g:208:18: '*' N E
					{
					match('*'); 
					mN(); 

					mE(); 

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

	// $ANTLR start "NG"
	public final void mNG() throws RecognitionException {
		try {
			int _type = NG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:209:9: ( '^>' | '*' N G )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='^') ) {
				alt8=1;
			}
			else if ( (LA8_0=='*') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// CLExpr.g:209:12: '^>'
					{
					match("^>"); 

					}
					break;
				case 2 :
					// CLExpr.g:209:19: '*' N G
					{
					match('*'); 
					mN(); 

					mG(); 

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
	// $ANTLR end "NG"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:210:9: ( '^<' | '*' N L )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='^') ) {
				alt9=1;
			}
			else if ( (LA9_0=='*') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// CLExpr.g:210:12: '^<'
					{
					match("^<"); 

					}
					break;
				case 2 :
					// CLExpr.g:210:19: '*' N L
					{
					match('*'); 
					mN(); 

					mL(); 

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
	// $ANTLR end "NL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:212:6: ( '+' )
			// CLExpr.g:212:8: '+'
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
			// CLExpr.g:213:7: ( '-' )
			// CLExpr.g:213:9: '-'
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
			// CLExpr.g:214:6: ( '*' )
			// CLExpr.g:214:8: '*'
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
			// CLExpr.g:215:5: ( '/' )
			// CLExpr.g:215:7: '/'
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

	// $ANTLR start "CAT"
	public final void mCAT() throws RecognitionException {
		try {
			int _type = CAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:217:9: ( '!!' | ( '*' C A T ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='!') ) {
				alt10=1;
			}
			else if ( (LA10_0=='*') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// CLExpr.g:217:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// CLExpr.g:217:18: ( '*' C A T )
					{
					// CLExpr.g:217:18: ( '*' C A T )
					// CLExpr.g:217:19: '*' C A T
					{
					match('*'); 
					mC(); 

					mA(); 

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
	// $ANTLR end "CAT"

	// $ANTLR start "BCAT"
	public final void mBCAT() throws RecognitionException {
		try {
			int _type = BCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:218:9: ( '!>' | ( '*' B C A T ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='!') ) {
				alt11=1;
			}
			else if ( (LA11_0=='*') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// CLExpr.g:218:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// CLExpr.g:218:18: ( '*' B C A T )
					{
					// CLExpr.g:218:18: ( '*' B C A T )
					// CLExpr.g:218:19: '*' B C A T
					{
					match('*'); 
					mB(); 

					mC(); 

					mA(); 

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
	// $ANTLR end "BCAT"

	// $ANTLR start "TCAT"
	public final void mTCAT() throws RecognitionException {
		try {
			int _type = TCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:219:9: ( '!<' | ( '*' T C A T ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='!') ) {
				alt12=1;
			}
			else if ( (LA12_0=='*') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// CLExpr.g:219:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// CLExpr.g:219:18: ( '*' T C A T )
					{
					// CLExpr.g:219:18: ( '*' T C A T )
					// CLExpr.g:219:19: '*' T C A T
					{
					match('*'); 
					mT(); 

					mC(); 

					mA(); 

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
	// $ANTLR end "TCAT"

	// $ANTLR start "TERM"
	public final void mTERM() throws RecognitionException {
		try {
			int _type = TERM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:221:6: ( LETTER ( LETTER | DIGIT )* )
			// CLExpr.g:221:8: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// CLExpr.g:221:15: ( LETTER | DIGIT )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\"'||LA13_0=='$'||(LA13_0 >= '+' && LA13_0 <= '9')||LA13_0=='?'||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')||LA13_0=='\u00A3'||LA13_0=='\u00A7'||LA13_0=='\u00E0'||(LA13_0 >= '\u00E8' && LA13_0 <= '\u00E9')||LA13_0=='\u00EC'||LA13_0=='\u00F2'||LA13_0=='\u00F9') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// CLExpr.g:
					{
					if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERM"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:223:9: ( ( DIGIT )+ )
			// CLExpr.g:224:2: ( DIGIT )+
			{
			// CLExpr.g:224:2: ( DIGIT )+
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
					// CLExpr.g:
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
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:228:2: ( ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+ )
			// CLExpr.g:228:4: ( '0' .. '9' )* DIGIT_SPECIAL ( '0' .. '9' )+
			{
			// CLExpr.g:228:4: ( '0' .. '9' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// CLExpr.g:
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
					break loop15;
				}
			}

			mDIGIT_SPECIAL(); 

			// CLExpr.g:228:30: ( '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// CLExpr.g:
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
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:232:2: ( '(' )
			// CLExpr.g:233:2: '('
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
	// $ANTLR end "OPEN_BRACE"

	// $ANTLR start "CLOSE_BRACE"
	public final void mCLOSE_BRACE() throws RecognitionException {
		try {
			int _type = CLOSE_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:237:2: ( ')' )
			// CLExpr.g:238:2: ')'
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
	// $ANTLR end "CLOSE_BRACE"

	// $ANTLR start "BINARY_FUN"
	public final void mBINARY_FUN() throws RecognitionException {
		try {
			int _type = BINARY_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:242:2: ( '%' B I N A R Y )
			// CLExpr.g:243:2: '%' B I N A R Y
			{
			match('%'); 
			mB(); 

			mI(); 

			mN(); 

			mA(); 

			mR(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINARY_FUN"

	// $ANTLR start "SST_FUN"
	public final void mSST_FUN() throws RecognitionException {
		try {
			int _type = SST_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:247:2: ( '%' S S T )
			// CLExpr.g:248:2: '%' S S T
			{
			match('%'); 
			mS(); 

			mS(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SST_FUN"

	// $ANTLR start "SWITCH_FUN"
	public final void mSWITCH_FUN() throws RecognitionException {
		try {
			int _type = SWITCH_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:252:2: ( '%' S W I T C H )
			// CLExpr.g:253:2: '%' S W I T C H
			{
			match('%'); 
			mS(); 

			mW(); 

			mI(); 

			mT(); 

			mC(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_FUN"

	// $ANTLR start "SWITCH_VALUE"
	public final void mSWITCH_VALUE() throws RecognitionException {
		try {
			int _type = SWITCH_VALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLExpr.g:257:2: ( ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) )
			// CLExpr.g:258:2: ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' ) ( '0' | X | '1' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||input.LA(1)=='X'||input.LA(1)=='x' ) {
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
	// $ANTLR end "SWITCH_VALUE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// CLExpr.g:263:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
			// CLExpr.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// CLExpr.g:268:3: ( ( '\\u00A7' | '_' | '.' | '/' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '\\u00a3' | '?' | '+' | '-' | ',' | '$' ) )
			// CLExpr.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||input.LA(1)=='?'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// CLExpr.g:291:3: ( ( '0' .. '9' ) )
			// CLExpr.g:
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

	// $ANTLR start "DIGIT_SPECIAL"
	public final void mDIGIT_SPECIAL() throws RecognitionException {
		try {
			// CLExpr.g:296:3: ( ( ',' | '.' ) )
			// CLExpr.g:
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
			// CLExpr.g:299:11: ( ( 'a' | 'A' ) )
			// CLExpr.g:
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
			// CLExpr.g:300:11: ( ( 'b' | 'B' ) )
			// CLExpr.g:
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
			// CLExpr.g:301:11: ( ( 'c' | 'C' ) )
			// CLExpr.g:
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
			// CLExpr.g:302:11: ( ( 'd' | 'D' ) )
			// CLExpr.g:
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
			// CLExpr.g:303:11: ( ( 'e' | 'E' ) )
			// CLExpr.g:
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
			// CLExpr.g:304:11: ( ( 'f' | 'F' ) )
			// CLExpr.g:
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
			// CLExpr.g:305:11: ( ( 'g' | 'G' ) )
			// CLExpr.g:
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
			// CLExpr.g:306:11: ( ( 'h' | 'H' ) )
			// CLExpr.g:
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
			// CLExpr.g:307:11: ( ( 'i' | 'I' ) )
			// CLExpr.g:
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
			// CLExpr.g:308:11: ( ( 'j' | 'J' ) )
			// CLExpr.g:
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
			// CLExpr.g:309:11: ( ( 'k' | 'K' ) )
			// CLExpr.g:
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
			// CLExpr.g:310:11: ( ( 'l' | 'L' ) )
			// CLExpr.g:
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
			// CLExpr.g:311:11: ( ( 'm' | 'M' ) )
			// CLExpr.g:
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
			// CLExpr.g:312:11: ( ( 'n' | 'N' ) )
			// CLExpr.g:
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
			// CLExpr.g:313:11: ( ( 'o' | 'O' ) )
			// CLExpr.g:
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
			// CLExpr.g:314:11: ( ( 'p' | 'P' ) )
			// CLExpr.g:
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
			// CLExpr.g:315:11: ( ( 'q' | 'Q' ) )
			// CLExpr.g:
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
			// CLExpr.g:316:11: ( ( 'r' | 'R' ) )
			// CLExpr.g:
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
			// CLExpr.g:317:11: ( ( 's' | 'S' ) )
			// CLExpr.g:
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
			// CLExpr.g:318:11: ( ( 't' | 'T' ) )
			// CLExpr.g:
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
			// CLExpr.g:319:11: ( ( 'u' | 'U' ) )
			// CLExpr.g:
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
			// CLExpr.g:320:11: ( ( 'v' | 'V' ) )
			// CLExpr.g:
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
			// CLExpr.g:321:11: ( ( 'w' | 'W' ) )
			// CLExpr.g:
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
			// CLExpr.g:322:11: ( ( 'x' | 'X' ) )
			// CLExpr.g:
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
			// CLExpr.g:323:11: ( ( 'y' | 'Y' ) )
			// CLExpr.g:
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
			// CLExpr.g:324:11: ( ( 'z' | 'Z' ) )
			// CLExpr.g:
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
			// CLExpr.g:328:2: ( ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' ) )
			// CLExpr.g:328:5: ( ' ' | '\\t' | '\\u000C' | '\\n' | '\\r' )
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
		// CLExpr.g:1:8: ( VAR | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | BINARY_FUN | SST_FUN | SWITCH_FUN | SWITCH_VALUE | WS )
		int alt17=30;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// CLExpr.g:1:10: VAR
				{
				mVAR(); 

				}
				break;
			case 2 :
				// CLExpr.g:1:14: STRING
				{
				mSTRING(); 

				}
				break;
			case 3 :
				// CLExpr.g:1:21: OR
				{
				mOR(); 

				}
				break;
			case 4 :
				// CLExpr.g:1:24: AND
				{
				mAND(); 

				}
				break;
			case 5 :
				// CLExpr.g:1:28: NOT
				{
				mNOT(); 

				}
				break;
			case 6 :
				// CLExpr.g:1:32: EQ
				{
				mEQ(); 

				}
				break;
			case 7 :
				// CLExpr.g:1:35: GT
				{
				mGT(); 

				}
				break;
			case 8 :
				// CLExpr.g:1:38: LT
				{
				mLT(); 

				}
				break;
			case 9 :
				// CLExpr.g:1:41: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 10 :
				// CLExpr.g:1:46: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 11 :
				// CLExpr.g:1:51: NE
				{
				mNE(); 

				}
				break;
			case 12 :
				// CLExpr.g:1:54: NG
				{
				mNG(); 

				}
				break;
			case 13 :
				// CLExpr.g:1:57: NL
				{
				mNL(); 

				}
				break;
			case 14 :
				// CLExpr.g:1:60: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// CLExpr.g:1:65: MINUS
				{
				mMINUS(); 

				}
				break;
			case 16 :
				// CLExpr.g:1:71: MULT
				{
				mMULT(); 

				}
				break;
			case 17 :
				// CLExpr.g:1:76: DIV
				{
				mDIV(); 

				}
				break;
			case 18 :
				// CLExpr.g:1:80: CAT
				{
				mCAT(); 

				}
				break;
			case 19 :
				// CLExpr.g:1:84: BCAT
				{
				mBCAT(); 

				}
				break;
			case 20 :
				// CLExpr.g:1:89: TCAT
				{
				mTCAT(); 

				}
				break;
			case 21 :
				// CLExpr.g:1:94: TERM
				{
				mTERM(); 

				}
				break;
			case 22 :
				// CLExpr.g:1:99: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 23 :
				// CLExpr.g:1:107: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 24 :
				// CLExpr.g:1:113: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 25 :
				// CLExpr.g:1:124: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 26 :
				// CLExpr.g:1:136: BINARY_FUN
				{
				mBINARY_FUN(); 

				}
				break;
			case 27 :
				// CLExpr.g:1:147: SST_FUN
				{
				mSST_FUN(); 

				}
				break;
			case 28 :
				// CLExpr.g:1:155: SWITCH_FUN
				{
				mSWITCH_FUN(); 

				}
				break;
			case 29 :
				// CLExpr.g:1:166: SWITCH_VALUE
				{
				mSWITCH_VALUE(); 

				}
				break;
			case 30 :
				// CLExpr.g:1:179: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\1\26\1\uffff\1\32\1\36\4\uffff\1\42\1\43\1\44\1\23\1\47\1\23"+
		"\3\uffff\1\47\22\uffff\1\23\1\47\3\uffff\1\23\5\uffff\1\47\1\23\2\uffff"+
		"\1\47\1\23\1\47\1\23\1\47\1\23\1\47\1\23\1\47\1\uffff";
	static final String DFA17_eofS =
		"\76\uffff";
	static final String DFA17_minS =
		"\1\11\1\42\1\uffff\1\41\1\101\3\uffff\1\74\3\42\1\60\1\54\1\60\2\uffff"+
		"\1\102\1\54\10\uffff\3\105\7\uffff\1\60\1\54\3\uffff\1\60\1\uffff\1\123"+
		"\3\uffff\1\54\1\60\2\uffff\1\54\1\60\1\54\1\60\1\54\1\60\1\54\1\60\1\54"+
		"\1\uffff";
	static final String DFA17_maxS =
		"\2\u00f9\1\uffff\1\76\1\164\3\uffff\1\76\3\u00f9\1\71\2\170\2\uffff\1"+
		"\163\1\71\10\uffff\1\157\2\164\7\uffff\1\71\1\170\3\uffff\1\170\1\uffff"+
		"\1\167\3\uffff\2\170\2\uffff\10\170\1\71\1\uffff";
	static final String DFA17_acceptS =
		"\2\uffff\1\2\2\uffff\1\6\1\7\1\10\7\uffff\1\30\1\31\2\uffff\1\25\1\36"+
		"\1\1\1\4\1\22\1\23\1\24\1\3\3\uffff\1\20\1\13\1\14\1\15\1\16\1\17\1\21"+
		"\2\uffff\1\26\1\35\1\27\1\uffff\1\32\1\uffff\1\5\1\11\1\12\2\uffff\1\33"+
		"\1\34\11\uffff\1\25";
	static final String DFA17_specialS =
		"\76\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\24\1\uffff\2\24\22\uffff\1\24\1\3\1\23\1\uffff\1\23\1\21\1\1\1\2\1"+
			"\17\1\20\1\4\1\11\1\14\1\12\1\14\1\13\2\15\10\22\2\uffff\1\7\1\5\1\6"+
			"\1\23\1\uffff\27\23\1\16\2\23\3\uffff\1\10\1\23\1\uffff\27\23\1\16\2"+
			"\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff\2\23\2\uffff\1\23"+
			"\5\uffff\1\23\6\uffff\1\23",
			"\1\25\1\uffff\1\25\6\uffff\5\25\17\uffff\1\25\1\uffff\32\25\4\uffff"+
			"\1\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"",
			"\1\27\32\uffff\1\31\1\uffff\1\30",
			"\1\26\1\30\1\27\1\uffff\1\5\1\uffff\1\34\4\uffff\1\35\1\uffff\1\33\1"+
			"\32\4\uffff\1\31\14\uffff\1\26\1\30\1\27\1\uffff\1\5\1\uffff\1\34\4\uffff"+
			"\1\35\1\uffff\1\33\1\32\4\uffff\1\31",
			"",
			"",
			"",
			"\1\41\1\37\1\40",
			"\1\23\1\uffff\1\23\6\uffff\17\23\5\uffff\1\23\1\uffff\32\23\4\uffff"+
			"\1\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"\1\23\1\uffff\1\23\6\uffff\17\23\5\uffff\1\23\1\uffff\32\23\4\uffff"+
			"\1\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"\1\23\1\uffff\1\23\6\uffff\17\23\5\uffff\1\23\1\uffff\32\23\4\uffff"+
			"\1\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"\12\45",
			"\1\51\1\uffff\1\51\1\uffff\2\46\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\52\46\uffff\1\52\37\uffff\1\52",
			"",
			"",
			"\1\53\20\uffff\1\54\16\uffff\1\53\20\uffff\1\54",
			"\1\51\1\uffff\1\51\1\uffff\12\22",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37\1\uffff\1\40\4\uffff\1\41\2\uffff\1\55\25\uffff\1\37\1\uffff\1"+
			"\40\4\uffff\1\41\2\uffff\1\55",
			"\1\56\16\uffff\1\6\20\uffff\1\56\16\uffff\1\6",
			"\1\57\16\uffff\1\7\20\uffff\1\57\16\uffff\1\7",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\45",
			"\1\51\1\uffff\1\51\1\uffff\2\60\10\22\36\uffff\1\50\37\uffff\1\50",
			"",
			"",
			"",
			"\2\61\46\uffff\1\61\37\uffff\1\61",
			"",
			"\1\62\3\uffff\1\63\33\uffff\1\62\3\uffff\1\63",
			"",
			"",
			"",
			"\1\51\1\uffff\1\51\1\uffff\2\64\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\65\46\uffff\1\65\37\uffff\1\65",
			"",
			"",
			"\1\51\1\uffff\1\51\1\uffff\2\66\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\67\46\uffff\1\67\37\uffff\1\67",
			"\1\51\1\uffff\1\51\1\uffff\2\70\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\71\46\uffff\1\71\37\uffff\1\71",
			"\1\51\1\uffff\1\51\1\uffff\2\72\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\73\46\uffff\1\73\37\uffff\1\73",
			"\1\51\1\uffff\1\51\1\uffff\2\74\10\22\36\uffff\1\50\37\uffff\1\50",
			"\2\75\46\uffff\1\75\37\uffff\1\75",
			"\1\51\1\uffff\1\51\1\uffff\12\22",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( VAR | STRING | OR | AND | NOT | EQ | GT | LT | GTEQ | LTEQ | NE | NG | NL | PLUS | MINUS | MULT | DIV | CAT | BCAT | TCAT | TERM | INTEGER | FLOAT | OPEN_BRACE | CLOSE_BRACE | BINARY_FUN | SST_FUN | SWITCH_FUN | SWITCH_VALUE | WS );";
		}
	}

}
