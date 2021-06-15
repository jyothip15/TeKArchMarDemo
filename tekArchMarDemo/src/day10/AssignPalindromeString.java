package day10;

public class AssignPalindromeString {

	public static void main(String[] args) {
		String inputString = "Malayalam";
		inputString = inputString.replace(" ", "").toLowerCase();
		int n = inputString.length(); 
		boolean isTrue = true;
		for(int i = 0; i<n; i++) {
			for(int j = n-1-i; j>0; j--) {
				if(inputString.charAt(i) != inputString.charAt(j)) {
					isTrue = false;
					break;
				}
				else {
					isTrue = true;
				}

			}
		}
		if(isTrue) {
			System.out.println(inputString+" is Palindrome");
		}
		else {
			System.out.println(inputString+" is Not Palindrome");
		}

	}
}
