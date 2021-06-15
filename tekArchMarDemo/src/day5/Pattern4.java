package day5;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = inputScan.nextInt();
		inputScan.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();	
		}
	    n--;
		for( int i = 1; i<=n; i++) {
			for( int j = 1;j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k>=i; k--) {
				System.out.print("*"+" ");
			}
			System.out.println();	
		
		}
		
	}
}
