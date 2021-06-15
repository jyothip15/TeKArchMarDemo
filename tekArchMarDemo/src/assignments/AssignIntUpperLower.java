package assignments;

//8.WJP to find total number of integers, uppercase and lowercase character in the give string.

import java.util.Scanner;

public class AssignIntUpperLower {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = inputScan.nextLine();
		inputScan.close();
		int digitCount = 0;
		int upperCount = 0;
		int lowerCount = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upperCount++;
			}
            if(Character.isLowerCase(str.charAt(i))) {
            	lowerCount++;
            }
            if(Character.isDigit(str.charAt(i))) {
            	digitCount++;
            }
		}

		System.out.println("Total number of uppercase "+upperCount );
		System.out.println("Total number of lowercase "+lowerCount );
		System.out.println("Total number of digits "+digitCount );
	}
}
