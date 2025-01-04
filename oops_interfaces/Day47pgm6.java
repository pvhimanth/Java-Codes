package oops_interfaces;

/* we can access methods of interface without object creation, but with interface name
 * by making methods as static 
 */

interface Sea {
	static void animals() {
		System.out.println("Shark");
	}
}

public class Day47pgm6 {
	public static void main(String[] args) {
		Sea.animals(); //static method access of interface
	}
}
