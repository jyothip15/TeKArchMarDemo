package day10;

public interface G {
	
	abstract void test();
	default void display() {
		System.out.println("from G");
		
	}
}
