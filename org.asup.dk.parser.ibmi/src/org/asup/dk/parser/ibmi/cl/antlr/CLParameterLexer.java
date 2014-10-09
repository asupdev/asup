// $ANTLR 3.5.1 CLParameter.g 2014-10-09 10:43:33

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
	public static final int ASTERISK=5;
	public static final int BCAT=6;
	public static final int CAT=7;
	public static final int CHAR_SPECIAL=8;
	public static final int CLOSE_BRACE=9;
	public static final int COMMENT=10;
	public static final int CR=11;
	public static final int FILTER=12;
	public static final int FUNCTION=13;
	public static final int FUNCTION_NAME=14;
	public static final int HEX=15;
	public static final int LIST=16;
	public static final int OPEN_BRACE=17;
	public static final int SPECIAL=18;
	public static final int STRING=19;
	public static final int TCAT=20;
	public static final int TOKEN=21;
	public static final int VALUE=22;
	public static final int VARIABLE=23;
	public static final int WS=24;

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
			// CLParameter.g:125:9: ( '!!' | '*CAT' )
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
					// CLParameter.g:125:11: '!!'
					{
					match("!!"); 

					}
					break;
				case 2 :
					// CLParameter.g:125:18: '*CAT'
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
			// CLParameter.g:127:9: ( '!>' | '*BCAT' )
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
					// CLParameter.g:127:11: '!>'
					{
					match("!>"); 

					}
					break;
				case 2 :
					// CLParameter.g:127:18: '*BCAT'
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
			// CLParameter.g:129:9: ( '!<' | '*TCAT' )
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
					// CLParameter.g:129:11: '!<'
					{
					match("!<"); 

					}
					break;
				case 2 :
					// CLParameter.g:129:18: '*TCAT'
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
			// CLParameter.g:131:14: ( ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' ) )
			// CLParameter.g:132:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
			{
			// CLParameter.g:132:2: ( '%SST' | '%SWITCH' | '%BINARY' | '%BIN' )
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
					// CLParameter.g:132:3: '%SST'
					{
					match("%SST"); 

					}
					break;
				case 2 :
					// CLParameter.g:132:12: '%SWITCH'
					{
					match("%SWITCH"); 

					}
					break;
				case 3 :
					// CLParameter.g:132:24: '%BINARY'
					{
					match("%BINARY"); 

					}
					break;
				case 4 :
					// CLParameter.g:132:36: '%BIN'
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
			// CLParameter.g:135:8: ( APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS )
			// CLParameter.g:136:4: APOS ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+ APOS
			{
			mAPOS(); 

			// CLParameter.g:136:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL | ' ' | '%' | '&' )+
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
			// CLParameter.g:139:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+ )
			// CLParameter.g:140:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
			{
			// CLParameter.g:140:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | CHAR_SPECIAL )+
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
			// CLParameter.g:143:9: ( '&' TOKEN )
			// CLParameter.g:144:4: '&' TOKEN
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
			// CLParameter.g:147:9: ( ASTERISK TOKEN )
			// CLParameter.g:148:4: ASTERISK TOKEN
			{
			mASTERISK(); 

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
			// CLParameter.g:151:8: ( TOKEN ASTERISK )
			// CLParameter.g:152:4: TOKEN ASTERISK
			{
			mTOKEN(); 

			mASTERISK(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILTER"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:155:9: ( '*' )
			// CLParameter.g:156:2: '*'
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
	// $ANTLR end "ASTERISK"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			int _type = HEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:159:5: ( 'X' APOS ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ APOS )
			// CLParameter.g:160:2: 'X' APOS ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ APOS
			{
			match('X'); 
			mAPOS(); 

			// CLParameter.g:160:11: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'F')||(LA7_0 >= 'a' && LA7_0 <= 'f')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// CLParameter.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
	// $ANTLR end "HEX"

	// $ANTLR start "OPEN_BRACE"
	public final void mOPEN_BRACE() throws RecognitionException {
		try {
			int _type = OPEN_BRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// CLParameter.g:164:3: ( '(' )
			// CLParameter.g:165:3: '('
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
			// CLParameter.g:169:3: ( ')' )
			// CLParameter.g:170:3: ')'
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
			// CLParameter.g:173:6: ( '\\'' )
			// CLParameter.g:174:2: '\\''
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
			// CLParameter.g:178:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='/') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='/') ) {
					alt11=1;
				}
				else if ( (LA11_1=='*') ) {
					alt11=2;
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
					// CLParameter.g:178:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// CLParameter.g:178:14: (~ ( '\\n' | '\\r' ) )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
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
							break loop8;
						}
					}

					// CLParameter.g:178:28: ( '\\r' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='\r') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// CLParameter.g:178:28: '\\r'
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
					// CLParameter.g:179:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// CLParameter.g:179:14: ( options {greedy=false; } : . )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0=='*') ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1=='/') ) {
								alt10=2;
							}
							else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
								alt10=1;
							}

						}
						else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// CLParameter.g:179:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop10;
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
			// CLParameter.g:182:4: ( ( '\\r' )? '\\n' )
			// CLParameter.g:183:3: ( '\\r' )? '\\n'
			{
			// CLParameter.g:183:3: ( '\\r' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\r') ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// CLParameter.g:183:4: '\\r'
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
			// CLParameter.g:186:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// CLParameter.g:186:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// CLParameter.g:199:3: ( ( '\\u00A7' | '$' | '_' | '.' | '^' | '\\u00e0' | '\\u00e8' | '\\u00e9' | '\\u00ec' | '\\u00f2' | '\\u00f9' | '\"' | '?' | ',' | '\\u00a3' | '!' | '=' | '>' | '<' | '+' | '-' | '/' | '\\\\' ) )
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
		// CLParameter.g:1:8: ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | ASTERISK | HEX | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS )
		int alt13=17;
		alt13 = dfa13.predict(input);
		switch (alt13) {
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
				// CLParameter.g:1:75: ASTERISK
				{
				mASTERISK(); 

				}
				break;
			case 11 :
				// CLParameter.g:1:84: HEX
				{
				mHEX(); 

				}
				break;
			case 12 :
				// CLParameter.g:1:88: OPEN_BRACE
				{
				mOPEN_BRACE(); 

				}
				break;
			case 13 :
				// CLParameter.g:1:99: CLOSE_BRACE
				{
				mCLOSE_BRACE(); 

				}
				break;
			case 14 :
				// CLParameter.g:1:111: APOS
				{
				mAPOS(); 

				}
				break;
			case 15 :
				// CLParameter.g:1:116: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 16 :
				// CLParameter.g:1:124: CR
				{
				mCR(); 

				}
				break;
			case 17 :
				// CLParameter.g:1:127: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\1\uffff\1\21\1\26\1\uffff\1\30\1\21\1\uffff\1\21\2\uffff\1\21\1\15\2"+
		"\uffff\1\36\1\37\1\40\2\uffff\3\27\5\uffff\1\21\1\22\4\uffff\3\27\1\21"+
		"\1\uffff\1\22\1\36\2\27\1\37\1\40";
	static final String DFA13_eofS =
		"\54\uffff";
	static final String DFA13_minS =
		"\1\11\2\41\1\uffff\1\40\1\41\1\uffff\1\41\2\uffff\1\41\1\12\2\uffff\3"+
		"\41\2\uffff\1\101\2\103\5\uffff\2\0\4\uffff\1\124\2\101\1\0\1\uffff\1"+
		"\0\1\41\2\124\2\41";
	static final String DFA13_maxS =
		"\3\u00f9\1\uffff\2\u00f9\1\uffff\1\u00f9\2\uffff\1\u00f9\1\12\2\uffff"+
		"\3\u00f9\2\uffff\1\101\2\103\5\uffff\2\uffff\4\uffff\1\124\2\101\1\uffff"+
		"\1\uffff\1\uffff\1\u00f9\2\124\2\u00f9";
	static final String DFA13_acceptS =
		"\3\uffff\1\4\2\uffff\1\7\1\uffff\1\14\1\15\2\uffff\1\20\1\21\3\uffff\1"+
		"\6\1\11\3\uffff\1\12\1\10\1\16\1\5\1\13\2\uffff\1\20\1\1\1\2\1\3\4\uffff"+
		"\1\17\6\uffff";
	static final String DFA13_specialS =
		"\33\uffff\1\1\1\0\7\uffff\1\3\1\uffff\1\2\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\15\1\14\2\uffff\1\13\22\uffff\1\15\1\1\1\12\1\uffff\1\12\1\3\1\6\1"+
			"\4\1\10\1\11\1\2\4\12\1\7\12\12\2\uffff\4\12\1\uffff\27\12\1\5\2\12\1"+
			"\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70"+
			"\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\1\16\1\12\1\uffff\1\12\5\uffff\1\22\17\12\2\uffff\1\20\1\12\1\17\1"+
			"\12\1\uffff\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1"+
			"\12\3\uffff\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12"+
			"\6\uffff\1\12",
			"\2\27\1\uffff\1\27\6\uffff\17\27\2\uffff\4\27\1\uffff\1\27\1\24\1\23"+
			"\20\27\1\25\6\27\1\uffff\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27"+
			"\3\uffff\1\27\70\uffff\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6"+
			"\uffff\1\27",
			"",
			"\3\31\1\uffff\3\31\4\uffff\17\31\2\uffff\4\31\1\uffff\32\31\1\uffff"+
			"\1\31\1\uffff\2\31\1\uffff\32\31\50\uffff\1\31\3\uffff\1\31\70\uffff"+
			"\1\31\7\uffff\2\31\2\uffff\1\31\5\uffff\1\31\6\uffff\1\31",
			"\2\12\1\uffff\1\12\2\uffff\1\32\2\uffff\1\22\17\12\2\uffff\4\12\1\uffff"+
			"\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff"+
			"\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1"+
			"\12",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\34\4\12\1\33\12\12\2\uffff\4\12\1\uffff"+
			"\32\12\1\uffff\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff"+
			"\1\12\70\uffff\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1"+
			"\12",
			"",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\22\17\12\2\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\1\35",
			"",
			"",
			"\2\12\1\uffff\1\12\5\uffff\1\22\17\12\2\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\2\12\1\uffff\1\12\5\uffff\1\22\17\12\2\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"\2\12\1\uffff\1\12\5\uffff\1\22\17\12\2\uffff\4\12\1\uffff\32\12\1\uffff"+
			"\1\12\1\uffff\2\12\1\uffff\32\12\50\uffff\1\12\3\uffff\1\12\70\uffff"+
			"\1\12\7\uffff\2\12\2\uffff\1\12\5\uffff\1\12\6\uffff\1\12",
			"",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"",
			"",
			"",
			"",
			"\41\45\2\44\1\45\1\44\5\45\1\46\17\44\2\45\4\44\1\45\32\44\1\45\1\44"+
			"\1\45\2\44\1\45\32\44\50\45\1\44\3\45\1\44\70\45\1\44\7\45\2\44\2\45"+
			"\1\44\5\45\1\44\6\45\1\44\uff06\45",
			"\0\45",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\50",
			"\1\51",
			"\41\45\2\44\1\45\1\44\5\45\1\46\17\44\2\45\4\44\1\45\32\44\1\45\1\44"+
			"\1\45\2\44\1\45\32\44\50\45\1\44\3\45\1\44\70\45\1\44\7\45\2\44\2\45"+
			"\1\44\5\45\1\44\6\45\1\44\uff06\45",
			"",
			"\0\45",
			"\2\27\1\uffff\1\27\6\uffff\17\27\2\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\1\52",
			"\1\53",
			"\2\27\1\uffff\1\27\6\uffff\17\27\2\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27",
			"\2\27\1\uffff\1\27\6\uffff\17\27\2\uffff\4\27\1\uffff\32\27\1\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\32\27\50\uffff\1\27\3\uffff\1\27\70\uffff"+
			"\1\27\7\uffff\2\27\2\uffff\1\27\5\uffff\1\27\6\uffff\1\27"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CAT | BCAT | TCAT | FUNCTION_NAME | STRING | TOKEN | VARIABLE | SPECIAL | FILTER | ASTERISK | HEX | OPEN_BRACE | CLOSE_BRACE | APOS | COMMENT | CR | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_28 = input.LA(1);
						s = -1;
						if ( ((LA13_28 >= '\u0000' && LA13_28 <= '\uFFFF')) ) {s = 37;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_27 = input.LA(1);
						s = -1;
						if ( ((LA13_27 >= '!' && LA13_27 <= '\"')||LA13_27=='$'||(LA13_27 >= '+' && LA13_27 <= '9')||(LA13_27 >= '<' && LA13_27 <= '?')||(LA13_27 >= 'A' && LA13_27 <= 'Z')||LA13_27=='\\'||(LA13_27 >= '^' && LA13_27 <= '_')||(LA13_27 >= 'a' && LA13_27 <= 'z')||LA13_27=='\u00A3'||LA13_27=='\u00A7'||LA13_27=='\u00E0'||(LA13_27 >= '\u00E8' && LA13_27 <= '\u00E9')||LA13_27=='\u00EC'||LA13_27=='\u00F2'||LA13_27=='\u00F9') ) {s = 36;}
						else if ( ((LA13_27 >= '\u0000' && LA13_27 <= ' ')||LA13_27=='#'||(LA13_27 >= '%' && LA13_27 <= ')')||(LA13_27 >= ':' && LA13_27 <= ';')||LA13_27=='@'||LA13_27=='['||LA13_27==']'||LA13_27=='`'||(LA13_27 >= '{' && LA13_27 <= '\u00A2')||(LA13_27 >= '\u00A4' && LA13_27 <= '\u00A6')||(LA13_27 >= '\u00A8' && LA13_27 <= '\u00DF')||(LA13_27 >= '\u00E1' && LA13_27 <= '\u00E7')||(LA13_27 >= '\u00EA' && LA13_27 <= '\u00EB')||(LA13_27 >= '\u00ED' && LA13_27 <= '\u00F1')||(LA13_27 >= '\u00F3' && LA13_27 <= '\u00F8')||(LA13_27 >= '\u00FA' && LA13_27 <= '\uFFFF')) ) {s = 37;}
						else if ( (LA13_27=='*') ) {s = 38;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_38 = input.LA(1);
						s = -1;
						if ( ((LA13_38 >= '\u0000' && LA13_38 <= '\uFFFF')) ) {s = 37;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA13_36 = input.LA(1);
						s = -1;
						if ( ((LA13_36 >= '\u0000' && LA13_36 <= ' ')||LA13_36=='#'||(LA13_36 >= '%' && LA13_36 <= ')')||(LA13_36 >= ':' && LA13_36 <= ';')||LA13_36=='@'||LA13_36=='['||LA13_36==']'||LA13_36=='`'||(LA13_36 >= '{' && LA13_36 <= '\u00A2')||(LA13_36 >= '\u00A4' && LA13_36 <= '\u00A6')||(LA13_36 >= '\u00A8' && LA13_36 <= '\u00DF')||(LA13_36 >= '\u00E1' && LA13_36 <= '\u00E7')||(LA13_36 >= '\u00EA' && LA13_36 <= '\u00EB')||(LA13_36 >= '\u00ED' && LA13_36 <= '\u00F1')||(LA13_36 >= '\u00F3' && LA13_36 <= '\u00F8')||(LA13_36 >= '\u00FA' && LA13_36 <= '\uFFFF')) ) {s = 37;}
						else if ( ((LA13_36 >= '!' && LA13_36 <= '\"')||LA13_36=='$'||(LA13_36 >= '+' && LA13_36 <= '9')||(LA13_36 >= '<' && LA13_36 <= '?')||(LA13_36 >= 'A' && LA13_36 <= 'Z')||LA13_36=='\\'||(LA13_36 >= '^' && LA13_36 <= '_')||(LA13_36 >= 'a' && LA13_36 <= 'z')||LA13_36=='\u00A3'||LA13_36=='\u00A7'||LA13_36=='\u00E0'||(LA13_36 >= '\u00E8' && LA13_36 <= '\u00E9')||LA13_36=='\u00EC'||LA13_36=='\u00F2'||LA13_36=='\u00F9') ) {s = 36;}
						else if ( (LA13_36=='*') ) {s = 38;}
						else s = 17;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
