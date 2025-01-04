package oops_interfaces;

/*Rule 8: A interface can extends another interface and can also 
 * inherit from another interface
 */
interface Calculator111 {
	void add();
}

interface Calculator333 {
	void mul();
}

interface Calculator222 extends Calculator111, Calculator333 {
	void sub();
}

class MyCalculatorQ implements Calculator222 {
	@Override
	public void add() {
		System.out.println("adding");
	}

	@Override
	public void sub() {
		System.out.println("subtraction");
	}

	@Override
	public void mul() {
		System.out.println("product");
	}
}

public class Day46pgm6 {
	public static void main(String[] args) {
		MyCalculatorQ mc = new MyCalculatorQ();
		mc.add();
		mc.sub();
		mc.mul();
	}
}
