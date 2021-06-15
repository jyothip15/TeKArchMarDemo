package day7;

public class Entry {

	public static void main(String[] args) {
	
		System.out.println(AccessMode.i = 5);
		System.out.println(AccessMode.k = 20);
		AccessMode.setJ(2010);
		
		System.out.println(AccessMode.getJ());
	}

}