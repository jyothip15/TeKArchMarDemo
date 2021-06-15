package assignments;

import java.util.Stack;

public class FactorialStack {

	public static void main(String[] args) {

		int number1 = 10; int fact1 = 1; 
		for(int i =1;i<=number1; i++) {
			fact1 = fact1*i;
		} 
		System.out.println(fact1);
		System.out.println("Using stack");

		int number = 10;
		int fact = 1;
		Stack<Integer> st = new Stack<>();
		while(number!=0) {
			st.push(number);
			number = number-1;
		}
		while(!st.isEmpty()) {
			fact = fact * st.pop();
		}
		System.out.println(fact);
	}

}
