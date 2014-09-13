// $ANTLR 3.5.1 CLParameter.g 2014-09-13 12:32:25

  package org.asup.dk.parser.ibmi.cl.antlr;
  
  import org.asup.dk.parser.ibmi.cl.util.LexerHelper;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CLParameterLexer extends Lexer {
	public static final int EOF=-1;
	public static final int APOS=4;
	public static final int BCAT=5;
	public static final int CAT=6;
	public static final int CHAR_SPECIAL=7;
	public static final int CLOSE_BRACE=8;
	public static final int COMMENT=9;
	public static final int CR=10;
	public static final int FUNCTION=11;
	public static final int FUNCTION_NAME=12;
	public static final int LIST=13;
	public static final int OPEN_BRACE=14;
	public static final int SPECIAL=15;
	public static final int STRING=16;
	public static final int STR_OPERATOR=17;
	public static final int TCAT=18;
	public static final int TOKEN=19;
	public static final int VARIABLE=20;
	public static final int WS=21;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CLParameterLexer() {} 
	public CLParameterLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLParameterLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "CLParameter.g"; }

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:112:8: ( APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS )
			// CLParameter.g:113:4: APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS
			{
			mAPOS(); 

			// CLParameter.g:113:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ' ' && LA1_0 <= '\"')||(LA1_0 >= '$' && LA1_0 <= '&')||(LA1_0 >= '+' && LA1_0 <= '9')||(LA1_0 >= '<' && LA1_0 <= '?')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= '^' && LA1_0 <= '_')||(LA1_0 >= 'a' && LA1_0 <= 'z')||LA1_0=='\u00A3'||LA1_0=='\u00A7'||LA1_0=='\u00E0'||(LA1_0 >= '\u00E8' && LA1_0 <= '\u00E9')||LA1_0=='\u00EC'||LA1_0=='\u00F2'||LA1_0=='\u00F9') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// CLParameter.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '+' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			mAPOS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "TOKEN"
	public final void mTOKEN() throws RecognitionException {
		try {
			int _type = TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:116:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// CLParameter.g:117:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			// CLParameter.g:117:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '!' && LA2_0 <= '\"')||LA2_0=='$'||(LA2_0 >= '+' && LA2_0 <= '9')||(LA2_0 >= '<' && LA2_0 <= '?')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= '^' && LA2_0 <= '_')||(LA2_0 >= 'a' && LA2_0 <= 'z')||LA2_0=='\u00A3'||LA2_0=='\u00A7'||LA2_0=='\u00E0'||(LA2_0 >= '\u00E8' && LA2_0 <= '\u00E9')||LA2_0=='\u00EC'||LA2_0=='\u00F2'||LA2_0=='\u00F9') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// CLParameter.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOKEN"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:120:9: ( '&' TOKEN )
			// CLParameter.g:121:4: '&' TOKEN
			{
			match('&'); 
			mTOKEN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SPECIAL"
	public final void mSPECIAL() throws RecognitionException {
		try {
			int _type = SPECIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:124:9: ( '*' TOKEN )
			// CLParameter.g:125:4: '*' TOKEN
			{
			match('*'); 
			mTOKEN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPECIAL"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:129:3: ( '(' )
			// CLParameter.g:130:3: '('
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
			// CLParameter.g:134:3: ( ')' )
			// CLParameter.g:135:3: ')'
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

	// $ANTLR start "APOS"
	public final void mAPOS() throws RecognitionException {
		try {
			int _type = APOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:138:6: ( '\\'' )
			// CLParameter.g:139:2: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:143:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// CLParameter.g:143:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// CLParameter.g:143:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// CLParameter.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop3;
						}
					}

					// CLParameter.g:143:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// CLParameter.g:143:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// CLParameter.g:144:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// CLParameter.g:144:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// CLParameter.g:144:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "CR"
	public final void mCR() throws RecognitionException {
		try {
			int _type = CR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:147:4: ( ( '\\r' )? '\\n' )
			// CLParameter.g:148:3: ( '\\r' )? '\\n'
			{
			// CLParameter.g:148:3: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// CLParameter.g:148:4: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:151:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// CLParameter.g:151:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

	// $ANTLR start "CAT"
	public final void mCAT() throws RecognitionException {
		try {
			// CLParameter.g:159:18: ( '!!' | ( '*CAT' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='!') ) {
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
					// CLParameter.g:159:20: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// CLParameter.g:159:27: ( '*CAT' )
					{
					// CLParameter.g:159:27: ( '*CAT' )
					// CLParameter.g:159:28: '*CAT'
					{
					match("*CAT"); 

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CAT"

	// $ANTLR start "BCAT"
	public final void mBCAT() throws RecognitionException {
		try {
			// CLParameter.g:160:18: ( '!>' | ( '*BCAT' ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='!') ) {
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
					// CLParameter.g:160:20: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// CLParameter.g:160:27: ( '*BCAT' )
					{
					// CLParameter.g:160:27: ( '*BCAT' )
					// CLParameter.g:160:28: '*BCAT'
					{
					match("*BCAT"); 

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BCAT"

	// $ANTLR start "TCAT"
	public final void mTCAT() throws RecognitionException {
		try {
			// CLParameter.g:161:18: ( '!<' | ( '*TCAT' ) )
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
					// CLParameter.g:161:20: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// CLParameter.g:161:27: ( '*TCAT' )
					{
					// CLParameter.g:161:27: ( '*TCAT' )
					// CLParameter.g:161:28: '*TCAT'
					{
					match("*TCAT"); 

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TCAT"

	// $ANTLR start "FUNCTION_NAME"
	public final void mFUNCTION_NAME() throws RecognitionException {
		try {
			// CLParameter.g:163:23: ( ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' ) )
			// CLParameter.g:164:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
			{
			// CLParameter.g:164:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='%') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='S') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='S') ) {
						alt11=1;
					}
					else if ( (LA11_2=='W') ) {
						alt11=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA11_1=='B') ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3=='I') ) {
						int LA11_6 = input.LA(4);
						if ( (LA11_6=='N') ) {
							int LA11_7 = input.LA(5);
							if ( (LA11_7=='A') ) {
								alt11=3;
							}

							else {
								alt11=4;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 6, input);
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
								new NoViableAltException("", 11, 3, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// CLParameter.g:164:3: '%SST'
					{
					match("%SST"); 

					}
					break;
				case 2 :
					// CLParameter.g:164:12: '%SWITCH'
					{
					match("%SWITCH"); 

					}
					break;
				case 3 :
					// CLParameter.g:164:24: '%BINARY'
					{
					match("%BINARY"); 

					}
					break;
				case 4 :
					// CLParameter.g:164:36: '%BIN'
					{
					match("%BIN"); 

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION_NAME"

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// CLParameter.g:170:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '!' | '=' | '>' | '<' | '+' | '-' | '/' ) )
			// CLParameter.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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

	@Override
	public void mTokens() throws RecognitionException {
		// CLParameter.g:1:8: ( STRING | TOKEN | VARIABLE | SPECIAL | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS )
		int alt12=10;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// CLParameter.g:1:10: STRING
				{
				mSTRING(); 

				}
				break;
			case 2 :
				// CLParameter.g:1:17: TOKEN
				{
				mTOKEN(); 

				}
				break;
			case 3 :
				// CLParameter.g:1:23: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 4 :
				// CLParameter.g:1:32: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 5 :
				// CLParameter.g:1:40: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 6 :
				// CLParameter.g:1:51: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 7 :
				// CLParameter.g:1:63: APOS
				{
				mAPOS(); 

				}
				break;
			case 8 :
				// CLParameter.g:1:68: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// CLParameter.g:1:76: CR
				{
				mCR(); 

				}
				break;
			case 10 :
				// CLParameter.g:1:79: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\13\1\7\5\uffff\1\12\4\uffff\1\7\2\uffff\1\7";
	static final String DFA12_eofS =
		"\21\uffff";
	static final String DFA12_minS =
		"\1\11\1\40\1\52\5\uffff\1\12\4\uffff\1\0\2\uffff\1\0";
	static final String DFA12_maxS =
		"\2\u00f9\1\57\5\uffff\1\12\4\uffff\1\uffff\2\uffff\1\uffff";
	static final String DFA12_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\2\1\uffff\1\11\1\12\1\7\1\1\1\uffff\1\10\1"+
		"\11\1\uffff";
	static final String DFA12_specialS =
		"\15\uffff\1\1\2\uffff\1\0}>";
	static final String[] DFA12_transitionS = {
			"\1\12\1\11\2\uffff\1\10\22\uffff\1\12\2\7\1\uffff\1\7\1\uffff\1\3\1\1"+
			"\1\5\1\6\1\4\4\7\1\2\12\7\2\uffff\4\7\1\uffff\32\7\3\uffff\2\7\1\uffff"+
			"\32\7\50\uffff\1\7\3\uffff\1\7\70\uffff\1\7\7\uffff\2\7\2\uffff\1\7\5"+
			"\uffff\1\7\6\uffff\1\7",
			"\3\14\1\uffff\3\14\4\uffff\17\14\2\uffff\4\14\1\uffff\32\14\3\uffff"+
			"\2\14\1\uffff\32\14\50\uffff\1\14\3\uffff\1\14\70\uffff\1\14\7\uffff"+
			"\2\14\2\uffff\1\14\5\uffff\1\14\6\uffff\1\14",
			"\1\16\4\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"\1\17",
			"",
			"",
			"",
			"",
			"\41\16\2\20\1\16\1\20\6\16\17\20\2\16\4\20\1\16\32\20\3\16\2\20\1\16"+
			"\32\20\50\16\1\20\3\16\1\20\70\16\1\20\7\16\2\20\2\16\1\20\5\16\1\20"+
			"\6\16\1\20\uff06\16",
			"",
			"",
			"\41\16\2\20\1\16\1\20\6\16\17\20\2\16\4\20\1\16\32\20\3\16\2\20\1\16"+
			"\32\20\50\16\1\20\3\16\1\20\70\16\1\20\7\16\2\20\2\16\1\20\5\16\1\20"+
			"\6\16\1\20\uff06\16"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( STRING | TOKEN | VARIABLE | SPECIAL | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_16 = input.LA(1);
						s = -1;
						if ( ((LA12_16 >= '\u0000' && LA12_16 <= ' ')||LA12_16=='#'||(LA12_16 >= '%' && LA12_16 <= '*')||(LA12_16 >= ':' && LA12_16 <= ';')||LA12_16=='@'||(LA12_16 >= '[' && LA12_16 <= ']')||LA12_16=='`'||(LA12_16 >= '{' && LA12_16 <= '\u00A2')||(LA12_16 >= '\u00A4' && LA12_16 <= '\u00A6')||(LA12_16 >= '\u00A8' && LA12_16 <= '\u00DF')||(LA12_16 >= '\u00E1' && LA12_16 <= '\u00E7')||(LA12_16 >= '\u00EA' && LA12_16 <= '\u00EB')||(LA12_16 >= '\u00ED' && LA12_16 <= '\u00F1')||(LA12_16 >= '\u00F3' && LA12_16 <= '\u00F8')||(LA12_16 >= '\u00FA' && LA12_16 <= '\uFFFF')) ) {s = 14;}
						else if ( ((LA12_16 >= '!' && LA12_16 <= '\"')||LA12_16=='$'||(LA12_16 >= '+' && LA12_16 <= '9')||(LA12_16 >= '<' && LA12_16 <= '?')||(LA12_16 >= 'A' && LA12_16 <= 'Z')||(LA12_16 >= '^' && LA12_16 <= '_')||(LA12_16 >= 'a' && LA12_16 <= 'z')||LA12_16=='\u00A3'||LA12_16=='\u00A7'||LA12_16=='\u00E0'||(LA12_16 >= '\u00E8' && LA12_16 <= '\u00E9')||LA12_16=='\u00EC'||LA12_16=='\u00F2'||LA12_16=='\u00F9') ) {s = 16;}
						else s = 7;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_13 = input.LA(1);
						s = -1;
						if ( ((LA12_13 >= '!' && LA12_13 <= '\"')||LA12_13=='$'||(LA12_13 >= '+' && LA12_13 <= '9')||(LA12_13 >= '<' && LA12_13 <= '?')||(LA12_13 >= 'A' && LA12_13 <= 'Z')||(LA12_13 >= '^' && LA12_13 <= '_')||(LA12_13 >= 'a' && LA12_13 <= 'z')||LA12_13=='\u00A3'||LA12_13=='\u00A7'||LA12_13=='\u00E0'||(LA12_13 >= '\u00E8' && LA12_13 <= '\u00E9')||LA12_13=='\u00EC'||LA12_13=='\u00F2'||LA12_13=='\u00F9') ) {s = 16;}
						else if ( ((LA12_13 >= '\u0000' && LA12_13 <= ' ')||LA12_13=='#'||(LA12_13 >= '%' && LA12_13 <= '*')||(LA12_13 >= ':' && LA12_13 <= ';')||LA12_13=='@'||(LA12_13 >= '[' && LA12_13 <= ']')||LA12_13=='`'||(LA12_13 >= '{' && LA12_13 <= '\u00A2')||(LA12_13 >= '\u00A4' && LA12_13 <= '\u00A6')||(LA12_13 >= '\u00A8' && LA12_13 <= '\u00DF')||(LA12_13 >= '\u00E1' && LA12_13 <= '\u00E7')||(LA12_13 >= '\u00EA' && LA12_13 <= '\u00EB')||(LA12_13 >= '\u00ED' && LA12_13 <= '\u00F1')||(LA12_13 >= '\u00F3' && LA12_13 <= '\u00F8')||(LA12_13 >= '\u00FA' && LA12_13 <= '\uFFFF')) ) {s = 14;}
						else s = 7;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
