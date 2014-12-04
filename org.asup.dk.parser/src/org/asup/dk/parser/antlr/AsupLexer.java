// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g 2014-02-04 14:49:16
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AsupLexer extends Lexer {
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
    public static final int DIM_CLOSE=13;
    public static final int DIM_OPEN=14;
    public static final int DIV=15;
    public static final int E=16;
    public static final int EQ=17;
    public static final int EXP_CLOSE=18;
    public static final int EXP_OPEN=19;
    public static final int F=20;
    public static final int FILLER=21;
    public static final int FLOAT=22;
    public static final int G=23;
    public static final int GE=24;
    public static final int GT=25;
    public static final int H=26;
    public static final int I=27;
    public static final int INDICATOR=28;
    public static final int INTEGER=29;
    public static final int J=30;
    public static final int K=31;
    public static final int L=32;
    public static final int LE=33;
    public static final int LETTER=34;
    public static final int LT=35;
    public static final int M=36;
    public static final int MINUS=37;
    public static final int MOD=38;
    public static final int MULT=39;
    public static final int N=40;
    public static final int NE=41;
    public static final int NOT=42;
    public static final int NUMBER=43;
    public static final int O=44;
    public static final int OR=45;
    public static final int P=46;
    public static final int PLUS=47;
    public static final int POW=48;
    public static final int Q=49;
    public static final int R=50;
    public static final int S=51;
    public static final int SPECIAL=52;
    public static final int STRING=53;
    public static final int T=54;
    public static final int TOKEN=55;
    public static final int U=56;
    public static final int V=57;
    public static final int W=58;
    public static final int WHITE_SPACE=59;
    public static final int X=60;
    public static final int Y=61;
    public static final int Z=62;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AsupLexer() {} 
    public AsupLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AsupLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:55:7: ( '+' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:55:9: '+'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:56:7: ( '-' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:56:9: '-'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:57:7: ( '*' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:57:9: '*'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:58:7: ( '/' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:58:9: '/'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:59:7: ( '%' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:59:9: '%'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:60:7: ( '^' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:60:9: '^'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:62:7: ( '=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:62:9: '='
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:63:7: ( '<>' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:63:9: '<>'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:64:7: ( '>' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:64:9: '>'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:65:7: ( '>=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:65:9: '>='
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:66:7: ( '<' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:66:9: '<'
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:67:7: ( '<=' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:67:9: '<='
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:70:7: ( A N D )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:70:9: A N D
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:71:7: ( O R )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:71:9: O R
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:72:7: ( N O T )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:72:9: N O T
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:74:13: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:74:15: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:74:15: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:75:6: ( ':' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:75:8: ':'
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
    // $ANTLR end "COMMA"

    // $ANTLR start "EXP_OPEN"
    public final void mEXP_OPEN() throws RecognitionException {
        try {
            int _type = EXP_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:77:9: ( '(' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:77:11: '('
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:78:10: ( ')' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:78:12: ')'
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

    // $ANTLR start "DIM_OPEN"
    public final void mDIM_OPEN() throws RecognitionException {
        try {
            int _type = DIM_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:80:9: ( '[' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:80:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIM_OPEN"

    // $ANTLR start "DIM_CLOSE"
    public final void mDIM_CLOSE() throws RecognitionException {
        try {
            int _type = DIM_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:81:10: ( ']' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:81:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIM_CLOSE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:84:3: ( '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\'' )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:84:5: '\\'' ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 

             StringBuilder b = new StringBuilder(); 

            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:86:5: ( '\\'' '\\'' |c=~ ( '\\'' | '\\r' | '\\n' ) )*
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
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:86:7: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	     b.appendCodePoint('\'');

            	    }
            	    break;
            	case 2 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:87:7: c=~ ( '\\'' | '\\r' | '\\n' )
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:93:8: ( FLOAT | INTEGER )
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
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:93:10: FLOAT
                    {
                    mFLOAT(); 


                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:93:18: INTEGER
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

    // $ANTLR start "INDICATOR"
    public final void mINDICATOR() throws RecognitionException {
        try {
            int _type = INDICATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:94:11: ( ( '*' I N ( LETTER | DIGIT )* ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:94:13: ( '*' I N ( LETTER | DIGIT )* )
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:94:13: ( '*' I N ( LETTER | DIGIT )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:94:14: '*' I N ( LETTER | DIGIT )*
            {
            match('*'); 

            mI(); 


            mN(); 


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:94:22: ( LETTER | DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '$' && LA4_0 <= '%')||LA4_0=='.'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')||LA4_0=='\u00A3'||LA4_0=='\u00A7') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
            	    {
            	    if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDICATOR"

    // $ANTLR start "SPECIAL"
    public final void mSPECIAL() throws RecognitionException {
        try {
            int _type = SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:96:8: ( ( '*' H I V A L | '*' L O V A L | '*' B L A N K S | '*' B L A N K | '*' Z E R O S | '*' Z E R O | '*' O N | '*' O F F | '*' O M I T | '*' N U L L | '*' S T A T U S | '*' P A R M S | '*' M S | '*' N E X T ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:96:10: ( '*' H I V A L | '*' L O V A L | '*' B L A N K S | '*' B L A N K | '*' Z E R O S | '*' Z E R O | '*' O N | '*' O F F | '*' O M I T | '*' N U L L | '*' S T A T U S | '*' P A R M S | '*' M S | '*' N E X T )
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:96:10: ( '*' H I V A L | '*' L O V A L | '*' B L A N K S | '*' B L A N K | '*' Z E R O S | '*' Z E R O | '*' O N | '*' O F F | '*' O M I T | '*' N U L L | '*' S T A T U S | '*' P A R M S | '*' M S | '*' N E X T )
            int alt5=14;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='*') ) {
                switch ( input.LA(2) ) {
                case 'H':
                case 'h':
                    {
                    alt5=1;
                    }
                    break;
                case 'L':
                case 'l':
                    {
                    alt5=2;
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4=='L'||LA5_4=='l') ) {
                        int LA5_11 = input.LA(4);

                        if ( (LA5_11=='A'||LA5_11=='a') ) {
                            int LA5_18 = input.LA(5);

                            if ( (LA5_18=='N'||LA5_18=='n') ) {
                                int LA5_20 = input.LA(6);

                                if ( (LA5_20=='K'||LA5_20=='k') ) {
                                    int LA5_22 = input.LA(7);

                                    if ( (LA5_22=='S'||LA5_22=='s') ) {
                                        alt5=3;
                                    }
                                    else {
                                        alt5=4;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 20, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'Z':
                case 'z':
                    {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5=='E'||LA5_5=='e') ) {
                        int LA5_12 = input.LA(4);

                        if ( (LA5_12=='R'||LA5_12=='r') ) {
                            int LA5_19 = input.LA(5);

                            if ( (LA5_19=='O'||LA5_19=='o') ) {
                                int LA5_21 = input.LA(6);

                                if ( (LA5_21=='S'||LA5_21=='s') ) {
                                    alt5=5;
                                }
                                else {
                                    alt5=6;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'O':
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'N':
                    case 'n':
                        {
                        alt5=7;
                        }
                        break;
                    case 'F':
                    case 'f':
                        {
                        alt5=8;
                        }
                        break;
                    case 'M':
                    case 'm':
                        {
                        alt5=9;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                case 'N':
                case 'n':
                    {
                    int LA5_7 = input.LA(3);

                    if ( (LA5_7=='U'||LA5_7=='u') ) {
                        alt5=10;
                    }
                    else if ( (LA5_7=='E'||LA5_7=='e') ) {
                        alt5=14;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'S':
                case 's':
                    {
                    alt5=11;
                    }
                    break;
                case 'P':
                case 'p':
                    {
                    alt5=12;
                    }
                    break;
                case 'M':
                case 'm':
                    {
                    alt5=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:96:11: '*' H I V A L
                    {
                    match('*'); 

                    mH(); 


                    mI(); 


                    mV(); 


                    mA(); 


                    mL(); 


                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:96:27: '*' L O V A L
                    {
                    match('*'); 

                    mL(); 


                    mO(); 


                    mV(); 


                    mA(); 


                    mL(); 


                    }
                    break;
                case 3 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:97:11: '*' B L A N K S
                    {
                    match('*'); 

                    mB(); 


                    mL(); 


                    mA(); 


                    mN(); 


                    mK(); 


                    mS(); 


                    }
                    break;
                case 4 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:97:29: '*' B L A N K
                    {
                    match('*'); 

                    mB(); 


                    mL(); 


                    mA(); 


                    mN(); 


                    mK(); 


                    }
                    break;
                case 5 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:98:11: '*' Z E R O S
                    {
                    match('*'); 

                    mZ(); 


                    mE(); 


                    mR(); 


                    mO(); 


                    mS(); 


                    }
                    break;
                case 6 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:98:27: '*' Z E R O
                    {
                    match('*'); 

                    mZ(); 


                    mE(); 


                    mR(); 


                    mO(); 


                    }
                    break;
                case 7 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:99:11: '*' O N
                    {
                    match('*'); 

                    mO(); 


                    mN(); 


                    }
                    break;
                case 8 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:99:22: '*' O F F
                    {
                    match('*'); 

                    mO(); 


                    mF(); 


                    mF(); 


                    }
                    break;
                case 9 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:100:11: '*' O M I T
                    {
                    match('*'); 

                    mO(); 


                    mM(); 


                    mI(); 


                    mT(); 


                    }
                    break;
                case 10 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:100:25: '*' N U L L
                    {
                    match('*'); 

                    mN(); 


                    mU(); 


                    mL(); 


                    mL(); 


                    }
                    break;
                case 11 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:101:11: '*' S T A T U S
                    {
                    match('*'); 

                    mS(); 


                    mT(); 


                    mA(); 


                    mT(); 


                    mU(); 


                    mS(); 


                    }
                    break;
                case 12 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:101:29: '*' P A R M S
                    {
                    match('*'); 

                    mP(); 


                    mA(); 


                    mR(); 


                    mM(); 


                    mS(); 


                    }
                    break;
                case 13 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:102:11: '*' M S
                    {
                    match('*'); 

                    mM(); 


                    mS(); 


                    }
                    break;
                case 14 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:102:21: '*' N E X T
                    {
                    match('*'); 

                    mN(); 


                    mE(); 


                    mX(); 


                    mT(); 


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
    // $ANTLR end "SPECIAL"

    // $ANTLR start "FILLER"
    public final void mFILLER() throws RecognitionException {
        try {
            int _type = FILLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:105:7: ( '*' A L L ( STRING | DIGIT ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:105:9: '*' A L L ( STRING | DIGIT )
            {
            match('*'); 

            mA(); 


            mL(); 


            mL(); 


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:105:19: ( STRING | DIGIT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:105:20: STRING
                    {
                    mSTRING(); 


                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:105:29: DIGIT
                    {
                    mDIGIT(); 


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
    // $ANTLR end "FILLER"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:107:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:107:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:107:16: ( LETTER | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '$' && LA7_0 <= '%')||LA7_0=='.'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')||LA7_0=='\u00A3'||LA7_0=='\u00A7') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
            	    {
            	    if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:110:3: ( ( DIGIT )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:110:5: ( DIGIT )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:110:5: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:114:3: ( ( DIGIT DIGIT_SPECIAL DIGIT )+ )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:114:5: ( DIGIT DIGIT_SPECIAL DIGIT )+
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:114:5: ( DIGIT DIGIT_SPECIAL DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:114:6: DIGIT DIGIT_SPECIAL DIGIT
            	    {
            	    mDIGIT(); 


            	    mDIGIT_SPECIAL(); 


            	    mDIGIT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:118:3: ( ( '\\u00A3' | '\\u00A7' | '$' | '%' | '_' | '.' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
            {
            if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='.'||input.LA(1)=='_'||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:122:3: ( ( ',' | '.' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:126:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | CHAR_SPECIAL ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
            {
            if ( (input.LA(1) >= '$' && input.LA(1) <= '%')||input.LA(1)=='.'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00A3'||input.LA(1)=='\u00A7' ) {
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:131:3: ( ( '0' .. '9' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:134:11: ( ( 'a' | 'A' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:135:11: ( ( 'b' | 'B' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:136:11: ( ( 'c' | 'C' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:137:11: ( ( 'd' | 'D' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:138:11: ( ( 'e' | 'E' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:139:11: ( ( 'f' | 'F' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:140:11: ( ( 'g' | 'G' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:141:11: ( ( 'h' | 'H' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:142:11: ( ( 'i' | 'I' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:143:11: ( ( 'j' | 'J' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:144:11: ( ( 'k' | 'K' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:145:11: ( ( 'l' | 'L' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:146:11: ( ( 'm' | 'M' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:147:11: ( ( 'n' | 'N' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:148:11: ( ( 'o' | 'O' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:149:11: ( ( 'p' | 'P' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:150:11: ( ( 'q' | 'Q' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:151:11: ( ( 'r' | 'R' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:152:11: ( ( 's' | 'S' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:153:11: ( ( 't' | 'T' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:154:11: ( ( 'u' | 'U' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:155:11: ( ( 'v' | 'V' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:156:11: ( ( 'w' | 'W' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:157:11: ( ( 'x' | 'X' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:158:11: ( ( 'y' | 'Y' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:159:11: ( ( 'z' | 'Z' ) )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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
        // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | POW | EQ | NE | GT | GE | LT | LE | AND | OR | NOT | WHITE_SPACE | COMMA | EXP_OPEN | EXP_CLOSE | DIM_OPEN | DIM_CLOSE | STRING | NUMBER | INDICATOR | SPECIAL | FILLER | TOKEN )
        int alt10=27;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt10=1;
            }
            break;
        case '-':
            {
            alt10=2;
            }
            break;
        case '*':
            {
            switch ( input.LA(2) ) {
            case 'I':
            case 'i':
                {
                alt10=24;
                }
                break;
            case 'B':
            case 'H':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'S':
            case 'Z':
            case 'b':
            case 'h':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 's':
            case 'z':
                {
                alt10=25;
                }
                break;
            case 'A':
            case 'a':
                {
                alt10=26;
                }
                break;
            default:
                alt10=3;
            }

            }
            break;
        case '/':
            {
            alt10=4;
            }
            break;
        case '%':
            {
            int LA10_5 = input.LA(2);

            if ( ((LA10_5 >= '$' && LA10_5 <= '%')||LA10_5=='.'||(LA10_5 >= '0' && LA10_5 <= '9')||(LA10_5 >= 'A' && LA10_5 <= 'Z')||LA10_5=='_'||(LA10_5 >= 'a' && LA10_5 <= 'z')||LA10_5=='\u00A3'||LA10_5=='\u00A7') ) {
                alt10=27;
            }
            else {
                alt10=5;
            }
            }
            break;
        case '^':
            {
            alt10=6;
            }
            break;
        case '=':
            {
            alt10=7;
            }
            break;
        case '<':
            {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt10=8;
                }
                break;
            case '=':
                {
                alt10=12;
                }
                break;
            default:
                alt10=11;
            }

            }
            break;
        case '>':
            {
            int LA10_9 = input.LA(2);

            if ( (LA10_9=='=') ) {
                alt10=10;
            }
            else {
                alt10=9;
            }
            }
            break;
        case 'A':
        case 'a':
            {
            int LA10_10 = input.LA(2);

            if ( (LA10_10=='N'||LA10_10=='n') ) {
                int LA10_32 = input.LA(3);

                if ( (LA10_32=='D'||LA10_32=='d') ) {
                    int LA10_35 = input.LA(4);

                    if ( ((LA10_35 >= '$' && LA10_35 <= '%')||LA10_35=='.'||(LA10_35 >= '0' && LA10_35 <= '9')||(LA10_35 >= 'A' && LA10_35 <= 'Z')||LA10_35=='_'||(LA10_35 >= 'a' && LA10_35 <= 'z')||LA10_35=='\u00A3'||LA10_35=='\u00A7') ) {
                        alt10=27;
                    }
                    else {
                        alt10=13;
                    }
                }
                else {
                    alt10=27;
                }
            }
            else {
                alt10=27;
            }
            }
            break;
        case 'O':
        case 'o':
            {
            int LA10_11 = input.LA(2);

            if ( (LA10_11=='R'||LA10_11=='r') ) {
                int LA10_33 = input.LA(3);

                if ( ((LA10_33 >= '$' && LA10_33 <= '%')||LA10_33=='.'||(LA10_33 >= '0' && LA10_33 <= '9')||(LA10_33 >= 'A' && LA10_33 <= 'Z')||LA10_33=='_'||(LA10_33 >= 'a' && LA10_33 <= 'z')||LA10_33=='\u00A3'||LA10_33=='\u00A7') ) {
                    alt10=27;
                }
                else {
                    alt10=14;
                }
            }
            else {
                alt10=27;
            }
            }
            break;
        case 'N':
        case 'n':
            {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='O'||LA10_12=='o') ) {
                int LA10_34 = input.LA(3);

                if ( (LA10_34=='T'||LA10_34=='t') ) {
                    int LA10_37 = input.LA(4);

                    if ( ((LA10_37 >= '$' && LA10_37 <= '%')||LA10_37=='.'||(LA10_37 >= '0' && LA10_37 <= '9')||(LA10_37 >= 'A' && LA10_37 <= 'Z')||LA10_37=='_'||(LA10_37 >= 'a' && LA10_37 <= 'z')||LA10_37=='\u00A3'||LA10_37=='\u00A7') ) {
                        alt10=27;
                    }
                    else {
                        alt10=15;
                    }
                }
                else {
                    alt10=27;
                }
            }
            else {
                alt10=27;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt10=16;
            }
            break;
        case ':':
            {
            alt10=17;
            }
            break;
        case '(':
            {
            alt10=18;
            }
            break;
        case ')':
            {
            alt10=19;
            }
            break;
        case '[':
            {
            alt10=20;
            }
            break;
        case ']':
            {
            alt10=21;
            }
            break;
        case '\'':
            {
            alt10=22;
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
            alt10=23;
            }
            break;
        case '$':
        case '.':
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
        case 'L':
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
        case 'l':
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
            alt10=27;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
            case 1 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:10: PLUS
                {
                mPLUS(); 


                }
                break;
            case 2 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:15: MINUS
                {
                mMINUS(); 


                }
                break;
            case 3 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:21: MULT
                {
                mMULT(); 


                }
                break;
            case 4 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:26: DIV
                {
                mDIV(); 


                }
                break;
            case 5 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:30: MOD
                {
                mMOD(); 


                }
                break;
            case 6 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:34: POW
                {
                mPOW(); 


                }
                break;
            case 7 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:38: EQ
                {
                mEQ(); 


                }
                break;
            case 8 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:41: NE
                {
                mNE(); 


                }
                break;
            case 9 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:44: GT
                {
                mGT(); 


                }
                break;
            case 10 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:47: GE
                {
                mGE(); 


                }
                break;
            case 11 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:50: LT
                {
                mLT(); 


                }
                break;
            case 12 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:53: LE
                {
                mLE(); 


                }
                break;
            case 13 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:56: AND
                {
                mAND(); 


                }
                break;
            case 14 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:60: OR
                {
                mOR(); 


                }
                break;
            case 15 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:63: NOT
                {
                mNOT(); 


                }
                break;
            case 16 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:67: WHITE_SPACE
                {
                mWHITE_SPACE(); 


                }
                break;
            case 17 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:79: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 18 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:85: EXP_OPEN
                {
                mEXP_OPEN(); 


                }
                break;
            case 19 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:94: EXP_CLOSE
                {
                mEXP_CLOSE(); 


                }
                break;
            case 20 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:104: DIM_OPEN
                {
                mDIM_OPEN(); 


                }
                break;
            case 21 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:113: DIM_CLOSE
                {
                mDIM_CLOSE(); 


                }
                break;
            case 22 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:123: STRING
                {
                mSTRING(); 


                }
                break;
            case 23 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:130: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 24 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:137: INDICATOR
                {
                mINDICATOR(); 


                }
                break;
            case 25 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:147: SPECIAL
                {
                mSPECIAL(); 


                }
                break;
            case 26 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:155: FILLER
                {
                mFILLER(); 


                }
                break;
            case 27 :
                // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:1:162: TOKEN
                {
                mTOKEN(); 


                }
                break;

        }

    }


 

}