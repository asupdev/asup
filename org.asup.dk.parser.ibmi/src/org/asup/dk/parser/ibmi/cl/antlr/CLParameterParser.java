// $ANTLR 3.5.1 CLParameter.g 2014-03-14 12:10:16

  package org.asup.dk.parser.ibmi.cl.antlr;

  import org.asup.dk.parser.ibmi.cl.util.CLParserHelper;


import org.antlr.runtime.*;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CLParameterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APOS", "BCAT", "CAT", "CHAR_SPECIAL", 
		"CLOSE_BRACE", "COMMENT", "CR", "FUNCTION", "FUNCTION_NAME", "LIST", "OPEN_BRACE", 
		"PAR", "SPECIAL", "STRING", "STR_OPERATOR", "TCAT", "TOKEN", "VARIABLE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int APOS=4;
	public static final int BCAT=5;
	public static final int CAT=6;
	public static final int CHAR_SPECIAL=7;
	public static final int CLOSE_BRACE=8;
	public static final int COMMENT=9;
	public static final int CR=10;
	public static final int FUNCTION=11;
	public static final int FUNCTION_NAME=12;
	public static final int LIST=13;
	public static final int OPEN_BRACE=14;
	public static final int PAR=15;
	public static final int SPECIAL=16;
	public static final int STRING=17;
	public static final int STR_OPERATOR=18;
	public static final int TCAT=19;
	public static final int TOKEN=20;
	public static final int VARIABLE=21;
	public static final int WS=22;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CLParameterParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CLParameterParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CLParameterParser.tokenNames; }
	@Override public String getGrammarFileName() { return "CLParameter.g"; }



	   public CLParserHelper hlp = new CLParserHelper(this);
	   
	   @Override
	  	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    	throw new MismatchedTokenException(ttype, input);
	  	}

	   @Override
	   public void reportError(RecognitionException e) {
	      super.reportError(e);
	      RuntimeException re = hlp.createException(e);
	      recover(input, e);
	      throw re;
	   }
	   
	   @Override
	  	public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    	throw e;
	    }
	  



	public static class parse_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// CLParameter.g:67:1: parse : ( elem )* -> ^( PAR[$parse.text] ( elem )* ) ;
	public final CLParameterParser.parse_return parse() throws RecognitionException {
		CLParameterParser.parse_return retval = new CLParameterParser.parse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope elem1 =null;

		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// CLParameter.g:68:3: ( ( elem )* -> ^( PAR[$parse.text] ( elem )* ) )
			// CLParameter.g:69:3: ( elem )*
			{
			// CLParameter.g:69:3: ( elem )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BCAT && LA1_0 <= CAT)||LA1_0==FUNCTION_NAME||LA1_0==OPEN_BRACE||(LA1_0 >= SPECIAL && LA1_0 <= STRING)||(LA1_0 >= TCAT && LA1_0 <= VARIABLE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// CLParameter.g:69:4: elem
					{
					pushFollow(FOLLOW_elem_in_parse107);
					elem1=elem();
					state._fsp--;

					stream_elem.add(elem1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: elem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:11: -> ^( PAR[$parse.text] ( elem )* )
			{
				// CLParameter.g:69:14: ^( PAR[$parse.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PAR, input.toString(retval.start,input.LT(-1))), root_1);
				// CLParameter.g:69:33: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

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
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class elem_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "elem"
	// CLParameter.g:72:1: elem : ( value | list );
	public final CLParameterParser.elem_return elem() throws RecognitionException {
		CLParameterParser.elem_return retval = new CLParameterParser.elem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value2 =null;
		ParserRuleReturnScope list3 =null;


		try {
			// CLParameter.g:72:6: ( value | list )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= BCAT && LA2_0 <= CAT)||LA2_0==FUNCTION_NAME||(LA2_0 >= SPECIAL && LA2_0 <= STRING)||(LA2_0 >= TCAT && LA2_0 <= VARIABLE)) ) {
				alt2=1;
			}
			else if ( (LA2_0==OPEN_BRACE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// CLParameter.g:73:2: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_elem136);
					value2=value();
					state._fsp--;

					adaptor.addChild(root_0, value2.getTree());

					}
					break;
				case 2 :
					// CLParameter.g:73:8: list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_elem138);
					list3=list();
					state._fsp--;

					adaptor.addChild(root_0, list3.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elem"


	public static class list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list"
	// CLParameter.g:76:1: list : OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) ;
	public final CLParameterParser.list_return list() throws RecognitionException {
		CLParameterParser.list_return retval = new CLParameterParser.list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE4=null;
		Token CLOSE_BRACE6=null;
		ParserRuleReturnScope elem5 =null;

		CommonTree OPEN_BRACE4_tree=null;
		CommonTree CLOSE_BRACE6_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// CLParameter.g:77:3: ( OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) )
			// CLParameter.g:78:3: OPEN_BRACE ( elem )* CLOSE_BRACE
			{
			OPEN_BRACE4=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_list158);  
			stream_OPEN_BRACE.add(OPEN_BRACE4);

			// CLParameter.g:78:14: ( elem )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= BCAT && LA3_0 <= CAT)||LA3_0==FUNCTION_NAME||LA3_0==OPEN_BRACE||(LA3_0 >= SPECIAL && LA3_0 <= STRING)||(LA3_0 >= TCAT && LA3_0 <= VARIABLE)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CLParameter.g:78:15: elem
					{
					pushFollow(FOLLOW_elem_in_list161);
					elem5=elem();
					state._fsp--;

					stream_elem.add(elem5.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			CLOSE_BRACE6=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_list165);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE6);

			// AST REWRITE
			// elements: elem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 78:34: -> ^( LIST[$list.text] ( elem )* )
			{
				// CLParameter.g:78:37: ^( LIST[$list.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, input.toString(retval.start,input.LT(-1))), root_1);
				// CLParameter.g:78:57: ( elem )*
				while ( stream_elem.hasNext() ) {
					adaptor.addChild(root_1, stream_elem.nextTree());
				}
				stream_elem.reset();

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
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// CLParameter.g:81:1: value : ( TOKEN | VARIABLE | SPECIAL | STRING | function | string_operator );
	public final CLParameterParser.value_return value() throws RecognitionException {
		CLParameterParser.value_return retval = new CLParameterParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN7=null;
		Token VARIABLE8=null;
		Token SPECIAL9=null;
		Token STRING10=null;
		ParserRuleReturnScope function11 =null;
		ParserRuleReturnScope string_operator12 =null;

		CommonTree TOKEN7_tree=null;
		CommonTree VARIABLE8_tree=null;
		CommonTree SPECIAL9_tree=null;
		CommonTree STRING10_tree=null;

		try {
			// CLParameter.g:82:3: ( TOKEN | VARIABLE | SPECIAL | STRING | function | string_operator )
			int alt4=6;
			switch ( input.LA(1) ) {
			case TOKEN:
				{
				alt4=1;
				}
				break;
			case VARIABLE:
				{
				alt4=2;
				}
				break;
			case SPECIAL:
				{
				alt4=3;
				}
				break;
			case STRING:
				{
				alt4=4;
				}
				break;
			case FUNCTION_NAME:
				{
				alt4=5;
				}
				break;
			case BCAT:
			case CAT:
			case TCAT:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// CLParameter.g:83:3: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN7=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_value198); 
					TOKEN7_tree = (CommonTree)adaptor.create(TOKEN7);
					adaptor.addChild(root_0, TOKEN7_tree);

					}
					break;
				case 2 :
					// CLParameter.g:85:3: VARIABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					VARIABLE8=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_value206); 
					VARIABLE8_tree = (CommonTree)adaptor.create(VARIABLE8);
					adaptor.addChild(root_0, VARIABLE8_tree);

					}
					break;
				case 3 :
					// CLParameter.g:87:3: SPECIAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SPECIAL9=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value214); 
					SPECIAL9_tree = (CommonTree)adaptor.create(SPECIAL9);
					adaptor.addChild(root_0, SPECIAL9_tree);

					}
					break;
				case 4 :
					// CLParameter.g:89:3: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_value222); 
					STRING10_tree = (CommonTree)adaptor.create(STRING10);
					adaptor.addChild(root_0, STRING10_tree);

					}
					break;
				case 5 :
					// CLParameter.g:91:3: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_value230);
					function11=function();
					state._fsp--;

					adaptor.addChild(root_0, function11.getTree());

					}
					break;
				case 6 :
					// CLParameter.g:93:3: string_operator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_operator_in_value238);
					string_operator12=string_operator();
					state._fsp--;

					adaptor.addChild(root_0, string_operator12.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (RecognitionException e) {
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// CLParameter.g:96:1: function : FUNCTION_NAME list -> ^( FUNCTION[$FUNCTION_NAME.text] list ) ;
	public final CLParameterParser.function_return function() throws RecognitionException {
		CLParameterParser.function_return retval = new CLParameterParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUNCTION_NAME13=null;
		ParserRuleReturnScope list14 =null;

		CommonTree FUNCTION_NAME13_tree=null;
		RewriteRuleTokenStream stream_FUNCTION_NAME=new RewriteRuleTokenStream(adaptor,"token FUNCTION_NAME");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// CLParameter.g:96:9: ( FUNCTION_NAME list -> ^( FUNCTION[$FUNCTION_NAME.text] list ) )
			// CLParameter.g:97:3: FUNCTION_NAME list
			{
			FUNCTION_NAME13=(Token)match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_function254);  
			stream_FUNCTION_NAME.add(FUNCTION_NAME13);

			pushFollow(FOLLOW_list_in_function256);
			list14=list();
			state._fsp--;

			stream_list.add(list14.getTree());
			// AST REWRITE
			// elements: list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 97:22: -> ^( FUNCTION[$FUNCTION_NAME.text] list )
			{
				// CLParameter.g:97:25: ^( FUNCTION[$FUNCTION_NAME.text] list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (FUNCTION_NAME13!=null?FUNCTION_NAME13.getText():null)), root_1);
				adaptor.addChild(root_1, stream_list.nextTree());
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
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class string_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string_operator"
	// CLParameter.g:100:1: string_operator : ( CAT -> ^( STR_OPERATOR[\"*CAT\"] ) | BCAT -> ^( STR_OPERATOR[\"*BCAT\"] ) | TCAT -> ^( STR_OPERATOR[\"*TCAT\"] ) );
	public final CLParameterParser.string_operator_return string_operator() throws RecognitionException {
		CLParameterParser.string_operator_return retval = new CLParameterParser.string_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAT15=null;
		Token BCAT16=null;
		Token TCAT17=null;

		CommonTree CAT15_tree=null;
		CommonTree BCAT16_tree=null;
		CommonTree TCAT17_tree=null;
		RewriteRuleTokenStream stream_BCAT=new RewriteRuleTokenStream(adaptor,"token BCAT");
		RewriteRuleTokenStream stream_TCAT=new RewriteRuleTokenStream(adaptor,"token TCAT");
		RewriteRuleTokenStream stream_CAT=new RewriteRuleTokenStream(adaptor,"token CAT");

		try {
			// CLParameter.g:100:16: ( CAT -> ^( STR_OPERATOR[\"*CAT\"] ) | BCAT -> ^( STR_OPERATOR[\"*BCAT\"] ) | TCAT -> ^( STR_OPERATOR[\"*TCAT\"] ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case CAT:
				{
				alt5=1;
				}
				break;
			case BCAT:
				{
				alt5=2;
				}
				break;
			case TCAT:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// CLParameter.g:101:3: CAT
					{
					CAT15=(Token)match(input,CAT,FOLLOW_CAT_in_string_operator277);  
					stream_CAT.add(CAT15);

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
					// 101:7: -> ^( STR_OPERATOR[\"*CAT\"] )
					{
						// CLParameter.g:101:10: ^( STR_OPERATOR[\"*CAT\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*CAT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CLParameter.g:103:3: BCAT
					{
					BCAT16=(Token)match(input,BCAT,FOLLOW_BCAT_in_string_operator292);  
					stream_BCAT.add(BCAT16);

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
					// 103:8: -> ^( STR_OPERATOR[\"*BCAT\"] )
					{
						// CLParameter.g:103:11: ^( STR_OPERATOR[\"*BCAT\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*BCAT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// CLParameter.g:105:3: TCAT
					{
					TCAT17=(Token)match(input,TCAT,FOLLOW_TCAT_in_string_operator307);  
					stream_TCAT.add(TCAT17);

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
					// 105:8: -> ^( STR_OPERATOR[\"*TCAT\"] )
					{
						// CLParameter.g:105:11: ^( STR_OPERATOR[\"*TCAT\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*TCAT"), root_1);
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
		        RuntimeException re = hlp.createException(e);
		        throw re;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string_operator"

	// Delegated rules



	public static final BitSet FOLLOW_elem_in_parse107 = new BitSet(new long[]{0x00000000003B5062L});
	public static final BitSet FOLLOW_value_in_elem136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_elem138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_list158 = new BitSet(new long[]{0x00000000003B5160L});
	public static final BitSet FOLLOW_elem_in_list161 = new BitSet(new long[]{0x00000000003B5160L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_list165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_value198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_value206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_value230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_operator_in_value238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_NAME_in_function254 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_list_in_function256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAT_in_string_operator277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BCAT_in_string_operator292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TCAT_in_string_operator307 = new BitSet(new long[]{0x0000000000000002L});
}
