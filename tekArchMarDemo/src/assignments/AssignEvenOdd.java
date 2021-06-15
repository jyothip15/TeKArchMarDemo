package assignments;
/*  This program works only if equal number of even and odd
 * 
 *  WJP: given an array of elements print 1 even and 1 odd number in sorted way. 
 *  input : 7 4 8 3 2 10 6 5 output: 2 3 4 5 6 7 8
 *  
 */
import java.util.Arrays;

public class AssignEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {13,4,8,3,2,10,6,7,11,5};
		int n = arr.length;
		int arrResult[] = new int [n];
		int arrEven[] = new int [n/2];
		int arrOdd[] = new int [n/2];
		int temp;
		
//sorting the array		
		for (int i = 0; i<n ;i++) {
			for( int j = i+1; j<n ;j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

	int counterOdd=0,counterEven=0;
	for(int i = 0; i< arr.length; i++)
	{
		if( arr[i] % 2 == 0) 
		{
			arrEven[counterEven] = arr[i];
			counterEven++;
		}
		else
		{
			arrOdd[counterOdd] = arr[i];
			counterOdd++;
		}
			
	}
	
	int counter = 0;
	for (int i=0;i<(n/2);i++)
	{ 
		arrResult[counter] = arrEven[i];
		counter++;

		arrResult[counter] = arrOdd[i];
		counter++;
	}

	System.out.println(Arrays.toString(arrResult));
    //System.out.println(Arrays.toString(arrEven));
	
	}

}
