grammar Shell400; 

@lexer::header { package org.asup.dk.parser.antlr;
}

@parser::header { package org.asup.dk.parser.antlr;
}

parse   
  :   expression
    ;
          
term 
  : PARAM
  | VALUE
  | SPECIAL
  | VARIABLE
  | EXP_OPEN
  | EXP_CLOSE
  ;

expression  
  : term *
  ;   


WHITE_SPACE : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
EXP_OPEN: '(';
EXP_CLOSE: ')';

SPECIAL : ('*' TOKEN);
PARAM : TOKEN;
VARIABLE : ('&' TOKEN);
VALUE : STRING | FLOAT | INTEGER;

fragment TOKEN : LETTER (LETTER | DIGIT)*;
fragment STRING
  : '\''
    { StringBuilder b = new StringBuilder(); }
    ( '\'' '\''        { b.appendCodePoint('\'');}
    | c=~('\''|'\r'|'\n')  { b.appendCodePoint(c);}
    )*
    '\''
    { setText(b.toString()); }
  ;

fragment CHAR_SPECIAL
  : ('\u00A3' | '\u00A7' | '$' | '%' | '_' | '.' | '/' )
  ;

fragment DIGIT_SPECIAL
  : (',' | '.')
  ;

fragment INTEGER 
  : DIGIT+
  ;

fragment FLOAT 
  : (DIGIT DIGIT_SPECIAL DIGIT)+ 
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