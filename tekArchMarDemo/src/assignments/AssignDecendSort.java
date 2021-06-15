package assignments;

import java.util.Arrays;

/*
 * WJP to do descending order sorting for the given array. Array = [3,2,4,7,0,3,1,5,8, 4]
 * 
 */
public class AssignDecendSort {

	public static void main(String[] args) {
		int arr[] = {3,2,4,7,0,3,1,5,8,4};
		int n = arr.length;
		int arr1[] = new int [n];
		int temp;
		for (int i = 0; i<n ;i++) {
			for( int j = i+1; j<n ;j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<n; i++) {
			arr1[i] = arr[i]; 
		}
		
	}

}
