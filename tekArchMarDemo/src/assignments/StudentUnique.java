package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Stud implements Comparable<Stud>{
	String name;
	int regNo; 
	public Stud(String name, int regNo) {
		super();
		this.name = name;
		this.regNo = regNo;
	}
	public String toString() {
		return "Student("+name+"," +regNo+")";
	}
	public int compareTo(Stud o) {
		return name.compareTo(o.name);
	}
}

public class StudentUnique {

	public static void main(String[] args) {
		List<Stud> stud = new ArrayList<Stud>();
		
		Stud s1 = new Stud("Jyothi",13);
		Stud s2 = new Stud("Jyo",10);
		Stud s3 = new Stud("Appu",9);
		Stud s4 = new Stud("Kannan",12);
		Stud s5 = new Stud("Advaith",14);

		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);

		Collections.sort(stud);
		
		/*for(Stud o: stud) {
			System.out.println(o);
		}
       */
		Iterator<Stud> it = stud.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
