package day9;

import java.io.FileNotFoundException;

public class MethodException {

	public static void divide(int a, int b) {
		int result = a/b;
		System.out.println(result);
	}
  static void readFile() throws FileNotFoundException {
	  throw new FileNotFoundException();
  }
	public static void main(String[] args) throws FileNotFoundException{
		readFile();
		try {
			divide(5,5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	    readFile();
	}
	

}
