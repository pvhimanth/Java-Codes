package oops_interfaces;

// default methods in interface can be overridden in implemented classes
interface ItCompanies {
	default void company() {
		System.out.println("Google");
	}
}

class Tech implements ItCompanies {
	@Override
	public void company() {
		System.out.println("Apple");
	}
}

public class Day47pgm4 {
	public static void main(String[] args) {
		Tech t = new Tech();
		t.company();
	}
}
