package assignments;

/*Check the palindrome of the following in separate programsa.     
For a interger a = 123321b.      For string s =”MALAYALAM”
*/
public class AssignPalindromeInteger {

	public static void main(String[] args) {
		int number = 123321;
		
		int originalnumber = number;
		int reversedInteger = 0;
		int reminder = 0;
		 
		while(number !=0) {
			reminder = number % 10;
			reversedInteger  = reversedInteger*10 + reminder ;
			number = number / 10;
			}
		if ( reversedInteger == originalnumber) {
			System.out.println(originalnumber +"  is Palindrome");
		}
		else{
			System.out.println(originalnumber +"  is Not Palindrome");
		}
			
	}

}

