package day10;

public class D implements B,A{

	public static void main(String []args) {
		D d = new D();
		d.display();
		
	}


	public void display() {
		

		B.super.display();
	}

	
}