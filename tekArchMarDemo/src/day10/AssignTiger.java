package day10;

public class AssignTiger extends AssignAnimal{

	public static void main(String[] args) {
		AssignTiger tiger = new AssignTiger();
        tiger.bloodType();
        tiger.legs();
        tiger.foodType();
	}

	public void foodType() {
		System.out.println("eats meat");
		
	}

	public void bloodType() {
		System.out.println("blood is warm ");
		
	}

}
