package assignments;
/*
 * 20.Reverse the words in a given string – a.Input string: I am learning OutputString: learning am I
 * 
 */
import java.util.Scanner;

public class AssignReverseWords {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = inputScan.nextLine();
		inputScan.close();
		
		String [] cArray = str.split(" ");
		for( int i = cArray.length-1; i>=0; i--) {
			System.out.print(cArray[i]+" ");
			
		}
		
		
	}

}
