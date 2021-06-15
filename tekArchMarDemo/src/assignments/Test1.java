package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		l=sc.nextInt();
		int a[]=new int [l];
		System.out.println("Enter the "+l+ "integer values: ");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		findout(l,a);
	}
	public static void findout(int s, int b[])
	{
//		Arrays.sort(b);
	    int temp = 0;
		for(int i=0;i<s;i++) {
			for(int j = 0;j<s;j++ ) {
				if(b[i]<b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;					
				}
			}
		}
		for(int i=0;i<s;i++)
		{
			int count=1;
			for(int j=i+1;j<s;j++)
			{
				if (b[j]==b[j-1])
				{
					count ++;
					i++;
				}
				else
					break;
			}
			if(count==1)
			{
				System.out.println("the "+ b[i]+" is unique no");
			}
			else
			{
				System.out.println("The occurence of "+b[i]+" is "+count);
			}
		}
		System.out.println("the array is "+ Arrays.toString(b));
	}



}


