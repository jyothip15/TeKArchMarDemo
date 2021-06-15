package assignments;

//Implement stack with all operations to add String elements 

import java.util.Stack;

public class AssignStackAddString {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("Java");
		st.push("is");
		st.push("a");
		st.push("good");
		st.push("language");
		
		
		System.out.println(st);
		
		for(String o: st) {
			System.out.print(o+" ");
	}

}
}