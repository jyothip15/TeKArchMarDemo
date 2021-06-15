package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class AssignStudent {

	public static void main(String[] args) {
		HashSet<Student> hs = new  HashSet<Student>();
	    hs.add(new Student("Jyothi",12));
	    hs.add(new Student("Advaith",1));
	    hs.add(new Student("Ananth",2));
	    hs.add(new Student("Ann",3));
	    hs.add(new Student("Thara",4));
	   
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	    
	}

}
