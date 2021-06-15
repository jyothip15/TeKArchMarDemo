package assignments;

import java.util.Arrays;

/*
 * Write an algorithm to reverse first 3 numbers,then next 3 numbers, then next 3 numbers,the number will be based on var k. 
 * input Array = [3,2,4,7,0,3,1,5,8, 4] & k=3 
 * OutPut = [4,2,3,3,0,7,8,5,1,4]
 *          [4, 2, 3, 3, 0, 7, 8, 5, 1, 4]
 */
public class AssignReverseThreeNumbers {

	public static void main(String[] args) {
		int arr[] = {3,2,4,7,0,3,1,5,8,4};
		int n = arr.length;
		int k = 3;
		reverse(arr,n,k);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int [] arr,int n,int k) {

		for(int i=0; i<n; i=i+k) {
			int left = i;
			int temp;
			int right = Math.min(i+k-1, n-1);
			while(left<right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left = left + 1;
				right = right - 1;
			}
		}

	}

}
