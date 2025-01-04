package exception_handling;

import java.util.Scanner;

/* exception handling in gamma method if not handled checks all the caller methods for try and catch block
 * then throws exception by DEH
 */
class Demo111 {
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

class Demo222 {
	void beta() {
		System.out.println("Connection established3");
		Demo111 d1 = new Demo111();
		d1.alpha();

		System.out.println("Connection terminated3");
	}
}

class Demo333 {
	void gamma() {
		System.out.println("Connection established2");
		try {
			Demo222 d2 = new Demo222();
			d2.beta();
		} 
		catch (Exception e) {
			System.out.println("Handled in gamma");
		}
		System.out.println("Connection terminated2");
	}
}

public class Day52pgm3 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		Demo333 d3 = new Demo333();
		d3.gamma();
		System.out.println("Connection terminated1");
	}
}
