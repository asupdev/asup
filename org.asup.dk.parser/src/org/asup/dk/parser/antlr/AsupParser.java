// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g 2014-02-04 14:49:16
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AsupParser extends Parser {
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


    public AsupParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AsupParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return AsupParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g"; }



    // $ANTLR start "parse"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:10:1: parse : expression ;
    public final void parse() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:11:3: ( expression )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:11:7: expression
            {
            pushFollow(FOLLOW_expression_in_parse39);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:14:1: parameters : expression ( COMMA expression )* ;
    public final void parameters() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:15:3: ( expression ( COMMA expression )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:15:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_parameters61);
            expression();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:15:16: ( COMMA expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:15:17: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_parameters64); 

            	    pushFollow(FOLLOW_expression_in_parameters66);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:18:1: term : ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | TOKEN '[' parameters ']' | FILLER | NUMBER | STRING | INDICATOR | INDICATOR '(' parameters ')' | SPECIAL );
    public final void term() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:19:3: ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | TOKEN '[' parameters ']' | FILLER | NUMBER | STRING | INDICATOR | INDICATOR '(' parameters ')' | SPECIAL )
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
            case FILLER:
                {
                alt2=5;
                }
                break;
            case NUMBER:
                {
                alt2=6;
                }
                break;
            case STRING:
                {
                alt2=7;
                }
                break;
            case INDICATOR:
                {
                int LA2_6 = input.LA(2);

                if ( (LA2_6==EXP_OPEN) ) {
                    alt2=9;
                }
                else if ( (LA2_6==EOF||LA2_6==AND||LA2_6==COMMA||LA2_6==DIM_CLOSE||LA2_6==DIV||(LA2_6 >= EQ && LA2_6 <= EXP_CLOSE)||(LA2_6 >= GE && LA2_6 <= GT)||LA2_6==LE||LA2_6==LT||(LA2_6 >= MINUS && LA2_6 <= MULT)||LA2_6==NE||LA2_6==OR||LA2_6==PLUS) ) {
                    alt2=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }
                }
                break;
            case SPECIAL:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:19:5: TOKEN
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term84); 

                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:20:5: '(' expression ')'
                    {
                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term90); 

                    pushFollow(FOLLOW_expression_in_term92);
                    expression();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term94); 

                    }
                    break;
                case 3 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:21:5: TOKEN '(' parameters ')'
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term100); 

                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term102); 

                    pushFollow(FOLLOW_parameters_in_term104);
                    parameters();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term106); 

                    }
                    break;
                case 4 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:22:5: TOKEN '[' parameters ']'
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term112); 

                    match(input,DIM_OPEN,FOLLOW_DIM_OPEN_in_term114); 

                    pushFollow(FOLLOW_parameters_in_term116);
                    parameters();

                    state._fsp--;


                    match(input,DIM_CLOSE,FOLLOW_DIM_CLOSE_in_term118); 

                    }
                    break;
                case 5 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:23:5: FILLER
                    {
                    match(input,FILLER,FOLLOW_FILLER_in_term124); 

                    }
                    break;
                case 6 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:24:5: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_term130); 

                    }
                    break;
                case 7 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:25:5: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_term136); 

                    }
                    break;
                case 8 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:26:5: INDICATOR
                    {
                    match(input,INDICATOR,FOLLOW_INDICATOR_in_term142); 

                    }
                    break;
                case 9 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:27:5: INDICATOR '(' parameters ')'
                    {
                    match(input,INDICATOR,FOLLOW_INDICATOR_in_term148); 

                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term150); 

                    pushFollow(FOLLOW_parameters_in_term152);
                    parameters();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term154); 

                    }
                    break;
                case 10 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:28:6: SPECIAL
                    {
                    match(input,SPECIAL,FOLLOW_SPECIAL_in_term161); 

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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:31:1: negation : ( NOT )* term ;
    public final void negation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:32:3: ( ( NOT )* term )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:32:5: ( NOT )* term
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:32:5: ( NOT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NOT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:32:5: NOT
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_negation174); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_negation177);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:35:1: unary : ( PLUS | MINUS )* negation ;
    public final void unary() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:36:3: ( ( PLUS | MINUS )* negation )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:36:5: ( PLUS | MINUS )* negation
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:36:5: ( PLUS | MINUS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:
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


            pushFollow(FOLLOW_negation_in_unary201);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:39:1: mult : unary ( ( MULT | DIV | MOD ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:40:3: ( unary ( ( MULT | DIV | MOD ) unary )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:40:5: unary ( ( MULT | DIV | MOD ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult214);
            unary();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:40:11: ( ( MULT | DIV | MOD ) unary )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DIV||(LA5_0 >= MOD && LA5_0 <= MULT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:40:12: ( MULT | DIV | MOD ) unary
            	    {
            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult229);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:43:1: add : mult ( ( PLUS | MINUS ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:44:3: ( mult ( ( PLUS | MINUS ) mult )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:44:5: mult ( ( PLUS | MINUS ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add244);
            mult();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:44:10: ( ( PLUS | MINUS ) mult )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:44:11: ( PLUS | MINUS ) mult
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add255);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:47:1: relation : add ( ( EQ | NE | GT | GE | LT | LE ) add )* ;
    public final void relation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:48:3: ( add ( ( EQ | NE | GT | GE | LT | LE ) add )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:48:5: add ( ( EQ | NE | GT | GE | LT | LE ) add )*
            {
            pushFollow(FOLLOW_add_in_relation270);
            add();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:48:9: ( ( EQ | NE | GT | GE | LT | LE ) add )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EQ||(LA7_0 >= GE && LA7_0 <= GT)||LA7_0==LE||LA7_0==LT||LA7_0==NE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:48:10: ( EQ | NE | GT | GE | LT | LE ) add
            	    {
            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation297);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:51:1: expression : relation ( ( AND | OR ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:52:3: ( relation ( ( AND | OR ) relation )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:52:5: relation ( ( AND | OR ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression314);
            relation();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:52:14: ( ( AND | OR ) relation )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\Asup.g:52:15: ( AND | OR ) relation
            	    {
            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relation_in_expression325);
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


 

    public static final BitSet FOLLOW_expression_in_parse39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameters61 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_parameters64 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_expression_in_parameters66 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TOKEN_in_term84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term90 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_expression_in_term92 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_term100 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term102 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term104 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_term112 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DIM_OPEN_in_term114 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term116 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DIM_CLOSE_in_term118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILLER_in_term124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDICATOR_in_term142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDICATOR_in_term148 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term150 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_parameters_in_term152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPECIAL_in_term161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negation174 = new BitSet(new long[]{0x00B00C0010280000L});
    public static final BitSet FOLLOW_term_in_negation177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negation_in_unary201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult214 = new BitSet(new long[]{0x000000C000008002L});
    public static final BitSet FOLLOW_set_in_mult217 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_unary_in_mult229 = new BitSet(new long[]{0x000000C000008002L});
    public static final BitSet FOLLOW_mult_in_add244 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_set_in_add247 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_mult_in_add255 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_add_in_relation270 = new BitSet(new long[]{0x0000020A03020002L});
    public static final BitSet FOLLOW_set_in_relation273 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_add_in_relation297 = new BitSet(new long[]{0x0000020A03020002L});
    public static final BitSet FOLLOW_relation_in_expression314 = new BitSet(new long[]{0x0000200000000022L});
    public static final BitSet FOLLOW_set_in_expression317 = new BitSet(new long[]{0x00B08C2010280000L});
    public static final BitSet FOLLOW_relation_in_expression325 = new BitSet(new long[]{0x0000200000000022L});

}