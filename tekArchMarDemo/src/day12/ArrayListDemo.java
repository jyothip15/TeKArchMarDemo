package day12;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(240);
		al.add(214);
		al.add(224);
		al.add(234);
		System.out.println(al);
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(444);
		al2.addAll(al);
		System.out.println(al2);
		
		/* al.clear();
		 * System.out.println(al);

		   al.toArray();
		   System.out.println(al);
		 */
       for(int i = 0; i<al.size(); i++) {
    	   System.out.println(al.get(i));
    	   
       }
	
	}

}
