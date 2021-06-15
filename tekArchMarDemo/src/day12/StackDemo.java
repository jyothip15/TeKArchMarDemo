package day12;

import java.util.Stack;

public class StackDemo {
	
public static void main(String[] args) {
	Stack<Integer> sd = new Stack<Integer>();
	sd.push(2);
	sd.add(204);
	sd.push(22);
	sd.add(204);
	sd.push(211);
	sd.add(224);
	System.out.println(sd);
	
	  System.out.println(sd.pop());
	  System.out.println();
	  System.out.println(sd.peek());
	 
       System.out.println();
	for(int i: sd) {
		System.out.println(i);
		
	}
	
}
}
