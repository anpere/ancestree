package familyParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import familyParser.familyParser.ChildContext;
import familyParser.familyParser.ChildrenContext;
import familyParser.familyParser.CommentContext;
import familyParser.familyParser.HusbandContext;
import familyParser.familyParser.NameContext;
import familyParser.familyParser.PersonContext;
import familyParser.familyParser.RootContext;
import familyParser.familyParser.TreeContext;
import familyParser.familyParser.WifeContext;
import familyTree.Family;
import familyTree.Person;

public class ImplementedFamilyListener implements familyListener{

	// Add inference of last names to children from parents
	private Family family = new Family();
	private List<String> children = new ArrayList<>();
	private String wife;
	private String husband;
	public Family getFamily(){
		return family;
	}
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		
	}

	@Override
	public void enterRoot(RootContext ctx) {
		
	}

	@Override
	public void exitRoot(RootContext ctx) {		
	}

	@Override
	public void enterTree(TreeContext ctx) {
		
	}

	@Override
	public void exitTree(TreeContext ctx) {
		
	}

	@Override
	public void enterPerson(PersonContext ctx) {
		
	}

	@Override
	public void exitPerson(PersonContext ctx) {
		String lastName = husband.split(" ")[husband.split(" ").length-2];
		String secondName = wife.split(" ")[wife.split(" ").length-2];
		List<String> childs = new ArrayList<>();
		for(String child : children){
			childs.add(child+" "+lastName+" "+secondName);
		}
		Person person = new Person(husband,wife,childs);
		family.addMember(person);
		children = new ArrayList<>();
	}

	@Override
	public void enterChildren(ChildrenContext ctx) {		
	}

	@Override
	public void exitChildren(ChildrenContext ctx) {
		
	}

	@Override
	public void enterName(NameContext ctx) {
	}

	@Override
	public void exitName(NameContext ctx) {
		
	}

	@Override
	public void enterComment(CommentContext ctx) {
		
	}

	@Override
	public void exitComment(CommentContext ctx) {
		
	}
	@Override
	public void enterChild(ChildContext ctx) {
		
	}
	@Override
	public void exitChild(ChildContext ctx) {
		children.add(ctx.getText());
		
	}
	@Override
	public void enterWife(WifeContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitWife(WifeContext ctx) {
		wife = ctx.getChild(1).getText();		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterHusband(HusbandContext ctx) {
		husband = ctx.getChild(1).getText();		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitHusband(HusbandContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
