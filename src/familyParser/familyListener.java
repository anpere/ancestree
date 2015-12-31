// Generated from family.g4 by ANTLR 4.5.1

package familyParser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link familyParser}.
 */
public interface familyListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link familyParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(familyParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(familyParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#tree}.
   * @param ctx the parse tree
   */
  void enterTree(familyParser.TreeContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#tree}.
   * @param ctx the parse tree
   */
  void exitTree(familyParser.TreeContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#person}.
   * @param ctx the parse tree
   */
  void enterPerson(familyParser.PersonContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#person}.
   * @param ctx the parse tree
   */
  void exitPerson(familyParser.PersonContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#spouse}.
   * @param ctx the parse tree
   */
  void enterSpouse(familyParser.SpouseContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#spouse}.
   * @param ctx the parse tree
   */
  void exitSpouse(familyParser.SpouseContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#children}.
   * @param ctx the parse tree
   */
  void enterChildren(familyParser.ChildrenContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#children}.
   * @param ctx the parse tree
   */
  void exitChildren(familyParser.ChildrenContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#name}.
   * @param ctx the parse tree
   */
  void enterName(familyParser.NameContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#name}.
   * @param ctx the parse tree
   */
  void exitName(familyParser.NameContext ctx);
  /**
   * Enter a parse tree produced by {@link familyParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(familyParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link familyParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(familyParser.CommentContext ctx);
}