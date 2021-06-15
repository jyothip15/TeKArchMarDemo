package assignments;

import java.util.Scanner;

//7.Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

public class AssignReverseString {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = inputScan.nextLine();
		inputScan.close();
		
		for( int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
