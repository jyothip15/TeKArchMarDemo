package day8;

public class StaticDemo {
	
	public static void main(String[] args) {

		final int s = 100;
		Entry.test();
		Entry.i =5;
		System.out.println(Entry.i);
        Entry e = new Entry();
        e.j = 10;
        e.testing();
        System.out.println(e.j);

		
	}

}
