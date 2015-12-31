package familyParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import familyParser.familyParser.ChildrenContext;
import familyParser.familyParser.CommentContext;
import familyParser.familyParser.NameContext;
import familyParser.familyParser.PersonContext;
import familyParser.familyParser.RootContext;
import familyParser.familyParser.SpouseContext;
import familyParser.familyParser.TreeContext;
import familyTree.Family;
import familyTree.Person;

public class ImplementedFamilyListener implements familyListener{

	private Family family = new Family();
	// private Stack people = new Stack()
	public Family getFamily(){
		return family;
	}
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRoot(RootContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRoot(RootContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTree(TreeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTree(TreeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPerson(PersonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPerson(PersonContext ctx) {
		String name = ctx.getChild(0).getText();
		String spouse ="";
		List<String> children = new ArrayList<>();
		if (ctx.getChildCount()>1){
			spouse = ctx.getChild(1).getText();
		}
		if (ctx.getChildCount()==3){
			ParseTree childrenNode = ctx.getChild(2);
			for (int i=0;i<childrenNode.getChildCount();i++){
				children.add(childrenNode.getChild(i).getText());
			}
		}
		
		family.addMember(new Person(name,spouse,children));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSpouse(SpouseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSpouse(SpouseContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterChildren(ChildrenContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitChildren(ChildrenContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterName(NameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitName(NameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterComment(CommentContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitComment(CommentContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
