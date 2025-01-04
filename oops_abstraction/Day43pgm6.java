package oops_abstraction;

/* abstract class can  have constructor but need child class
 * to execute constructor of abstract class using super call 
 */
abstract class Demop {

	public Demop() {
		System.out.println("Inside Demo1");
	}

}

class Demoq extends Demop {

	public Demoq() {
		System.out.println("Inside Demo2");
	}

}

public class Day43pgm6 {
	public static void main(String[] args) {
		Demoq d = new Demoq();
	}
}
