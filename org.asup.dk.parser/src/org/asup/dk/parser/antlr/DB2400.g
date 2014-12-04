grammar DB2400; 

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
  | NUMBER
  | FLOAT
  | STRING
  | DOT
  | COMMA
  | VARIABLE
  ;

negation
  : NOT* term
  ;
  
unary
  : (PLUS | MINUS)* negation
  ;

mult
  : unary ((MUL | DIV | MOD) unary)*
  ;

add
  : mult ((PLUS | MINUS) mult)*
  ;

relation
  : add ((EQ | NE | GT | GE | LT | LE | LIKE) add)*
  ;
  
expression
  : relation ((AND | OR) relation)*
  ; 


PLUS  : '+' ;
MINUS : '-' ;
MUL   : '*' ;
DIV   : '/' ;
MOD   : '%' ;
POW   : '^' ;

EQ    : '=' ;
NE    : '<>' ;
GT    : '>' ;
GE    : '>=' ;
LT    : '<' ;
LE    : '<=' ;
LIKE  : L I K E ;
 
// Comparison operator
AND   : A N D;
OR    : O R;
NOT   : N O T;

WHITE_SPACE : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMA: ',';
DOT: '.';
VARIABLE: ':' TOKEN;
EXP_OPEN: '(';
EXP_CLOSE: ')';


STRING
  : '\''
    { StringBuilder b = new StringBuilder(); }
    ( '\'' '\''        { b.appendCodePoint('\'');}
    | c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
    )*
    '\''
    { setText(b.toString()); }
  ;

NUMBER : FLOAT | INTEGER;
TOKEN : LETTER (LETTER | DIGIT)*;

fragment INTEGER 
  : DIGIT+
  ;

fragment FLOAT 
  : (DIGIT DIGIT_SPECIAL DIGIT)+ 
  ;


fragment CHAR_SPECIAL
  : ('\u00A3' | '\u00A7' | '$' | '%' | '_' | '.'|'*')
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