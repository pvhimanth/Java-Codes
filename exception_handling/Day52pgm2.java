package exception_handling;

import java.util.Scanner;

/* exception handling in beta method if not handled checks all the caller methods for try and catch block
 * then throws exception by DEH
 */
class Demo11 {
	void alpha() {
		System.out.println("Connection established4");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		System.out.println(num1 / num2);
		System.out.println("Connection terminated4");
	}
}

class Demo22 {
	void beta() {
		System.out.println("Connection established3");
		try {
			Demo11 d1 = new Demo11();
			d1.alpha();
		} 
		catch (Exception e) {
			System.out.println("Handled in beta");
		}

		System.out.println("Connection terminated3");
	}
}

class Demo33 {
	void gamma() {
		System.out.println("Connection established2");
		Demo22 d2 = new Demo22();
		d2.beta();
		System.out.println("Connection terminated2");
	}
}

public class Day52pgm2 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		Demo33 d3 = new Demo33();
		d3.gamma();
		System.out.println("Connection terminated1");
	}
}
