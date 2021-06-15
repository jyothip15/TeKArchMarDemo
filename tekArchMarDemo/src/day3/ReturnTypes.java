package day3;

import java.util.Scanner;

public class ReturnTypes {

	public static int addition(int a,int b) {
		return a+b;
	}
     public static String concat(String s1,String s2) 
     {
    	return s1+s2; 
     }

	public static void main(String[] args) {

		Scanner inputScan = new Scanner(System.in);
		System.out.println("enter the two integers");
		int i1 = inputScan.nextInt(); 
		int i2 = inputScan.nextInt();  
		System.out.println("enter the first strings to concat");
		String str1 = inputScan.next();
		System.out.println("enter the second strings to concat");
		String str2 = inputScan.next();
		
		System.out.println("The addition of  "+i1 +" and " +i2 +" is "+addition(i1,i2));
		System.out.println("The concat of  "+str1+" and " +str2+" is "+concat(str1,str2));
		inputScan.close();


	}

}
