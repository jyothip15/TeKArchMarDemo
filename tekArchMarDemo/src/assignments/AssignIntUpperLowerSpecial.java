package assignments;
/*
 * WJP to count the Uppercase, lowercase, numbers and special characters in the string.
 */
import java.util.Scanner;

public class AssignIntUpperLowerSpecial {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the input String");
		String inputString = inputScan.nextLine();
		int upperCount = 0; 
		int lowerCount = 0; 
		int digitCount = 0; 
		int specialCount = 0; 
		for(int i = 0; i<inputString.length(); i++) {
			if(Character.isUpperCase(inputString.charAt(i))) {
				upperCount++;
			}
			else if(Character.isLowerCase(inputString.charAt(i))) {
				lowerCount++;
			}
			else if(Character.isDigit(inputString.charAt(i))) {
				digitCount++;
			}
			else {
				specialCount++;
			}
		}
		System.out.println(" uppercase count is "+upperCount);
		System.out.println(" lowercase count is "+lowerCount);
		System.out.println(" digit count is "+digitCount);
		System.out.println(" special count is "+specialCount);
	}
}
