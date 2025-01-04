package oops_interfaces;

/* Rule 6: We can achieve multiple inheritance with interfaces....
 * As one class can implement multiple interfaces
 */
interface CalculatorJ {
	void add();

	void sub();
}

interface CalculatorK {
	void mul();

	void div();
}

class MyCalculatorL implements CalculatorJ, CalculatorK {
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

	@Override
	public void div() {
		System.out.println("dividing");
	}

}

public class Day46pgm3 {
	public static void main(String[] args) {
		MyCalculatorL mc = new MyCalculatorL();

		System.out.println("---------With Polymorphism----------");
		CalculatorJ c1;
		c1 = mc;
		c1.add();
		c1.sub();
		CalculatorK c2;
		c2 = mc;
		c2.mul();
		c2.div();

		System.out.println("---------Without Polymorphism--------");
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
