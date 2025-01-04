package oops_interfaces;

/*  Rule3:
 *  By default methods in interface are public and abstract we can't change the 
 *  visibility of methods in interface and we can't create concrete methods in interface
 */
interface Calculator11 {
	void add();

	/*
	 * We can represent methods in interface as below or above ways
	 * 
	 * OR public abstract void add();
	 * 
	 * OR abstract void add();
	 */
}

class MyCalculator implements Calculator11 {
	@Override
	public void add() {

	}

	/*
	 * ERROR--> We can't use other than public as access modifier when overriding
	 * methods of interface as by default methods in interface are public
	 *  
	 * void add(){
	 * 
	 * }
	 */
}

public class Day45pgm2 {
	public static void main(String[] args) {

	}
}
