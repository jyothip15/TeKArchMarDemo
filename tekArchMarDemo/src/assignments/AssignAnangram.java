package assignments;
//Write a Java program to check whether two strings are anagram or not?
import java.util.Scanner;

public class AssignAnangram {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = inputScan.nextLine();
		System.out.println("Enter the second String");
		String str2 = inputScan.nextLine();
		boolean flag = true;
		int count1,count2;
		String letters = "";
		char array1[] = str1.replace(" ","").toLowerCase().toCharArray();
		char array2[] = str2.replace(" ","").toLowerCase().toCharArray();
		if (array1.length != array2.length) {
			flag = false;
			System.out.println("The given strings arenot anagrams");
		}
		else {
			for( int i=0; i<array1.length; i++) {
				if(letters.indexOf(array1[i]) >= 0) {
					continue;
				}
				letters = letters + array1[i];
				count1 = 1;
				for( int j=i+1; j<array1.length; j++) {
					if(array1[i] == array1[j] ) {
						count1++;
					}
					count2 = 0;
					for( int k=0; k<array1.length; k++) {
						if(array1[i] == array1[k] ) {
							count2++;
						}
					}
				   if(count1 != count2) {
					   flag = false;
					   System.out.println("The given strings are anagrams");
					   break;
				   }
				}
			}

			if(flag) {
				System.out.println("The given strings are anagrams");
			}
		}

	}
}

