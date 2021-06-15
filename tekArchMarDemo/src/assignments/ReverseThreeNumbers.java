package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be based on 
 * var k. Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
 *                            
 */
public class ReverseThreeNumbers 
{

	public static void main(String[] args) 
	{
		int []inputArray = {3,2,4,7,0,3,1,5,8,4};
		
		int k = 3;
		int counter=1;
		List<Integer> lstArray = new ArrayList<>();
		
		for (int i=0;i<inputArray.length;i++)
		{
			lstArray.add(inputArray[i]);

			if (counter==k)
			{
				
				int[] tmpArray = lstArray.stream().mapToInt(Integer::intValue).toArray();
				tmpArray=reverse(tmpArray);
				System.out.println(Arrays.toString(tmpArray));
				counter=0;		
				lstArray.clear();
			}
			counter++;
		}
	}

	
	public static int[] reverse(int[] inputArray) 
	{
		for(int i = 0; i < inputArray.length / 2; i++)
		{
		    int temp = inputArray[i];
		    inputArray[i] = inputArray[inputArray.length - i - 1];
		    inputArray[inputArray.length - i - 1] = temp;
		}
		return inputArray;
	}
	
	
}
