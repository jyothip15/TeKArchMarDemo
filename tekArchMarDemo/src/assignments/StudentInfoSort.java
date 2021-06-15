package assignments;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 2.Create student class with name(String type) and RegNo (int type) attributes. 
 * use any collection to Store 5 student information. Sort using student name
 */
class Students implements Comparable<Students>{
	String name;
	int regNo;
	Students(String name,int regNo){
		this.name = name;
		this.regNo = regNo;
	}
	public String toString() {

		return "Student[name="+name+", RegNo="+regNo+"]";	
	}

	public int compareTo(Students o) {
		
		return name.compareTo(o.name);
//		return regNo<o.regNo?1:-1;
	}

}
public class StudentInfoSort {

	public static void main(String[] args) {
		ArrayList<Students> stud = new ArrayList<Students>();
		stud.add(new Students("Jyothi",12));
		stud.add(new Students("Kanna",11));
		stud.add(new Students("vaith",10));
		stud.add(new Students("Ananth",9));
		stud.add(new Students("Ali",3));
		
		Collections.sort(stud);
		
		for(Students o: stud) {
			System.out.println(o);

		}

	}
}
