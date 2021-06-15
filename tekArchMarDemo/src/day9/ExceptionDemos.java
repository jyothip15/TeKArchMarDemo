package day9;

public class ExceptionDemos {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int [] c = {1};
		try
		{
			int result = a/b; 
			System.out.println(result);
			c[0] = 1;
			try {
				throw new ArrayIndexOutOfBoundsException(2);
				//	throw new ArithmeticException();
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());

			//	System.out.println(e.getStackTrace());
		}
		catch(Exception e) {
			System.out.println();
			System.out.println(e.getMessage()); }
		finally {

			System.out.println("Last line");
		}
	}

}
