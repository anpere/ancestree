package familyTree;


import java.util.ArrayList;
import java.util.List;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private List<Person> people = new ArrayList<>();
	public Family(){
	}
	public Family(List<Person>people){
		for(Person person:people){
			people.add(person);
		}
	}
	public void addMember(Person person){
		people.add(person);
	}
	@Override
	public String toString(){
		String rep ="";
		for(Person person: people){
			rep+=person.toString();
		}
		return rep;
	}
}
