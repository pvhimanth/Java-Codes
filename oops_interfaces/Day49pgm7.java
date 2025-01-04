package oops_interfaces;

/* Lambda expression only work for FunctionalInterface as it have only have 
 * one abstract method to implement, if its normal interface then ambiguity happens
 * for which abstract method has to implement for lambda expression 
 */

interface DisplayL {
	public abstract void disp1(int a);

	public abstract void disp2(int a);
}

public class Day49pgm7 {
	public static void main(String[] args) {
//	DisplayL d = (int a) -> {System.out.println(a);}; --->ERROR
	}
}
