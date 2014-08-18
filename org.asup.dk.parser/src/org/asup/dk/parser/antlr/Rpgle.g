grammar Rpgle; 

@lexer::header { package org.asup.dk.parser.antlr;
}

@parser::header { package org.asup.dk.parser.antlr;
}

parse   
  :   expression
    ;
       
parameters
  : expression (COMMA expression)*
  ;
   
term
  : TOKEN
  | '(' expression ')'
  | TOKEN '(' parameters ')'
  | TOKEN '[' parameters ']'
  | SPECIAL
  | FILLER
  | NUMBER
  | STRING
  | INDICATOR
  | INDICATOR '(' parameters ')'
  ;

negation
  : NOT* term
  ;
  
unary
  : (PLUS | MINUS)* negation
  ;

mult
  : unary ((MULT | DIV | MOD) unary)*
  ;

add
  : mult ((PLUS | MINUS) mult)*
  ;

relation
  : add ((EQ | NE | GT | GE | LT | LE) add)*
  ;
  
expression
  : relation ((AND | OR) relation)*
  ; 


PLUS  : '+' ;
MINUS : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
POW   : '^' ;

EQ    : '=' ;
NE    : '<>' ;
GT    : '>' ;
GE    : '>=' ;
LT    : '<' ;
LE    : '<=' ;

// Comparison operator
AND   : A N D;
OR    : O R;
NOT   : N O T;

WHITE_SPACE : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMA: ':';

EXP_OPEN: '(';
EXP_CLOSE: ')';

DIM_OPEN: '[';
DIM_CLOSE: ']';

STRING
  : '\''
    { StringBuilder b = new StringBuilder(); }
    ( '\'' '\''        { b.appendCodePoint('\'');}
    | c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
    )*
    '\''
    { setText(b.toString()); }
  ;
 
 SPECIAL: ('*' H I V A L | '*' L O V A L | 
          '*' B L A N K S | '*' B L A N K | 
          '*' Z E R O S | '*' Z E R O | 
          '*' O N  | '*' O F F |
          '*' O M I T | '*' N U L L |
          '*' S T A T U S | '*' P A R M S |
          '*' M S | '*' N E X T
          );
FILLER: '*' A L L (STRING | DIGIT);
NUMBER : FLOAT | INTEGER;
INDICATOR : ('*' I N (LETTER | DIGIT )*);

TOKEN : LETTER (LETTER | DIGIT )*;

fragment INTEGER 
  : DIGIT+
  ;

fragment FLOAT 
  : (DIGIT DIGIT_SPECIAL DIGIT)+ 
  ;

fragment CHAR_SPECIAL
  : ( '\u00A3' | '\u00A7' | '$' | '%' | '_' | '.')
  ;

fragment DIGIT_SPECIAL
  : (',' | '.')
  ;
  
fragment LETTER 
  : ('a'..'z' 
  | 'A'..'Z' 
  | CHAR_SPECIAL) ;
  
fragment DIGIT 
  : ('0'..'9')
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