package assignments;

/*
 * 22.Given two strings, first string is a sentence and the second string is a character. You need to write a function 
 * to print number of characters in between the occurrences of second-string excluding spaces. 
 * String1 = “I love java programming” String2 =”o”
 * 
 * here I converted string to char Array
 */

public class AssignReadCharArray {

	public static void main(String[] args) {
		String str1 = "I love java programming";
		char []Cstr1 = str1.replaceAll(" ", "").toLowerCase().toCharArray();
		String str2 = "o";
		read(Cstr1,str2);
	}

	public static void read(char[] Cstr1, String str2) {
		boolean find = false;
        for( int i = 0; i<Cstr1.length; i++) {
             if (String.valueOf(Cstr1[i]).equals(str2)){
            	 find = !find;
            	 }
             if(find && Cstr1[i] != 'o') {
             System.out.print(Cstr1[i]);
        }

	}

}
}

