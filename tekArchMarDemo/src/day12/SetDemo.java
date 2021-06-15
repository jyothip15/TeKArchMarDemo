package day12;
/*
 * Remove the duplicates 
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
			
			Set<Character> object = new HashSet<>();
			String str = "abcabc";
			for(int i = 0;i<str.length();i++) {
				object.add(str.charAt(i));
			}
			
			  for(Character ch : object) { 
				  System.out.print(ch+ " "); }
			}

	}


