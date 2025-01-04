package oops_interfaces;

/* Functional interface- interface with only one abstract method and with
 * one or many type of default, static, private, private static methods
 */
@FunctionalInterface
interface Demo11 {
	public abstract void disp();

	default void disp2() {

	}

	static void disp3() {

	}

	private void disp4() {

	}

	private static void disp5() {

	}

}

/*  ERROR---> we can't able to give more than one abstract mehtod in FunctionalInterface
  	@FunctionalInterface
	interface Ab{
		void disp1();
		void disp2();
	}
 */




/* here we can't get error as we can't give @FunctionalInterface annotation 
 * so, java treated like this as normal interface which contain one or more abstract methods
 */

interface Computer{
	void ram();
	void cpu();
}

public class Day48pgm3 {
	public static void main(String[] args) {

	}
}
