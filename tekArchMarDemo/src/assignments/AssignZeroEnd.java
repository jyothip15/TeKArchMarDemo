package assignments;

import java.util.Arrays;

/*
 *Push all the zeros element to the end of the array
 *input1={5,0,6,0,7} output={5,6,7,0,0}
 * 
 */
public class AssignZeroEnd {

	public static void main(String[] args) {
		int [] array = {5,0,6,0,7};
		int  lastIndex = array.length-1;
		int temp = 0;
		for(int i=lastIndex; i>=0; i--) {
			if(array[i] == 0) {
				for( int j = i;j<lastIndex; j++) {
					if(array[j+1] == 0 || j == lastIndex) {
						break;
					}
			else {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					}
				}
			}
		}

		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+",");
		}
		System.out.println("\nUsing toString() method");
		System.out.println(Arrays.toString(array));
	}

}
