// $ANTLR 3.5.1 RPGExpr.g 2014-10-16 12:00:13

  package org.asup.il.expr.base.antlr.rpg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RPGExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "ARRAY_INDICATOR", 
		"B", "BI_FUN", "BI_FUNCTION", "BLOCK", "BOOLEAN", "C", "CHAR_SPECIAL", 
		"D", "DATETIME", "DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", 
		"F", "FILLER", "FLOAT", "G", "GT", "GTEQ", "H", "HEX", "HexDigit", "I", 
		"INDICATOR", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", 
		"MOD", "MULT", "N", "NE", "NEGATE", "NOT", "O", "OR", "P", "PLUS", "POINT", 
		"POW", "Q", "QUALIFIED", "R", "S", "SPECIAL", "SP_VALUE", "STRING", "T", 
		"TERM", "U", "USER_FUNCTION", "UnicodeEscape", "V", "W", "WS", "X", "Y", 
		"Z", "'('", "')'", "':'"
	};
	public static final int EOF=-1;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int A=4;
	public static final int AND=5;
	public static final int ARRAY_INDICATOR=6;
	public static final int B=7;
	public static final int BI_FUN=8;
	public static final int BI_FUNCTION=9;
	public static final int BLOCK=10;
	public static final int BOOLEAN=11;
	public static final int C=12;
	public static final int CHAR_SPECIAL=13;
	public static final int D=14;
	public static final int DATETIME=15;
	public static final int DIGIT=16;
	public static final int DIGIT_SPECIAL=17;
	public static final int DIV=18;
	public static final int E=19;
	public static final int EQ=20;
	public static final int EscapeSequence=21;
	public static final int F=22;
	public static final int FILLER=23;
	public static final int FLOAT=24;
	public static final int G=25;
	public static final int GT=26;
	public static final int GTEQ=27;
	public static final int H=28;
	public static final int HEX=29;
	public static final int HexDigit=30;
	public static final int I=31;
	public static final int INDICATOR=32;
	public static final int INTEGER=33;
	public static final int J=34;
	public static final int K=35;
	public static final int L=36;
	public static final int LETTER=37;
	public static final int LT=38;
	public static final int LTEQ=39;
	public static final int M=40;
	public static final int MINUS=41;
	public static final int MOD=42;
	public static final int MULT=43;
	public static final int N=44;
	public static final int NE=45;
	public static final int NEGATE=46;
	public static final int NOT=47;
	public static final int O=48;
	public static final int OR=49;
	public static final int P=50;
	public static final int PLUS=51;
	public static final int POINT=52;
	public static final int POW=53;
	public static final int Q=54;
	public static final int QUALIFIED=55;
	public static final int R=56;
	public static final int S=57;
	public static final int SPECIAL=58;
	public static final int SP_VALUE=59;
	public static final int STRING=60;
	public static final int T=61;
	public static final int TERM=62;
	public static final int U=63;
	public static final int USER_FUNCTION=64;
	public static final int UnicodeEscape=65;
	public static final int V=66;
	public static final int W=67;
	public static final int WS=68;
	public static final int X=69;
	public static final int Y=70;
	public static final int Z=71;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RPGExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RPGExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RPGExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "RPGExpr.g"; }


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// RPGExpr.g:45:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// RPGExpr.g:46:2: ( logicalExpression EOF !)
			// RPGExpr.g:46:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression117);
			logicalExpression1=logicalExpression();
			state._fsp--;

			adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression119); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalExpression"
	// RPGExpr.g:49:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// RPGExpr.g:50:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// RPGExpr.g:50:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression131);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;

			adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// RPGExpr.g:50:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// RPGExpr.g:50:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression134); 
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression137);
					booleanAndExpression5=booleanAndExpression();
					state._fsp--;

					adaptor.addChild(root_0, booleanAndExpression5.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalExpression"


	public static class booleanAndExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "booleanAndExpression"
	// RPGExpr.g:53:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// RPGExpr.g:54:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// RPGExpr.g:54:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression151);
			equalityExpression6=equalityExpression();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpression6.getTree());

			// RPGExpr.g:54:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// RPGExpr.g:54:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression154); 
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression157);
					equalityExpression8=equalityExpression();
					state._fsp--;

					adaptor.addChild(root_0, equalityExpression8.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanAndExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// RPGExpr.g:58:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// RPGExpr.g:59:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// RPGExpr.g:59:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression171);
			relationalExpression9=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpression9.getTree());

			// RPGExpr.g:59:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// RPGExpr.g:59:26: ( EQ | NE ) ^ relationalExpression
					{
					set10=input.LT(1);
					set10=input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set10), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression181);
					relationalExpression11=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, relationalExpression11.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// RPGExpr.g:62:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// RPGExpr.g:63:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// RPGExpr.g:63:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression194);
			additiveExpression12=additiveExpression();
			state._fsp--;

			adaptor.addChild(root_0, additiveExpression12.getTree());

			// RPGExpr.g:63:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// RPGExpr.g:63:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
					{
					set13=input.LT(1);
					set13=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set13), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression209);
					additiveExpression14=additiveExpression();
					state._fsp--;

					adaptor.addChild(root_0, additiveExpression14.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// RPGExpr.g:67:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// RPGExpr.g:68:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// RPGExpr.g:68:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression224);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;

			adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// RPGExpr.g:68:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// RPGExpr.g:68:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression235);
					multiplicativeExpression17=multiplicativeExpression();
					state._fsp--;

					adaptor.addChild(root_0, multiplicativeExpression17.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// RPGExpr.g:71:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// RPGExpr.g:72:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// RPGExpr.g:73:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression251);
			powerExpression18=powerExpression();
			state._fsp--;

			adaptor.addChild(root_0, powerExpression18.getTree());

			// RPGExpr.g:73:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// RPGExpr.g:73:21: ( MULT | DIV | MOD ) ^ powerExpression
					{
					set19=input.LT(1);
					set19=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression264);
					powerExpression20=powerExpression();
					state._fsp--;

					adaptor.addChild(root_0, powerExpression20.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class powerExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "powerExpression"
	// RPGExpr.g:76:1: powerExpression : unaryExpression ( POW ^ unaryExpression )? ;
	public final RPGExprParser.powerExpression_return powerExpression() throws RecognitionException {
		RPGExprParser.powerExpression_return retval = new RPGExprParser.powerExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POW22=null;
		ParserRuleReturnScope unaryExpression21 =null;
		ParserRuleReturnScope unaryExpression23 =null;

		CommonTree POW22_tree=null;

		try {
			// RPGExpr.g:77:2: ( unaryExpression ( POW ^ unaryExpression )? )
			// RPGExpr.g:77:4: unaryExpression ( POW ^ unaryExpression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_powerExpression278);
			unaryExpression21=unaryExpression();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpression21.getTree());

			// RPGExpr.g:77:20: ( POW ^ unaryExpression )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==POW) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// RPGExpr.g:77:22: POW ^ unaryExpression
					{
					POW22=(Token)match(input,POW,FOLLOW_POW_in_powerExpression282); 
					POW22_tree = (CommonTree)adaptor.create(POW22);
					root_0 = (CommonTree)adaptor.becomeRoot(POW22_tree, root_0);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression285);
					unaryExpression23=unaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpression23.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powerExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// RPGExpr.g:80:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( NEGATE qualified ) );
	public final RPGExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		RPGExprParser.unaryExpression_return retval = new RPGExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT25=null;
		Token MINUS27=null;
		ParserRuleReturnScope qualified24 =null;
		ParserRuleReturnScope qualified26 =null;
		ParserRuleReturnScope qualified28 =null;

		CommonTree NOT25_tree=null;
		CommonTree MINUS27_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_qualified=new RewriteRuleSubtreeStream(adaptor,"rule qualified");

		try {
			// RPGExpr.g:81:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( NEGATE qualified ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case ARRAY_INDICATOR:
			case BI_FUN:
			case BOOLEAN:
			case DATETIME:
			case FILLER:
			case FLOAT:
			case HEX:
			case INDICATOR:
			case INTEGER:
			case MULT:
			case SPECIAL:
			case STRING:
			case TERM:
			case 72:
				{
				alt8=1;
				}
				break;
			case NOT:
				{
				alt8=2;
				}
				break;
			case MINUS:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// RPGExpr.g:82:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression302);
					qualified24=qualified();
					state._fsp--;

					adaptor.addChild(root_0, qualified24.getTree());

					}
					break;
				case 2 :
					// RPGExpr.g:83:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT25=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression311); 
					NOT25_tree = (CommonTree)adaptor.create(NOT25);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT25_tree, root_0);

					pushFollow(FOLLOW_qualified_in_unaryExpression314);
					qualified26=qualified();
					state._fsp--;

					adaptor.addChild(root_0, qualified26.getTree());

					}
					break;
				case 3 :
					// RPGExpr.g:84:8: MINUS qualified
					{
					MINUS27=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression323);  
					stream_MINUS.add(MINUS27);

					pushFollow(FOLLOW_qualified_in_unaryExpression325);
					qualified28=qualified();
					state._fsp--;

					stream_qualified.add(qualified28.getTree());
					// AST REWRITE
					// elements: qualified
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 84:24: -> ^( NEGATE qualified )
					{
						// RPGExpr.g:84:27: ^( NEGATE qualified )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_qualified.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class qualified_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualified"
	// RPGExpr.g:87:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
	public final RPGExprParser.qualified_return qualified() throws RecognitionException {
		RPGExprParser.qualified_return retval = new RPGExprParser.qualified_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POINT29=null;
		List<Object> list_vals=null;
		ParserRuleReturnScope v =null;
		RuleReturnScope vals = null;
		CommonTree POINT29_tree=null;
		RewriteRuleTokenStream stream_POINT=new RewriteRuleTokenStream(adaptor,"token POINT");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");

		try {
			// RPGExpr.g:88:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// RPGExpr.g:89:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// RPGExpr.g:89:3: (v= primaryExpression -> primaryExpression )
			// RPGExpr.g:89:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified352);
			v=primaryExpression();
			state._fsp--;

			stream_primaryExpression.add(v.getTree());
			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 89:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;

			}

			// RPGExpr.g:89:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// RPGExpr.g:89:47: ( POINT vals+= primaryExpression )
					{
					// RPGExpr.g:89:47: ( POINT vals+= primaryExpression )
					// RPGExpr.g:89:48: POINT vals+= primaryExpression
					{
					POINT29=(Token)match(input,POINT,FOLLOW_POINT_in_qualified361);  
					stream_POINT.add(POINT29);

					pushFollow(FOLLOW_primaryExpression_in_qualified365);
					vals=primaryExpression();
					state._fsp--;

					stream_primaryExpression.add(vals.getTree());
					if (list_vals==null) list_vals=new ArrayList<Object>();
					list_vals.add(vals.getTree());
					}

					// AST REWRITE
					// elements: vals, v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: vals
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_vals=new RewriteRuleSubtreeStream(adaptor,"token vals",list_vals);
					root_0 = (CommonTree)adaptor.nil();
					// 89:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// RPGExpr.g:89:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUALIFIED, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
						if ( !(stream_vals.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_vals.hasNext() ) {
							adaptor.addChild(root_1, stream_vals.nextTree());
						}
						stream_vals.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qualified"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// RPGExpr.g:92:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value );
	public final RPGExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		RPGExprParser.primaryExpression_return retval = new RPGExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal30=null;
		Token char_literal32=null;
		ParserRuleReturnScope logicalExpression31 =null;
		ParserRuleReturnScope value33 =null;

		CommonTree char_literal30_tree=null;
		CommonTree char_literal32_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// RPGExpr.g:93:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==72) ) {
				alt10=1;
			}
			else if ( (LA10_0==ARRAY_INDICATOR||LA10_0==BI_FUN||LA10_0==BOOLEAN||LA10_0==DATETIME||(LA10_0 >= FILLER && LA10_0 <= FLOAT)||LA10_0==HEX||(LA10_0 >= INDICATOR && LA10_0 <= INTEGER)||LA10_0==MULT||LA10_0==SPECIAL||LA10_0==STRING||LA10_0==TERM) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// RPGExpr.g:93:4: '(' logicalExpression ')'
					{
					char_literal30=(Token)match(input,72,FOLLOW_72_in_primaryExpression393);  
					stream_72.add(char_literal30);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression395);
					logicalExpression31=logicalExpression();
					state._fsp--;

					stream_logicalExpression.add(logicalExpression31.getTree());
					char_literal32=(Token)match(input,73,FOLLOW_73_in_primaryExpression397);  
					stream_73.add(char_literal32);

					// AST REWRITE
					// elements: logicalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 93:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// RPGExpr.g:93:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_1, stream_logicalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// RPGExpr.g:95:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression414);
					value33=value();
					state._fsp--;

					adaptor.addChild(root_0, value33.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// RPGExpr.g:98:1: value : ( INTEGER | FLOAT | DATETIME | BOOLEAN | STRING | HEX | TERM | INDICATOR | ( ARRAY_INDICATOR -> BI_FUNCTION[$ARRAY_INDICATOR.text] ) | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function );
	public final RPGExprParser.value_return value() throws RecognitionException {
		RPGExprParser.value_return retval = new RPGExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER34=null;
		Token FLOAT35=null;
		Token DATETIME36=null;
		Token BOOLEAN37=null;
		Token STRING38=null;
		Token HEX39=null;
		Token TERM40=null;
		Token INDICATOR41=null;
		Token ARRAY_INDICATOR42=null;
		Token SPECIAL43=null;
		ParserRuleReturnScope filler44 =null;
		ParserRuleReturnScope special45 =null;
		ParserRuleReturnScope bi_function46 =null;
		ParserRuleReturnScope usr_function47 =null;

		CommonTree INTEGER34_tree=null;
		CommonTree FLOAT35_tree=null;
		CommonTree DATETIME36_tree=null;
		CommonTree BOOLEAN37_tree=null;
		CommonTree STRING38_tree=null;
		CommonTree HEX39_tree=null;
		CommonTree TERM40_tree=null;
		CommonTree INDICATOR41_tree=null;
		CommonTree ARRAY_INDICATOR42_tree=null;
		CommonTree SPECIAL43_tree=null;
		RewriteRuleTokenStream stream_ARRAY_INDICATOR=new RewriteRuleTokenStream(adaptor,"token ARRAY_INDICATOR");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// RPGExpr.g:99:2: ( INTEGER | FLOAT | DATETIME | BOOLEAN | STRING | HEX | TERM | INDICATOR | ( ARRAY_INDICATOR -> BI_FUNCTION[$ARRAY_INDICATOR.text] ) | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function )
			int alt11=14;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt11=1;
				}
				break;
			case FLOAT:
				{
				alt11=2;
				}
				break;
			case DATETIME:
				{
				alt11=3;
				}
				break;
			case BOOLEAN:
				{
				alt11=4;
				}
				break;
			case STRING:
				{
				alt11=5;
				}
				break;
			case HEX:
				{
				alt11=6;
				}
				break;
			case TERM:
				{
				int LA11_7 = input.LA(2);
				if ( (LA11_7==EOF||LA11_7==AND||LA11_7==DIV||LA11_7==EQ||(LA11_7 >= GT && LA11_7 <= GTEQ)||(LA11_7 >= LT && LA11_7 <= LTEQ)||(LA11_7 >= MINUS && LA11_7 <= MULT)||LA11_7==NE||LA11_7==OR||(LA11_7 >= PLUS && LA11_7 <= POW)||(LA11_7 >= 73 && LA11_7 <= 74)) ) {
					alt11=7;
				}
				else if ( (LA11_7==72) ) {
					alt11=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INDICATOR:
				{
				alt11=8;
				}
				break;
			case ARRAY_INDICATOR:
				{
				alt11=9;
				}
				break;
			case SPECIAL:
				{
				alt11=10;
				}
				break;
			case FILLER:
				{
				alt11=11;
				}
				break;
			case MULT:
				{
				alt11=12;
				}
				break;
			case BI_FUN:
				{
				alt11=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// RPGExpr.g:100:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER34=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value427); 
					INTEGER34_tree = (CommonTree)adaptor.create(INTEGER34);
					adaptor.addChild(root_0, INTEGER34_tree);

					}
					break;
				case 2 :
					// RPGExpr.g:101:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT35=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value432); 
					FLOAT35_tree = (CommonTree)adaptor.create(FLOAT35);
					adaptor.addChild(root_0, FLOAT35_tree);

					}
					break;
				case 3 :
					// RPGExpr.g:102:5: DATETIME
					{
					root_0 = (CommonTree)adaptor.nil();


					DATETIME36=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_value438); 
					DATETIME36_tree = (CommonTree)adaptor.create(DATETIME36);
					adaptor.addChild(root_0, DATETIME36_tree);

					}
					break;
				case 4 :
					// RPGExpr.g:103:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN37=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value443); 
					BOOLEAN37_tree = (CommonTree)adaptor.create(BOOLEAN37);
					adaptor.addChild(root_0, BOOLEAN37_tree);

					}
					break;
				case 5 :
					// RPGExpr.g:104:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING38=(Token)match(input,STRING,FOLLOW_STRING_in_value448); 
					STRING38_tree = (CommonTree)adaptor.create(STRING38);
					adaptor.addChild(root_0, STRING38_tree);

					}
					break;
				case 6 :
					// RPGExpr.g:105:4: HEX
					{
					root_0 = (CommonTree)adaptor.nil();


					HEX39=(Token)match(input,HEX,FOLLOW_HEX_in_value453); 
					HEX39_tree = (CommonTree)adaptor.create(HEX39);
					adaptor.addChild(root_0, HEX39_tree);

					}
					break;
				case 7 :
					// RPGExpr.g:106:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM40=(Token)match(input,TERM,FOLLOW_TERM_in_value458); 
					TERM40_tree = (CommonTree)adaptor.create(TERM40);
					adaptor.addChild(root_0, TERM40_tree);

					}
					break;
				case 8 :
					// RPGExpr.g:107:4: INDICATOR
					{
					root_0 = (CommonTree)adaptor.nil();


					INDICATOR41=(Token)match(input,INDICATOR,FOLLOW_INDICATOR_in_value463); 
					INDICATOR41_tree = (CommonTree)adaptor.create(INDICATOR41);
					adaptor.addChild(root_0, INDICATOR41_tree);

					}
					break;
				case 9 :
					// RPGExpr.g:108:4: ( ARRAY_INDICATOR -> BI_FUNCTION[$ARRAY_INDICATOR.text] )
					{
					// RPGExpr.g:108:4: ( ARRAY_INDICATOR -> BI_FUNCTION[$ARRAY_INDICATOR.text] )
					// RPGExpr.g:108:5: ARRAY_INDICATOR
					{
					ARRAY_INDICATOR42=(Token)match(input,ARRAY_INDICATOR,FOLLOW_ARRAY_INDICATOR_in_value469);  
					stream_ARRAY_INDICATOR.add(ARRAY_INDICATOR42);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 108:21: -> BI_FUNCTION[$ARRAY_INDICATOR.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(BI_FUNCTION, (ARRAY_INDICATOR42!=null?ARRAY_INDICATOR42.getText():null)));
					}


					retval.tree = root_0;

					}

					}
					break;
				case 10 :
					// RPGExpr.g:109:4: ( SPECIAL -> TERM )
					{
					// RPGExpr.g:109:4: ( SPECIAL -> TERM )
					// RPGExpr.g:109:5: SPECIAL
					{
					SPECIAL43=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value481);  
					stream_SPECIAL.add(SPECIAL43);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:13: -> TERM
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, "TERM"));
					}


					retval.tree = root_0;

					}

					}
					break;
				case 11 :
					// RPGExpr.g:110:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value491);
					filler44=filler();
					state._fsp--;

					adaptor.addChild(root_0, filler44.getTree());

					}
					break;
				case 12 :
					// RPGExpr.g:111:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value496);
					special45=special();
					state._fsp--;

					adaptor.addChild(root_0, special45.getTree());

					}
					break;
				case 13 :
					// RPGExpr.g:112:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value501);
					bi_function46=bi_function();
					state._fsp--;

					adaptor.addChild(root_0, bi_function46.getTree());

					}
					break;
				case 14 :
					// RPGExpr.g:113:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value506);
					usr_function47=usr_function();
					state._fsp--;

					adaptor.addChild(root_0, usr_function47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class filler_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filler"
	// RPGExpr.g:116:1: filler : FILLER STRING -> ^( SP_VALUE[$FILLER.text] TERM[$STRING.text] ) ;
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FILLER48=null;
		Token STRING49=null;

		CommonTree FILLER48_tree=null;
		CommonTree STRING49_tree=null;
		RewriteRuleTokenStream stream_FILLER=new RewriteRuleTokenStream(adaptor,"token FILLER");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// RPGExpr.g:116:8: ( FILLER STRING -> ^( SP_VALUE[$FILLER.text] TERM[$STRING.text] ) )
			// RPGExpr.g:117:3: FILLER STRING
			{
			FILLER48=(Token)match(input,FILLER,FOLLOW_FILLER_in_filler518);  
			stream_FILLER.add(FILLER48);

			STRING49=(Token)match(input,STRING,FOLLOW_STRING_in_filler520);  
			stream_STRING.add(STRING49);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 117:17: -> ^( SP_VALUE[$FILLER.text] TERM[$STRING.text] )
			{
				// RPGExpr.g:117:20: ^( SP_VALUE[$FILLER.text] TERM[$STRING.text] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SP_VALUE, (FILLER48!=null?FILLER48.getText():null)), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TERM, (STRING49!=null?STRING49.getText():null)));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filler"


	public static class special_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "special"
	// RPGExpr.g:120:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT50=null;
		Token SPECIAL51=null;

		CommonTree MULT50_tree=null;
		CommonTree SPECIAL51_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// RPGExpr.g:120:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// RPGExpr.g:121:3: MULT SPECIAL
			{
			MULT50=(Token)match(input,MULT,FOLLOW_MULT_in_special542);  
			stream_MULT.add(MULT50);

			SPECIAL51=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special544);  
			stream_SPECIAL.add(SPECIAL51);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 121:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT50!=null?MULT50.getText():null) + (SPECIAL51!=null?SPECIAL51.getText():null)));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "special"


	public static class bi_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bi_function"
	// RPGExpr.g:124:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN52=null;
		Token BI_FUN54=null;
		Token char_literal55=null;
		Token char_literal56=null;
		ParserRuleReturnScope params53 =null;

		CommonTree BI_FUN52_tree=null;
		CommonTree BI_FUN54_tree=null;
		CommonTree char_literal55_tree=null;
		CommonTree char_literal56_tree=null;
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// RPGExpr.g:125:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BI_FUN) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==72) ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2==73) ) {
						alt13=2;
					}
					else if ( (LA13_2==ARRAY_INDICATOR||LA13_2==BI_FUN||LA13_2==BOOLEAN||LA13_2==DATETIME||(LA13_2 >= FILLER && LA13_2 <= FLOAT)||LA13_2==HEX||(LA13_2 >= INDICATOR && LA13_2 <= INTEGER)||LA13_2==MINUS||LA13_2==MULT||LA13_2==NOT||LA13_2==SPECIAL||LA13_2==STRING||LA13_2==TERM||LA13_2==72) ) {
						alt13=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA13_1==EOF||LA13_1==AND||LA13_1==DIV||LA13_1==EQ||(LA13_1 >= GT && LA13_1 <= GTEQ)||(LA13_1 >= LT && LA13_1 <= LTEQ)||(LA13_1 >= MINUS && LA13_1 <= MULT)||LA13_1==NE||LA13_1==OR||(LA13_1 >= PLUS && LA13_1 <= POW)||(LA13_1 >= 73 && LA13_1 <= 74)) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// RPGExpr.g:126:3: BI_FUN ( params )?
					{
					BI_FUN52=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function564);  
					stream_BI_FUN.add(BI_FUN52);

					// RPGExpr.g:126:10: ( params )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==72) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// RPGExpr.g:126:11: params
							{
							pushFollow(FOLLOW_params_in_bi_function567);
							params53=params();
							state._fsp--;

							stream_params.add(params53.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 126:20: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// RPGExpr.g:126:23: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN52!=null?BI_FUN52.getText():null)), root_1);
						// RPGExpr.g:126:51: ( params )?
						if ( stream_params.hasNext() ) {
							adaptor.addChild(root_1, stream_params.nextTree());
						}
						stream_params.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// RPGExpr.g:128:3: BI_FUN '(' ')'
					{
					BI_FUN54=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function589);  
					stream_BI_FUN.add(BI_FUN54);

					char_literal55=(Token)match(input,72,FOLLOW_72_in_bi_function591);  
					stream_72.add(char_literal55);

					char_literal56=(Token)match(input,73,FOLLOW_73_in_bi_function593);  
					stream_73.add(char_literal56);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 128:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// RPGExpr.g:128:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN54!=null?BI_FUN54.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bi_function"


	public static class usr_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "usr_function"
	// RPGExpr.g:131:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM57=null;
		Token TERM59=null;
		ParserRuleReturnScope params58 =null;
		ParserRuleReturnScope empty60 =null;

		CommonTree TERM57_tree=null;
		CommonTree TERM59_tree=null;
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// RPGExpr.g:132:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TERM) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==72) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==73) ) {
						alt14=2;
					}
					else if ( (LA14_2==ARRAY_INDICATOR||LA14_2==BI_FUN||LA14_2==BOOLEAN||LA14_2==DATETIME||(LA14_2 >= FILLER && LA14_2 <= FLOAT)||LA14_2==HEX||(LA14_2 >= INDICATOR && LA14_2 <= INTEGER)||LA14_2==MINUS||LA14_2==MULT||LA14_2==NOT||LA14_2==SPECIAL||LA14_2==STRING||LA14_2==TERM||LA14_2==72) ) {
						alt14=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
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
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// RPGExpr.g:132:4: TERM params
					{
					TERM57=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function613);  
					stream_TERM.add(TERM57);

					pushFollow(FOLLOW_params_in_usr_function615);
					params58=params();
					state._fsp--;

					stream_params.add(params58.getTree());
					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// RPGExpr.g:132:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM57!=null?TERM57.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// RPGExpr.g:134:3: TERM empty
					{
					TERM59=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function633);  
					stream_TERM.add(TERM59);

					pushFollow(FOLLOW_empty_in_usr_function635);
					empty60=empty();
					state._fsp--;

					stream_empty.add(empty60.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 134:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// RPGExpr.g:134:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM59!=null?TERM59.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "usr_function"


	public static class params_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "params"
	// RPGExpr.g:137:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal61=null;
		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope logicalExpression62 =null;
		ParserRuleReturnScope logicalExpression64 =null;

		CommonTree char_literal61_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal65_tree=null;

		try {
			// RPGExpr.g:138:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// RPGExpr.g:138:4: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal61=(Token)match(input,72,FOLLOW_72_in_params653); 
			pushFollow(FOLLOW_logicalExpression_in_params656);
			logicalExpression62=logicalExpression();
			state._fsp--;

			adaptor.addChild(root_0, logicalExpression62.getTree());

			// RPGExpr.g:138:27: ( ':' ! logicalExpression )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==74) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// RPGExpr.g:138:28: ':' ! logicalExpression
					{
					char_literal63=(Token)match(input,74,FOLLOW_74_in_params659); 
					pushFollow(FOLLOW_logicalExpression_in_params662);
					logicalExpression64=logicalExpression();
					state._fsp--;

					adaptor.addChild(root_0, logicalExpression64.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			char_literal65=(Token)match(input,73,FOLLOW_73_in_params666); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "params"


	public static class empty_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "empty"
	// RPGExpr.g:141:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal66=null;
		Token char_literal67=null;

		CommonTree char_literal66_tree=null;
		CommonTree char_literal67_tree=null;

		try {
			// RPGExpr.g:142:2: ( '(' ')' )
			// RPGExpr.g:143:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal66=(Token)match(input,72,FOLLOW_72_in_empty679); 
			char_literal66_tree = (CommonTree)adaptor.create(char_literal66);
			adaptor.addChild(root_0, char_literal66_tree);

			char_literal67=(Token)match(input,73,FOLLOW_73_in_empty681); 
			char_literal67_tree = (CommonTree)adaptor.create(char_literal67);
			adaptor.addChild(root_0, char_literal67_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "empty"

	// Delegated rules



	public static final BitSet FOLLOW_logicalExpression_in_expression117 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression131 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression134 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression137 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression151 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression154 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression157 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression171 = new BitSet(new long[]{0x0000200000100002L});
	public static final BitSet FOLLOW_set_in_equalityExpression174 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression181 = new BitSet(new long[]{0x0000200000100002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression194 = new BitSet(new long[]{0x000000C00C000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression198 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression209 = new BitSet(new long[]{0x000000C00C000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression224 = new BitSet(new long[]{0x0008020000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression228 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression235 = new BitSet(new long[]{0x0008020000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression251 = new BitSet(new long[]{0x00000C0000040002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression255 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression264 = new BitSet(new long[]{0x00000C0000040002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression278 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_POW_in_powerExpression282 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression311 = new BitSet(new long[]{0x5400080321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression323 = new BitSet(new long[]{0x5400080321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified352 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified361 = new BitSet(new long[]{0x5400080321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified365 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_72_in_primaryExpression393 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_primaryExpression397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATETIME_in_value438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INDICATOR_in_value463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_INDICATOR_in_value469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILLER_in_filler518 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_in_filler520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special542 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_params_in_bi_function567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_bi_function591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_bi_function593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_params_in_usr_function615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_empty_in_usr_function635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_params653 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_logicalExpression_in_params656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
	public static final BitSet FOLLOW_74_in_params659 = new BitSet(new long[]{0x54008A0321808940L,0x0000000000000100L});
	public static final BitSet FOLLOW_logicalExpression_in_params662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
	public static final BitSet FOLLOW_73_in_params666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_empty679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_empty681 = new BitSet(new long[]{0x0000000000000002L});
}
