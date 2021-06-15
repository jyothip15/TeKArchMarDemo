package assignments;

import java.util.Scanner;
import java.util.Stack;

//15.Reverse the given string using stack

public class AssignReverseStringStack {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the input");
		String inputString = inputScan.nextLine();
		inputScan.close();
		Stack<Character> st = new Stack<Character>();
		for(int i=inputString.length()-1;i>0; i--) {
			st.push(inputString.charAt(i));

		}
	//	System.out.println(st);
		
		for(Character o: st) {
			System.out.print(o);
		}
	}

}
