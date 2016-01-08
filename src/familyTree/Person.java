package familyTree;


import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String spouse;
	private List<String> children = new ArrayList<>();
	
	public Person(String name){
		this.name=name;
	}
	public Person(String name, String spouse, List<String> children){
		this.name = "\""+name+"\"";
		if (spouse!=""){
			this.spouse = "\""+spouse+"\"";
		}
		for(String child :children){
			this.children.add("\""+child+"\"");
		}
	}
	@Override
	public String toString(){
		String rep ="";
		rep+= hasSpouse()?name+"--"+spouse+";\n":"";
		for(String child:children){
			rep+=name+"--"+child+";\n";
		}
		rep+="{rank = same;"+name+";"+spouse+";}\n";
		return rep;
	}
	public String getName(){
		return name;
	}
	public boolean hasSpouse(){
		return spouse!=null?true:false;
	}	

}
