// $ANTLR 3.5.1 RPGExpr.g 2015-03-23 18:16:07

  package org.asup.il.expr.base.antlr.rpg;
  
  import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RPGExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "AND", "B", "BI_FUN", 
		"BI_FUNCTION", "BLOCK", "BOOLEAN", "C", "CHAR_SPECIAL", "D", "DATETIME", 
		"DIGIT", "DIGIT_SPECIAL", "DIV", "E", "EQ", "EscapeSequence", "F", "FLOAT", 
		"G", "GT", "GTEQ", "H", "HEX", "HexDigit", "I", "IN", "INDICATOR", "INNR", 
		"INNU", "INTEGER", "J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", 
		"MOD", "MULT", "N", "NE", "NOT", "O", "OR", "P", "PLUS", "POINT", "POW", 
		"Q", "QUALIFIED", "R", "S", "SIGN_MINUS", "SIGN_PLUS", "SPECIAL", "SP_VALUE", 
		"STRING", "T", "TERM", "U", "USER_FUNCTION", "UnicodeEscape", "V", "W", 
		"WS", "X", "Y", "Z", "'('", "')'", "':'"
	};
	public static final int EOF=-1;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int A=4;
	public static final int ALL=5;
	public static final int AND=6;
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
	public static final int FLOAT=23;
	public static final int G=24;
	public static final int GT=25;
	public static final int GTEQ=26;
	public static final int H=27;
	public static final int HEX=28;
	public static final int HexDigit=29;
	public static final int I=30;
	public static final int IN=31;
	public static final int INDICATOR=32;
	public static final int INNR=33;
	public static final int INNU=34;
	public static final int INTEGER=35;
	public static final int J=36;
	public static final int K=37;
	public static final int L=38;
	public static final int LETTER=39;
	public static final int LT=40;
	public static final int LTEQ=41;
	public static final int M=42;
	public static final int MINUS=43;
	public static final int MOD=44;
	public static final int MULT=45;
	public static final int N=46;
	public static final int NE=47;
	public static final int NOT=48;
	public static final int O=49;
	public static final int OR=50;
	public static final int P=51;
	public static final int PLUS=52;
	public static final int POINT=53;
	public static final int POW=54;
	public static final int Q=55;
	public static final int QUALIFIED=56;
	public static final int R=57;
	public static final int S=58;
	public static final int SIGN_MINUS=59;
	public static final int SIGN_PLUS=60;
	public static final int SPECIAL=61;
	public static final int SP_VALUE=62;
	public static final int STRING=63;
	public static final int T=64;
	public static final int TERM=65;
	public static final int U=66;
	public static final int USER_FUNCTION=67;
	public static final int UnicodeEscape=68;
	public static final int V=69;
	public static final int W=70;
	public static final int WS=71;
	public static final int X=72;
	public static final int Y=73;
	public static final int Z=74;

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



	   @Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	   @Override
	   public void reportError(RecognitionException e) {
	      super.reportError(e);
	      RuntimeException re = createException(e);
	      recover(input, e);
	      throw re;
	   }

	   @Override
	  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
	    }
	    
	    public RuntimeException createException(RecognitionException e) {
	        String message = "";
	        boolean addTokenAndLine = true;
	        if (e instanceof NoViableAltException) {
	            message = "Syntax error. ";
	        } else if (e instanceof MissingTokenException) {
	            message = "Missing token ";
	        } else if (e instanceof UnwantedTokenException) {
	            UnwantedTokenException ex = (UnwantedTokenException) e;
	            ex.getUnexpectedToken().getText();
	            message = "Unkow token '" + ex.getUnexpectedToken().getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
	            addTokenAndLine = false;
	        } else {
	            message = "Syntax error near ";
	        }
	        if (addTokenAndLine) {
	            message = message + "'" + e.token.getText() + "' at line " + e.token.getLine() + ":" + e.token.getCharPositionInLine();
	        }
	        return new IntegratedLanguageExpressionRuntimeException(message,e);
	    }


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// RPGExpr.g:98:1: expression : logicalExpression EOF !;
	public final RPGExprParser.expression_return expression() throws RecognitionException {
		RPGExprParser.expression_return retval = new RPGExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// RPGExpr.g:99:2: ( logicalExpression EOF !)
			// RPGExpr.g:99:5: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression145);
			logicalExpression1=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression147); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:102:1: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final RPGExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		RPGExprParser.logicalExpression_return retval = new RPGExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// RPGExpr.g:103:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// RPGExpr.g:103:4: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression159);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// RPGExpr.g:103:25: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// RPGExpr.g:103:26: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);
					}

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression165);
					booleanAndExpression5=booleanAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanAndExpression5.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:106:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final RPGExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		RPGExprParser.booleanAndExpression_return retval = new RPGExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// RPGExpr.g:107:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// RPGExpr.g:107:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression179);
			equalityExpression6=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression6.getTree());

			// RPGExpr.g:107:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// RPGExpr.g:107:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression185);
					equalityExpression8=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression8.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:111:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final RPGExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		RPGExprParser.equalityExpression_return retval = new RPGExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// RPGExpr.g:112:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// RPGExpr.g:112:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression199);
			relationalExpression9=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression9.getTree());

			// RPGExpr.g:112:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// RPGExpr.g:112:26: ( EQ | NE ) ^ relationalExpression
					{
					set10=input.LT(1);
					set10=input.LT(1);
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set10), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression209);
					relationalExpression11=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression11.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:115:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* ;
	public final RPGExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		RPGExprParser.relationalExpression_return retval = new RPGExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope additiveExpression12 =null;
		ParserRuleReturnScope additiveExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// RPGExpr.g:116:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )* )
			// RPGExpr.g:116:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_relationalExpression222);
			additiveExpression12=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression12.getTree());

			// RPGExpr.g:116:23: ( ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// RPGExpr.g:116:25: ( LT | LTEQ | GT | GTEQ ) ^ additiveExpression
					{
					set13=input.LT(1);
					set13=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set13), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression237);
					additiveExpression14=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression14.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:120:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final RPGExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		RPGExprParser.additiveExpression_return retval = new RPGExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope multiplicativeExpression15 =null;
		ParserRuleReturnScope multiplicativeExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// RPGExpr.g:121:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// RPGExpr.g:121:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression252);
			multiplicativeExpression15=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression15.getTree());

			// RPGExpr.g:121:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MINUS||LA5_0==PLUS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// RPGExpr.g:121:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression263);
					multiplicativeExpression17=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression17.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:124:1: multiplicativeExpression : powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* ;
	public final RPGExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		RPGExprParser.multiplicativeExpression_return retval = new RPGExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope powerExpression18 =null;
		ParserRuleReturnScope powerExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// RPGExpr.g:125:2: ( powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )* )
			// RPGExpr.g:126:3: powerExpression ( ( MULT | DIV | MOD ) ^ powerExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression279);
			powerExpression18=powerExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression18.getTree());

			// RPGExpr.g:126:19: ( ( MULT | DIV | MOD ) ^ powerExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DIV||(LA6_0 >= MOD && LA6_0 <= MULT)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// RPGExpr.g:126:21: ( MULT | DIV | MOD ) ^ powerExpression
					{
					set19=input.LT(1);
					set19=input.LT(1);
					if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powerExpression_in_multiplicativeExpression292);
					powerExpression20=powerExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, powerExpression20.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:129:1: powerExpression : (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* ;
	public final RPGExprParser.powerExpression_return powerExpression() throws RecognitionException {
		RPGExprParser.powerExpression_return retval = new RPGExprParser.powerExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT21=null;
		Token MULT22=null;
		ParserRuleReturnScope v1 =null;
		ParserRuleReturnScope v2 =null;

		CommonTree MULT21_tree=null;
		CommonTree MULT22_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			// RPGExpr.g:130:2: ( (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )* )
			// RPGExpr.g:130:4: (v1= unaryExpression -> unaryExpression ) ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			{
			// RPGExpr.g:130:4: (v1= unaryExpression -> unaryExpression )
			// RPGExpr.g:130:5: v1= unaryExpression
			{
			pushFollow(FOLLOW_unaryExpression_in_powerExpression308);
			v1=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unaryExpression.add(v1.getTree());
			// AST REWRITE
			// elements: unaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 130:24: -> unaryExpression
			{
				adaptor.addChild(root_0, stream_unaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// RPGExpr.g:130:44: ( ( MULT MULT v2= unaryExpression ) -> ^( POW $v1 $v2) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==MULT) ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1==MULT) ) {
						int LA7_3 = input.LA(3);
						if ( (LA7_3==SPECIAL) ) {
							int LA7_4 = input.LA(4);
							if ( (synpred14_RPGExpr()) ) {
								alt7=1;
							}

						}
						else if ( (LA7_3==BI_FUN||LA7_3==BOOLEAN||LA7_3==DATETIME||LA7_3==FLOAT||LA7_3==HEX||LA7_3==IN||(LA7_3 >= INNR && LA7_3 <= INTEGER)||LA7_3==MINUS||LA7_3==MULT||LA7_3==NOT||LA7_3==PLUS||LA7_3==STRING||LA7_3==TERM||LA7_3==75) ) {
							alt7=1;
						}

					}

				}

				switch (alt7) {
				case 1 :
					// RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
					{
					// RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
					// RPGExpr.g:130:47: MULT MULT v2= unaryExpression
					{
					MULT21=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression318); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT21);

					MULT22=(Token)match(input,MULT,FOLLOW_MULT_in_powerExpression320); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT22);

					pushFollow(FOLLOW_unaryExpression_in_powerExpression324);
					v2=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(v2.getTree());
					}

					// AST REWRITE
					// elements: v2, v1
					// token labels: 
					// rule labels: v1, retval, v2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 130:78: -> ^( POW $v1 $v2)
					{
						// RPGExpr.g:130:81: ^( POW $v1 $v2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);
						adaptor.addChild(root_1, stream_v1.nextTree());
						adaptor.addChild(root_1, stream_v2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:133:1: unaryExpression : ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) );
	public final RPGExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		RPGExprParser.unaryExpression_return retval = new RPGExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT24=null;
		Token MINUS26=null;
		Token PLUS28=null;
		ParserRuleReturnScope qualified23 =null;
		ParserRuleReturnScope qualified25 =null;
		ParserRuleReturnScope qualified27 =null;
		ParserRuleReturnScope qualified29 =null;

		CommonTree NOT24_tree=null;
		CommonTree MINUS26_tree=null;
		CommonTree PLUS28_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_qualified=new RewriteRuleSubtreeStream(adaptor,"rule qualified");

		try {
			// RPGExpr.g:134:2: ( qualified | NOT ^ qualified | MINUS qualified -> ^( SIGN_MINUS qualified ) | PLUS qualified -> ^( SIGN_PLUS qualified ) )
			int alt8=4;
			switch ( input.LA(1) ) {
			case BI_FUN:
			case BOOLEAN:
			case DATETIME:
			case FLOAT:
			case HEX:
			case IN:
			case INNR:
			case INNU:
			case INTEGER:
			case MULT:
			case SPECIAL:
			case STRING:
			case TERM:
			case 75:
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
			case PLUS:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// RPGExpr.g:135:4: qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_qualified_in_unaryExpression354);
					qualified23=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified23.getTree());

					}
					break;
				case 2 :
					// RPGExpr.g:136:8: NOT ^ qualified
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT24=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT24_tree = (CommonTree)adaptor.create(NOT24);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT24_tree, root_0);
					}

					pushFollow(FOLLOW_qualified_in_unaryExpression366);
					qualified25=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qualified25.getTree());

					}
					break;
				case 3 :
					// RPGExpr.g:137:8: MINUS qualified
					{
					MINUS26=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression375); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS26);

					pushFollow(FOLLOW_qualified_in_unaryExpression377);
					qualified27=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualified.add(qualified27.getTree());
					// AST REWRITE
					// elements: qualified
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 137:24: -> ^( SIGN_MINUS qualified )
					{
						// RPGExpr.g:137:27: ^( SIGN_MINUS qualified )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_MINUS, "SIGN_MINUS"), root_1);
						adaptor.addChild(root_1, stream_qualified.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// RPGExpr.g:138:8: PLUS qualified
					{
					PLUS28=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression394); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS28);

					pushFollow(FOLLOW_qualified_in_unaryExpression396);
					qualified29=qualified();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_qualified.add(qualified29.getTree());
					// AST REWRITE
					// elements: qualified
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 138:24: -> ^( SIGN_PLUS qualified )
					{
						// RPGExpr.g:138:27: ^( SIGN_PLUS qualified )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGN_PLUS, "SIGN_PLUS"), root_1);
						adaptor.addChild(root_1, stream_qualified.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:141:1: qualified : (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* ;
	public final RPGExprParser.qualified_return qualified() throws RecognitionException {
		RPGExprParser.qualified_return retval = new RPGExprParser.qualified_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POINT30=null;
		List<Object> list_vals=null;
		ParserRuleReturnScope v =null;
		RuleReturnScope vals = null;
		CommonTree POINT30_tree=null;
		RewriteRuleTokenStream stream_POINT=new RewriteRuleTokenStream(adaptor,"token POINT");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");

		try {
			// RPGExpr.g:142:2: ( (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )* )
			// RPGExpr.g:143:3: (v= primaryExpression -> primaryExpression ) ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			{
			// RPGExpr.g:143:3: (v= primaryExpression -> primaryExpression )
			// RPGExpr.g:143:4: v= primaryExpression
			{
			pushFollow(FOLLOW_primaryExpression_in_qualified428);
			v=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryExpression.add(v.getTree());
			// AST REWRITE
			// elements: primaryExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:24: -> primaryExpression
			{
				adaptor.addChild(root_0, stream_primaryExpression.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// RPGExpr.g:143:46: ( ( POINT vals+= primaryExpression ) -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==POINT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// RPGExpr.g:143:47: ( POINT vals+= primaryExpression )
					{
					// RPGExpr.g:143:47: ( POINT vals+= primaryExpression )
					// RPGExpr.g:143:48: POINT vals+= primaryExpression
					{
					POINT30=(Token)match(input,POINT,FOLLOW_POINT_in_qualified437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_POINT.add(POINT30);

					pushFollow(FOLLOW_primaryExpression_in_qualified441);
					vals=primaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primaryExpression.add(vals.getTree());
					if (list_vals==null) list_vals=new ArrayList<Object>();
					list_vals.add(vals.getTree());
					}

					// AST REWRITE
					// elements: v, vals
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: vals
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_vals=new RewriteRuleSubtreeStream(adaptor,"token vals",list_vals);
					root_0 = (CommonTree)adaptor.nil();
					// 143:79: -> ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
					{
						// RPGExpr.g:143:82: ^( QUALIFIED[$qualified.text] $v ( $vals)+ )
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

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:146:1: primaryExpression : ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value );
	public final RPGExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		RPGExprParser.primaryExpression_return retval = new RPGExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope logicalExpression32 =null;
		ParserRuleReturnScope value34 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// RPGExpr.g:147:2: ( '(' logicalExpression ')' -> ^( BLOCK[$primaryExpression.text] logicalExpression ) | value )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==75) ) {
				alt10=1;
			}
			else if ( (LA10_0==BI_FUN||LA10_0==BOOLEAN||LA10_0==DATETIME||LA10_0==FLOAT||LA10_0==HEX||LA10_0==IN||(LA10_0 >= INNR && LA10_0 <= INTEGER)||LA10_0==MULT||LA10_0==SPECIAL||LA10_0==STRING||LA10_0==TERM) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// RPGExpr.g:147:4: '(' logicalExpression ')'
					{
					char_literal31=(Token)match(input,75,FOLLOW_75_in_primaryExpression474); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal31);

					pushFollow(FOLLOW_logicalExpression_in_primaryExpression476);
					logicalExpression32=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression32.getTree());
					char_literal33=(Token)match(input,76,FOLLOW_76_in_primaryExpression478); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(char_literal33);

					// AST REWRITE
					// elements: logicalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:30: -> ^( BLOCK[$primaryExpression.text] logicalExpression )
					{
						// RPGExpr.g:147:33: ^( BLOCK[$primaryExpression.text] logicalExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, input.toString(retval.start,input.LT(-1))), root_1);
						adaptor.addChild(root_1, stream_logicalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// RPGExpr.g:149:3: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression495);
					value34=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value34.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:152:1: value : ( INTEGER | FLOAT | DATETIME | BOOLEAN | STRING | HEX | TERM | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function | indicator );
	public final RPGExprParser.value_return value() throws RecognitionException {
		RPGExprParser.value_return retval = new RPGExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER35=null;
		Token FLOAT36=null;
		Token DATETIME37=null;
		Token BOOLEAN38=null;
		Token STRING39=null;
		Token HEX40=null;
		Token TERM41=null;
		Token SPECIAL42=null;
		ParserRuleReturnScope filler43 =null;
		ParserRuleReturnScope special44 =null;
		ParserRuleReturnScope bi_function45 =null;
		ParserRuleReturnScope usr_function46 =null;
		ParserRuleReturnScope indicator47 =null;

		CommonTree INTEGER35_tree=null;
		CommonTree FLOAT36_tree=null;
		CommonTree DATETIME37_tree=null;
		CommonTree BOOLEAN38_tree=null;
		CommonTree STRING39_tree=null;
		CommonTree HEX40_tree=null;
		CommonTree TERM41_tree=null;
		CommonTree SPECIAL42_tree=null;
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// RPGExpr.g:153:2: ( INTEGER | FLOAT | DATETIME | BOOLEAN | STRING | HEX | TERM | ( SPECIAL -> TERM ) | filler | special | bi_function | usr_function | indicator )
			int alt11=13;
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
				if ( (LA11_7==EOF||LA11_7==AND||LA11_7==DIV||LA11_7==EQ||(LA11_7 >= GT && LA11_7 <= GTEQ)||(LA11_7 >= LT && LA11_7 <= LTEQ)||(LA11_7 >= MINUS && LA11_7 <= MULT)||LA11_7==NE||LA11_7==OR||(LA11_7 >= PLUS && LA11_7 <= POINT)||(LA11_7 >= 76 && LA11_7 <= 77)) ) {
					alt11=7;
				}
				else if ( (LA11_7==75) ) {
					alt11=12;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case SPECIAL:
				{
				alt11=8;
				}
				break;
			case MULT:
				{
				int LA11_9 = input.LA(2);
				if ( (LA11_9==ALL) ) {
					alt11=9;
				}
				else if ( (LA11_9==SPECIAL) ) {
					alt11=10;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BI_FUN:
				{
				alt11=11;
				}
				break;
			case IN:
			case INNR:
			case INNU:
				{
				alt11=13;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// RPGExpr.g:154:3: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value510); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER35_tree = (CommonTree)adaptor.create(INTEGER35);
					adaptor.addChild(root_0, INTEGER35_tree);
					}

					}
					break;
				case 2 :
					// RPGExpr.g:155:4: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT36=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value515); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT36_tree = (CommonTree)adaptor.create(FLOAT36);
					adaptor.addChild(root_0, FLOAT36_tree);
					}

					}
					break;
				case 3 :
					// RPGExpr.g:156:5: DATETIME
					{
					root_0 = (CommonTree)adaptor.nil();


					DATETIME37=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_value521); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATETIME37_tree = (CommonTree)adaptor.create(DATETIME37);
					adaptor.addChild(root_0, DATETIME37_tree);
					}

					}
					break;
				case 4 :
					// RPGExpr.g:157:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN38=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_value526); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOOLEAN38_tree = (CommonTree)adaptor.create(BOOLEAN38);
					adaptor.addChild(root_0, BOOLEAN38_tree);
					}

					}
					break;
				case 5 :
					// RPGExpr.g:158:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING39=(Token)match(input,STRING,FOLLOW_STRING_in_value531); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING39_tree = (CommonTree)adaptor.create(STRING39);
					adaptor.addChild(root_0, STRING39_tree);
					}

					}
					break;
				case 6 :
					// RPGExpr.g:159:4: HEX
					{
					root_0 = (CommonTree)adaptor.nil();


					HEX40=(Token)match(input,HEX,FOLLOW_HEX_in_value536); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HEX40_tree = (CommonTree)adaptor.create(HEX40);
					adaptor.addChild(root_0, HEX40_tree);
					}

					}
					break;
				case 7 :
					// RPGExpr.g:160:4: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM41=(Token)match(input,TERM,FOLLOW_TERM_in_value541); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TERM41_tree = (CommonTree)adaptor.create(TERM41);
					adaptor.addChild(root_0, TERM41_tree);
					}

					}
					break;
				case 8 :
					// RPGExpr.g:161:4: ( SPECIAL -> TERM )
					{
					// RPGExpr.g:161:4: ( SPECIAL -> TERM )
					// RPGExpr.g:161:5: SPECIAL
					{
					SPECIAL42=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value547); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL42);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 161:13: -> TERM
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(TERM, "TERM"));
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 9 :
					// RPGExpr.g:162:4: filler
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filler_in_value557);
					filler43=filler();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filler43.getTree());

					}
					break;
				case 10 :
					// RPGExpr.g:163:4: special
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_special_in_value562);
					special44=special();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, special44.getTree());

					}
					break;
				case 11 :
					// RPGExpr.g:164:4: bi_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bi_function_in_value567);
					bi_function45=bi_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_function45.getTree());

					}
					break;
				case 12 :
					// RPGExpr.g:165:4: usr_function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_usr_function_in_value572);
					usr_function46=usr_function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, usr_function46.getTree());

					}
					break;
				case 13 :
					// RPGExpr.g:166:6: indicator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_indicator_in_value579);
					indicator47=indicator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indicator47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class indicator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "indicator"
	// RPGExpr.g:169:1: indicator : ( IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] ) | INNU -> ^( INDICATOR[$INNU.text] ) );
	public final RPGExprParser.indicator_return indicator() throws RecognitionException {
		RPGExprParser.indicator_return retval = new RPGExprParser.indicator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IN48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		Token INNR52=null;
		Token INNU53=null;
		ParserRuleReturnScope logicalExpression50 =null;

		CommonTree IN48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree INNR52_tree=null;
		CommonTree INNU53_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_INNR=new RewriteRuleTokenStream(adaptor,"token INNR");
		RewriteRuleTokenStream stream_INNU=new RewriteRuleTokenStream(adaptor,"token INNU");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_logicalExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalExpression");

		try {
			// RPGExpr.g:170:2: ( IN '(' logicalExpression ')' -> ^( BI_FUNCTION[\"*IN\"] logicalExpression ) | INNR -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] ) | INNU -> ^( INDICATOR[$INNU.text] ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case IN:
				{
				alt12=1;
				}
				break;
			case INNR:
				{
				alt12=2;
				}
				break;
			case INNU:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// RPGExpr.g:171:3: IN '(' logicalExpression ')'
					{
					IN48=(Token)match(input,IN,FOLLOW_IN_in_indicator593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IN.add(IN48);

					char_literal49=(Token)match(input,75,FOLLOW_75_in_indicator595); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal49);

					pushFollow(FOLLOW_logicalExpression_in_indicator597);
					logicalExpression50=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalExpression.add(logicalExpression50.getTree());
					char_literal51=(Token)match(input,76,FOLLOW_76_in_indicator599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(char_literal51);

					// AST REWRITE
					// elements: logicalExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 171:32: -> ^( BI_FUNCTION[\"*IN\"] logicalExpression )
					{
						// RPGExpr.g:171:35: ^( BI_FUNCTION[\"*IN\"] logicalExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, stream_logicalExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// RPGExpr.g:173:3: INNR
					{
					INNR52=(Token)match(input,INNR,FOLLOW_INNR_in_indicator619); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNR.add(INNR52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 173:8: -> ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] )
					{
						// RPGExpr.g:173:11: ^( BI_FUNCTION[\"*IN\"] INTEGER[$INNR.text.substring(3)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*IN"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INTEGER, (INNR52!=null?INNR52.getText():null).substring(3)));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// RPGExpr.g:175:3: INNU
					{
					INNU53=(Token)match(input,INNU,FOLLOW_INNU_in_indicator640); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INNU.add(INNU53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 175:8: -> ^( INDICATOR[$INNU.text] )
					{
						// RPGExpr.g:175:11: ^( INDICATOR[$INNU.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDICATOR, (INNU53!=null?INNU53.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indicator"


	public static class filler_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filler"
	// RPGExpr.g:178:1: filler : ( MULT ALL STRING -> ^( BI_FUNCTION[\"*ALL\"] STRING ) | MULT ALL HEX -> ^( BI_FUNCTION[\"*ALL\"] HEX ) );
	public final RPGExprParser.filler_return filler() throws RecognitionException {
		RPGExprParser.filler_return retval = new RPGExprParser.filler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT54=null;
		Token ALL55=null;
		Token STRING56=null;
		Token MULT57=null;
		Token ALL58=null;
		Token HEX59=null;

		CommonTree MULT54_tree=null;
		CommonTree ALL55_tree=null;
		CommonTree STRING56_tree=null;
		CommonTree MULT57_tree=null;
		CommonTree ALL58_tree=null;
		CommonTree HEX59_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// RPGExpr.g:178:8: ( MULT ALL STRING -> ^( BI_FUNCTION[\"*ALL\"] STRING ) | MULT ALL HEX -> ^( BI_FUNCTION[\"*ALL\"] HEX ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==MULT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==ALL) ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2==STRING) ) {
						alt13=1;
					}
					else if ( (LA13_2==HEX) ) {
						alt13=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// RPGExpr.g:179:3: MULT ALL STRING
					{
					MULT54=(Token)match(input,MULT,FOLLOW_MULT_in_filler675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT54);

					ALL55=(Token)match(input,ALL,FOLLOW_ALL_in_filler677); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL55);

					STRING56=(Token)match(input,STRING,FOLLOW_STRING_in_filler679); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING.add(STRING56);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 179:19: -> ^( BI_FUNCTION[\"*ALL\"] STRING )
					{
						// RPGExpr.g:179:22: ^( BI_FUNCTION[\"*ALL\"] STRING )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// RPGExpr.g:181:3: MULT ALL HEX
					{
					MULT57=(Token)match(input,MULT,FOLLOW_MULT_in_filler696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT57);

					ALL58=(Token)match(input,ALL,FOLLOW_ALL_in_filler698); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ALL.add(ALL58);

					HEX59=(Token)match(input,HEX,FOLLOW_HEX_in_filler700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_HEX.add(HEX59);

					// AST REWRITE
					// elements: HEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 181:16: -> ^( BI_FUNCTION[\"*ALL\"] HEX )
					{
						// RPGExpr.g:181:19: ^( BI_FUNCTION[\"*ALL\"] HEX )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, "*ALL"), root_1);
						adaptor.addChild(root_1, stream_HEX.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:184:1: special : MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] ;
	public final RPGExprParser.special_return special() throws RecognitionException {
		RPGExprParser.special_return retval = new RPGExprParser.special_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MULT60=null;
		Token SPECIAL61=null;

		CommonTree MULT60_tree=null;
		CommonTree SPECIAL61_tree=null;
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_SPECIAL=new RewriteRuleTokenStream(adaptor,"token SPECIAL");

		try {
			// RPGExpr.g:184:9: ( MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text] )
			// RPGExpr.g:185:3: MULT SPECIAL
			{
			MULT60=(Token)match(input,MULT,FOLLOW_MULT_in_special722); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MULT.add(MULT60);

			SPECIAL61=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_special724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SPECIAL.add(SPECIAL61);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 185:16: -> SP_VALUE[$MULT.text + $SPECIAL.text]
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(SP_VALUE, (MULT60!=null?MULT60.getText():null) + (SPECIAL61!=null?SPECIAL61.getText():null)));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "special"


	public static class usr_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "usr_function"
	// RPGExpr.g:189:1: usr_function : ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) );
	public final RPGExprParser.usr_function_return usr_function() throws RecognitionException {
		RPGExprParser.usr_function_return retval = new RPGExprParser.usr_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TERM62=null;
		Token TERM64=null;
		ParserRuleReturnScope params63 =null;
		ParserRuleReturnScope empty65 =null;

		CommonTree TERM62_tree=null;
		CommonTree TERM64_tree=null;
		RewriteRuleTokenStream stream_TERM=new RewriteRuleTokenStream(adaptor,"token TERM");
		RewriteRuleSubtreeStream stream_empty=new RewriteRuleSubtreeStream(adaptor,"rule empty");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// RPGExpr.g:190:2: ( TERM params -> ^( USER_FUNCTION[$TERM.text] params ) | TERM empty -> ^( USER_FUNCTION[$TERM.text] ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TERM) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==75) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==76) ) {
						alt14=2;
					}
					else if ( (LA14_2==BI_FUN||LA14_2==BOOLEAN||LA14_2==DATETIME||LA14_2==FLOAT||LA14_2==HEX||LA14_2==IN||(LA14_2 >= INNR && LA14_2 <= INTEGER)||LA14_2==MINUS||LA14_2==MULT||LA14_2==NOT||LA14_2==PLUS||LA14_2==SPECIAL||LA14_2==STRING||LA14_2==TERM||LA14_2==75) ) {
						alt14=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// RPGExpr.g:190:4: TERM params
					{
					TERM62=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function741); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM62);

					pushFollow(FOLLOW_params_in_usr_function743);
					params63=params();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_params.add(params63.getTree());
					// AST REWRITE
					// elements: params
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 190:17: -> ^( USER_FUNCTION[$TERM.text] params )
					{
						// RPGExpr.g:190:20: ^( USER_FUNCTION[$TERM.text] params )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM62!=null?TERM62.getText():null)), root_1);
						adaptor.addChild(root_1, stream_params.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// RPGExpr.g:192:3: TERM empty
					{
					TERM64=(Token)match(input,TERM,FOLLOW_TERM_in_usr_function761); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERM.add(TERM64);

					pushFollow(FOLLOW_empty_in_usr_function763);
					empty65=empty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_empty.add(empty65.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 192:14: -> ^( USER_FUNCTION[$TERM.text] )
					{
						// RPGExpr.g:192:17: ^( USER_FUNCTION[$TERM.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(USER_FUNCTION, (TERM64!=null?TERM64.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "usr_function"


	public static class bi_function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bi_function"
	// RPGExpr.g:194:1: bi_function : ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) );
	public final RPGExprParser.bi_function_return bi_function() throws RecognitionException {
		RPGExprParser.bi_function_return retval = new RPGExprParser.bi_function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BI_FUN66=null;
		Token BI_FUN68=null;
		Token char_literal69=null;
		Token char_literal70=null;
		ParserRuleReturnScope params67 =null;

		CommonTree BI_FUN66_tree=null;
		CommonTree BI_FUN68_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree char_literal70_tree=null;
		RewriteRuleTokenStream stream_BI_FUN=new RewriteRuleTokenStream(adaptor,"token BI_FUN");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");

		try {
			// RPGExpr.g:195:2: ( BI_FUN ( params )? -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? ) | BI_FUN '(' ')' -> ^( BI_FUNCTION[$BI_FUN.text] ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BI_FUN) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==75) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==76) ) {
						alt16=2;
					}
					else if ( (LA16_2==BI_FUN||LA16_2==BOOLEAN||LA16_2==DATETIME||LA16_2==FLOAT||LA16_2==HEX||LA16_2==IN||(LA16_2 >= INNR && LA16_2 <= INTEGER)||LA16_2==MINUS||LA16_2==MULT||LA16_2==NOT||LA16_2==PLUS||LA16_2==SPECIAL||LA16_2==STRING||LA16_2==TERM||LA16_2==75) ) {
						alt16=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA16_1==EOF||LA16_1==AND||LA16_1==DIV||LA16_1==EQ||(LA16_1 >= GT && LA16_1 <= GTEQ)||(LA16_1 >= LT && LA16_1 <= LTEQ)||(LA16_1 >= MINUS && LA16_1 <= MULT)||LA16_1==NE||LA16_1==OR||(LA16_1 >= PLUS && LA16_1 <= POINT)||(LA16_1 >= 76 && LA16_1 <= 77)) ) {
					alt16=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// RPGExpr.g:195:5: BI_FUN ( params )?
					{
					BI_FUN66=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN66);

					// RPGExpr.g:195:12: ( params )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==75) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// RPGExpr.g:195:13: params
							{
							pushFollow(FOLLOW_params_in_bi_function784);
							params67=params();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_params.add(params67.getTree());
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
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 195:22: -> ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
					{
						// RPGExpr.g:195:25: ^( BI_FUNCTION[$BI_FUN.text] ( params )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN66!=null?BI_FUN66.getText():null)), root_1);
						// RPGExpr.g:195:53: ( params )?
						if ( stream_params.hasNext() ) {
							adaptor.addChild(root_1, stream_params.nextTree());
						}
						stream_params.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// RPGExpr.g:197:3: BI_FUN '(' ')'
					{
					BI_FUN68=(Token)match(input,BI_FUN,FOLLOW_BI_FUN_in_bi_function806); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BI_FUN.add(BI_FUN68);

					char_literal69=(Token)match(input,75,FOLLOW_75_in_bi_function808); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal69);

					char_literal70=(Token)match(input,76,FOLLOW_76_in_bi_function810); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(char_literal70);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 197:20: -> ^( BI_FUNCTION[$BI_FUN.text] )
					{
						// RPGExpr.g:197:23: ^( BI_FUNCTION[$BI_FUN.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BI_FUNCTION, (BI_FUN68!=null?BI_FUN68.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bi_function"


	public static class params_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "params"
	// RPGExpr.g:200:1: params : '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !;
	public final RPGExprParser.params_return params() throws RecognitionException {
		RPGExprParser.params_return retval = new RPGExprParser.params_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal71=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope logicalExpression72 =null;
		ParserRuleReturnScope logicalExpression74 =null;

		CommonTree char_literal71_tree=null;
		CommonTree char_literal73_tree=null;
		CommonTree char_literal75_tree=null;

		try {
			// RPGExpr.g:201:2: ( '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !)
			// RPGExpr.g:202:3: '(' ! logicalExpression ( ':' ! logicalExpression )* ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal71=(Token)match(input,75,FOLLOW_75_in_params835); if (state.failed) return retval;
			pushFollow(FOLLOW_logicalExpression_in_params838);
			logicalExpression72=logicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression72.getTree());

			// RPGExpr.g:202:26: ( ':' ! logicalExpression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==77) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// RPGExpr.g:202:27: ':' ! logicalExpression
					{
					char_literal73=(Token)match(input,77,FOLLOW_77_in_params841); if (state.failed) return retval;
					pushFollow(FOLLOW_logicalExpression_in_params844);
					logicalExpression74=logicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalExpression74.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			char_literal75=(Token)match(input,76,FOLLOW_76_in_params848); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
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
	// RPGExpr.g:205:1: empty : '(' ')' ;
	public final RPGExprParser.empty_return empty() throws RecognitionException {
		RPGExprParser.empty_return retval = new RPGExprParser.empty_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal76=null;
		Token char_literal77=null;

		CommonTree char_literal76_tree=null;
		CommonTree char_literal77_tree=null;

		try {
			// RPGExpr.g:206:2: ( '(' ')' )
			// RPGExpr.g:207:2: '(' ')'
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal76=(Token)match(input,75,FOLLOW_75_in_empty862); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal76_tree = (CommonTree)adaptor.create(char_literal76);
			adaptor.addChild(root_0, char_literal76_tree);
			}

			char_literal77=(Token)match(input,76,FOLLOW_76_in_empty864); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal77_tree = (CommonTree)adaptor.create(char_literal77);
			adaptor.addChild(root_0, char_literal77_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "empty"

	// $ANTLR start synpred14_RPGExpr
	public final void synpred14_RPGExpr_fragment() throws RecognitionException {
		ParserRuleReturnScope v2 =null;


		// RPGExpr.g:130:45: ( ( MULT MULT v2= unaryExpression ) )
		// RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
		{
		// RPGExpr.g:130:45: ( MULT MULT v2= unaryExpression )
		// RPGExpr.g:130:47: MULT MULT v2= unaryExpression
		{
		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr318); if (state.failed) return;

		match(input,MULT,FOLLOW_MULT_in_synpred14_RPGExpr320); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred14_RPGExpr324);
		v2=unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred14_RPGExpr

	// Delegated rules

	public final boolean synpred14_RPGExpr() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_RPGExpr_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_logicalExpression_in_expression145 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression159 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression162 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression165 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression179 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression182 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression185 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression199 = new BitSet(new long[]{0x0000800000100002L});
	public static final BitSet FOLLOW_set_in_equalityExpression202 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression209 = new BitSet(new long[]{0x0000800000100002L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression222 = new BitSet(new long[]{0x0000030006000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression226 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression237 = new BitSet(new long[]{0x0000030006000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression252 = new BitSet(new long[]{0x0010080000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression256 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression263 = new BitSet(new long[]{0x0010080000000002L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression279 = new BitSet(new long[]{0x0000300000040002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression283 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_powerExpression_in_multiplicativeExpression292 = new BitSet(new long[]{0x0000300000040002L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression308 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_MULT_in_powerExpression318 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_MULT_in_powerExpression320 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_unaryExpression_in_powerExpression324 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression363 = new BitSet(new long[]{0xA000200E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression375 = new BitSet(new long[]{0xA000200E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpression394 = new BitSet(new long[]{0xA000200E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_qualified_in_unaryExpression396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified428 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_POINT_in_qualified437 = new BitSet(new long[]{0xA000200E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_primaryExpression_in_qualified441 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_75_in_primaryExpression474 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_primaryExpression478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATETIME_in_value521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_value526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filler_in_value557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_in_value562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bi_function_in_value567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usr_function_in_value572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_indicator_in_value579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_indicator593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_indicator595 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_logicalExpression_in_indicator597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_indicator599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNR_in_indicator619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNU_in_indicator640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler675 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler677 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STRING_in_filler679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_filler696 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_filler698 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_HEX_in_filler700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_special722 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_in_special724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_params_in_usr_function743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_usr_function761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_empty_in_usr_function763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_params_in_bi_function784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BI_FUN_in_bi_function806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_bi_function808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_bi_function810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_params835 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_logicalExpression_in_params838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
	public static final BitSet FOLLOW_77_in_params841 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_logicalExpression_in_params844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
	public static final BitSet FOLLOW_76_in_params848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_empty862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_empty864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr318 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_MULT_in_synpred14_RPGExpr320 = new BitSet(new long[]{0xA011280E90808900L,0x0000000000000802L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred14_RPGExpr324 = new BitSet(new long[]{0x0000000000000002L});
}
