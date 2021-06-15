package assignments;

import java.util.ArrayList;

/*
 * 1.Create student class with name(String type) and RegNo: (int type) attributes.
 * use any collection to Store 5 student information. (no duplicates).
 */

class Student{
	String name;
	int regNo;
	Student(String name,int regNo){
		this.name = name;
		this.regNo = regNo;
	}
	public String toString() {

		return "Student[name="+name+", RegNo="+regNo+"]";	
	}
}

public class StudentInfoNoDuplicates {

	public static void main(String[] args) {
       ArrayList<Student> stud = new ArrayList<Student>();
       stud.add(new Student("Jyothi",12));
       stud.add(new Student("Anna",11));
       stud.add(new Student("Advaith",10));
       stud.add(new Student("Ananth",9));
       stud.add(new Student("Ali",3));
       
       for(Student o: stud) {
    	   System.out.println(o);
       }
  
	}

}
