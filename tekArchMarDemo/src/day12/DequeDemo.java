package day12;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class DequeDemo {

	public static void main(String[] args) {
	ArrayDeque<Integer> aqd = new ArrayDeque<>();
//	PriorityQueue<Integer> aqd = new PriorityQueue<>();
//
//	aqd.addFirst(24);
	aqd.add(25);
	aqd.add(200);
	aqd.add(25);
//	aqd.addLast(100);
	aqd.add(200);
	System.out.println(aqd);
//peek and poll
	Iterator<Integer> it = aqd.iterator();
	
	}
	

}
