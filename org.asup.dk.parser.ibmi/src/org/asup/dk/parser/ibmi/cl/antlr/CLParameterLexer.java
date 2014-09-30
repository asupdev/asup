// $ANTLR 3.5.1 CLParameter.g 2014-09-30 08:31:52

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
	public static final int FILTER=11;
	public static final int FUNCTION=12;
	public static final int FUNCTION_NAME=13;
	public static final int LIST=14;
	public static final int OPEN_BRACE=15;
	public static final int SPECIAL=16;
	public static final int STRING=17;
	public static final int TCAT=18;
	public static final int TOKEN=19;
	public static final int VALUE=20;
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
			// CLParameter.g:120:9: ( '!!' | '*CAT' )
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
					// CLParameter.g:120:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// CLParameter.g:120:18: '*CAT'
					{
					match("*CAT"); 

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
			// CLParameter.g:122:9: ( '!>' | '*BCAT' )
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
					// CLParameter.g:122:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// CLParameter.g:122:18: '*BCAT'
					{
					match("*BCAT"); 

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
			// CLParameter.g:124:9: ( '!<' | '*TCAT' )
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
					// CLParameter.g:124:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// CLParameter.g:124:18: '*TCAT'
					{
					match("*TCAT"); 

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
			// CLParameter.g:126:14: ( ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' ) )
			// CLParameter.g:127:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
			{
			// CLParameter.g:127:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
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
					// CLParameter.g:127:3: '%SST'
					{
					match("%SST"); 

					}
					break;
				case 2 :
					// CLParameter.g:127:12: '%SWITCH'
					{
					match("%SWITCH"); 

					}
					break;
				case 3 :
					// CLParameter.g:127:24: '%BINARY'
					{
					match("%BINARY"); 

					}
					break;
				case 4 :
					// CLParameter.g:127:36: '%BIN'
					{
					match("%BIN"); 

					}
					break;

			}

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
			// CLParameter.g:130:8: ( APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS )
			// CLParameter.g:131:4: APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS
			{
			mAPOS(); 

			// CLParameter.g:131:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ' ' && LA5_0 <= '\"')||(LA5_0 >= '$' && LA5_0 <= '&')||(LA5_0 >= '+' && LA5_0 <= '9')||(LA5_0 >= '<' && LA5_0 <= '?')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='\\'||(LA5_0 >= '^' && LA5_0 <= '_')||(LA5_0 >= 'a' && LA5_0 <= 'z')||LA5_0=='\u00A3'||LA5_0=='\u00A7'||LA5_0=='\u00E0'||(LA5_0 >= '\u00E8' && LA5_0 <= '\u00E9')||LA5_0=='\u00EC'||LA5_0=='\u00F2'||LA5_0=='\u00F9') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// CLParameter.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '\"')||(input.LA(1) >= '$' && input.LA(1) <= '&')||(input.LA(1) >= '+' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
			// CLParameter.g:134:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// CLParameter.g:135:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			// CLParameter.g:135:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '!' && LA6_0 <= '\"')||LA6_0=='$'||(LA6_0 >= '+' && LA6_0 <= '9')||(LA6_0 >= '<' && LA6_0 <= '?')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='\\'||(LA6_0 >= '^' && LA6_0 <= '_')||(LA6_0 >= 'a' && LA6_0 <= 'z')||LA6_0=='\u00A3'||LA6_0=='\u00A7'||LA6_0=='\u00E0'||(LA6_0 >= '\u00E8' && LA6_0 <= '\u00E9')||LA6_0=='\u00EC'||LA6_0=='\u00F2'||LA6_0=='\u00F9') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// CLParameter.g:
					{
					if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
			// CLParameter.g:138:9: ( '&' TOKEN )
			// CLParameter.g:139:4: '&' TOKEN
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
			// CLParameter.g:142:9: ( '*' TOKEN )
			// CLParameter.g:143:4: '*' TOKEN
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

	// $ANTLR start "FILTER"
	public final void mFILTER() throws RecognitionException {
		try {
			int _type = FILTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:146:8: ( TOKEN '*' )
			// CLParameter.g:147:4: TOKEN '*'
			{
			mTOKEN(); 

			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILTER"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:151:3: ( '(' )
			// CLParameter.g:152:3: '('
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
			// CLParameter.g:156:3: ( ')' )
			// CLParameter.g:157:3: ')'
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
			// CLParameter.g:160:6: ( '\\'' )
			// CLParameter.g:161:2: '\\''
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
			// CLParameter.g:165:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// CLParameter.g:165:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// CLParameter.g:165:14: (~ ( '\\n' | '\\r' ) )*
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

					// CLParameter.g:165:28: ( '\\r' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='\r') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// CLParameter.g:165:28: '\\r'
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
					// CLParameter.g:166:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// CLParameter.g:166:14: ( options {greedy=false; } : . )*
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
							// CLParameter.g:166:42: .
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
			// CLParameter.g:169:4: ( ( '\\r' )? '\\n' )
			// CLParameter.g:170:3: ( '\\r' )? '\\n'
			{
			// CLParameter.g:170:3: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// CLParameter.g:170:4: '\\r'
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
			// CLParameter.g:173:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// CLParameter.g:173:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// CLParameter.g:186:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '!' | '=' | '>' | '<' | '+' | '-' | '/' | '\\\\' ) )
			// CLParameter.g:
			{
			if ( (input.LA(1) >= '!' && input.LA(1) <= '\"')||input.LA(1)=='$'||(input.LA(1) >= '+' && input.LA(1) <= '/')||(input.LA(1) >= '<' && input.LA(1) <= '?')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7'||input.LA(1)=='\u00E0'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00E9')||input.LA(1)=='\u00EC'||input.LA(1)=='\u00F2'||input.LA(1)=='\u00F9' ) {
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
		// CLParameter.g:1:8: ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS )
		int alt12=15;
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
				// CLParameter.g:1:68: FILTER
				{
				mFILTER(); 

				}
				break;
			case 10 :
				// CLParameter.g:1:75: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 11 :
				// CLParameter.g:1:86: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 12 :
				// CLParameter.g:1:98: APOS
				{
				mAPOS(); 

				}
				break;
			case 13 :
				// CLParameter.g:1:103: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 14 :
				// CLParameter.g:1:111: CR
				{
				mCR(); 

				}
				break;
			case 15 :
				// CLParameter.g:1:114: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\20\2\uffff\1\26\1\20\3\uffff\1\20\1\14\2\uffff\1\33\1\34\1"+
		"\35\2\uffff\3\25\3\uffff\1\20\1\21\4\uffff\3\25\1\20\1\uffff\1\21\1\33"+
		"\2\25\1\34\1\35";
	static final String DFA12_eofS =
		"\51\uffff";
	static final String DFA12_minS =
		"\1\11\2\41\1\uffff\1\40\1\41\3\uffff\1\41\1\12\2\uffff\3\41\2\uffff\1"+
		"\101\2\103\3\uffff\2\0\4\uffff\1\124\2\101\1\0\1\uffff\1\0\1\41\2\124"+
		"\2\41";
	static final String DFA12_maxS =
		"\3\u00f9\1\uffff\2\u00f9\3\uffff\1\u00f9\1\12\2\uffff\3\u00f9\2\uffff"+
		"\1\101\2\103\3\uffff\2\uffff\4\uffff\1\124\2\101\1\uffff\1\uffff\1\uffff"+
		"\1\u00f9\2\124\2\u00f9";
	static final String DFA12_acceptS =
		"\3\uffff\1\4\2\uffff\1\7\1\12\1\13\2\uffff\1\16\1\17\3\uffff\1\6\1\11"+
		"\3\uffff\1\10\1\14\1\5\2\uffff\1\16\1\1\1\2\1\3\4\uffff\1\15\6\uffff";
	static final String DFA12_specialS =
		"\30\uffff\1\0\1\1\7\uffff\1\3\1\uffff\1\2\5\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\14\1\13\2\uffff\1\12\22\uffff\1\14\1\1\1\11\1\uffff\1\11\1\3\1\6\1"+
			"\4\1\7\1\10\1\2\4\11\1\5\12\11\2\uffff\4\11\1\uffff\32\11\1\uffff\1\11"+
			"\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff\1\11"+
			"\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\1\15\1\11\1\uffff\1\11\5\uffff\1\21\17\11\2\uffff\1\17\1\11\1\16\1"+
			"\11\1\uffff\32\11\1\uffff\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1"+
			"\11\3\uffff\1\11\70\uffff\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11"+
			"\6\uffff\1\11",
			"\2\25\1\uffff\1\25\6\uffff\17\25\2\uffff\4\25\1\uffff\1\25\1\23\1\22"+
			"\20\25\1\24\6\25\1\uffff\1\25\1\uffff\2\25\1\uffff\32\25\50\uffff\1\25"+
			"\3\uffff\1\25\70\uffff\1\25\7\uffff\2\25\2\uffff\1\25\5\uffff\1\25\6"+
			"\uffff\1\25",
			"",
			"\3\27\1\uffff\3\27\4\uffff\17\27\2\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\2\11\1\uffff\1\11\5\uffff\1\31\4\11\1\30\12\11\2\uffff\4\11\1\uffff"+
			"\32\11\1\uffff\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff"+
			"\1\11\70\uffff\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1"+
			"\11",
			"",
			"",
			"",
			"\2\11\1\uffff\1\11\5\uffff\1\21\17\11\2\uffff\4\11\1\uffff\32\11\1\uffff"+
			"\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff"+
			"\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\1\32",
			"",
			"",
			"\2\11\1\uffff\1\11\5\uffff\1\21\17\11\2\uffff\4\11\1\uffff\32\11\1\uffff"+
			"\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff"+
			"\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\2\11\1\uffff\1\11\5\uffff\1\21\17\11\2\uffff\4\11\1\uffff\32\11\1\uffff"+
			"\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff"+
			"\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"\2\11\1\uffff\1\11\5\uffff\1\21\17\11\2\uffff\4\11\1\uffff\32\11\1\uffff"+
			"\1\11\1\uffff\2\11\1\uffff\32\11\50\uffff\1\11\3\uffff\1\11\70\uffff"+
			"\1\11\7\uffff\2\11\2\uffff\1\11\5\uffff\1\11\6\uffff\1\11",
			"",
			"",
			"\1\36",
			"\1\37",
			"\1\40",
			"",
			"",
			"",
			"\41\42\2\41\1\42\1\41\5\42\1\43\17\41\2\42\4\41\1\42\32\41\1\42\1\41"+
			"\1\42\2\41\1\42\32\41\50\42\1\41\3\42\1\41\70\42\1\41\7\42\2\41\2\42"+
			"\1\41\5\42\1\41\6\42\1\41\uff06\42",
			"\0\42",
			"",
			"",
			"",
			"",
			"\1\44",
			"\1\45",
			"\1\46",
			"\41\42\2\41\1\42\1\41\5\42\1\43\17\41\2\42\4\41\1\42\32\41\1\42\1\41"+
			"\1\42\2\41\1\42\32\41\50\42\1\41\3\42\1\41\70\42\1\41\7\42\2\41\2\42"+
			"\1\41\5\42\1\41\6\42\1\41\uff06\42",
			"",
			"\0\42",
			"\2\25\1\uffff\1\25\6\uffff\17\25\2\uffff\4\25\1\uffff\32\25\1\uffff"+
			"\1\25\1\uffff\2\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff"+
			"\1\25\7\uffff\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\1\47",
			"\1\50",
			"\2\25\1\uffff\1\25\6\uffff\17\25\2\uffff\4\25\1\uffff\32\25\1\uffff"+
			"\1\25\1\uffff\2\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff"+
			"\1\25\7\uffff\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25",
			"\2\25\1\uffff\1\25\6\uffff\17\25\2\uffff\4\25\1\uffff\32\25\1\uffff"+
			"\1\25\1\uffff\2\25\1\uffff\32\25\50\uffff\1\25\3\uffff\1\25\70\uffff"+
			"\1\25\7\uffff\2\25\2\uffff\1\25\5\uffff\1\25\6\uffff\1\25"
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
			return "1:1: Tokens : ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_24 = input.LA(1);
						s = -1;
						if ( ((LA12_24 >= '!' && LA12_24 <= '\"')||LA12_24=='$'||(LA12_24 >= '+' && LA12_24 <= '9')||(LA12_24 >= '<' && LA12_24 <= '?')||(LA12_24 >= 'A' && LA12_24 <= 'Z')||LA12_24=='\\'||(LA12_24 >= '^' && LA12_24 <= '_')||(LA12_24 >= 'a' && LA12_24 <= 'z')||LA12_24=='\u00A3'||LA12_24=='\u00A7'||LA12_24=='\u00E0'||(LA12_24 >= '\u00E8' && LA12_24 <= '\u00E9')||LA12_24=='\u00EC'||LA12_24=='\u00F2'||LA12_24=='\u00F9') ) {s = 33;}
						else if ( ((LA12_24 >= '\u0000' && LA12_24 <= ' ')||LA12_24=='#'||(LA12_24 >= '%' && LA12_24 <= ')')||(LA12_24 >= ':' && LA12_24 <= ';')||LA12_24=='@'||LA12_24=='['||LA12_24==']'||LA12_24=='`'||(LA12_24 >= '{' && LA12_24 <= '\u00A2')||(LA12_24 >= '\u00A4' && LA12_24 <= '\u00A6')||(LA12_24 >= '\u00A8' && LA12_24 <= '\u00DF')||(LA12_24 >= '\u00E1' && LA12_24 <= '\u00E7')||(LA12_24 >= '\u00EA' && LA12_24 <= '\u00EB')||(LA12_24 >= '\u00ED' && LA12_24 <= '\u00F1')||(LA12_24 >= '\u00F3' && LA12_24 <= '\u00F8')||(LA12_24 >= '\u00FA' && LA12_24 <= '\uFFFF')) ) {s = 34;}
						else if ( (LA12_24=='*') ) {s = 35;}
						else s = 16;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_25 = input.LA(1);
						s = -1;
						if ( ((LA12_25 >= '\u0000' && LA12_25 <= '\uFFFF')) ) {s = 34;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA12_35 = input.LA(1);
						s = -1;
						if ( ((LA12_35 >= '\u0000' && LA12_35 <= '\uFFFF')) ) {s = 34;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA12_33 = input.LA(1);
						s = -1;
						if ( ((LA12_33 >= '\u0000' && LA12_33 <= ' ')||LA12_33=='#'||(LA12_33 >= '%' && LA12_33 <= ')')||(LA12_33 >= ':' && LA12_33 <= ';')||LA12_33=='@'||LA12_33=='['||LA12_33==']'||LA12_33=='`'||(LA12_33 >= '{' && LA12_33 <= '\u00A2')||(LA12_33 >= '\u00A4' && LA12_33 <= '\u00A6')||(LA12_33 >= '\u00A8' && LA12_33 <= '\u00DF')||(LA12_33 >= '\u00E1' && LA12_33 <= '\u00E7')||(LA12_33 >= '\u00EA' && LA12_33 <= '\u00EB')||(LA12_33 >= '\u00ED' && LA12_33 <= '\u00F1')||(LA12_33 >= '\u00F3' && LA12_33 <= '\u00F8')||(LA12_33 >= '\u00FA' && LA12_33 <= '\uFFFF')) ) {s = 34;}
						else if ( ((LA12_33 >= '!' && LA12_33 <= '\"')||LA12_33=='$'||(LA12_33 >= '+' && LA12_33 <= '9')||(LA12_33 >= '<' && LA12_33 <= '?')||(LA12_33 >= 'A' && LA12_33 <= 'Z')||LA12_33=='\\'||(LA12_33 >= '^' && LA12_33 <= '_')||(LA12_33 >= 'a' && LA12_33 <= 'z')||LA12_33=='\u00A3'||LA12_33=='\u00A7'||LA12_33=='\u00E0'||(LA12_33 >= '\u00E8' && LA12_33 <= '\u00E9')||LA12_33=='\u00EC'||LA12_33=='\u00F2'||LA12_33=='\u00F9') ) {s = 33;}
						else if ( (LA12_33=='*') ) {s = 35;}
						else s = 16;
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
