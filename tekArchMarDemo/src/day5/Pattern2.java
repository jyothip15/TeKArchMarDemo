package day5;
/**** Pattern************
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 

 ********************************/

public class Pattern2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i = 4; i > 0; i--){
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();

		}
	}
}


