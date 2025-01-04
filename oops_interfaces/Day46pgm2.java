package oops_interfaces;

/* Rule5: If one implemented method is abstract,another method 
 * is overridden have to declare class as abstract
 */

interface Calculator33 {
	void add();

	void sub();
}

abstract class MyCalculator33 implements Calculator33 {
	@Override
	public void add() {

	}
}

public class Day46pgm2 {
	public static void main(String[] args) {

	}
}
