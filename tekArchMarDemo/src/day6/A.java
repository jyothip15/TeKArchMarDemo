package day6;

public class A {

	public static void main(String[] args) {
		A a1= new A();
		
		Car c1 = new Car();
		c1.color = "blue";
		Car.seats = 4;
		Car c2 = new Car();
		c2.color = "red";
		Car.seats = 4;
		c1.startEngine();
		Car.turnRight();
		System.out.println();
		c2.startEngine();
		Car.turnRight();
		System.out.println(c2.color);
	}

}
