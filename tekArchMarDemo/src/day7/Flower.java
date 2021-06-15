package day7;

public class Flower {

	static String petals;
	static String  color;

	Flower(String color){
		//this.color = color;
		/*System.out.println(this.color);
		String petals = "four";
		System.out.println(color);
		System.out.println(this.color);
		System.out.println();
		System.out.println(petals);
		System.out.println(this.petals);
		this.petals = petals;
		System.out.println(petals);*/
	}

	/*
	 * Flower() { String petals;
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Flower rose = new Flower("red");
		
		Flower.petals = "yellow";
		
	}

}
