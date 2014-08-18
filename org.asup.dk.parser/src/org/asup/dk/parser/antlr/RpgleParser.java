// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g 2014-02-04 14:49:14
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RpgleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "C", "CHAR_SPECIAL", "COMMA", "D", "DIGIT", "DIGIT_SPECIAL", "DIM_CLOSE", "DIM_OPEN", "DIV", "E", "EQ", "EXP_CLOSE", "EXP_OPEN", "F", "FILLER", "FLOAT", "G", "GE", "GT", "H", "I", "INDICATOR", "INTEGER", "J", "K", "L", "LE", "LETTER", "LT", "M", "MINUS", "MOD", "MULT", "N", "NE", "NOT", "NUMBER", "O", "OR", "P", "PLUS", "POW", "Q", "R", "S", "SPECIAL", "STRING", "T", "TOKEN", "U", "V", "W", "WHITE_SPACE", "X", "Y", "Z"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RpgleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RpgleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RpgleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g"; }



    // $ANTLR start "parse"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:9:1: parse : expression ;
    public final void parse() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:10:3: ( expression )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:10:7: expression
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



    // $ANTLR start "parameters"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:13:1: parameters : expression ( COMMA expression )* ;
    public final void parameters() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:14:3: ( expression ( COMMA expression )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:14:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_parameters58);
            expression();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:14:16: ( COMMA expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:14:17: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameters61); 

            	    pushFollow(FOLLOW_expression_in_parameters63);
            	    expression();

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
    // $ANTLR end "parameters"



    // $ANTLR start "term"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:17:1: term : ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | TOKEN '[' parameters ']' | SPECIAL | FILLER | NUMBER | STRING | INDICATOR | INDICATOR '(' parameters ')' );
    public final void term() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:18:3: ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | TOKEN '[' parameters ']' | SPECIAL | FILLER | NUMBER | STRING | INDICATOR | INDICATOR '(' parameters ')' )
            int alt2=10;
            switch ( input.LA(1) ) {
            case TOKEN:
                {
                switch ( input.LA(2) ) {
                case EXP_OPEN:
                    {
                    alt2=3;
                    }
                    break;
                case DIM_OPEN:
                    {
                    alt2=4;
                    }
                    break;
                case EOF:
                case AND:
                case COMMA:
                case DIM_CLOSE:
                case DIV:
                case EQ:
                case EXP_CLOSE:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MULT:
                case NE:
                case OR:
                case PLUS:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case EXP_OPEN:
                {
                alt2=2;
                }
                break;
            case SPECIAL:
                {
                alt2=5;
                }
                break;
            case FILLER:
                {
                alt2=6;
                }
                break;
            case NUMBER:
                {
                alt2=7;
                }
                break;
            case STRING:
                {
                alt2=8;
                }
                break;
            case INDICATOR:
                {
                int LA2_7 = input.LA(2);

                if ( (LA2_7==EXP_OPEN) ) {
                    alt2=10;
                }
                else if ( (LA2_7==EOF||LA2_7==AND||LA2_7==COMMA||LA2_7==DIM_CLOSE||LA2_7==DIV||(LA2_7 >= EQ && LA2_7 <= EXP_CLOSE)||(LA2_7 >= GE && LA2_7 <= GT)||LA2_7==LE||LA2_7==LT||(LA2_7 >= MINUS && LA2_7 <= MULT)||LA2_7==NE||LA2_7==OR||LA2_7==PLUS) ) {
                    alt2=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:18:5: TOKEN
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term81); 

                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:19:5: '(' expression ')'
                    {
                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term87); 

                    pushFollow(FOLLOW_expression_in_term89);
                    expression();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term91); 

                    }
                    break;
                case 3 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:20:5: TOKEN '(' parameters ')'
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term97); 

                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term99); 

                    pushFollow(FOLLOW_parameters_in_term101);
                    parameters();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term103); 

                    }
                    break;
                case 4 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:21:5: TOKEN '[' parameters ']'
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term109); 

                    match(input,DIM_OPEN,FOLLOW_DIM_OPEN_in_term111); 

                    pushFollow(FOLLOW_parameters_in_term113);
                    parameters();

                    state._fsp--;


                    match(input,DIM_CLOSE,FOLLOW_DIM_CLOSE_in_term115); 

                    }
                    break;
                case 5 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:22:5: SPECIAL
                    {
                    match(input,SPECIAL,FOLLOW_SPECIAL_in_term121); 

                    }
                    break;
                case 6 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:23:5: FILLER
                    {
                    match(input,FILLER,FOLLOW_FILLER_in_term127); 

                    }
                    break;
                case 7 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:24:5: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_term133); 

                    }
                    break;
                case 8 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:25:5: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_term139); 

                    }
                    break;
                case 9 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:26:5: INDICATOR
                    {
                    match(input,INDICATOR,FOLLOW_INDICATOR_in_term145); 

                    }
                    break;
                case 10 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:27:5: INDICATOR '(' parameters ')'
                    {
                    match(input,INDICATOR,FOLLOW_INDICATOR_in_term151); 

                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term153); 

                    pushFollow(FOLLOW_parameters_in_term155);
                    parameters();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term157); 

                    }
                    break;

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



    // $ANTLR start "negation"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:30:1: negation : ( NOT )* term ;
    public final void negation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:31:3: ( ( NOT )* term )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:31:5: ( NOT )* term
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:31:5: ( NOT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NOT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:31:5: NOT
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_negation170); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_negation173);
            term();

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
    // $ANTLR end "negation"



    // $ANTLR start "unary"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:34:1: unary : ( PLUS | MINUS )* negation ;
    public final void unary() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:35:3: ( ( PLUS | MINUS )* negation )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:35:5: ( PLUS | MINUS )* negation
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:35:5: ( PLUS | MINUS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_negation_in_unary197);
            negation();

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
    // $ANTLR end "unary"



    // $ANTLR start "mult"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:38:1: mult : unary ( ( MULT | DIV | MOD ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:39:3: ( unary ( ( MULT | DIV | MOD ) unary )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:39:5: unary ( ( MULT | DIV | MOD ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult210);
            unary();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:39:11: ( ( MULT | DIV | MOD ) unary )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DIV||(LA5_0 >= MOD && LA5_0 <= MULT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:39:12: ( MULT | DIV | MOD ) unary
            	    {
            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult225);
            	    unary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "mult"



    // $ANTLR start "add"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:42:1: add : mult ( ( PLUS | MINUS ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:43:3: ( mult ( ( PLUS | MINUS ) mult )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:43:5: mult ( ( PLUS | MINUS ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add240);
            mult();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:43:10: ( ( PLUS | MINUS ) mult )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:43:11: ( PLUS | MINUS ) mult
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add251);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "add"



    // $ANTLR start "relation"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:46:1: relation : add ( ( EQ | NE | GT | GE | LT | LE ) add )* ;
    public final void relation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:47:3: ( add ( ( EQ | NE | GT | GE | LT | LE ) add )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:47:5: add ( ( EQ | NE | GT | GE | LT | LE ) add )*
            {
            pushFollow(FOLLOW_add_in_relation266);
            add();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:47:9: ( ( EQ | NE | GT | GE | LT | LE ) add )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EQ||(LA7_0 >= GE && LA7_0 <= GT)||LA7_0==LE||LA7_0==LT||LA7_0==NE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:47:10: ( EQ | NE | GT | GE | LT | LE ) add
            	    {
            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation293);
            	    add();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "relation"



    // $ANTLR start "expression"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:50:1: expression : relation ( ( AND | OR ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:51:3: ( relation ( ( AND | OR ) relation )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:51:5: relation ( ( AND | OR ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression310);
            relation();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:51:14: ( ( AND | OR ) relation )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Rpgle.g:51:15: ( AND | OR ) relation
            	    {
            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relation_in_expression321);
            	    relation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    public static final BitSet FOLLOW_expression_in_parameters58 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_parameters61 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_expression_in_parameters63 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TOKEN_in_term81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term87 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_expression_in_term89 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_term97 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term99 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_term109 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DIM_OPEN_in_term111 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term113 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DIM_CLOSE_in_term115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPECIAL_in_term121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILLER_in_term127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDICATOR_in_term145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDICATOR_in_term151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term153 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term155 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negation170 = new BitSet(new long[]{0x00B00C0010280000L});
    public static final BitSet FOLLOW_term_in_negation173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negation_in_unary197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult210 = new BitSet(new long[]{0x000000C000008002L});
    public static final BitSet FOLLOW_set_in_mult213 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_unary_in_mult225 = new BitSet(new long[]{0x000000C000008002L});
    public static final BitSet FOLLOW_mult_in_add240 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_set_in_add243 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_mult_in_add251 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_add_in_relation266 = new BitSet(new long[]{0x0000020A03020002L});
    public static final BitSet FOLLOW_set_in_relation269 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_add_in_relation293 = new BitSet(new long[]{0x0000020A03020002L});
    public static final BitSet FOLLOW_relation_in_expression310 = new BitSet(new long[]{0x0000200000000022L});
    public static final BitSet FOLLOW_set_in_expression313 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_relation_in_expression321 = new BitSet(new long[]{0x0000200000000022L});

}