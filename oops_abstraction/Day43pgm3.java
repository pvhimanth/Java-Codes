package oops_abstraction;

/* Normal class can extends abstract class,
 * To access abstract methods in abstract class,need to override the
 * abstract method and has to access through child class
 */
abstract class Demo1 {
	abstract void disp();
}

class Demo2 extends Demo1 {
	@Override
	void disp() {
		System.out.println("Hi");
	}
}

public class Day43pgm3 {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.disp();
	}
}
