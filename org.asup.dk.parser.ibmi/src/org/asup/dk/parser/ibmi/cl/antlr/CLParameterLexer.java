// $ANTLR 3.5.1 CLParameter.g 2014-09-11 14:39:44

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
	public static final int PAR=15;
	public static final int SPECIAL=16;
	public static final int STRING=17;
	public static final int STR_OPERATOR=18;
	public static final int TCAT=19;
	public static final int TOKEN=20;
	public static final int VARIABLE=21;
	public static final int WS=22;

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

	// $ANTLR start "CAT"
	public final void mCAT() throws RecognitionException {
		try {
			int _type = CAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:112:9: ( '!!' | ( '*CAT' ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='!') ) {
				alt1=1;
			}
			else if ( (LA1_0=='*') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// CLParameter.g:112:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// CLParameter.g:112:18: ( '*CAT' )
					{
					// CLParameter.g:112:18: ( '*CAT' )
					// CLParameter.g:112:19: '*CAT'
					{
					match("*CAT"); 

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
			// CLParameter.g:113:9: ( '!>' | ( '*BCAT' ) )
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
					// CLParameter.g:113:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// CLParameter.g:113:18: ( '*BCAT' )
					{
					// CLParameter.g:113:18: ( '*BCAT' )
					// CLParameter.g:113:19: '*BCAT'
					{
					match("*BCAT"); 

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
			// CLParameter.g:114:9: ( '!<' | ( '*TCAT' ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='!') ) {
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
					// CLParameter.g:114:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// CLParameter.g:114:18: ( '*TCAT' )
					{
					// CLParameter.g:114:18: ( '*TCAT' )
					// CLParameter.g:114:19: '*TCAT'
					{
					match("*TCAT"); 

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

	// $ANTLR start "FUNCTION_NAME"
	public final void mFUNCTION_NAME() throws RecognitionException {
		try {
			int _type = FUNCTION_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:117:14: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
			int alt4=4;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='%') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='S') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='S') ) {
						alt4=1;
					}
					else if ( (LA4_2=='W') ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_1=='B') ) {
					int LA4_3 = input.LA(3);
					if ( (LA4_3=='I') ) {
						int LA4_6 = input.LA(4);
						if ( (LA4_6=='N') ) {
							int LA4_7 = input.LA(5);
							if ( (LA4_7=='A') ) {
								alt4=3;
							}

							else {
								alt4=4;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 6, input);
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
								new NoViableAltException("", 4, 3, input);
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
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CLParameter.g:118:2: '%SST'
					{
					match("%SST"); 

					}
					break;
				case 2 :
					// CLParameter.g:118:11: '%SWITCH'
					{
					match("%SWITCH"); 

					}
					break;
				case 3 :
					// CLParameter.g:118:23: '%BINARY'
					{
					match("%BINARY"); 

					}
					break;
				case 4 :
					// CLParameter.g:118:35: '%BIN'
					{
					match("%BIN"); 

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
	// $ANTLR end "FUNCTION_NAME"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:121:8: ( APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS )
			// CLParameter.g:122:4: APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS
			{
			mAPOS(); 

			// CLParameter.g:122:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ' ' && LA5_0 <= '\"')||(LA5_0 >= '$' && LA5_0 <= '&')||(LA5_0 >= '+' && LA5_0 <= '9')||(LA5_0 >= '<' && LA5_0 <= '?')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= '^' && LA5_0 <= '_')||(LA5_0 >= 'a' && LA5_0 <= 'z')||LA5_0=='\u00A3'||LA5_0=='\u00A7'||LA5_0=='\u00E0'||(LA5_0 >= '\u00E8' && LA5_0 <= '\u00E9')||LA5_0=='\u00EC'||LA5_0=='\u00F2'||LA5_0=='\u00F9') ) {
					alt5=1;
				}

				switch (alt5) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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
			// CLParameter.g:125:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// CLParameter.g:126:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			// CLParameter.g:126:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '!' && LA6_0 <= '\"')||LA6_0=='$'||(LA6_0 >= '+' && LA6_0 <= '9')||(LA6_0 >= '<' && LA6_0 <= '?')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= '^' && LA6_0 <= '_')||(LA6_0 >= 'a' && LA6_0 <= 'z')||LA6_0=='\u00A3'||LA6_0=='\u00A7'||LA6_0=='\u00E0'||(LA6_0 >= '\u00E8' && LA6_0 <= '\u00E9')||LA6_0=='\u00EC'||LA6_0=='\u00F2'||LA6_0=='\u00F9') ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// CLParameter.g:129:9: ( '&' TOKEN )
			// CLParameter.g:130:4: '&' TOKEN
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
			// CLParameter.g:133:9: ( '*' TOKEN )
			// CLParameter.g:134:4: '*' TOKEN
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
			// CLParameter.g:138:3: ( '(' )
			// CLParameter.g:139:3: '('
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
			// CLParameter.g:143:3: ( ')' )
			// CLParameter.g:144:3: ')'
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
			// CLParameter.g:147:6: ( '\\'' )
			// CLParameter.g:148:2: '\\''
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
			// CLParameter.g:152:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='/') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='/') ) {
					alt10=1;
				}
				else if ( (LA10_1=='*') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// CLParameter.g:152:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// CLParameter.g:152:14: (~ ( '\\n' | '\\r' ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
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
							break loop7;
						}
					}

					// CLParameter.g:152:28: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// CLParameter.g:152:28: '\\r'
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
					// CLParameter.g:153:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// CLParameter.g:153:14: ( options {greedy=false; } : . )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='*') ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1=='/') ) {
								alt9=2;
							}
							else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// CLParameter.g:153:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop9;
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
			// CLParameter.g:156:4: ( ( '\\r' )? '\\n' )
			// CLParameter.g:157:3: ( '\\r' )? '\\n'
			{
			// CLParameter.g:157:3: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// CLParameter.g:157:4: '\\r'
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
			// CLParameter.g:160:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// CLParameter.g:160:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "CHAR_SPECIAL"
	public final void mCHAR_SPECIAL() throws RecognitionException {
		try {
			// CLParameter.g:171:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '!' | '=' | '>' | '<' | '+' | '-' | '/' ) )
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
		// CLParameter.g:1:8: ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS )
		int alt12=14;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// CLParameter.g:1:10: CAT
				{
				mCAT(); 

				}
				break;
			case 2 :
				// CLParameter.g:1:14: BCAT
				{
				mBCAT(); 

				}
				break;
			case 3 :
				// CLParameter.g:1:19: TCAT
				{
				mTCAT(); 

				}
				break;
			case 4 :
				// CLParameter.g:1:24: FUNCTION_NAME
				{
				mFUNCTION_NAME(); 

				}
				break;
			case 5 :
				// CLParameter.g:1:38: STRING
				{
				mSTRING(); 

				}
				break;
			case 6 :
				// CLParameter.g:1:45: TOKEN
				{
				mTOKEN(); 

				}
				break;
			case 7 :
				// CLParameter.g:1:51: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 8 :
				// CLParameter.g:1:60: SPECIAL
				{
				mSPECIAL(); 

				}
				break;
			case 9 :
				// CLParameter.g:1:68: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 10 :
				// CLParameter.g:1:79: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 11 :
				// CLParameter.g:1:91: APOS
				{
				mAPOS(); 

				}
				break;
			case 12 :
				// CLParameter.g:1:96: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 13 :
				// CLParameter.g:1:104: CR
				{
				mCR(); 

				}
				break;
			case 14 :
				// CLParameter.g:1:107: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\11\2\uffff\1\24\1\11\4\uffff\1\14\2\uffff\1\31\1\32\1\33\3"+
		"\23\3\uffff\1\11\5\uffff\3\23\1\11\1\31\2\23\1\32\1\33";
	static final String DFA12_eofS =
		"\45\uffff";
	static final String DFA12_minS =
		"\1\11\2\41\1\uffff\1\40\1\52\4\uffff\1\12\2\uffff\3\41\1\101\2\103\3\uffff"+
		"\1\0\5\uffff\1\124\2\101\1\0\1\41\2\124\2\41";
	static final String DFA12_maxS =
		"\1\u00f9\1\76\1\u00f9\1\uffff\1\u00f9\1\57\4\uffff\1\12\2\uffff\3\u00f9"+
		"\1\101\2\103\3\uffff\1\uffff\5\uffff\1\124\2\101\1\uffff\1\u00f9\2\124"+
		"\2\u00f9";
	static final String DFA12_acceptS =
		"\3\uffff\1\4\2\uffff\1\7\1\11\1\12\1\6\1\uffff\1\15\1\16\6\uffff\1\10"+
		"\1\13\1\5\1\uffff\1\14\1\15\1\1\1\2\1\3\11\uffff";
	static final String DFA12_specialS =
		"\26\uffff\1\0\10\uffff\1\1\5\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\14\1\13\2\uffff\1\12\22\uffff\1\14\1\1\1\11\1\uffff\1\11\1\3\1\6\1"+
			"\4\1\7\1\10\1\2\4\11\1\5\12\11\2\uffff\4\11\1\uffff\32\11\3\uffff\2\11"+
			"\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff\1\11\7\uffff\2\11"+
			"\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\1\15\32\uffff\1\17\1\uffff\1\16",
			"\2\23\1\uffff\1\23\6\uffff\17\23\2\uffff\4\23\1\uffff\1\23\1\21\1\20"+
			"\20\23\1\22\6\23\3\uffff\2\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23"+
			"\70\uffff\1\23\7\uffff\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"",
			"\3\25\1\uffff\3\25\4\uffff\17\25\2\uffff\4\25\1\uffff\32\25\3\uffff"+
			"\2\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff\1\25\7\uffff"+
			"\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\27\4\uffff\1\26",
			"",
			"",
			"",
			"",
			"\1\30",
			"",
			"",
			"\2\11\1\uffff\1\11\6\uffff\17\11\2\uffff\4\11\1\uffff\32\11\3\uffff"+
			"\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff\1\11\7\uffff"+
			"\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\2\11\1\uffff\1\11\6\uffff\17\11\2\uffff\4\11\1\uffff\32\11\3\uffff"+
			"\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff\1\11\7\uffff"+
			"\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\2\11\1\uffff\1\11\6\uffff\17\11\2\uffff\4\11\1\uffff\32\11\3\uffff"+
			"\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff\1\11\7\uffff"+
			"\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\1\34",
			"\1\35",
			"\1\36",
			"",
			"",
			"",
			"\41\27\2\37\1\27\1\37\6\27\17\37\2\27\4\37\1\27\32\37\3\27\2\37\1\27"+
			"\32\37\50\27\1\37\3\27\1\37\70\27\1\37\7\27\2\37\2\27\1\37\5\27\1\37"+
			"\6\27\1\37\uff06\27",
			"",
			"",
			"",
			"",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"\41\27\2\37\1\27\1\37\6\27\17\37\2\27\4\37\1\27\32\37\3\27\2\37\1\27"+
			"\32\37\50\27\1\37\3\27\1\37\70\27\1\37\7\27\2\37\2\27\1\37\5\27\1\37"+
			"\6\27\1\37\uff06\27",
			"\2\23\1\uffff\1\23\6\uffff\17\23\2\uffff\4\23\1\uffff\32\23\3\uffff"+
			"\2\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"\1\43",
			"\1\44",
			"\2\23\1\uffff\1\23\6\uffff\17\23\2\uffff\4\23\1\uffff\32\23\3\uffff"+
			"\2\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23",
			"\2\23\1\uffff\1\23\6\uffff\17\23\2\uffff\4\23\1\uffff\32\23\3\uffff"+
			"\2\23\1\uffff\32\23\50\uffff\1\23\3\uffff\1\23\70\uffff\1\23\7\uffff"+
			"\2\23\2\uffff\1\23\5\uffff\1\23\6\uffff\1\23"
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
			return "1:1: Tokens : ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_22 = input.LA(1);
						s = -1;
						if ( ((LA12_22 >= '!' && LA12_22 <= '\"')||LA12_22=='$'||(LA12_22 >= '+' && LA12_22 <= '9')||(LA12_22 >= '<' && LA12_22 <= '?')||(LA12_22 >= 'A' && LA12_22 <= 'Z')||(LA12_22 >= '^' && LA12_22 <= '_')||(LA12_22 >= 'a' && LA12_22 <= 'z')||LA12_22=='\u00A3'||LA12_22=='\u00A7'||LA12_22=='\u00E0'||(LA12_22 >= '\u00E8' && LA12_22 <= '\u00E9')||LA12_22=='\u00EC'||LA12_22=='\u00F2'||LA12_22=='\u00F9') ) {s = 31;}
						else if ( ((LA12_22 >= '\u0000' && LA12_22 <= ' ')||LA12_22=='#'||(LA12_22 >= '%' && LA12_22 <= '*')||(LA12_22 >= ':' && LA12_22 <= ';')||LA12_22=='@'||(LA12_22 >= '[' && LA12_22 <= ']')||LA12_22=='`'||(LA12_22 >= '{' && LA12_22 <= '\u00A2')||(LA12_22 >= '\u00A4' && LA12_22 <= '\u00A6')||(LA12_22 >= '\u00A8' && LA12_22 <= '\u00DF')||(LA12_22 >= '\u00E1' && LA12_22 <= '\u00E7')||(LA12_22 >= '\u00EA' && LA12_22 <= '\u00EB')||(LA12_22 >= '\u00ED' && LA12_22 <= '\u00F1')||(LA12_22 >= '\u00F3' && LA12_22 <= '\u00F8')||(LA12_22 >= '\u00FA' && LA12_22 <= '\uFFFF')) ) {s = 23;}
						else s = 9;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_31 = input.LA(1);
						s = -1;
						if ( ((LA12_31 >= '\u0000' && LA12_31 <= ' ')||LA12_31=='#'||(LA12_31 >= '%' && LA12_31 <= '*')||(LA12_31 >= ':' && LA12_31 <= ';')||LA12_31=='@'||(LA12_31 >= '[' && LA12_31 <= ']')||LA12_31=='`'||(LA12_31 >= '{' && LA12_31 <= '\u00A2')||(LA12_31 >= '\u00A4' && LA12_31 <= '\u00A6')||(LA12_31 >= '\u00A8' && LA12_31 <= '\u00DF')||(LA12_31 >= '\u00E1' && LA12_31 <= '\u00E7')||(LA12_31 >= '\u00EA' && LA12_31 <= '\u00EB')||(LA12_31 >= '\u00ED' && LA12_31 <= '\u00F1')||(LA12_31 >= '\u00F3' && LA12_31 <= '\u00F8')||(LA12_31 >= '\u00FA' && LA12_31 <= '\uFFFF')) ) {s = 23;}
						else if ( ((LA12_31 >= '!' && LA12_31 <= '\"')||LA12_31=='$'||(LA12_31 >= '+' && LA12_31 <= '9')||(LA12_31 >= '<' && LA12_31 <= '?')||(LA12_31 >= 'A' && LA12_31 <= 'Z')||(LA12_31 >= '^' && LA12_31 <= '_')||(LA12_31 >= 'a' && LA12_31 <= 'z')||LA12_31=='\u00A3'||LA12_31=='\u00A7'||LA12_31=='\u00E0'||(LA12_31 >= '\u00E8' && LA12_31 <= '\u00E9')||LA12_31=='\u00EC'||LA12_31=='\u00F2'||LA12_31=='\u00F9') ) {s = 31;}
						else s = 9;
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
