package assignments;

import java.util.Arrays;

/*
 * WJP for int array = [1,2,3,4,5] running sum of numbers. O/p = [1,1+2,1+2+3,1+2+3+4,1+2+3+4+5] i.e [1,3,5,9,14]
 */
public class AssignForAddition {

	public static void main(String[] args) 
	{
		int [] intArray = {1,2,3,4,5};
		String[]  strOutput=new String[5];
		String currentVal="";
		for (int i = 0; i<intArray.length; i++) 
		{
			if (i==0)
				currentVal=currentVal+intArray[i];
			else
				currentVal=currentVal+"+"+intArray[i];
				
			strOutput[i]=currentVal;
		
		}
		
		System.out.println(Arrays.toString(strOutput));
	}
}