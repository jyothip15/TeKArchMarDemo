package day4;

public class StringSplit {

	public static void main(String[] args) {
		String sWord = "Welcome to Tekarch";
		for (int i = sWord.length()-1; i>=0; i--)
			System.out.print(sWord.charAt(i));
            System.out.println();
		String[] sInput = sWord.split(" ");
		for (int i = sInput.length-1; i>=0; i--)
			System.out.print(sInput[i]+" ");

	}

}
