package oops_interfaces;

// we can give concrete methods in interface but has to default
interface Book {
	default void name() {

	}

	/*
	 * Error as method has to be default
	 *  void author() { 
	 *  }
	 */
}
public class Day47pgm1 {
	public static void main(String[] args) {

	}
}
