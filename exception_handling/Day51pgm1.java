package exception_handling;

import java.util.Scanner;

/* Risky code is given in try block , exception handled by using catch block 
 */
public class Day51pgm1 {
	public static void main(String[] args) {

		try {
			System.out.println("Connection established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number1");
			int num1 = scan.nextInt();
			System.out.println("Enter the number2");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
			System.out.println("Connection terminated");

		} catch (Exception e) {
			System.out.println("can't give denominator as zero");
		}
	}
}
