package assignments;

//3.Sort Array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(500);
		al.add(100);
		al.add(300);
		al.add(600);
		al.add(200);
		
//ascending order
		Collections.sort(al);  
		System.out.println(al);
		
//decending order		
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i<j?1:-1;
			}			
		};
		Collections.sort(al, c);
		System.out.println(al);
	}
}
