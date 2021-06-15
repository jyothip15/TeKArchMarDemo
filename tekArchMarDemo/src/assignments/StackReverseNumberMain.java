package assignments;

//Java program to reverse the number

import java.util.Stack;

public class StackReverseNumberMain {

	public static void main(String[] args) {
	    int number = 12345;
	    Stack<Integer> st = new Stack<>();
	    int reminder = 0,reverse = 0;
	    int i = 1;
	    
	    while(number!=0) {
	    	reminder = number%10;
	    	st.push(reminder);
	    	number = number/10;
	    }
	    while(!st.isEmpty()) {
	    	reverse = reverse + (st.peek()*i);
	    	st.pop();
	    	i = i*10;
	   }
	System.out.println(reverse);
	}

}
