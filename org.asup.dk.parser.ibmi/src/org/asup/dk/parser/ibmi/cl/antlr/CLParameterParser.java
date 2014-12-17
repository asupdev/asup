// $ANTLR 3.5.1 CLParameter.g 2014-12-17 18:27:50

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APOS", "ASTERISK", "BCAT", "CAT", 
		"CHAR_SPECIAL", "CLOSE_BRACE", "COMMENT", "CR", "FILTER", "FUNCTION", 
		"FUNCTION_NAME", "HEX", "LIST", "OPEN_BRACE", "SPECIAL", "STRING", "TCAT", 
		"TOKEN", "VALUE", "VARIABLE", "WS"
	};
	public static final int EOF=-1;
	public static final int APOS=4;
	public static final int ASTERISK=5;
	public static final int BCAT=6;
	public static final int CAT=7;
	public static final int CHAR_SPECIAL=8;
	public static final int CLOSE_BRACE=9;
	public static final int COMMENT=10;
	public static final int CR=11;
	public static final int FILTER=12;
	public static final int FUNCTION=13;
	public static final int FUNCTION_NAME=14;
	public static final int HEX=15;
	public static final int LIST=16;
	public static final int OPEN_BRACE=17;
	public static final int SPECIAL=18;
	public static final int STRING=19;
	public static final int TCAT=20;
	public static final int TOKEN=21;
	public static final int VALUE=22;
	public static final int VARIABLE=23;
	public static final int WS=24;

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
	// CLParameter.g:68:1: parse : ( elem )* -> ^( LIST[\"LIST: \" + $parse.text] ( elem )* ) ;
	public final CLParameterParser.parse_return parse() throws RecognitionException {
		CLParameterParser.parse_return retval = new CLParameterParser.parse_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope elem1 =null;

		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// CLParameter.g:69:3: ( ( elem )* -> ^( LIST[\"LIST: \" + $parse.text] ( elem )* ) )
			// CLParameter.g:70:3: ( elem )*
			{
			// CLParameter.g:70:3: ( elem )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASTERISK||LA1_0==FILTER||(LA1_0 >= FUNCTION_NAME && LA1_0 <= HEX)||(LA1_0 >= OPEN_BRACE && LA1_0 <= STRING)||LA1_0==TOKEN||LA1_0==VARIABLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// CLParameter.g:70:4: elem
					{
					pushFollow(FOLLOW_elem_in_parse109);
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
			// 70:11: -> ^( LIST[\"LIST: \" + $parse.text] ( elem )* )
			{
				// CLParameter.g:70:14: ^( LIST[\"LIST: \" + $parse.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST: " + input.toString(retval.start,input.LT(-1))), root_1);
				// CLParameter.g:70:45: ( elem )*
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
	// CLParameter.g:73:1: elem : ( composite | list );
	public final CLParameterParser.elem_return elem() throws RecognitionException {
		CLParameterParser.elem_return retval = new CLParameterParser.elem_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope composite2 =null;
		ParserRuleReturnScope list3 =null;


		try {
			// CLParameter.g:74:2: ( composite | list )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ASTERISK||LA2_0==FILTER||(LA2_0 >= FUNCTION_NAME && LA2_0 <= HEX)||(LA2_0 >= SPECIAL && LA2_0 <= STRING)||LA2_0==TOKEN||LA2_0==VARIABLE) ) {
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
					// CLParameter.g:75:5: composite
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_composite_in_elem143);
					composite2=composite();
					state._fsp--;

					adaptor.addChild(root_0, composite2.getTree());

					}
					break;
				case 2 :
					// CLParameter.g:75:15: list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_elem145);
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


	public static class composite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "composite"
	// CLParameter.g:79:3: composite : value ( operator value )* -> ^( VALUE[\"COMPOSITE: \" + $composite.text] value ( operator value )* ) ;
	public final CLParameterParser.composite_return composite() throws RecognitionException {
		CLParameterParser.composite_return retval = new CLParameterParser.composite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope value4 =null;
		ParserRuleReturnScope operator5 =null;
		ParserRuleReturnScope value6 =null;

		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");

		try {
			// CLParameter.g:80:3: ( value ( operator value )* -> ^( VALUE[\"COMPOSITE: \" + $composite.text] value ( operator value )* ) )
			// CLParameter.g:81:4: value ( operator value )*
			{
			pushFollow(FOLLOW_value_in_composite174);
			value4=value();
			state._fsp--;

			stream_value.add(value4.getTree());
			// CLParameter.g:81:10: ( operator value )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= BCAT && LA3_0 <= CAT)||LA3_0==TCAT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// CLParameter.g:81:11: operator value
					{
					pushFollow(FOLLOW_operator_in_composite177);
					operator5=operator();
					state._fsp--;

					stream_operator.add(operator5.getTree());
					pushFollow(FOLLOW_value_in_composite179);
					value6=value();
					state._fsp--;

					stream_value.add(value6.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: value, operator, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 81:28: -> ^( VALUE[\"COMPOSITE: \" + $composite.text] value ( operator value )* )
			{
				// CLParameter.g:81:31: ^( VALUE[\"COMPOSITE: \" + $composite.text] value ( operator value )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "COMPOSITE: " + input.toString(retval.start,input.LT(-1))), root_1);
				adaptor.addChild(root_1, stream_value.nextTree());
				// CLParameter.g:81:78: ( operator value )*
				while ( stream_value.hasNext()||stream_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_operator.nextTree());
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();
				stream_operator.reset();

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
	// $ANTLR end "composite"


	public static class list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list"
	// CLParameter.g:84:1: list : OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[\"LIST: \" + $list.text] ( elem )* ) ;
	public final CLParameterParser.list_return list() throws RecognitionException {
		CLParameterParser.list_return retval = new CLParameterParser.list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE7=null;
		Token CLOSE_BRACE9=null;
		ParserRuleReturnScope elem8 =null;

		CommonTree OPEN_BRACE7_tree=null;
		CommonTree CLOSE_BRACE9_tree=null;
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleSubtreeStream stream_elem=new RewriteRuleSubtreeStream(adaptor,"rule elem");

		try {
			// CLParameter.g:85:3: ( OPEN_BRACE ( elem )* CLOSE_BRACE -> ^( LIST[\"LIST: \" + $list.text] ( elem )* ) )
			// CLParameter.g:86:3: OPEN_BRACE ( elem )* CLOSE_BRACE
			{
			OPEN_BRACE7=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_list220);  
			stream_OPEN_BRACE.add(OPEN_BRACE7);

			// CLParameter.g:86:14: ( elem )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ASTERISK||LA4_0==FILTER||(LA4_0 >= FUNCTION_NAME && LA4_0 <= HEX)||(LA4_0 >= OPEN_BRACE && LA4_0 <= STRING)||LA4_0==TOKEN||LA4_0==VARIABLE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// CLParameter.g:86:15: elem
					{
					pushFollow(FOLLOW_elem_in_list223);
					elem8=elem();
					state._fsp--;

					stream_elem.add(elem8.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			CLOSE_BRACE9=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_list227);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE9);

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
			// 86:34: -> ^( LIST[\"LIST: \" + $list.text] ( elem )* )
			{
				// CLParameter.g:86:37: ^( LIST[\"LIST: \" + $list.text] ( elem )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST, "LIST: " + input.toString(retval.start,input.LT(-1))), root_1);
				// CLParameter.g:86:68: ( elem )*
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
	// CLParameter.g:90:1: value : ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1)] ) | function );
	public final CLParameterParser.value_return value() throws RecognitionException {
		CLParameterParser.value_return retval = new CLParameterParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASTERISK10=null;
		Token TOKEN11=null;
		Token VARIABLE12=null;
		Token SPECIAL13=null;
		Token FILTER14=null;
		Token HEX15=null;
		Token STRING16=null;
		ParserRuleReturnScope function17 =null;

		CommonTree ASTERISK10_tree=null;
		CommonTree TOKEN11_tree=null;
		CommonTree VARIABLE12_tree=null;
		CommonTree SPECIAL13_tree=null;
		CommonTree FILTER14_tree=null;
		CommonTree HEX15_tree=null;
		CommonTree STRING16_tree=null;
		RewriteRuleTokenStream stream_HEX=new RewriteRuleTokenStream(adaptor,"token HEX");
		RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// CLParameter.g:91:3: ( ASTERISK -> ^( TOKEN[$ASTERISK.text] ) | TOKEN | VARIABLE | SPECIAL | FILTER | HEX -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)] | STRING -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1)] ) | function )
			int alt5=8;
			switch ( input.LA(1) ) {
			case ASTERISK:
				{
				alt5=1;
				}
				break;
			case TOKEN:
				{
				alt5=2;
				}
				break;
			case VARIABLE:
				{
				alt5=3;
				}
				break;
			case SPECIAL:
				{
				alt5=4;
				}
				break;
			case FILTER:
				{
				alt5=5;
				}
				break;
			case HEX:
				{
				alt5=6;
				}
				break;
			case STRING:
				{
				alt5=7;
				}
				break;
			case FUNCTION_NAME:
				{
				alt5=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// CLParameter.g:92:3: ASTERISK
					{
					ASTERISK10=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_value262);  
					stream_ASTERISK.add(ASTERISK10);

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
					// 92:12: -> ^( TOKEN[$ASTERISK.text] )
					{
						// CLParameter.g:92:15: ^( TOKEN[$ASTERISK.text] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOKEN, (ASTERISK10!=null?ASTERISK10.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CLParameter.g:94:3: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_value277); 
					TOKEN11_tree = (CommonTree)adaptor.create(TOKEN11);
					adaptor.addChild(root_0, TOKEN11_tree);

					}
					break;
				case 3 :
					// CLParameter.g:96:3: VARIABLE
					{
					root_0 = (CommonTree)adaptor.nil();


					VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_value285); 
					VARIABLE12_tree = (CommonTree)adaptor.create(VARIABLE12);
					adaptor.addChild(root_0, VARIABLE12_tree);

					}
					break;
				case 4 :
					// CLParameter.g:98:3: SPECIAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SPECIAL13=(Token)match(input,SPECIAL,FOLLOW_SPECIAL_in_value293); 
					SPECIAL13_tree = (CommonTree)adaptor.create(SPECIAL13);
					adaptor.addChild(root_0, SPECIAL13_tree);

					}
					break;
				case 5 :
					// CLParameter.g:100:3: FILTER
					{
					root_0 = (CommonTree)adaptor.nil();


					FILTER14=(Token)match(input,FILTER,FOLLOW_FILTER_in_value303); 
					FILTER14_tree = (CommonTree)adaptor.create(FILTER14);
					adaptor.addChild(root_0, FILTER14_tree);

					}
					break;
				case 6 :
					// CLParameter.g:102:3: HEX
					{
					HEX15=(Token)match(input,HEX,FOLLOW_HEX_in_value311);  
					stream_HEX.add(HEX15);

					// AST REWRITE
					// elements: HEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 102:7: -> HEX[$HEX.text.substring(2, $HEX.text.length()-1)]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(HEX, (HEX15!=null?HEX15.getText():null).substring(2, (HEX15!=null?HEX15.getText():null).length()-1)));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// CLParameter.g:104:3: STRING
					{
					STRING16=(Token)match(input,STRING,FOLLOW_STRING_in_value324);  
					stream_STRING.add(STRING16);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 104:10: -> ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1)] )
					{
						// CLParameter.g:104:13: ^( STRING[$STRING.text.substring(1, $STRING.text.length()-1)] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRING, (STRING16!=null?STRING16.getText():null).substring(1, (STRING16!=null?STRING16.getText():null).length()-1)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// CLParameter.g:106:3: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_value339);
					function17=function();
					state._fsp--;

					adaptor.addChild(root_0, function17.getTree());

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


	public static class operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// CLParameter.g:110:1: operator : ( CAT | BCAT | TCAT );
	public final CLParameterParser.operator_return operator() throws RecognitionException {
		CLParameterParser.operator_return retval = new CLParameterParser.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set18=null;

		CommonTree set18_tree=null;

		try {
			// CLParameter.g:110:9: ( CAT | BCAT | TCAT )
			// CLParameter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set18=input.LT(1);
			if ( (input.LA(1) >= BCAT && input.LA(1) <= CAT)||input.LA(1)==TCAT ) {
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
	// $ANTLR end "operator"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// CLParameter.g:121:1: function : FUNCTION_NAME list -> ^( FUNCTION[\"FUN: \" + $FUNCTION_NAME.text] list ) ;
	public final CLParameterParser.function_return function() throws RecognitionException {
		CLParameterParser.function_return retval = new CLParameterParser.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FUNCTION_NAME19=null;
		ParserRuleReturnScope list20 =null;

		CommonTree FUNCTION_NAME19_tree=null;
		RewriteRuleTokenStream stream_FUNCTION_NAME=new RewriteRuleTokenStream(adaptor,"token FUNCTION_NAME");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// CLParameter.g:121:9: ( FUNCTION_NAME list -> ^( FUNCTION[\"FUN: \" + $FUNCTION_NAME.text] list ) )
			// CLParameter.g:122:3: FUNCTION_NAME list
			{
			FUNCTION_NAME19=(Token)match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_function383);  
			stream_FUNCTION_NAME.add(FUNCTION_NAME19);

			pushFollow(FOLLOW_list_in_function385);
			list20=list();
			state._fsp--;

			stream_list.add(list20.getTree());
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
			// 122:22: -> ^( FUNCTION[\"FUN: \" + $FUNCTION_NAME.text] list )
			{
				// CLParameter.g:122:25: ^( FUNCTION[\"FUN: \" + $FUNCTION_NAME.text] list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION, "FUN: " + (FUNCTION_NAME19!=null?FUNCTION_NAME19.getText():null)), root_1);
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



	public static final BitSet FOLLOW_elem_in_parse109 = new BitSet(new long[]{0x0000000000AED022L});
	public static final BitSet FOLLOW_composite_in_elem143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_elem145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_composite174 = new BitSet(new long[]{0x00000000001000C2L});
	public static final BitSet FOLLOW_operator_in_composite177 = new BitSet(new long[]{0x0000000000ACD020L});
	public static final BitSet FOLLOW_value_in_composite179 = new BitSet(new long[]{0x00000000001000C2L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_list220 = new BitSet(new long[]{0x0000000000AED220L});
	public static final BitSet FOLLOW_elem_in_list223 = new BitSet(new long[]{0x0000000000AED220L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_list227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASTERISK_in_value262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_value277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_value285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_in_value293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_in_value303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_in_value311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_value324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_value339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_NAME_in_function383 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_list_in_function385 = new BitSet(new long[]{0x0000000000000002L});
}
