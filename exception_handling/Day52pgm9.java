package exception_handling;
import java.util.Scanner;

// Ducking an exception with throws and with try and catch
class DemoM {
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

public class Day52pgm9 {
	public static void main(String[] args) { // handles exception using try and catch
		System.out.println("Connection established1");
		DemoM d = new DemoM();
		try {
			d.alpha();
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		System.out.println("Connection terminated1");
	}
}
