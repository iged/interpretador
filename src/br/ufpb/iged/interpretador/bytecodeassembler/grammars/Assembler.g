grammar Assembler;

@members {

  protected void escreverOpcode(Token opc);
  protected void escreverOpcode(Token opc, Token op) throws LabelException;
  protected void definirLabel(Token id) throws LabelException;
  
}

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : a = ID SP* ':' {definirLabel($a);};

instrucao: (aritmetica | load | store | desvio | logica | 'nop')? NOVA_LINHA;

aritmetica : a = 'iadd' {escreverOpcode($a);}
           | a = 'isub' {escreverOpcode($a);}
           | a = 'imul' {escreverOpcode($a);}
           | a = 'idiv' {escreverOpcode($a);}
           | a = 'irem' {escreverOpcode($a);}
           | a = 'iinc' {escreverOpcode($a);}
           ; 
           
load : a = 'iconst_' ('m1' | '0'..'5') {escreverOpcode($a);}
     | a = 'iload_' RG03 {escreverOpcode($a);}
     | a = 'iload' SP b = INT {escreverOpcode($a, $b);}
     | a = 'ldc' SP b = INT {escreverOpcode($a, $b);}
     ;
     
store : a = 'istore_' RG03 {escreverOpcode($a);}
      | a = 'istore' SP b = INT {escreverOpcode($a, $b);}
      ;

logica : a = 'ineg' {escreverOpcode($a);}
       | a = 'iand' {escreverOpcode($a);}
       | a = 'ior' {escreverOpcode($a);}
       | a = 'ixor' {escreverOpcode($a);}
       ;

desvio : a = 'ifeq' SP b = ID {escreverOpcode($a, $b);}
       | a = 'ifne' SP b = ID {escreverOpcode($a, $b);}
       | a = 'iflt' SP b = ID {escreverOpcode($a, $b);}
       | a = 'ifge' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'ifgt' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'ifle' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmpeq' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmpne' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmplt' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmpge' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmpgt' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'if_icmple' SP b = ID {escreverOpcode($a, $b);} 
       | a = 'goto' SP b = ID {escreverOpcode($a, $b);}
       ;        

NULL: ('null' | 'NULL');

RG03 :  '0'..'3';

INT : '-'? '0'..'9'+ ;

ID:  ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NOVA_LINHA : ';';

WS : ('\t' | '\r' | '\n') {skip();} ;

SP: ' ';