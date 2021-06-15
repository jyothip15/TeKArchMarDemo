	package assignments;
/*
 * Input string= “ABCAABCAEBEE” which character is duplicated less/leaser number of times.
 * 
 */
public class AssignDuplicate {

	public static void main(String[] args) {
		String str = "ABCAABCAEBEE";
		int output[] = new int[128];
		int minItem=0;
		char minItemChar=' ';
		for( int i = 0; i< str.length(); i++) {
			if( str.charAt(i) != ' ') {
				output[str.charAt(i)]++;
			}
		}
		for(int j = 0; j<output.length; j++) {    	     
			if (output[j] > 0) {
				if (minItemChar == ' ')  {				
					minItem = output[j];
					minItemChar = (char)(j);
				}
		        if(output[j] < minItem){
					minItem = output[j];
					minItemChar = (char)(j);
				}
			}
		}

		System.out.println(minItemChar+" occurred "+minItem+" times");
	}
}