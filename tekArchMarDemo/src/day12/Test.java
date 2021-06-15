package day12;

import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students>{
	int RegNo;
	String name;
	Students(int RegNo,String name){
		this.name = name;
		this.RegNo = RegNo;
	}
	@Override
	public int compareTo(Students s) {
//		return name.compareTo(s.name);
		return RegNo>s.RegNo?1:-1;
	}
    public String toString() {
		return "Student[name="+ name +","+"RegNo="+RegNo+"]";
    	
    }

}

public class Test {

	public static void main(String[] args) {
		ArrayList<Students> stud = new ArrayList<Students>();
		stud.add(new Students(12,"Jyothi"));
		stud.add(new Students(10,"Advaith"));
		stud.add(new Students(11,"Ananth"));
		stud.add(new Students(9,"Ann"));
		stud.add(new Students(13,"Anna"));
		
	    Collections.sort(stud);
		
	    for(Students o : stud) {
	    	System.out.println(o);
	    }
	}

}
