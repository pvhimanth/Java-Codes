package oops_abstraction;

/* Abstract class can extends Normal class,
 * concrete methods present in normal class can be overridden
 * by abstract class , but can't able to create object for abstract class
 * To access methods we need another class extending abstract class
 * for that class we can create object can access methods
 */
class Demo11 {
	void disp() {
		System.out.println("Hi");
	}
}

abstract class Demo22 extends Demo11 {
	@Override
	void disp() {
		System.out.println("Hi,how are you?");
	}
}

class Demo33 extends Demo22 {

}

public class Day43pgm4 {
	public static void main(String[] args) {
		Demo33 d = new Demo33();
		d.disp();
	}
}