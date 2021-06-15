package day7;

public class AccessMode {

	static int i;
	private static int j;
	public static int k;
	

	public static void setJ(int w) {
		AccessMode.j = w;
	}
	public static int getJ() {

		return AccessMode.j;
	}

	public static void main(String[] args) {

		AccessMode.j = 5;
		AccessMode.i = 3;

	}

}

