package day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
//		HashMap<String,String> hm = new HashMap<String,String>();
//	    LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
	    TreeMap<String,String> hm = new TreeMap<String,String>();
		hm.put("one", "Jyothi");
		hm.put("two", "Advaith");
		hm.put("three", "Ananth");
		hm.put("two",null);
		hm.put("one", "abc");
		System.out.println(hm);
	}

}
