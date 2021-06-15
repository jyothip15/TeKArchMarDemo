package day10;

public interface X extends G{

	default void display() {
		System.out.println("from x");
		
	}
}
