package oops_inheritance;

//constructors can't be inherited but prints using super() call
class Parentp {
	Parentp() {
		System.out.println("Inside parent constructor");
	}
}

class Childc extends Parentp {
	Childc() {
		System.out.println("Inside child constructor");
	}
}

public class Day35pgm2 {
	public static void main(String[] args) {
		Childc c = new Childc();

	}
}
