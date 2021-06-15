package day10;

public class AssignFish extends AssignAnimal{

	public static void main(String[] args) {
		AssignFish fish = new AssignFish();
        fish.bloodType();
        fish.foodType();
        		
	}


	public void foodType() {
		System.out.println("eats small bugs");
		
	}

	public void bloodType() {
		System.out.println("fish blood is cold ");
		
	}

}
