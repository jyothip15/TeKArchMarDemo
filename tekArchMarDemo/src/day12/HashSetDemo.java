package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		//		HashSet<Integer> hs = new HashSet<>();
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(25);
		hs.add(215);
		hs.add(100);
		hs.add(215);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add(25);
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
