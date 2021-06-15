package day2;

import java.util.Scanner;

/*
 *  6. Write a program to analyse the healthy persons height and weight
    height is above 3 - 4 : Weight should be 15 - 30
    height is above 4 - 5 : Weight should be 50 - 60  
     5 - 6 :      60 - 75
     6 - 8 :      75 - 120
 * 
 */
public class IfElseHealthy {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the height of the person");
		int	iHeight = inputScan.nextInt();
		System.out.println("Enter the weight of the person");
		int	iWeight = inputScan.nextInt();
		
		if(iHeight>3 && iHeight<5) {
			if(iWeight>=15 && iWeight<=30 ) {
				System.out.println("The person is healthy");
			}
			else {
				System.out.println("The person is NOT healthy");
			}
		}
		else if(iHeight>4 && iHeight<6)
		{
			if(iWeight>=50 && iWeight<=60 ) {
				System.out.println("The person is healthy");
			}
			else {
				System.out.println("The person is NOT healthy");
			}
		}

	}

}
