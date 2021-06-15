package assignments;

//1.Program to remove duplicates from a string input= “abcabcabc” output = “abc”

public class AssignDupRemove {

	public static void main(String[] args) {
		String str = "abcabcabc";
		char [] array = str.toCharArray();
		String letters = "";
		for (int i = 0; i<array.length; i++) {
			if ( letters.indexOf(array[i]) >= 0 || array[i] == ' ') {
				continue;
			}
			letters = letters + array[i];
		}
		System.out.println("After removing the duplicates the string : "+letters);
	}
}

