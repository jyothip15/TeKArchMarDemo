package assignments;

import java.util.Stack;

/*
 * Implement stack with all operations to add
 * Student objects (Each student object contains Name, ID and Marks Attributes)
 */
class Person{
	String name;
	int id,marks;

	public Person(String name, int id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String toString()
	{
		return "Student[ name= "+name+" id= "+"marks = "+marks+"]";
		
	}
}

public class AssignStackAddObject {

	public static void main(String[] args) {
		Stack<Person> st = new Stack<>();
		st.push(new Person("Jyothi",60, 100));
		st.push(new Person("J",160, 100));
		st.push(new Person("Jyo",610, 1100));
//System.out.println(st);
		
		for(Object o: st) {
			
			System.out.println(o);
			
	}

}
}