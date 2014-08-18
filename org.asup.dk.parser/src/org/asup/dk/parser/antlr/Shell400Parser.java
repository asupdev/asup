// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g 2014-02-04 14:49:14
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Shell400Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "C", "CHAR_SPECIAL", "D", "DIGIT", "DIGIT_SPECIAL", "E", "EXP_CLOSE", "EXP_OPEN", "F", "FLOAT", "G", "H", "I", "INTEGER", "J", "K", "L", "LETTER", "M", "N", "O", "P", "PARAM", "Q", "R", "S", "SPECIAL", "STRING", "T", "TOKEN", "U", "V", "VALUE", "VARIABLE", "W", "WHITE_SPACE", "X", "Y", "Z"
    };

    public static final int EOF=-1;
    public static final int A=4;
    public static final int B=5;
    public static final int C=6;
    public static final int CHAR_SPECIAL=7;
    public static final int D=8;
    public static final int DIGIT=9;
    public static final int DIGIT_SPECIAL=10;
    public static final int E=11;
    public static final int EXP_CLOSE=12;
    public static final int EXP_OPEN=13;
    public static final int F=14;
    public static final int FLOAT=15;
    public static final int G=16;
    public static final int H=17;
    public static final int I=18;
    public static final int INTEGER=19;
    public static final int J=20;
    public static final int K=21;
    public static final int L=22;
    public static final int LETTER=23;
    public static final int M=24;
    public static final int N=25;
    public static final int O=26;
    public static final int P=27;
    public static final int PARAM=28;
    public static final int Q=29;
    public static final int R=30;
    public static final int S=31;
    public static final int SPECIAL=32;
    public static final int STRING=33;
    public static final int T=34;
    public static final int TOKEN=35;
    public static final int U=36;
    public static final int V=37;
    public static final int VALUE=38;
    public static final int VARIABLE=39;
    public static final int W=40;
    public static final int WHITE_SPACE=41;
    public static final int X=42;
    public static final int Y=43;
    public static final int Z=44;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Shell400Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Shell400Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Shell400Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g"; }



    // $ANTLR start "parse"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:9:1: parse : expression ;
    public final void parse() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:10:3: ( expression )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:10:7: expression
            {
            pushFollow(FOLLOW_expression_in_parse36);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parse"



    // $ANTLR start "term"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:13:1: term : ( PARAM | VALUE | SPECIAL | VARIABLE | EXP_OPEN | EXP_CLOSE );
    public final void term() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:14:3: ( PARAM | VALUE | SPECIAL | VARIABLE | EXP_OPEN | EXP_CLOSE )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:
            {
            if ( (input.LA(1) >= EXP_CLOSE && input.LA(1) <= EXP_OPEN)||input.LA(1)==PARAM||input.LA(1)==SPECIAL||(input.LA(1) >= VALUE && input.LA(1) <= VARIABLE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "expression"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:22:1: expression : ( term )* ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:23:3: ( ( term )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:23:5: ( term )*
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:23:5: ( term )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= EXP_CLOSE && LA1_0 <= EXP_OPEN)||LA1_0==PARAM||LA1_0==SPECIAL||(LA1_0 >= VALUE && LA1_0 <= VARIABLE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Shell400.g:23:5: term
            	    {
            	    pushFollow(FOLLOW_term_in_expression107);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_parse36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression107 = new BitSet(new long[]{0x000000C110003002L});

}