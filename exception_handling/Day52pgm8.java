
package exception_handling;

import java.util.Scanner;

// Ducking an exception with throws without try and catch
class DemoS {
	void alpha() throws Exception { // throws exception
		System.out.println("Connection established2");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		System.out.println(num1 / num2);
		System.out.println("Connection terminated2");
	}
}

public class Day52pgm8 {
	public static void main(String[] args) throws Exception { // throws exception caught by RTS gives to DEH
		System.out.println("Connection established1");
		DemoS d = new DemoS();
		d.alpha();
		System.out.println("Connection terminated1");
	}
}
