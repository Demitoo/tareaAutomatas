grammar ParserT;
import LexerT;

program   : BEGIN statement+ EOF;
          
statement : print | while_block | condition_block | operation | content_block | for_operation | assign |
read | for_block | if_block;
block: statement+;
declare: (NUMBER_|STRING_|FLOAT_) (ID | assign);
assign: ID IGUAL operation; //Nat x = 24

//CONTENIDO
condition_block: PARENTESIS1 operation PARENTESIS2; // (condicion)
content_block: LLAVE1 block LLAVE2;
operation: 
          (ID|NUMBER|FLOAT) 
          | operation EQUAL operation
          | operation Y operation 
          | operation O operation // (X===Y OO X===Z YY X===X)
          | operation SUMA operation
          | operation RESTA operation
          | operation DIVISION operation
          | operation MULTIPLICACION operation
          | RAIZ PARENTESIS1 operation PARENTESIS2
          | COSENO PARENTESIS1 operation PARENTESIS2
          | SENO PARENTESIS1 operation PARENTESIS2
          | LOGARITMO PARENTESIS1 operation PARENTESIS2
          ;
for_operation: ID EQUAL (ID|NUMBER|FLOAT);

//LEER Y IMPRIMIR
read: READ PARENTESIS1 (ID) PARENTESIS2; //read(x)
print     : PRINT PARENTESIS1 (ID| NUMBER | STRING |FLOAT) PARENTESIS2; // print(variable)



//ITERATIVOS
while_block: WHILE condition_block content_block; // while (operacion){contenido}
for_block: FOR PARENTESIS1 ID ';' for_operation PARENTESIS2 content_block; // for ( x ; x===7){}

//CONDICIONAL 
if_block:IF condition_block content_block (ELSE content_block)?;

//OPERADORES MATEMATICOS *obsoletos 
/*suma:SUMA ID PARENTESIS1 (ID|NUMBER|FLOAT) PARENTESIS2; // sum x(14)
resta:RESTA ID PARENTESIS1 (ID|NUMBER|FLOAT) PARENTESIS2; // minus x(14)
div: DIVISION ID PARENTESIS1 (ID|NUMBER|FLOAT) PARENTESIS2; // div x(14)
mult: MULTIPLICACION ID PARENTESIS1 (ID|NUMBER|FLOAT) PARENTESIS2; //prod x(14)*/

//funciones
/*raiz: RAIZ PARENTESIS1 (operation) PARENTESIS2; //sqrt(14)
cos: COSENO PARENTESIS1 (operation) PARENTESIS2; //cos(14) en radianes
sen: SENO PARENTESIS1 (operation) PARENTESIS2; //sen(14) en radianes
log: LOGARITMO PARENTESIS1 (operation) PARENTESIS2; //log(15) en base 10*/
