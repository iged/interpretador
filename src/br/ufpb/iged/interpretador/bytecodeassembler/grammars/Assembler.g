grammar Assembler;

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : ID SP* ':';

instrucao: (aritmetica | load | store | desvio | logica | 'nop')? NOVA_LINHA;

aritmetica : 'iadd'
           | 'isub'
           | 'imul'
           | 'idiv'
           | 'irem'
           | 'iinc'
           ; 
           
load : 'iconst_' ('m1' | '0'..'5')
     | 'iload_' RG03
     | 'iload' SP INT
     | 'ldc' SP INT
     ;
     
store : 'istore_' RG03
      | 'istore' SP INT
      ;

logica : 'ineg'
       | 'iand'
       | 'ior'
       | 'ixor'
       ;

desvio : 'ifeq' SP ID 
       | 'ifne' SP ID  
       | 'iflt' SP ID 
       | 'ifge' SP ID  
       | 'ifgt' SP ID  
       | 'ifle' SP ID  
       | 'if_icmpeq' SP ID  
       | 'if_icmpne' SP ID  
       | 'if_icmplt' SP ID  
       | 'if_icmpge' SP ID  
       | 'if_icmpgt' SP ID  
       | 'if_icmple' SP ID  
       | 'goto' SP ID
       ;        

NULL: ('null' | 'NULL');

RG03 :  '0'..'3';

INT : '-'? '0'..'9'+ ;

ID:  ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NOVA_LINHA : ';';

WS : ('\t' | '\r' | '\n') {skip();} ;

SP: ' ';