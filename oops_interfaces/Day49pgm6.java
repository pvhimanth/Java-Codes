package oops_interfaces;

//implementing functional interface of parameter using lambda expression(in main method)

@FunctionalInterface
interface DisplayG {
	public abstract void disp(int a);
}

public class Day49pgm6 {
public static void main(String[] args) {
	
	//1st way... to implement FunctionalInterface using lambda expression
	DisplayG d = (int a) -> {System.out.println(a);};
	
	/* 2nd way... to implement FunctionalInterface using lambda expression
	 *      DisplayG d = (a) -> {System.out.println(a);};
	*/
	
	/*3rd way... to implement FunctionalInterface using lambda expression
	 * 	    DisplayG d =  a -> {System.out.println(a);};
	 */

	d.disp(10);
}
}
