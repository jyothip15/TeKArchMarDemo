package assignments;

//2.Convert List content to Array.

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(500);
		al.add(100);
		al.add(300);
		al.add(600);
		al.add(200);
    	
		Integer toArray[] = new Integer[al.size()];
		toArray = al.toArray(toArray);
		
		for(int o: al) {
			System.out.println(o);
		}
		System.out.println("************");
		for(int o: toArray) {
			System.out.println(o);
		}

	}

}
