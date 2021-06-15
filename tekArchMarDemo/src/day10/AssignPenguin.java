package day10;

public class AssignPenguin extends AssignAnimal{

	public static void main(String[] args) throws Throwable {
		AssignPenguin penguin = new AssignPenguin();
		penguin.legs();
		penguin.bloodType();
		penguin.foodType();
		
	}

	
	public void foodType() {
		System.out.println("eats fish");
	}

	
	public void bloodType() {
		System.out.println(" penguin blood is cold ");
		
	}

}
