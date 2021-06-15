package assignments;
/*
 * Q16. Write a method that will remove given character from the String?
package hackathon;

 */

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = inputScan.nextLine();
		System.out.println("enter the char");
		String ch = inputScan.nextLine();
		if(str.contains(ch)) {
			str = str.replace(ch, "");
			System.out.println(str);
		}
		else {
			System.out.println("The given character "+ch+" is Not present");
		}

	}
}
