package oops_interfaces;

interface Monitor {
	default void company() {
		System.out.println("LG");
	}
}

class Tv implements Monitor {
	/*
	 * ERROR----default methods are public
	 * 
	 * @Override void company() { 
	 * 		System.out.println("Samsung");
	 * }
	 */
	@Override
	public void company() {
		System.out.println("Samsung");
	}
}

public class Day47pgm5 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.company();
	}
}
