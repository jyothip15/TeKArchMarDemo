package assignments;

import java.util.Arrays;

/*
 *WJP: given an array of elements print 1 even and 1 odd number in sorted way. 
input : 7 4 8 3 2 10 6 5
output: 2 3 4 5 6 7 8
 * 
 */
public class AssignEvenOddWithBuiltInFn {
	public static void main(String[] args) {
		int [] inputArray = {1,7,6,4,8,2,10,6,5};
		
		Arrays.sort(inputArray);
		
		System.out.println(Arrays.toString(inputArray));
		
	}


}
