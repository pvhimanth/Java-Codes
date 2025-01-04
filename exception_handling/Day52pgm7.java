package exception_handling;

import java.util.Scanner;

// Re throwing a exception with finally block
class DemoR {
	void alpha() throws Exception {
		System.out.println("Connection established2");
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
			throw e;
		}
		finally {
			System.out.println("Connection terminated2");/* prints as control goes out from method seeing
			  										throw after execution statements in finally block*/
		}
	}
}

public class Day52pgm7 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		DemoR d = new DemoR();
		try {

			d.alpha();
		} 
		catch (Exception e) {
			System.out.println("handled in main");
		}
		System.out.println("Connection terminated1");
	}
}
