package oops_interfaces;

/*Rule 9: A class can implement another interface and extend 
 * another class at same time, but order first extends then implements
 */
interface CalculatorE {
	void add();

	void sub();
}

class CalculatorF {
	void mul() {
		System.out.println("product");
	}

	void div() {
		System.out.println("dividing");
	}
}

class MyCalculatorG extends CalculatorF implements CalculatorE {
	@Override
	public void add() {
		System.out.println("adding");
	}

	@Override
	public void sub() {
		System.out.println("subtraction");
	}
	
}

public class Day46pgm7 {
	public static void main(String[] args) {
		MyCalculatorG mc = new MyCalculatorG();
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
