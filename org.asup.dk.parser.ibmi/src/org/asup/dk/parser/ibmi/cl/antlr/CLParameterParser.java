// $ANTLR 3.5.1 CLParameter.g 2014-09-11 14:39:44

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
				if ( (LA1_0==FUNCTION_NAME||LA1_0==OPEN_BRACE||(LA1_0 >= SPECIAL && LA1_0 <= STRING)||(LA1_0 >= TOKEN && LA1_0 <= VARIABLE)) ) {
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
	// CLParameter.g:72:2: elem : ( value | list | string_operator );
	public final CLParameterParser.elem_return elem() throws RecognitionException {
		CLParameterParser.elem_return retval = new CLParameterParser.elem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value2 =null;
		ParserRuleReturnScope list3 =null;
		ParserRuleReturnScope string_operator4 =null;


		try {
			// CLParameter.g:72:7: ( value | list | string_operator )
			int alt2=3;
			switch ( input.LA(1) ) {
			case TOKEN:
				{
				alt2=1;
				}
				break;
			case VARIABLE:
				{
				alt2=1;
				}
				break;
			case FUNCTION_NAME:
			case SPECIAL:
				{
				alt2=1;
				}
				break;
			case OPEN_BRACE:
				{
				alt2=2;
				}
				break;
			case STRING:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// CLParameter.g:73:2: value
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_value_in_elem137);
					value2=value();
					state._fsp--;

					adaptor.addChild(root_0, value2.getTree());

					}
					break;
				case 2 :
					// CLParameter.g:73:8: list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_elem139);
					list3=list();
					state._fsp--;

					adaptor.addChild(root_0, list3.getTree());

					}
					break;
				case 3 :
					// CLParameter.g:73:13: string_operator
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_operator_in_elem141);
					string_operator4=string_operator();
					state._fsp--;

					adaptor.addChild(root_0, string_operator4.getTree());

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

		Token OPEN_BRACE5=null;
		Token CLOSE_BRACE7=null;
		ParserRuleReturnScope elem6 =null;

		CommonTree OPEN_BRACE5_tree=null;
		CommonTree CLOSE_BRACE7_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// CLParameter.g:77:3: ( OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[$list.text] ( elem )* ) )
			// CLParameter.g:78:3: OPEN_BRACE ( elem )* CLOSE_BRACE
			{
			OPEN_BRACE5=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_list161);  
			stream_OPEN_BRACE.add(OPEN_BRACE5);

			// CLParameter.g:78:14: ( elem )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==FUNCTION_NAME||LA3_0==OPEN_BRACE||(LA3_0 >= SPECIAL && LA3_0 <= STRING)||(LA3_0 >= TOKEN && LA3_0 <= VARIABLE)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CLParameter.g:78:15: elem
					{
					pushFollow(FOLLOW_elem_in_list164);
					elem6=elem();
					state._fsp--;

					stream_elem.add(elem6.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			CLOSE_BRACE7=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_list168);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE7);

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


	public static class string_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string_operator"
	// CLParameter.g:81:1: string_operator : ( string | string CAT string_operator -> ^( STR_OPERATOR[\"*CAT\"] string string_operator ) | string BCAT string_operator -> ^( STR_OPERATOR[\"*BCAT\"] string string_operator ) | string TCAT string_operator -> ^( STR_OPERATOR[\"*TCAT\"] string string_operator ) );
	public final CLParameterParser.string_operator_return string_operator() throws RecognitionException {
		CLParameterParser.string_operator_return retval = new CLParameterParser.string_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CAT10=null;
		Token BCAT13=null;
		Token TCAT16=null;
		ParserRuleReturnScope string8 =null;
		ParserRuleReturnScope string9 =null;
		ParserRuleReturnScope string_operator11 =null;
		ParserRuleReturnScope string12 =null;
		ParserRuleReturnScope string_operator14 =null;
		ParserRuleReturnScope string15 =null;
		ParserRuleReturnScope string_operator17 =null;

		CommonTree CAT10_tree=null;
		CommonTree BCAT13_tree=null;
		CommonTree TCAT16_tree=null;
		RewriteRuleTokenStream stream_BCAT=new RewriteRuleTokenStream(adaptor,"token BCAT");
		RewriteRuleTokenStream stream_TCAT=new RewriteRuleTokenStream(adaptor,"token TCAT");
		RewriteRuleTokenStream stream_CAT=new RewriteRuleTokenStream(adaptor,"token CAT");
		RewriteRuleSubtreeStream stream_string=new RewriteRuleSubtreeStream(adaptor,"rule string");
		RewriteRuleSubtreeStream stream_string_operator=new RewriteRuleSubtreeStream(adaptor,"rule string_operator");

		try {
			// CLParameter.g:82:3: ( string | string CAT string_operator -> ^( STR_OPERATOR[\"*CAT\"] string string_operator ) | string BCAT string_operator -> ^( STR_OPERATOR[\"*BCAT\"] string string_operator ) | string TCAT string_operator -> ^( STR_OPERATOR[\"*TCAT\"] string string_operator ) )
			int alt4=4;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= SPECIAL && LA4_0 <= STRING)||LA4_0==VARIABLE) ) {
				switch ( input.LA(2) ) {
				case EOF:
				case CLOSE_BRACE:
				case FUNCTION_NAME:
				case OPEN_BRACE:
				case SPECIAL:
				case STRING:
				case TOKEN:
				case VARIABLE:
					{
					alt4=1;
					}
					break;
				case CAT:
					{
					alt4=2;
					}
					break;
				case BCAT:
					{
					alt4=3;
					}
					break;
				case TCAT:
					{
					alt4=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CLParameter.g:83:3: string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_in_string_operator201);
					string8=string();
					state._fsp--;

					adaptor.addChild(root_0, string8.getTree());

					}
					break;
				case 2 :
					// CLParameter.g:85:3: string CAT string_operator
					{
					pushFollow(FOLLOW_string_in_string_operator209);
					string9=string();
					state._fsp--;

					stream_string.add(string9.getTree());
					CAT10=(Token)match(input,CAT,FOLLOW_CAT_in_string_operator211);  
					stream_CAT.add(CAT10);

					pushFollow(FOLLOW_string_operator_in_string_operator213);
					string_operator11=string_operator();
					state._fsp--;

					stream_string_operator.add(string_operator11.getTree());
					// AST REWRITE
					// elements: string_operator, string
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 85:31: -> ^( STR_OPERATOR[\"*CAT\"] string string_operator )
					{
						// CLParameter.g:85:34: ^( STR_OPERATOR[\"*CAT\"] string string_operator )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*CAT"), root_1);
						adaptor.addChild(root_1, stream_string.nextTree());
						adaptor.addChild(root_1, stream_string_operator.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// CLParameter.g:87:3: string BCAT string_operator
					{
					pushFollow(FOLLOW_string_in_string_operator233);
					string12=string();
					state._fsp--;

					stream_string.add(string12.getTree());
					BCAT13=(Token)match(input,BCAT,FOLLOW_BCAT_in_string_operator235);  
					stream_BCAT.add(BCAT13);

					pushFollow(FOLLOW_string_operator_in_string_operator237);
					string_operator14=string_operator();
					state._fsp--;

					stream_string_operator.add(string_operator14.getTree());
					// AST REWRITE
					// elements: string_operator, string
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 87:31: -> ^( STR_OPERATOR[\"*BCAT\"] string string_operator )
					{
						// CLParameter.g:87:34: ^( STR_OPERATOR[\"*BCAT\"] string string_operator )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*BCAT"), root_1);
						adaptor.addChild(root_1, stream_string.nextTree());
						adaptor.addChild(root_1, stream_string_operator.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// CLParameter.g:89:3: string TCAT string_operator
					{
					pushFollow(FOLLOW_string_in_string_operator256);
					string15=string();
					state._fsp--;

					stream_string.add(string15.getTree());
					TCAT16=(Token)match(input,TCAT,FOLLOW_TCAT_in_string_operator258);  
					stream_TCAT.add(TCAT16);

					pushFollow(FOLLOW_string_operator_in_string_operator260);
					string_operator17=string_operator();
					state._fsp--;

					stream_string_operator.add(string_operator17.getTree());
					// AST REWRITE
					// elements: string, string_operator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 89:31: -> ^( STR_OPERATOR[\"*TCAT\"] string string_operator )
					{
						// CLParameter.g:89:34: ^( STR_OPERATOR[\"*TCAT\"] string string_operator )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STR_OPERATOR, "*TCAT"), root_1);
						adaptor.addChild(root_1, stream_string.nextTree());
						adaptor.addChild(root_1, stream_string_operator.nextTree());
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


	public static class string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// CLParameter.g:92:2: string : ( VARIABLE | SPECIAL | STRING );
	public final CLParameterParser.string_return string() throws RecognitionException {
		CLParameterParser.string_return retval = new CLParameterParser.string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set18=null;

		CommonTree set18_tree=null;

		try {
			// CLParameter.g:93:3: ( VARIABLE | SPECIAL | STRING )
			// CLParameter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set18=input.LT(1);
			if ( (input.LA(1) >= SPECIAL && input.LA(1) <= STRING)||input.LA(1)==VARIABLE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set18));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "string"


	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// CLParameter.g:97:1: value : ( TOKEN | VARIABLE | SPECIAL | function );
	public final CLParameterParser.value_return value() throws RecognitionException {
		CLParameterParser.value_return retval = new CLParameterParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN19=null;
		Token VARIABLE20=null;
		Token SPECIAL21=null;
		ParserRuleReturnScope function22 =null;

		CommonTree TOKEN19_tree=null;
		CommonTree VARIABLE20_tree=null;
		CommonTree SPECIAL21_tree=null;

		try {
			// CLParameter.g:98:3: ( TOKEN | VARIABLE | SPECIAL | function )
			int alt5=4;
			switch ( input.LA(1) ) {
			case TOKEN:
				{
				alt5=1;
				}
				break;
			case VARIABLE:
				{
				alt5=2;
				}
				break;
			case SPECIAL:
				{
				alt5=3;
				}
				break;
			case FUNCTION_NAME:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// CLParameter.g:99:3: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN19=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_value313); 
					TOKEN19_tree = (CommonTree)adaptor.create(TOKEN19);
					adaptor.addChild(root_0, TOKEN19_tree);

					}
					break;
				case 2 :
					// CLParameter.g:101:3: VARIABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					VARIABLE20=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_value321); 
					VARIABLE20_tree = (CommonTree)adaptor.create(VARIABLE20);
					adaptor.addChild(root_0, VARIABLE20_tree);

					}
					break;
				case 3 :
					// CLParameter.g:103:3: SPECIAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SPECIAL21=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value329); 
					SPECIAL21_tree = (CommonTree)adaptor.create(SPECIAL21);
					adaptor.addChild(root_0, SPECIAL21_tree);

					}
					break;
				case 4 :
					// CLParameter.g:105:3: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_value337);
					function22=function();
					state._fsp--;

					adaptor.addChild(root_0, function22.getTree());

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
	// CLParameter.g:108:1: function : FUNCTION_NAME list -> ^( FUNCTION[$FUNCTION_NAME.text] list ) ;
	public final CLParameterParser.function_return function() throws RecognitionException {
		CLParameterParser.function_return retval = new CLParameterParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUNCTION_NAME23=null;
		ParserRuleReturnScope list24 =null;

		CommonTree FUNCTION_NAME23_tree=null;
		RewriteRuleTokenStream stream_FUNCTION_NAME=new RewriteRuleTokenStream(adaptor,"token FUNCTION_NAME");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// CLParameter.g:108:9: ( FUNCTION_NAME list -> ^( FUNCTION[$FUNCTION_NAME.text] list ) )
			// CLParameter.g:109:3: FUNCTION_NAME list
			{
			FUNCTION_NAME23=(Token)match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_function355);  
			stream_FUNCTION_NAME.add(FUNCTION_NAME23);

			pushFollow(FOLLOW_list_in_function357);
			list24=list();
			state._fsp--;

			stream_list.add(list24.getTree());
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
			// 109:22: -> ^( FUNCTION[$FUNCTION_NAME.text] list )
			{
				// CLParameter.g:109:25: ^( FUNCTION[$FUNCTION_NAME.text] list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, (FUNCTION_NAME23!=null?FUNCTION_NAME23.getText():null)), root_1);
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

	// Delegated rules



	public static final BitSet FOLLOW_elem_in_parse107 = new BitSet(new long[]{0x0000000000335002L});
	public static final BitSet FOLLOW_value_in_elem137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_elem139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_operator_in_elem141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_list161 = new BitSet(new long[]{0x0000000000335100L});
	public static final BitSet FOLLOW_elem_in_list164 = new BitSet(new long[]{0x0000000000335100L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_list168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_string_operator201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_string_operator209 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CAT_in_string_operator211 = new BitSet(new long[]{0x0000000000230000L});
	public static final BitSet FOLLOW_string_operator_in_string_operator213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_string_operator233 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BCAT_in_string_operator235 = new BitSet(new long[]{0x0000000000230000L});
	public static final BitSet FOLLOW_string_operator_in_string_operator237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_string_operator256 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TCAT_in_string_operator258 = new BitSet(new long[]{0x0000000000230000L});
	public static final BitSet FOLLOW_string_operator_in_string_operator260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_value313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_value321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_value337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_NAME_in_function355 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_list_in_function357 = new BitSet(new long[]{0x0000000000000002L});
}
