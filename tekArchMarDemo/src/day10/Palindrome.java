package day10;

public class Palindrome {

	public static void main(String[] args) {
		int arr[] = {1,2,2,1};
		int n = arr.length;
		boolean flag = false;
		for(int i = 0; i<n ;i++) {
			for(int j = n-1-i; j>0; j--) {
				if( arr[i] != arr[j]) {
					flag = false;
					break;
					
				}
				else
				{
					flag = true;
				}
			}
		}
		if(flag) {
			System.out.println("Palindrome");}
		else
		{
			System.out.println("Not Palindrome");	
		}
	}
}
