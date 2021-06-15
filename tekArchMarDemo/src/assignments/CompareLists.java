package assignments;

import java.util.ArrayList;
import java.util.List;

//4.Compare two lists for equality i.e to check Equal or NotEqual

public class CompareLists {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(500);
		al.add(100);
		al.add(300);
		al.add(600);
		al.add(200);
		
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(500);
		al1.add(100);
		al1.add(300);
		al1.add(600);
		al1.add(200);
		
		System.out.println(al.equals(al1));//true if equal and false if NOT equal
		
	}

}
