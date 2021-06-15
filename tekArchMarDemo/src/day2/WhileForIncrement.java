package day2;

/*
 *  7. Write an program to print number from 1 - 50 with an increment of 3 digits
 *  1, 4, 7, 10 using while loop and for loop
 * 
 */
public class WhileForIncrement {
	public static void main(String[] args) {
		int iCount = 1;
		System.out.println("***************while*****************************");
		while(iCount < 50) {
			System.out.println(iCount);
			iCount = iCount+3;
		}
		
		System.out.println("***************for*****************************");
		for( iCount = 1; iCount < 50; iCount = iCount+3) {
          System.out.println(iCount);
		}


	}

}
