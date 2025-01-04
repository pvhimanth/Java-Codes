package exception_handling;

import java.util.Scanner;

/* exception handling in main method if not handled then throws exception by DEH
 */
class Demo1111 {
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

class Demo2222 {
	void beta() {
		System.out.println("Connection established3");
		Demo111 d1 = new Demo111();
		d1.alpha();

		System.out.println("Connection terminated3");
	}
}

class Demo3333 {
	void gamma() {
		System.out.println("Connection established2");
		Demo2222 d2 = new Demo2222();
		d2.beta();

		System.out.println("Connection terminated2");
	}
}

public class Day52pgm4 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		try {

			Demo3333 d3 = new Demo3333();
			d3.gamma();
		} 
		catch (Exception e) {
			System.out.println("Handled in main");
		}
		System.out.println("Connection terminated1");
	}
}
