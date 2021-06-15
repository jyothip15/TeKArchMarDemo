package day10;

public class Tiger implements Animal{

		public void foodType() {
			System.out.println("Tiger meat");
		}
		public  void bloodType() {
			System.out.println(" Tiger blood");
		}
		public void legs() {
			System.out.println("Tiger legs");
		}

		
			public static void main(String[] args) {
				Tiger t = new Tiger();
				t.bloodType();
				t.legs();
				t.foodType();


			}
}
