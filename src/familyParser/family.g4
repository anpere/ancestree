/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar family;
import Configuration;
root: tree;
tree: person+;
person: (husband wife | wife husband) children? '\n';
wife: 'W:' name;
husband: 'H:' name;
children: 'C:' child (','child)*;
name: CHAR+;
child: CHAR+;
CHAR: [a-zA-Z]|' ';


comment :  '%' ~('\n')+ NEWLINE;
NEWLINE :  ('\n' | '\r' '\n'?);
DIGIT :  [0-9]+;
SPACE : ' ';
PLUS: '+';
