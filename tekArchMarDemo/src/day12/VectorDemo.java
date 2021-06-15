package day12;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vl = new Vector<Integer>();
		vl.add(191);
		vl.add(109);
		vl.add(119);
		for(int i : vl) {
			System.out.println(i);
		}
      Iterator<Integer> it = vl.iterator();
      
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }
	}

}
