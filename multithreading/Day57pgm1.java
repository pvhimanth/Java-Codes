package multithreading;
import java.util.Scanner;

// sequential execution of program
public class Day57pgm1 {
	public static void main(String[] args) {

		System.out.println("Adding numbers started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2");
		int num2 = scan.nextInt();
		System.out.println(num1 + num2);
		System.out.println("Adding numbers completed");

		System.out.println("Printing characters started");
		for (int i = 65; i < 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000);
			} 
			catch (Exception e) {
				System.out.println("Handled");
			}
		}
		System.out.println("Printing characters completed");

		System.out.println("Printing numbers started");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} 
			catch (Exception e) {
				System.out.println("Handled");
			}
		}
		System.out.println("Printing numbers completed");

	}
}
