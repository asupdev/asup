grammar RPGExpr;

options
{
	output=AST;
	ASTLabelType=CommonTree;
	language=Java;
}

tokens
{
	NEGATE;
	STRING;
	BI_FUNCTION;
	USER_FUNCTION;
	SP_VALUE;
	//OR
	//AND
	//EQ
	//NE
	//LT
	//LTEQ
	//GT
	//GTEQ
	//PLUS
	//MINUS
	//MULT
	//DIV
	//MOD
	//POW
	//NOT
	QUALIFIED;
	BLOCK;
}

@parser::header {
  package org.asup.il.expr.base.antlr.rpg;
  
  import org.asup.il.expr.IntegratedLanguageExpressionRuntimeException;
}

@lexer::header {
  package org.asup.il.expr.base.antlr.rpg;
}

@parser::members {

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
}

@rulecatch {
    catch (RecognitionException e) {
        RuntimeException re = createException(e);
        throw re;
    }
}


expression
	: 	logicalExpression EOF!
	;

logicalExpression
	:	booleanAndExpression (OR^ booleanAndExpression )*
	;

booleanAndExpression
	:	equalityExpression (AND^ equalityExpression)*
	;


equalityExpression
	:	relationalExpression ((EQ|NE)^ relationalExpression)*
	;

relationalExpression
	:	additiveExpression ( (LT|LTEQ|GT|GTEQ)^ additiveExpression )*

	;

additiveExpression
	:	multiplicativeExpression ( (PLUS|MINUS)^ multiplicativeExpression )*
	;

multiplicativeExpression
	:
		powerExpression ( (MULT|DIV|MOD)^ powerExpression )*
	;

powerExpression
	:	unaryExpression ( POW^ unaryExpression )?
	;

unaryExpression
	:
	 	qualified
    	|	NOT^ qualified
    	|	MINUS qualified -> ^(NEGATE qualified)
   	;

qualified
	:
		(v=primaryExpression -> primaryExpression) ((POINT vals+=primaryExpression) -> ^(QUALIFIED[$qualified.text] $v $vals+))*
	;

primaryExpression
	:	'(' logicalExpression ')' -> ^(BLOCK[$primaryExpression.text] logicalExpression)
		|
		value
	;

value
	:
		INTEGER
	|	FLOAT
	| 	DATETIME
	|	BOOLEAN
	|	STRING
	|	HEX
	|	TERM
	|	INDICATOR	
	|	(SPECIAL -> TERM)
	|	filler
	|	special
	|	bi_function
	|	usr_function
	|   array_indicator
	;

filler	:
		FILLER STRING -> ^(BI_FUNCTION[$FILLER.text] STRING)
		|
		FILLER HEX -> ^(BI_FUNCTION[$FILLER.text] HEX)
	;

special	:
		MULT SPECIAL -> SP_VALUE[$MULT.text + $SPECIAL.text]
	;

usr_function
	:	TERM params	 -> ^(USER_FUNCTION[$TERM.text] params)
		|
		TERM empty	-> ^(USER_FUNCTION[$TERM.text])
	;

bi_function
	: 	
		BI_FUN (params)? -> ^(BI_FUNCTION[$BI_FUN.text] (params)?)
		|
		BI_FUN '(' ')'   -> ^(BI_FUNCTION[$BI_FUN.text])
	;

params
	:	'('! logicalExpression (':'! logicalExpression)* ')'!
	;

empty
	:
	'(' ')'
	;	

array_indicator
	:
		ARRAY_INDICATOR  logicalExpression ')' -> ^(BI_FUNCTION["*IN"] logicalExpression)
	;			


SPECIAL
	:	( H I V A L)
		|
		( L O V A L)
		|
		( Z E R O S)
		|
		( Z E R O)
		|
		( B L A N K)
		|
		( B L A N K S)
		|
		( O N)
		|
		( O F F)
		|
		( O M I T)
		|
		( N U L L)
		|
		( S T A T U S)
		|
		( P A R M S)
		|
		( M S)
		|
		( N E X T)
	;


OR 	: 	'||' | (O R);
AND 	: 	'&&' | (A N D);
NOT	:	'!'  | (N O T);

EQ	:	'='  | '==';
NE	:	'!=' | '<>';
LT	:	'<';
LTEQ	:	'<=';
GT	:	'>';
GTEQ	:	'>=';

PLUS	:	'+';
MINUS	:	'-';
MULT	:	'*';
DIV	:	'/';
MOD	:	'%';
POW	:	'**';

FILLER	: '*ALL'
		;

BI_FUN  :	'%'TERM
		;

INDICATOR : ('*IN' (LETTER | DIGIT )*)
	;
	
ARRAY_INDICATOR	: '*IN('
	;	

HEX	:   ('X\''|'x\'') (HexDigit)+ '\''
	;

STRING
	: '\''
    	{ StringBuilder b = new StringBuilder(); }
	( '\'' '\''        { b.appendCodePoint('\'');}
	| c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
	)*
	'\''
	{ setText(b.toString()); }
  ;

INTEGER
	:	('0'..'9')+
	;

FLOAT
	:	('0'..'9')* DIGIT_SPECIAL ('0'..'9')+
	;

DATETIME
 	:	'#' (~'#')* '#'
        ;

BOOLEAN
	:	(T R U E)
	|	(F A L S E)
	;

TERM
	:	LETTER (LETTER | DIGIT)*
	;

POINT
  : '.'
  ;

fragment DIGIT
  : ('0'..'9')
  ;

fragment CHAR_SPECIAL
  : ('\u00A3' | '\u00A7' | '$' | '_')
  ;

fragment LETTER
  : ('a'..'z'
  | 'A'..'Z'
  | CHAR_SPECIAL) ;

fragment EscapeSequence
	:	'\\'
  	(
  		'n'
	|	'r'
	|	't'
	|	'\''
	|	'\\'
	|	UnicodeEscape
	)
  ;

fragment UnicodeEscape
    	:    	'u' HexDigit HexDigit HexDigit HexDigit
    	;

fragment HexDigit
	: 	('0'..'9'|'a'..'f'|'A'..'F') ;

fragment DIGIT_SPECIAL
  : (',' | '.')
  ;



fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


/* Ignore white spaces */

WS
	:  (' '|'\t'|'\u000C'| '\n' | '\r') {$channel=HIDDEN;}
	;


