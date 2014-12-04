// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g 2014-02-04 14:49:15
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DB2400Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int A=4;
    public static final int AND=5;
    public static final int B=6;
    public static final int C=7;
    public static final int CHAR_SPECIAL=8;
    public static final int COMMA=9;
    public static final int D=10;
    public static final int DIGIT=11;
    public static final int DIGIT_SPECIAL=12;
    public static final int DIV=13;
    public static final int DOT=14;
    public static final int E=15;
    public static final int EQ=16;
    public static final int EXP_CLOSE=17;
    public static final int EXP_OPEN=18;
    public static final int F=19;
    public static final int FLOAT=20;
    public static final int G=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int H=24;
    public static final int I=25;
    public static final int INTEGER=26;
    public static final int J=27;
    public static final int K=28;
    public static final int L=29;
    public static final int LE=30;
    public static final int LETTER=31;
    public static final int LIKE=32;
    public static final int LT=33;
    public static final int M=34;
    public static final int MINUS=35;
    public static final int MOD=36;
    public static final int MUL=37;
    public static final int N=38;
    public static final int NE=39;
    public static final int NOT=40;
    public static final int NUMBER=41;
    public static final int O=42;
    public static final int OR=43;
    public static final int P=44;
    public static final int PLUS=45;
    public static final int POW=46;
    public static final int Q=47;
    public static final int R=48;
    public static final int S=49;
    public static final int STRING=50;
    public static final int T=51;
    public static final int TOKEN=52;
    public static final int U=53;
    public static final int V=54;
    public static final int VARIABLE=55;
    public static final int W=56;
    public static final int WHITE_SPACE=57;
    public static final int X=58;
    public static final int Y=59;
    public static final int Z=60;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DB2400Lexer() {} 
    public DB2400Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DB2400Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:54:7: ( '+' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:54:9: '+'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:55:7: ( '-' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:55:9: '-'
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

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:56:7: ( '*' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:56:9: '*'
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
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:57:7: ( '/' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:57:9: '/'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:58:7: ( '%' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:58:9: '%'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:59:7: ( '^' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:59:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:61:7: ( '=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:61:9: '='
            {
            match('='); 

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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:62:7: ( '<>' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:62:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:63:7: ( '>' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:63:9: '>'
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

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:64:7: ( '>=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:64:9: '>='
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
    // $ANTLR end "GE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:65:7: ( '<' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:65:9: '<'
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

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:66:7: ( '<=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:66:9: '<='
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
    // $ANTLR end "LE"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:67:7: ( L I K E )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:67:9: L I K E
            {
            mL(); 


            mI(); 


            mK(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:70:7: ( A N D )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:70:9: A N D
            {
            mA(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:71:7: ( O R )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:71:9: O R
            {
            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:72:7: ( N O T )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:72:9: N O T
            {
            mN(); 


            mO(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "WHITE_SPACE"
    public final void mWHITE_SPACE() throws RecognitionException {
        try {
            int _type = WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:74:13: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:74:15: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:74:15: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITE_SPACE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:75:6: ( ',' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:75:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:76:4: ( '.' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:76:6: '.'
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
    // $ANTLR end "DOT"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:77:9: ( ':' TOKEN )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:77:11: ':' TOKEN
            {
            match(':'); 

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

    // $ANTLR start "EXP_OPEN"
    public final void mEXP_OPEN() throws RecognitionException {
        try {
            int _type = EXP_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:78:9: ( '(' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:78:11: '('
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
    // $ANTLR end "EXP_OPEN"

    // $ANTLR start "EXP_CLOSE"
    public final void mEXP_CLOSE() throws RecognitionException {
        try {
            int _type = EXP_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:79:10: ( ')' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:79:12: ')'
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
    // $ANTLR end "EXP_CLOSE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:83:3: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:83:5: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 

             StringBuilder b = new StringBuilder(); 

            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:85:5: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:85:7: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	     b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:86:7: c=~ ( '\\'' | '\\r' | '\\n' )
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
            	    break loop2;
                }
            } while (true);


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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:92:8: ( FLOAT | INTEGER )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==','||LA3_1=='.') ) {
                    alt3=1;
                }
                else {
                    alt3=2;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:92:10: FLOAT
                    {
                    mFLOAT(); 


                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:92:18: INTEGER
                    {
                    mINTEGER(); 


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
    // $ANTLR end "NUMBER"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:93:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:93:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:93:16: ( LETTER | DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '$' && LA4_0 <= '%')||LA4_0=='*'||LA4_0=='.'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')||LA4_0=='\u00A3'||LA4_0=='\u00A7') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
            	    {
            	    if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='*'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOKEN"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:96:3: ( ( DIGIT )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:96:5: ( DIGIT )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:96:5: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:100:3: ( ( DIGIT DIGIT_SPECIAL DIGIT )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:100:5: ( DIGIT DIGIT_SPECIAL DIGIT )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:100:5: ( DIGIT DIGIT_SPECIAL DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:100:6: DIGIT DIGIT_SPECIAL DIGIT
            	    {
            	    mDIGIT(); 


            	    mDIGIT_SPECIAL(); 


            	    mDIGIT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "CHAR_SPECIAL"
    public final void mCHAR_SPECIAL() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:105:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '%' | '_' | '.' | '*' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
            {
            if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='*'||input.LA(1)=='.'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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

    // $ANTLR start "DIGIT_SPECIAL"
    public final void mDIGIT_SPECIAL() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:109:3: ( ( ',' | '.' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:113:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
            {
            if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='*'||input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:118:3: ( ( '0' .. '9' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:121:11: ( ( 'a' | 'A' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:122:11: ( ( 'b' | 'B' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:123:11: ( ( 'c' | 'C' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:124:11: ( ( 'd' | 'D' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:125:11: ( ( 'e' | 'E' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:126:11: ( ( 'f' | 'F' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:127:11: ( ( 'g' | 'G' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:128:11: ( ( 'h' | 'H' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:129:11: ( ( 'i' | 'I' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:130:11: ( ( 'j' | 'J' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:131:11: ( ( 'k' | 'K' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:132:11: ( ( 'l' | 'L' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:133:11: ( ( 'm' | 'M' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:134:11: ( ( 'n' | 'N' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:135:11: ( ( 'o' | 'O' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:136:11: ( ( 'p' | 'P' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:137:11: ( ( 'q' | 'Q' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:138:11: ( ( 'r' | 'R' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:139:11: ( ( 's' | 'S' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:140:11: ( ( 't' | 'T' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:141:11: ( ( 'u' | 'U' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:142:11: ( ( 'v' | 'V' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:143:11: ( ( 'w' | 'W' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:144:11: ( ( 'x' | 'X' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:145:11: ( ( 'y' | 'Y' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:146:11: ( ( 'z' | 'Z' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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

    public void mTokens() throws RecognitionException {
        // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:8: ( PLUS | MINUS | MUL | DIV | MOD | POW | EQ | NE | GT | GE | LT | LE | LIKE | AND | OR | NOT | WHITE_SPACE | COMMA | DOT | VARIABLE | EXP_OPEN | EXP_CLOSE | STRING | NUMBER | TOKEN )
        int alt7=25;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt7=1;
            }
            break;
        case '-':
            {
            alt7=2;
            }
            break;
        case '*':
            {
            int LA7_3 = input.LA(2);

            if ( ((LA7_3 >= '$' && LA7_3 <= '%')||LA7_3=='*'||LA7_3=='.'||(LA7_3 >= '0' && LA7_3 <= '9')||(LA7_3 >= 'A' && LA7_3 <= 'Z')||LA7_3=='_'||(LA7_3 >= 'a' && LA7_3 <= 'z')||LA7_3=='\u00A3'||LA7_3=='\u00A7') ) {
                alt7=25;
            }
            else {
                alt7=3;
            }
            }
            break;
        case '/':
            {
            alt7=4;
            }
            break;
        case '%':
            {
            int LA7_5 = input.LA(2);

            if ( ((LA7_5 >= '$' && LA7_5 <= '%')||LA7_5=='*'||LA7_5=='.'||(LA7_5 >= '0' && LA7_5 <= '9')||(LA7_5 >= 'A' && LA7_5 <= 'Z')||LA7_5=='_'||(LA7_5 >= 'a' && LA7_5 <= 'z')||LA7_5=='\u00A3'||LA7_5=='\u00A7') ) {
                alt7=25;
            }
            else {
                alt7=5;
            }
            }
            break;
        case '^':
            {
            alt7=6;
            }
            break;
        case '=':
            {
            alt7=7;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt7=8;
                }
                break;
            case '=':
                {
                alt7=12;
                }
                break;
            default:
                alt7=11;
            }

            }
            break;
        case '>':
            {
            int LA7_9 = input.LA(2);

            if ( (LA7_9=='=') ) {
                alt7=10;
            }
            else {
                alt7=9;
            }
            }
            break;
        case 'L':
        case 'l':
            {
            int LA7_10 = input.LA(2);

            if ( (LA7_10=='I'||LA7_10=='i') ) {
                int LA7_30 = input.LA(3);

                if ( (LA7_30=='K'||LA7_30=='k') ) {
                    int LA7_35 = input.LA(4);

                    if ( (LA7_35=='E'||LA7_35=='e') ) {
                        int LA7_39 = input.LA(5);

                        if ( ((LA7_39 >= '$' && LA7_39 <= '%')||LA7_39=='*'||LA7_39=='.'||(LA7_39 >= '0' && LA7_39 <= '9')||(LA7_39 >= 'A' && LA7_39 <= 'Z')||LA7_39=='_'||(LA7_39 >= 'a' && LA7_39 <= 'z')||LA7_39=='\u00A3'||LA7_39=='\u00A7') ) {
                            alt7=25;
                        }
                        else {
                            alt7=13;
                        }
                    }
                    else {
                        alt7=25;
                    }
                }
                else {
                    alt7=25;
                }
            }
            else {
                alt7=25;
            }
            }
            break;
        case 'A':
        case 'a':
            {
            int LA7_11 = input.LA(2);

            if ( (LA7_11=='N'||LA7_11=='n') ) {
                int LA7_31 = input.LA(3);

                if ( (LA7_31=='D'||LA7_31=='d') ) {
                    int LA7_36 = input.LA(4);

                    if ( ((LA7_36 >= '$' && LA7_36 <= '%')||LA7_36=='*'||LA7_36=='.'||(LA7_36 >= '0' && LA7_36 <= '9')||(LA7_36 >= 'A' && LA7_36 <= 'Z')||LA7_36=='_'||(LA7_36 >= 'a' && LA7_36 <= 'z')||LA7_36=='\u00A3'||LA7_36=='\u00A7') ) {
                        alt7=25;
                    }
                    else {
                        alt7=14;
                    }
                }
                else {
                    alt7=25;
                }
            }
            else {
                alt7=25;
            }
            }
            break;
        case 'O':
        case 'o':
            {
            int LA7_12 = input.LA(2);

            if ( (LA7_12=='R'||LA7_12=='r') ) {
                int LA7_32 = input.LA(3);

                if ( ((LA7_32 >= '$' && LA7_32 <= '%')||LA7_32=='*'||LA7_32=='.'||(LA7_32 >= '0' && LA7_32 <= '9')||(LA7_32 >= 'A' && LA7_32 <= 'Z')||LA7_32=='_'||(LA7_32 >= 'a' && LA7_32 <= 'z')||LA7_32=='\u00A3'||LA7_32=='\u00A7') ) {
                    alt7=25;
                }
                else {
                    alt7=15;
                }
            }
            else {
                alt7=25;
            }
            }
            break;
        case 'N':
        case 'n':
            {
            int LA7_13 = input.LA(2);

            if ( (LA7_13=='O'||LA7_13=='o') ) {
                int LA7_33 = input.LA(3);

                if ( (LA7_33=='T'||LA7_33=='t') ) {
                    int LA7_38 = input.LA(4);

                    if ( ((LA7_38 >= '$' && LA7_38 <= '%')||LA7_38=='*'||LA7_38=='.'||(LA7_38 >= '0' && LA7_38 <= '9')||(LA7_38 >= 'A' && LA7_38 <= 'Z')||LA7_38=='_'||(LA7_38 >= 'a' && LA7_38 <= 'z')||LA7_38=='\u00A3'||LA7_38=='\u00A7') ) {
                        alt7=25;
                    }
                    else {
                        alt7=16;
                    }
                }
                else {
                    alt7=25;
                }
            }
            else {
                alt7=25;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt7=17;
            }
            break;
        case ',':
            {
            alt7=18;
            }
            break;
        case '.':
            {
            int LA7_16 = input.LA(2);

            if ( ((LA7_16 >= '$' && LA7_16 <= '%')||LA7_16=='*'||LA7_16=='.'||(LA7_16 >= '0' && LA7_16 <= '9')||(LA7_16 >= 'A' && LA7_16 <= 'Z')||LA7_16=='_'||(LA7_16 >= 'a' && LA7_16 <= 'z')||LA7_16=='\u00A3'||LA7_16=='\u00A7') ) {
                alt7=25;
            }
            else {
                alt7=19;
            }
            }
            break;
        case ':':
            {
            alt7=20;
            }
            break;
        case '(':
            {
            alt7=21;
            }
            break;
        case ')':
            {
            alt7=22;
            }
            break;
        case '\'':
            {
            alt7=23;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=24;
            }
            break;
        case '$':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'M':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'm':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
        case '\u00A3':
        case '\u00A7':
            {
            alt7=25;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:10: PLUS
                {
                mPLUS(); 


                }
                break;
            case 2 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:15: MINUS
                {
                mMINUS(); 


                }
                break;
            case 3 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:21: MUL
                {
                mMUL(); 


                }
                break;
            case 4 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:25: DIV
                {
                mDIV(); 


                }
                break;
            case 5 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:29: MOD
                {
                mMOD(); 


                }
                break;
            case 6 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:33: POW
                {
                mPOW(); 


                }
                break;
            case 7 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:37: EQ
                {
                mEQ(); 


                }
                break;
            case 8 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:40: NE
                {
                mNE(); 


                }
                break;
            case 9 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:43: GT
                {
                mGT(); 


                }
                break;
            case 10 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:46: GE
                {
                mGE(); 


                }
                break;
            case 11 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:49: LT
                {
                mLT(); 


                }
                break;
            case 12 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:52: LE
                {
                mLE(); 


                }
                break;
            case 13 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:55: LIKE
                {
                mLIKE(); 


                }
                break;
            case 14 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:60: AND
                {
                mAND(); 


                }
                break;
            case 15 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:64: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:67: NOT
                {
                mNOT(); 


                }
                break;
            case 17 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:71: WHITE_SPACE
                {
                mWHITE_SPACE(); 


                }
                break;
            case 18 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:83: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 19 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:89: DOT
                {
                mDOT(); 


                }
                break;
            case 20 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:93: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 21 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:102: EXP_OPEN
                {
                mEXP_OPEN(); 


                }
                break;
            case 22 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:111: EXP_CLOSE
                {
                mEXP_CLOSE(); 


                }
                break;
            case 23 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:121: STRING
                {
                mSTRING(); 


                }
                break;
            case 24 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:128: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 25 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:1:135: TOKEN
                {
                mTOKEN(); 


                }
                break;

        }

    }


 

}