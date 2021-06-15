package day11;

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 100;
		Integer iObject1 = new Integer(100);
		System.out.println(iObject1 );
		Integer iObject2 = new Integer("100");
		System.out.println(iObject2);
		
		Character cObject1 = new Character('c');
		System.out.println(cObject1);
		
		
		int j = 100;
		String s = String.valueOf(j);
		System.out.println(j);
		
		String str = "100";
		int intStr = Integer.valueOf(str);
		System.out.println(str);
		
		Integer var = new Integer("100");
		int k = var.intValue();
		
		
	}

}
