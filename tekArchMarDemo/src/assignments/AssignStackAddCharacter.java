package assignments;

//Implement stack with all operations to add Character elements

import java.util.Stack;

public class AssignStackAddCharacter {

	public static void main(String[] args) {

		Stack<Character> st = new Stack<Character>();
		st.push('c');
		st.push('d');
		st.push('E');
		st.push('y');
		System.out.println(st);
		
		for(Character o: st) {
			System.out.print(o+" ");
		}
	}

}
