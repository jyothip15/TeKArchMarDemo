package day10;

public class Fish implements Animal{
	public void foodType() {
		System.out.println("fish bugs");
	}
	public  void bloodType() {
		System.out.println(" fish blood");
	}
	public void legs() {
		System.out.println("fish no legs");
	}

	
		public static void main(String[] args) {
			Fish f = new Fish();
			f.bloodType();
			f.legs();
			f.foodType();


		}

	}
