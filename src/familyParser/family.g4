/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar family;
import Configuration;
root: tree;
tree: person+;
person: name spouse? children? '\n';
spouse: 'S:' name;
children: 'C:' name (','name)*;
name: CHAR+;
CHAR: [a-zA-Z];


comment :  '%' ~('\n')+ NEWLINE;
NEWLINE :  ('\n' | '\r' '\n'?);
DIGIT :  [0-9]+;

PLUS: '+';
