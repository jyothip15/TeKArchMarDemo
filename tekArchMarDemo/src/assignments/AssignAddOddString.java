package assignments;
/*
 *  WJP program where String = "1,2,3,4,5,6,7,8,9" from this string add all odd number
 *  WITHOUT converting string to Character Array.
 */
public class AssignAddOddString {
	public static void main(String[] args) {
		String inputString = "1,2,3,4,5,6,7,8,9,11";
        String[] inputStringArray = inputString.split(",");
		int sum = 0;
		for( int i = 0; i<inputStringArray.length; i++) {
			if(Integer.parseInt(inputStringArray[i]) %2 != 0 ) {
				sum = sum + Integer.parseInt(inputStringArray[i]);
			}
		}
		System.out.println("The sum of odd numbers in the string is "+ sum);
	}

}
