package day12;

public class Student {
	    String name;
	 
	    int rollNo;
	    public Student(String name, int rollNo)
	    {
	        this.name = name;
	 
	        this.rollNo = rollNo;

	    }
	 
		
		  @Override public int hashCode() { 
			  return rollNo; }
		  
		  @Override public boolean equals(Object obj) { 
			  Student student = (Student)
		  obj;
		  
		  return (rollNo == student.rollNo); }
		  
		  @Override 
		  public String toString() { 
			  return rollNo+", "+name; }
		 
	}
