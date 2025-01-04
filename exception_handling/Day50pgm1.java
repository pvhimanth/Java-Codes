package exception_handling;

import java.util.Scanner;

public class Day50pgm1 {
	public static void main(String[] args) {

		System.out.println("Connection established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt(); //if 0 gives cause ArithmeticException
		System.out.println(num1 / num2);
		System.out.println("Connection terminated");
	}
}
