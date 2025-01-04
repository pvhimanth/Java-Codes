package oops_interfaces;

/* static methods of interface can't be inherited to implementing class
 * , so that static methods can' be override in implementing class........
 * But static methods can be inherited from class to class
 */
interface Clock {
	static void digital() {
		System.out.println("It is a digital Clock");
	}
}

class Watches implements Clock {

}

public class Day47pgm7 {
	public static void main(String[] args) {
//	Watches.digital(); ERROR --- As static methods of interface can't be inherited
	}
}
