package exception_handling;

import java.util.Scanner;

/* exception handling in alpha method if not handled checks all the caller methods for try and catch block
 * then throws exception by DEH
 */
class Demo1 {
	void alpha() {
		System.out.println("Connection established4");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number1");
			int num1 = scan.nextInt();
			System.out.println("Enter the number2");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
		} 
		catch (Exception e) {
			System.out.println("handled in alpha");
		}
		System.out.println("Connection terminated4");
	}
}

class Demo2 {
	void beta() {
		System.out.println("Connection established3");
		Demo1 d1 = new Demo1();
		d1.alpha();
		System.out.println("Connection terminated3");
	}
}

class Demo3 {
	void gamma() {
		System.out.println("Connection established2");
		Demo2 d2 = new Demo2();
		d2.beta();
		System.out.println("Connection terminated2");
	}
}

public class Day52pgm1 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		Demo3 d3 = new Demo3();
		d3.gamma();
		System.out.println("Connection terminated1");
	}
}
