grammar Assembler;

@members {

  protected void escreverOpcode(Token opc);
  protected void escreverOpcode(Token opc, Token op) throws LabelException;
  protected void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
  protected void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
  protected void definirLabel(Token id) throws LabelException;
  
}

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : a = ID ':' {definirLabel($a);};

instrucao: (aritmetica | load | store | desvio | logica | 'nop'
              | a = 'pop' {escreverOpcode($a);}
              | a = 'pop2'{escreverOpcode($a);}
              )? NOVA_LINHA;

aritmetica : a = 'iadd' {escreverOpcode($a);}
           | a = 'isub' {escreverOpcode($a);}
           | a = 'imul' {escreverOpcode($a);}
           | a = 'idiv' {escreverOpcode($a);}
           | a = 'irem' {escreverOpcode($a);}
           | a = 'iinc' {escreverOpcode($a);}
           | a = 'ineg' {escreverOpcode($a);}
           ;
           
load : a = 'iconst_m1'{escreverOpcode($a);}
     | a = 'iconst_0' {escreverOpcode($a);}
     | a = 'iconst_1' {escreverOpcode($a);}
     | a = 'iconst_2' {escreverOpcode($a);}
     | a = 'iconst_3'{escreverOpcode($a);}
     | a = 'iconst_4'{escreverOpcode($a);}
     | a = 'iconst_5'{escreverOpcode($a);}
     | a = 'iload_0' {escreverOpcode($a);}
     | a = 'iload_1' {escreverOpcode($a);}
     | a = 'iload_2' {escreverOpcode($a);}
     | a = 'iload_3' {escreverOpcode($a);}
     | a = 'iload' INT {escreverOpcode($a, $INT);}
     | a = 'ldc' INT {escreverOpcode($a, $INT);}
     ;
     
store : a = 'istore_0' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_1' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_2' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_3' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore' INT {verificarAumentoMemoriaGlobal($a, $INT);}
      ;

logica : a = 'iand' {escreverOpcode($a);}
       | a = 'ior' {escreverOpcode($a);}
       | a = 'ixor' {escreverOpcode($a);}
       ;

desvio : a = 'ifeq' b = ID {escreverOpcode($a, $b);}
       | a = 'ifne' b = ID {escreverOpcode($a, $b);}
       | a = 'iflt' b = ID {escreverOpcode($a, $b);}
       | a = 'ifge' b = ID {escreverOpcode($a, $b);}
       | a = 'ifgt' b = ID {escreverOpcode($a, $b);}
       | a = 'ifle' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpeq' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpne' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmplt' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpge' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpgt' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmple' b = ID {escreverOpcode($a, $b);}
       | a = 'goto' b = ID {escreverOpcode($a, $b);}
       ;

NULL: ('null' | 'NULL');

INT : '-'? '0'..'9'+ ;

ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NOVA_LINHA : ';';

WS : (' ' | '\t' | '\r' | '\n') {skip();} ;