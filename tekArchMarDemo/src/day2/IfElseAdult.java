package day2;

import java.util.Scanner;

//5. use if else conditions for isMarried variables. Age as adult or not

public class IfElseAdult {

	public static void main(String[] args) {
	    Scanner inputScan = new Scanner(System.in);
	    System.out.println("Enter the age of the person");
		int iAge = inputScan.nextInt();
		
		if ( iAge>18 ) {
			System.out.println("The person is adult");
		}
		else {
			System.out.println("The person is not adult");
			
		}

	}

}
