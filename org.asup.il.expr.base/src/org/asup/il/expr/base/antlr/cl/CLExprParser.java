// $ANTLR 3.5.1 CLExpr.g 2015-01-26 17:27:49

  package org.asup.il.expr.base.antlr.cl;
  
  import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CLExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "BCAT", "BINARY_FUN", 
		"C", "CAT", "CHAR_SPECIAL", "CLOSE_BRACE", "D", "DIGIT", "DIGIT_SPECIAL", 
		"DIV", "E", "EQ", "F", "FLOAT", "G", "GT", "GTEQ", "H", "I", "INTEGER", 
		"J", "K", "L", "LETTER", "LT", "LTEQ", "M", "MINUS", "MULT", "N", "NE", 
		"NEGATE", "NG", "NL", "NOT", "O", "OPEN_BRACE", "OR", "P", "PLUS", "Q", 
		"R", "S", "SST_FUN", "STRING", "SWITCH_FUN", "SWITCH_VALUE", "T", "TCAT", 
		"TERM", "U", "V", "VAR", "W", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AND=5;
	public static final int B=6;
	public static final int BCAT=7;
	public static final int BINARY_FUN=8;
	public static final int C=9;
	public static final int CAT=10;
	public static final int CHAR_SPECIAL=11;
	public static final int CLOSE_BRACE=12;
	public static final int D=13;
	public static final int DIGIT=14;
	public static final int DIGIT_SPECIAL=15;
	public static final int DIV=16;
	public static final int E=17;
	public static final int EQ=18;
	public static final int F=19;
	public static final int FLOAT=20;
	public static final int G=21;
	public static final int GT=22;
	public static final int GTEQ=23;
	public static final int H=24;
	public static final int I=25;
	public static final int INTEGER=26;
	public static final int J=27;
	public static final int K=28;
	public static final int L=29;
	public static final int LETTER=30;
	public static final int LT=31;
	public static final int LTEQ=32;
	public static final int M=33;
	public static final int MINUS=34;
	public static final int MULT=35;
	public static final int N=36;
	public static final int NE=37;
	public static final int NEGATE=38;
	public static final int NG=39;
	public static final int NL=40;
	public static final int NOT=41;
	public static final int O=42;
	public static final int OPEN_BRACE=43;
	public static final int OR=44;
	public static final int P=45;
	public static final int PLUS=46;
	public static final int Q=47;
	public static final int R=48;
	public static final int S=49;
	public static final int SST_FUN=50;
	public static final int STRING=51;
	public static final int SWITCH_FUN=52;
	public static final int SWITCH_VALUE=53;
	public static final int T=54;
	public static final int TCAT=55;
	public static final int TERM=56;
	public static final int U=57;
	public static final int V=58;
	public static final int VAR=59;
	public static final int W=60;
	public static final int WS=61;
	public static final int X=62;
	public static final int Y=63;
	public static final int Z=64;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CLExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CLExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "CLExpr.g"; }



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
	// CLExpr.g:101:1: expression : logicalExpression EOF !;
	public final CLExprParser.expression_return expression() throws RecognitionException {
		CLExprParser.expression_return retval = new CLExprParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope logicalExpression1 =null;

		CommonTree EOF2_tree=null;

		try {
			// CLExpr.g:102:4: ( logicalExpression EOF !)
			// CLExpr.g:103:4: logicalExpression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalExpression_in_expression139);
			logicalExpression1=logicalExpression();
			state._fsp--;

			adaptor.addChild(root_0, logicalExpression1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_expression142); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// CLExpr.g:106:2: logicalExpression : booleanAndExpression ( OR ^ booleanAndExpression )* ;
	public final CLExprParser.logicalExpression_return logicalExpression() throws RecognitionException {
		CLExprParser.logicalExpression_return retval = new CLExprParser.logicalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR4=null;
		ParserRuleReturnScope booleanAndExpression3 =null;
		ParserRuleReturnScope booleanAndExpression5 =null;

		CommonTree OR4_tree=null;

		try {
			// CLExpr.g:107:2: ( booleanAndExpression ( OR ^ booleanAndExpression )* )
			// CLExpr.g:108:2: booleanAndExpression ( OR ^ booleanAndExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression158);
			booleanAndExpression3=booleanAndExpression();
			state._fsp--;

			adaptor.addChild(root_0, booleanAndExpression3.getTree());

			// CLExpr.g:108:23: ( OR ^ booleanAndExpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// CLExpr.g:108:24: OR ^ booleanAndExpression
					{
					OR4=(Token)match(input,OR,FOLLOW_OR_in_logicalExpression161); 
					OR4_tree = (CommonTree)adaptor.create(OR4);
					root_0 = (CommonTree)adaptor.becomeRoot(OR4_tree, root_0);

					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression164);
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
	// CLExpr.g:111:1: booleanAndExpression : equalityExpression ( AND ^ equalityExpression )* ;
	public final CLExprParser.booleanAndExpression_return booleanAndExpression() throws RecognitionException {
		CLExprParser.booleanAndExpression_return retval = new CLExprParser.booleanAndExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND7=null;
		ParserRuleReturnScope equalityExpression6 =null;
		ParserRuleReturnScope equalityExpression8 =null;

		CommonTree AND7_tree=null;

		try {
			// CLExpr.g:112:2: ( equalityExpression ( AND ^ equalityExpression )* )
			// CLExpr.g:112:4: equalityExpression ( AND ^ equalityExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression178);
			equalityExpression6=equalityExpression();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpression6.getTree());

			// CLExpr.g:112:23: ( AND ^ equalityExpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AND) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// CLExpr.g:112:24: AND ^ equalityExpression
					{
					AND7=(Token)match(input,AND,FOLLOW_AND_in_booleanAndExpression181); 
					AND7_tree = (CommonTree)adaptor.create(AND7);
					root_0 = (CommonTree)adaptor.becomeRoot(AND7_tree, root_0);

					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression184);
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
	// CLExpr.g:115:1: equalityExpression : relationalExpression ( ( EQ | NE ) ^ relationalExpression )* ;
	public final CLExprParser.equalityExpression_return equalityExpression() throws RecognitionException {
		CLExprParser.equalityExpression_return retval = new CLExprParser.equalityExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;
		ParserRuleReturnScope relationalExpression9 =null;
		ParserRuleReturnScope relationalExpression11 =null;

		CommonTree set10_tree=null;

		try {
			// CLExpr.g:116:2: ( relationalExpression ( ( EQ | NE ) ^ relationalExpression )* )
			// CLExpr.g:116:4: relationalExpression ( ( EQ | NE ) ^ relationalExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression197);
			relationalExpression9=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpression9.getTree());

			// CLExpr.g:116:25: ( ( EQ | NE ) ^ relationalExpression )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==EQ||LA3_0==NE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CLExpr.g:116:26: ( EQ | NE ) ^ relationalExpression
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
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression207);
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
	// CLExpr.g:119:1: relationalExpression : concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )* ;
	public final CLExprParser.relationalExpression_return relationalExpression() throws RecognitionException {
		CLExprParser.relationalExpression_return retval = new CLExprParser.relationalExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;
		ParserRuleReturnScope concatExpression12 =null;
		ParserRuleReturnScope concatExpression14 =null;

		CommonTree set13_tree=null;

		try {
			// CLExpr.g:120:2: ( concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )* )
			// CLExpr.g:120:4: concatExpression ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_concatExpression_in_relationalExpression220);
			concatExpression12=concatExpression();
			state._fsp--;

			adaptor.addChild(root_0, concatExpression12.getTree());

			// CLExpr.g:120:21: ( ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= GT && LA4_0 <= GTEQ)||(LA4_0 >= LT && LA4_0 <= LTEQ)||(LA4_0 >= NG && LA4_0 <= NL)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// CLExpr.g:120:23: ( LT | LTEQ | GT | GTEQ | NG | NL ) ^ concatExpression
					{
					set13=input.LT(1);
					set13=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ)||(input.LA(1) >= NG && input.LA(1) <= NL) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set13), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_concatExpression_in_relationalExpression239);
					concatExpression14=concatExpression();
					state._fsp--;

					adaptor.addChild(root_0, concatExpression14.getTree());

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


	public static class concatExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "concatExpression"
	// CLExpr.g:123:1: concatExpression : additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )* ;
	public final CLExprParser.concatExpression_return concatExpression() throws RecognitionException {
		CLExprParser.concatExpression_return retval = new CLExprParser.concatExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set16=null;
		ParserRuleReturnScope additiveExpression15 =null;
		ParserRuleReturnScope additiveExpression17 =null;

		CommonTree set16_tree=null;

		try {
			// CLExpr.g:124:2: ( additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )* )
			// CLExpr.g:125:3: additiveExpression ( ( CAT | BCAT | TCAT ) ^ additiveExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_concatExpression255);
			additiveExpression15=additiveExpression();
			state._fsp--;

			adaptor.addChild(root_0, additiveExpression15.getTree());

			// CLExpr.g:125:22: ( ( CAT | BCAT | TCAT ) ^ additiveExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==BCAT||LA5_0==CAT||LA5_0==TCAT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// CLExpr.g:125:24: ( CAT | BCAT | TCAT ) ^ additiveExpression
					{
					set16=input.LT(1);
					set16=input.LT(1);
					if ( input.LA(1)==BCAT||input.LA(1)==CAT||input.LA(1)==TCAT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_concatExpression268);
					additiveExpression17=additiveExpression();
					state._fsp--;

					adaptor.addChild(root_0, additiveExpression17.getTree());

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

		    catch (RecognitionException e) {
		        RuntimeException re = createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concatExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// CLExpr.g:129:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* ;
	public final CLExprParser.additiveExpression_return additiveExpression() throws RecognitionException {
		CLExprParser.additiveExpression_return retval = new CLExprParser.additiveExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set19=null;
		ParserRuleReturnScope multiplicativeExpression18 =null;
		ParserRuleReturnScope multiplicativeExpression20 =null;

		CommonTree set19_tree=null;

		try {
			// CLExpr.g:130:2: ( multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )* )
			// CLExpr.g:130:4: multiplicativeExpression ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression283);
			multiplicativeExpression18=multiplicativeExpression();
			state._fsp--;

			adaptor.addChild(root_0, multiplicativeExpression18.getTree());

			// CLExpr.g:130:29: ( ( PLUS | MINUS ) ^ multiplicativeExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// CLExpr.g:130:31: ( PLUS | MINUS ) ^ multiplicativeExpression
					{
					set19=input.LT(1);
					set19=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression294);
					multiplicativeExpression20=multiplicativeExpression();
					state._fsp--;

					adaptor.addChild(root_0, multiplicativeExpression20.getTree());

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
	// CLExpr.g:133:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV ) ^ unaryExpression )* ;
	public final CLExprParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		CLExprParser.multiplicativeExpression_return retval = new CLExprParser.multiplicativeExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set22=null;
		ParserRuleReturnScope unaryExpression21 =null;
		ParserRuleReturnScope unaryExpression23 =null;

		CommonTree set22_tree=null;

		try {
			// CLExpr.g:134:2: ( unaryExpression ( ( MULT | DIV ) ^ unaryExpression )* )
			// CLExpr.g:135:3: unaryExpression ( ( MULT | DIV ) ^ unaryExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression310);
			unaryExpression21=unaryExpression();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpression21.getTree());

			// CLExpr.g:135:19: ( ( MULT | DIV ) ^ unaryExpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DIV||LA7_0==MULT) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// CLExpr.g:135:21: ( MULT | DIV ) ^ unaryExpression
					{
					set22=input.LT(1);
					set22=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set22), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression321);
					unaryExpression23=unaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpression23.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// CLExpr.g:138:1: unaryExpression : ( primaryExpression | NOT ^ primaryExpression | MINUS primaryExpression -> ^( NEGATE primaryExpression ) );
	public final CLExprParser.unaryExpression_return unaryExpression() throws RecognitionException {
		CLExprParser.unaryExpression_return retval = new CLExprParser.unaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT25=null;
		Token MINUS27=null;
		ParserRuleReturnScope primaryExpression24 =null;
		ParserRuleReturnScope primaryExpression26 =null;
		ParserRuleReturnScope primaryExpression28 =null;

		CommonTree NOT25_tree=null;
		CommonTree MINUS27_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");

		try {
			// CLExpr.g:139:2: ( primaryExpression | NOT ^ primaryExpression | MINUS primaryExpression -> ^( NEGATE primaryExpression ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case BINARY_FUN:
			case FLOAT:
			case INTEGER:
			case OPEN_BRACE:
			case SST_FUN:
			case STRING:
			case SWITCH_FUN:
			case TERM:
			case VAR:
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
					// CLExpr.g:140:4: primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primaryExpression_in_unaryExpression338);
					primaryExpression24=primaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, primaryExpression24.getTree());

					}
					break;
				case 2 :
					// CLExpr.g:141:8: NOT ^ primaryExpression
					{
					root_0 = (CommonTree)adaptor.nil();


					NOT25=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression347); 
					NOT25_tree = (CommonTree)adaptor.create(NOT25);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT25_tree, root_0);

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression350);
					primaryExpression26=primaryExpression();
					state._fsp--;

					adaptor.addChild(root_0, primaryExpression26.getTree());

					}
					break;
				case 3 :
					// CLExpr.g:142:8: MINUS primaryExpression
					{
					MINUS27=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression359);  
					stream_MINUS.add(MINUS27);

					pushFollow(FOLLOW_primaryExpression_in_unaryExpression361);
					primaryExpression28=primaryExpression();
					state._fsp--;

					stream_primaryExpression.add(primaryExpression28.getTree());
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
					// 142:32: -> ^( NEGATE primaryExpression )
					{
						// CLExpr.g:142:35: ^( NEGATE primaryExpression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_primaryExpression.nextTree());
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


	public static class primaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// CLExpr.g:145:1: primaryExpression : ( '(' ! logicalExpression ')' !| value );
	public final CLExprParser.primaryExpression_return primaryExpression() throws RecognitionException {
		CLExprParser.primaryExpression_return retval = new CLExprParser.primaryExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal29=null;
		Token char_literal31=null;
		ParserRuleReturnScope logicalExpression30 =null;
		ParserRuleReturnScope value32 =null;

		CommonTree char_literal29_tree=null;
		CommonTree char_literal31_tree=null;

		try {
			// CLExpr.g:146:2: ( '(' ! logicalExpression ')' !| value )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==OPEN_BRACE) ) {
				alt9=1;
			}
			else if ( (LA9_0==BINARY_FUN||LA9_0==FLOAT||LA9_0==INTEGER||(LA9_0 >= SST_FUN && LA9_0 <= SWITCH_FUN)||LA9_0==TERM||LA9_0==VAR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// CLExpr.g:146:4: '(' ! logicalExpression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal29=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_primaryExpression386); 
					pushFollow(FOLLOW_logicalExpression_in_primaryExpression389);
					logicalExpression30=logicalExpression();
					state._fsp--;

					adaptor.addChild(root_0, logicalExpression30.getTree());

					char_literal31=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_primaryExpression391); 
					}
					break;
				case 2 :
					// CLExpr.g:147:4: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_primaryExpression397);
					value32=value();
					state._fsp--;

					adaptor.addChild(root_0, value32.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// CLExpr.g:151:1: value : ( VAR | STRING | TERM | INTEGER | FLOAT | binary_fun | sst_fun | switch_fun );
	public final CLExprParser.value_return value() throws RecognitionException {
		CLExprParser.value_return retval = new CLExprParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token VAR33=null;
		Token STRING34=null;
		Token TERM35=null;
		Token INTEGER36=null;
		Token FLOAT37=null;
		ParserRuleReturnScope binary_fun38 =null;
		ParserRuleReturnScope sst_fun39 =null;
		ParserRuleReturnScope switch_fun40 =null;

		CommonTree VAR33_tree=null;
		CommonTree STRING34_tree=null;
		CommonTree TERM35_tree=null;
		CommonTree INTEGER36_tree=null;
		CommonTree FLOAT37_tree=null;

		try {
			// CLExpr.g:151:7: ( VAR | STRING | TERM | INTEGER | FLOAT | binary_fun | sst_fun | switch_fun )
			int alt10=8;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt10=1;
				}
				break;
			case STRING:
				{
				alt10=2;
				}
				break;
			case TERM:
				{
				alt10=3;
				}
				break;
			case INTEGER:
				{
				alt10=4;
				}
				break;
			case FLOAT:
				{
				alt10=5;
				}
				break;
			case BINARY_FUN:
				{
				alt10=6;
				}
				break;
			case SST_FUN:
				{
				alt10=7;
				}
				break;
			case SWITCH_FUN:
				{
				alt10=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// CLExpr.g:153:2: VAR
					{
					root_0 = (CommonTree)adaptor.nil();


					VAR33=(Token)match(input,VAR,FOLLOW_VAR_in_value410); 
					VAR33_tree = (CommonTree)adaptor.create(VAR33);
					adaptor.addChild(root_0, VAR33_tree);

					}
					break;
				case 2 :
					// CLExpr.g:155:2: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING34=(Token)match(input,STRING,FOLLOW_STRING_in_value416); 
					STRING34_tree = (CommonTree)adaptor.create(STRING34);
					adaptor.addChild(root_0, STRING34_tree);

					}
					break;
				case 3 :
					// CLExpr.g:157:2: TERM
					{
					root_0 = (CommonTree)adaptor.nil();


					TERM35=(Token)match(input,TERM,FOLLOW_TERM_in_value422); 
					TERM35_tree = (CommonTree)adaptor.create(TERM35);
					adaptor.addChild(root_0, TERM35_tree);

					}
					break;
				case 4 :
					// CLExpr.g:159:2: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER36=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_value428); 
					INTEGER36_tree = (CommonTree)adaptor.create(INTEGER36);
					adaptor.addChild(root_0, INTEGER36_tree);

					}
					break;
				case 5 :
					// CLExpr.g:161:2: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT37=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_value434); 
					FLOAT37_tree = (CommonTree)adaptor.create(FLOAT37);
					adaptor.addChild(root_0, FLOAT37_tree);

					}
					break;
				case 6 :
					// CLExpr.g:163:2: binary_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_binary_fun_in_value440);
					binary_fun38=binary_fun();
					state._fsp--;

					adaptor.addChild(root_0, binary_fun38.getTree());

					}
					break;
				case 7 :
					// CLExpr.g:165:2: sst_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sst_fun_in_value446);
					sst_fun39=sst_fun();
					state._fsp--;

					adaptor.addChild(root_0, sst_fun39.getTree());

					}
					break;
				case 8 :
					// CLExpr.g:167:2: switch_fun
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_switch_fun_in_value452);
					switch_fun40=switch_fun();
					state._fsp--;

					adaptor.addChild(root_0, switch_fun40.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class binary_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binary_fun"
	// CLExpr.g:170:1: binary_fun : BINARY_FUN '(' ( value )? ')' -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? ) ;
	public final CLExprParser.binary_fun_return binary_fun() throws RecognitionException {
		CLExprParser.binary_fun_return retval = new CLExprParser.binary_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token BINARY_FUN41=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope value43 =null;

		CommonTree BINARY_FUN41_tree=null;
		CommonTree char_literal42_tree=null;
		CommonTree char_literal44_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_BINARY_FUN=new RewriteRuleTokenStream(adaptor,"token BINARY_FUN");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// CLExpr.g:171:2: ( BINARY_FUN '(' ( value )? ')' -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? ) )
			// CLExpr.g:172:3: BINARY_FUN '(' ( value )? ')'
			{
			BINARY_FUN41=(Token)match(input,BINARY_FUN,FOLLOW_BINARY_FUN_in_binary_fun465);  
			stream_BINARY_FUN.add(BINARY_FUN41);

			char_literal42=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_binary_fun467);  
			stream_OPEN_BRACE.add(char_literal42);

			// CLExpr.g:172:18: ( value )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BINARY_FUN||LA11_0==FLOAT||LA11_0==INTEGER||(LA11_0 >= SST_FUN && LA11_0 <= SWITCH_FUN)||LA11_0==TERM||LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// CLExpr.g:172:18: value
					{
					pushFollow(FOLLOW_value_in_binary_fun469);
					value43=value();
					state._fsp--;

					stream_value.add(value43.getTree());
					}
					break;

			}

			char_literal44=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_binary_fun472);  
			stream_CLOSE_BRACE.add(char_literal44);

			// AST REWRITE
			// elements: value, BINARY_FUN
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 172:29: -> ^( BINARY_FUN[$BINARY_FUN.text] ( value )? )
			{
				// CLExpr.g:172:32: ^( BINARY_FUN[$BINARY_FUN.text] ( value )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BINARY_FUN, (BINARY_FUN41!=null?BINARY_FUN41.getText():null)), root_1);
				// CLExpr.g:172:63: ( value )?
				if ( stream_value.hasNext() ) {
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "binary_fun"


	public static class sst_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sst_fun"
	// CLExpr.g:175:1: sst_fun : SST_FUN '(' value value value ')' -> ^( SST_FUN[$SST_FUN.text] value value value ) ;
	public final CLExprParser.sst_fun_return sst_fun() throws RecognitionException {
		CLExprParser.sst_fun_return retval = new CLExprParser.sst_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SST_FUN45=null;
		Token char_literal46=null;
		Token char_literal50=null;
		ParserRuleReturnScope value47 =null;
		ParserRuleReturnScope value48 =null;
		ParserRuleReturnScope value49 =null;

		CommonTree SST_FUN45_tree=null;
		CommonTree char_literal46_tree=null;
		CommonTree char_literal50_tree=null;
		RewriteRuleTokenStream stream_SST_FUN=new RewriteRuleTokenStream(adaptor,"token SST_FUN");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// CLExpr.g:176:2: ( SST_FUN '(' value value value ')' -> ^( SST_FUN[$SST_FUN.text] value value value ) )
			// CLExpr.g:177:3: SST_FUN '(' value value value ')'
			{
			SST_FUN45=(Token)match(input,SST_FUN,FOLLOW_SST_FUN_in_sst_fun496);  
			stream_SST_FUN.add(SST_FUN45);

			char_literal46=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_sst_fun498);  
			stream_OPEN_BRACE.add(char_literal46);

			pushFollow(FOLLOW_value_in_sst_fun500);
			value47=value();
			state._fsp--;

			stream_value.add(value47.getTree());
			pushFollow(FOLLOW_value_in_sst_fun502);
			value48=value();
			state._fsp--;

			stream_value.add(value48.getTree());
			pushFollow(FOLLOW_value_in_sst_fun504);
			value49=value();
			state._fsp--;

			stream_value.add(value49.getTree());
			char_literal50=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_sst_fun506);  
			stream_CLOSE_BRACE.add(char_literal50);

			// AST REWRITE
			// elements: value, SST_FUN, value, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 177:37: -> ^( SST_FUN[$SST_FUN.text] value value value )
			{
				// CLExpr.g:177:40: ^( SST_FUN[$SST_FUN.text] value value value )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SST_FUN, (SST_FUN45!=null?SST_FUN45.getText():null)), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "sst_fun"


	public static class switch_fun_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "switch_fun"
	// CLExpr.g:180:1: switch_fun : SWITCH_FUN '(' SWITCH_VALUE ')' -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE ) ;
	public final CLExprParser.switch_fun_return switch_fun() throws RecognitionException {
		CLExprParser.switch_fun_return retval = new CLExprParser.switch_fun_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SWITCH_FUN51=null;
		Token char_literal52=null;
		Token SWITCH_VALUE53=null;
		Token char_literal54=null;

		CommonTree SWITCH_FUN51_tree=null;
		CommonTree char_literal52_tree=null;
		CommonTree SWITCH_VALUE53_tree=null;
		CommonTree char_literal54_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_SWITCH_FUN=new RewriteRuleTokenStream(adaptor,"token SWITCH_FUN");
		RewriteRuleTokenStream stream_SWITCH_VALUE=new RewriteRuleTokenStream(adaptor,"token SWITCH_VALUE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");

		try {
			// CLExpr.g:181:2: ( SWITCH_FUN '(' SWITCH_VALUE ')' -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE ) )
			// CLExpr.g:182:3: SWITCH_FUN '(' SWITCH_VALUE ')'
			{
			SWITCH_FUN51=(Token)match(input,SWITCH_FUN,FOLLOW_SWITCH_FUN_in_switch_fun535);  
			stream_SWITCH_FUN.add(SWITCH_FUN51);

			char_literal52=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_switch_fun537);  
			stream_OPEN_BRACE.add(char_literal52);

			SWITCH_VALUE53=(Token)match(input,SWITCH_VALUE,FOLLOW_SWITCH_VALUE_in_switch_fun539);  
			stream_SWITCH_VALUE.add(SWITCH_VALUE53);

			char_literal54=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_switch_fun541);  
			stream_CLOSE_BRACE.add(char_literal54);

			// AST REWRITE
			// elements: SWITCH_FUN, SWITCH_VALUE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 182:35: -> ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE )
			{
				// CLExpr.g:182:38: ^( SWITCH_FUN[$SWITCH_FUN.text] SWITCH_VALUE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SWITCH_FUN, (SWITCH_FUN51!=null?SWITCH_FUN51.getText():null)), root_1);
				adaptor.addChild(root_1, stream_SWITCH_VALUE.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "switch_fun"

	// Delegated rules



	public static final BitSet FOLLOW_logicalExpression_in_expression139 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_expression142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression158 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression161 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression164 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression178 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression181 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression184 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression197 = new BitSet(new long[]{0x0000002000040002L});
	public static final BitSet FOLLOW_set_in_equalityExpression200 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression207 = new BitSet(new long[]{0x0000002000040002L});
	public static final BitSet FOLLOW_concatExpression_in_relationalExpression220 = new BitSet(new long[]{0x0000018180C00002L});
	public static final BitSet FOLLOW_set_in_relationalExpression224 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_concatExpression_in_relationalExpression239 = new BitSet(new long[]{0x0000018180C00002L});
	public static final BitSet FOLLOW_additiveExpression_in_concatExpression255 = new BitSet(new long[]{0x0080000000000482L});
	public static final BitSet FOLLOW_set_in_concatExpression259 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_additiveExpression_in_concatExpression268 = new BitSet(new long[]{0x0080000000000482L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression283 = new BitSet(new long[]{0x0000400400000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression287 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression294 = new BitSet(new long[]{0x0000400400000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression310 = new BitSet(new long[]{0x0000000800010002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression314 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression321 = new BitSet(new long[]{0x0000000800010002L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression347 = new BitSet(new long[]{0x091C080004100100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpression359 = new BitSet(new long[]{0x091C080004100100L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_primaryExpression386 = new BitSet(new long[]{0x091C0A0404100100L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression389 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_primaryExpression391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_primaryExpression397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_value410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERM_in_value422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_value428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_value434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_fun_in_value440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sst_fun_in_value446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_fun_in_value452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINARY_FUN_in_binary_fun465 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_binary_fun467 = new BitSet(new long[]{0x091C000004101100L});
	public static final BitSet FOLLOW_value_in_binary_fun469 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_binary_fun472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SST_FUN_in_sst_fun496 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_sst_fun498 = new BitSet(new long[]{0x091C000004100100L});
	public static final BitSet FOLLOW_value_in_sst_fun500 = new BitSet(new long[]{0x091C000004100100L});
	public static final BitSet FOLLOW_value_in_sst_fun502 = new BitSet(new long[]{0x091C000004100100L});
	public static final BitSet FOLLOW_value_in_sst_fun504 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_sst_fun506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_FUN_in_switch_fun535 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_switch_fun537 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SWITCH_VALUE_in_switch_fun539 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_switch_fun541 = new BitSet(new long[]{0x0000000000000002L});
}
