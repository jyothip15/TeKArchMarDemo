package day10;

public class Z implements X,Y{

	public static void main(String[] args) {
		Z z = new Z();
		z.display();

	}

	public void display() {
		
		X.super.display();
		Y.super.display();
	}

	public void test() {
		
		
	}

}
