package day10;

public class Penguin implements Animal{
	
			public void foodType() {
				System.out.println("Penguin bugs");
			}
			public  void bloodType() {
				System.out.println("Penguin blood");
			}
			public void legs() {
				System.out.println("Penguin legs");
			}

			
				public static void main(String[] args) {
					Penguin p = new Penguin();
					p.bloodType();
					p.legs();
					p.foodType();


				}

	}

