package exception_handling;

import java.util.Scanner;

// handling a exception using try and catch block
class DemoP {
	void alpha() {
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
		}
		System.out.println("Connection terminated2");
	}
}

public class Day52pgm5 {
	public static void main(String[] args) {
		System.out.println("Connection established1");
		DemoP d = new DemoP();
		d.alpha();
		System.out.println("Connection terminated1");
	}
}
