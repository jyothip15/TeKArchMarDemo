package day5;
/**** code from class************
   * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */
public class Pattern3 {

	public static void main(String[] args) {
		int lines = 5;
		for (int i = 0; i<lines; i++) {

			for (int j = i+1; j<lines; j++) {
				System.out.print(" ");
			} 
			for( int k= 0;k<=i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		lines--;
		for (int i = 0; i<lines; i++) {
			for( int k = 0; k<=i; k++) {
				System.out.print(" ");
			}

			for( int j = i; j<lines; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();

		}
	}
}