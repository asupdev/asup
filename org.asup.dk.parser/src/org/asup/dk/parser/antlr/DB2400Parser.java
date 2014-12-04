// $ANTLR 3.4 C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g 2014-02-04 14:49:15
 package org.asup.dk.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DB2400Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "C", "CHAR_SPECIAL", "COMMA", "D", "DIGIT", "DIGIT_SPECIAL", "DIV", "DOT", "E", "EQ", "EXP_CLOSE", "EXP_OPEN", "F", "FLOAT", "G", "GE", "GT", "H", "I", "INTEGER", "J", "K", "L", "LE", "LETTER", "LIKE", "LT", "M", "MINUS", "MOD", "MUL", "N", "NE", "NOT", "NUMBER", "O", "OR", "P", "PLUS", "POW", "Q", "R", "S", "STRING", "T", "TOKEN", "U", "V", "VARIABLE", "W", "WHITE_SPACE", "X", "Y", "Z"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DB2400Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DB2400Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DB2400Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g"; }



    // $ANTLR start "parse"
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:9:1: parse : expression ;
    public final void parse() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:10:3: ( expression )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:10:7: expression
            {
            pushFollow(FOLLOW_expression_in_parse38);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:13:1: parameters : expression ( COMMA expression )* ;
    public final void parameters() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:14:3: ( expression ( COMMA expression )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:14:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_parameters61);
            expression();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:14:16: ( COMMA expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:14:17: COMMA expression
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:17:1: term : ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | NUMBER | FLOAT | STRING | DOT | COMMA | VARIABLE );
    public final void term() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:18:3: ( TOKEN | '(' expression ')' | TOKEN '(' parameters ')' | NUMBER | FLOAT | STRING | DOT | COMMA | VARIABLE )
            int alt2=9;
            switch ( input.LA(1) ) {
            case TOKEN:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EXP_OPEN) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||LA2_1==AND||LA2_1==COMMA||LA2_1==DIV||(LA2_1 >= EQ && LA2_1 <= EXP_CLOSE)||(LA2_1 >= GE && LA2_1 <= GT)||LA2_1==LE||(LA2_1 >= LIKE && LA2_1 <= LT)||(LA2_1 >= MINUS && LA2_1 <= MUL)||LA2_1==NE||LA2_1==OR||LA2_1==PLUS) ) {
                    alt2=1;
                }
                else {
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
            case NUMBER:
                {
                alt2=4;
                }
                break;
            case FLOAT:
                {
                alt2=5;
                }
                break;
            case STRING:
                {
                alt2=6;
                }
                break;
            case DOT:
                {
                alt2=7;
                }
                break;
            case COMMA:
                {
                alt2=8;
                }
                break;
            case VARIABLE:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:18:5: TOKEN
                    {
                    match(input,TOKEN,FOLLOW_TOKEN_in_term84); 

                    }
                    break;
                case 2 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:19:5: '(' expression ')'
                    {
                    match(input,EXP_OPEN,FOLLOW_EXP_OPEN_in_term90); 

                    pushFollow(FOLLOW_expression_in_term92);
                    expression();

                    state._fsp--;


                    match(input,EXP_CLOSE,FOLLOW_EXP_CLOSE_in_term94); 

                    }
                    break;
                case 3 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:20:5: TOKEN '(' parameters ')'
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
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:21:5: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_term112); 

                    }
                    break;
                case 5 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:22:5: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_term118); 

                    }
                    break;
                case 6 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:23:5: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_term124); 

                    }
                    break;
                case 7 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:24:5: DOT
                    {
                    match(input,DOT,FOLLOW_DOT_in_term130); 

                    }
                    break;
                case 8 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:25:5: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_term136); 

                    }
                    break;
                case 9 :
                    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:26:5: VARIABLE
                    {
                    match(input,VARIABLE,FOLLOW_VARIABLE_in_term142); 

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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:29:1: negation : ( NOT )* term ;
    public final void negation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:30:3: ( ( NOT )* term )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:30:5: ( NOT )* term
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:30:5: ( NOT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NOT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:30:5: NOT
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_negation155); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_negation158);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:33:1: unary : ( PLUS | MINUS )* negation ;
    public final void unary() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:34:3: ( ( PLUS | MINUS )* negation )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:34:5: ( PLUS | MINUS )* negation
            {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:34:5: ( PLUS | MINUS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:
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


            pushFollow(FOLLOW_negation_in_unary182);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:37:1: mult : unary ( ( MUL | DIV | MOD ) unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:38:3: ( unary ( ( MUL | DIV | MOD ) unary )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:38:5: unary ( ( MUL | DIV | MOD ) unary )*
            {
            pushFollow(FOLLOW_unary_in_mult195);
            unary();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:38:11: ( ( MUL | DIV | MOD ) unary )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DIV||(LA5_0 >= MOD && LA5_0 <= MUL)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:38:12: ( MUL | DIV | MOD ) unary
            	    {
            	    if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_in_mult210);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:41:1: add : mult ( ( PLUS | MINUS ) mult )* ;
    public final void add() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:42:3: ( mult ( ( PLUS | MINUS ) mult )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:42:5: mult ( ( PLUS | MINUS ) mult )*
            {
            pushFollow(FOLLOW_mult_in_add225);
            mult();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:42:10: ( ( PLUS | MINUS ) mult )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:42:11: ( PLUS | MINUS ) mult
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add236);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:45:1: relation : add ( ( EQ | NE | GT | GE | LT | LE | LIKE ) add )* ;
    public final void relation() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:46:3: ( add ( ( EQ | NE | GT | GE | LT | LE | LIKE ) add )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:46:5: add ( ( EQ | NE | GT | GE | LT | LE | LIKE ) add )*
            {
            pushFollow(FOLLOW_add_in_relation251);
            add();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:46:9: ( ( EQ | NE | GT | GE | LT | LE | LIKE ) add )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==EQ||(LA7_0 >= GE && LA7_0 <= GT)||LA7_0==LE||(LA7_0 >= LIKE && LA7_0 <= LT)||LA7_0==NE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:46:10: ( EQ | NE | GT | GE | LT | LE | LIKE ) add
            	    {
            	    if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||(input.LA(1) >= LIKE && input.LA(1) <= LT)||input.LA(1)==NE ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation282);
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
    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:49:1: expression : relation ( ( AND | OR ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:50:3: ( relation ( ( AND | OR ) relation )* )
            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:50:5: relation ( ( AND | OR ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression299);
            relation();

            state._fsp--;


            // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:50:14: ( ( AND | OR ) relation )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\EclipseWorkspaces\\JavaAsupProject_0_3\\org.asup.dk.parser\\src\\org\\asup\\dk\\parser\\antlr\\DB2400.g:50:15: ( AND | OR ) relation
            	    {
            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relation_in_expression310);
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


 

    public static final BitSet FOLLOW_expression_in_parse38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameters61 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_parameters64 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_expression_in_parameters66 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TOKEN_in_term84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term90 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_expression_in_term92 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_term100 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EXP_OPEN_in_term102 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_parameters_in_term104 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EXP_CLOSE_in_term106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_term118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_term130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_term136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_term142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negation155 = new BitSet(new long[]{0x0094030000144200L});
    public static final BitSet FOLLOW_term_in_negation158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negation_in_unary182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult195 = new BitSet(new long[]{0x0000003000002002L});
    public static final BitSet FOLLOW_set_in_mult198 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_unary_in_mult210 = new BitSet(new long[]{0x0000003000002002L});
    public static final BitSet FOLLOW_mult_in_add225 = new BitSet(new long[]{0x0000200800000002L});
    public static final BitSet FOLLOW_set_in_add228 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_mult_in_add236 = new BitSet(new long[]{0x0000200800000002L});
    public static final BitSet FOLLOW_add_in_relation251 = new BitSet(new long[]{0x0000008340C10002L});
    public static final BitSet FOLLOW_set_in_relation254 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_add_in_relation282 = new BitSet(new long[]{0x0000008340C10002L});
    public static final BitSet FOLLOW_relation_in_expression299 = new BitSet(new long[]{0x0000080000000022L});
    public static final BitSet FOLLOW_set_in_expression302 = new BitSet(new long[]{0x0094230800144200L});
    public static final BitSet FOLLOW_relation_in_expression310 = new BitSet(new long[]{0x0000080000000022L});

}