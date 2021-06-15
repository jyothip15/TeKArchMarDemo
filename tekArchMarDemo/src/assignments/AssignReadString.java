package assignments;

/**
 * 22.Given two strings, first string is a sentence and the second string is a
 * character. You need to write a function to print number of characters in
 * between the occurrences of second-string excluding spaces. String1 = “I love
 * java programming” String2 =”o”
 * 
 * same problem as AssignReadCharArray 
 * here I didnot convert string to char Array
 */


public class AssignReadString {

	public static void main(String[] args) {
		String str1 = "I love java prOgramming";
		str1 = str1.replaceAll(" ", "").toLowerCase();
		String str2 = "o";
		read(str1,str2);
	}
	public static void read(String str1,String str2) {
		    boolean find = false;
			for(int i = 0;i<str1.length();i++) {
				if (str1.charAt(i) == str2.charAt(0)){
					find = !find;
				}
				if(find && (str1.charAt(i)) != 'o') {
					System.out.println(str1.charAt(i));
				}
			}
		}

	}

