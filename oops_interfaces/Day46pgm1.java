package oops_interfaces;

/* Rule4:can't access specialized methods directly has to downcasting
 * class which implements interface
 */
interface Calculator22 {
	void add();

	void sub();
}

class MyCalculator22 implements Calculator22 {
	@Override
	public void add() {
		System.out.println("adding");
	}

	@Override
	public void sub() {
		System.out.println("subtracting");
	}

	public void mul() {
		System.out.println("product");
	}

}

public class Day46pgm1 {
	public static void main(String[] args) {
		MyCalculator22 mc = new MyCalculator22();
		Calculator22 c;
		c = mc;
		c.add();
		c.sub();
//		c.mul();--->error
		((MyCalculator22) (c)).mul();
	}
}
