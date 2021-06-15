package assignments;

import java.util.Stack;

//6 & 7 Implement stack with all operations to add Integer elements

public class AssignStackAddInteger {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(190);
		st.push(100);
		st.push(110);
		st.push(210);
		
		System.out.println(st);
		
			for(Integer o: st) {
				System.out.print(o+" ");
			}
	}

}
