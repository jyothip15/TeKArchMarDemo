package day2;
/*
 * 8. Write an program to print number from 50 - 1 with an decrement of 5 digits
 *  50,45,40,35,30 using while loop and for loop
 */

public class WhileForDecrement {

	public static void main(String[] args) {
		int iCount = 50;
		System.out.println("***************while*****************************");
		while(iCount >= 0) {
			System.out.println(iCount);
			iCount = iCount-5;
		}
		
		System.out.println("***************for*****************************");
		for( iCount = 50; iCount > 0; iCount = iCount-5) {
          System.out.println(iCount);
		}


	}

}
