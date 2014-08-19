grammar CLParameter;

options {
  	output=AST;
  	ASTLabelType=CommonTree;
	language=Java;	
}


tokens
{
	PAR;
	LIST;
	//TOKEN
	//VARIABLE
	//SPECIAL
	//STRING
	FUNCTION;
	STR_OPERATOR;
}

@lexer::header {
  package org.asup.dk.parser.ibmi.cl.antlr;
  
  import org.asup.dk.parser.ibmi.cl.utils.LexerHelper;
}

@parser::header {
  package org.asup.dk.parser.ibmi.cl.antlr;

  import org.asup.dk.parser.ibmi.cl.utils.CLParserHelper;
}

@parser::members {

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
  

}

@rulecatch {
    catch (RecognitionException e) {
        RuntimeException re = hlp.createException(e);
        throw re;
    }
}


parse
  :
  (elem)* -> ^(PAR[$parse.text] (elem)*) 
  ;
  
elem	:
	value|list
	;	  
  
list
  : 
  OPEN_BRACE (elem)* CLOSE_BRACE -> ^(LIST[$list.text]  (elem)*)   
  ;
  
value
  :
  TOKEN
  |
  VARIABLE
  |
  SPECIAL
  |
  STRING
  |
  function
  |
  string_operator
  ;  
  
function:
  FUNCTION_NAME list	-> ^(FUNCTION[$FUNCTION_NAME.text] list)
	;
	
string_operator:
  CAT -> ^(STR_OPERATOR["*CAT"])
  |
  BCAT -> ^(STR_OPERATOR["*BCAT"])
  |
  TCAT -> ^(STR_OPERATOR["*TCAT"])
	;	

CAT     :	'!!' | ('*CAT');
BCAT    :	'!>' | ('*BCAT');
TCAT    :	'!<' | ('*TCAT');		
	  
  
FUNCTION_NAME:
	'%SST' | '%SWITCH' | '%BINARY' | '%BIN'	
	;  
  
STRING	:	
   APOS ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL|' '|'%'|'&')+ APOS	
   ;	  

TOKEN: 
  ('a'..'z'|'A'..'Z'|'0'..'9'|CHAR_SPECIAL)+
  ;

VARIABLE: 
   '&' TOKEN   
 ;
 
SPECIAL	:	
   '*' TOKEN
 ;   	 
      
OPEN_BRACE
  :
  '(' 
  ;
  
CLOSE_BRACE
  :
  ')' 
  ;
  
APOS	:
	'\''	
	;  

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

CR :
  ('\r')? '\n'
  ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )
        {$channel=HIDDEN;}
    ;

fragment
CHAR_SPECIAL
  :
  (
    '\u00A7'  //�
    | '$'
    | '_'
    | '.'    
    | '^'
    | '\u00e0' //�
    | '\u00e8' //�
    | '\u00e9' //�
    | '\u00ec' //�
    | '\u00f2' //�
    | '\u00f9' //�
    | '"'
    | '?'    
    | ','   
    | '\u00a3' //�	
    | '!'
    | '='
    | '>'
    | '<'	
    | '+'
    | '-'
    | '/' 
  )
  ;


