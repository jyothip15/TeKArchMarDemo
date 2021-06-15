package assignments;
/*
 *  Given two strings, first string is a sentence and the second string is a character.
 *   You need to write a function to print unique number of characters in between the occurrences of second-string 
 *   excluding spaces. String1 = “I love java programming” String2 =”o”
 */
public class AssignUnique {
		public static void main(String[] args) {
			String str1 = "I love java programming";
			char []Cstr1 = str1.replaceAll(" ", "").toLowerCase().toCharArray();
			String str2 = "o";

			boolean find = false;
			int [] output = new int[128];

			String str ="";
			for( int i = 0; i<Cstr1.length; i++) {
				if (String.valueOf(Cstr1[i]).equals(str2)){
					find = !find;
				}
				if(find && Cstr1[i] != 'o') {
					str = str+String.valueOf(Cstr1[i]);
					System.out.print(Cstr1[i]);
				}

			}
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) != ' ') {
					output[str.charAt(i)]++; 
				}

			}

			System.out.println();
            System.out.println("unique number of characters are");
			for(int i=0; i<output.length; i++) {
               if(output[i] == 1) {
            	   System.out.println((char)(i)); 
               }
			}

		}
	}

