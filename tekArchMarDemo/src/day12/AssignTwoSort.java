package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class stud implements Comparable<stud>{
	int rollNo;
	String name;
	
	stud(String name,int rollNo){
	//	super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString() {
		return "Stud[rollno="+ rollNo+",name="+name+"]";
		}
	public int compareTo(stud s) {
//		return s.name.compareTo(name);
		return rollNo>s.rollNo?1:-1;
	}
	
	
}

public class AssignTwoSort {
	

		public static void main(String[] args) {

			ArrayList <stud> hs = new ArrayList<stud>(); 
		    hs.add(new stud("Jyothi",12));
		    hs.add(new stud("Advaith",1));
		    hs.add(new stud("Ananth",2));
		    hs.add(new stud("Ann",3));
		    hs.add(new stud("Thara",4));
		   
		//    Comparator<Integer> com = new ComparatorImp();
            Collections.sort(hs);
		    
	       for(stud s : hs) {
	    	   System.out.println(s);
	    	   
	        }
		    
		}

	}


