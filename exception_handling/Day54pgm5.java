package exception_handling;
import java.util.Scanner;

public class Day54pgm5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println(scan.nextInt() / scan.nextInt());
		} 
		catch (ArithmeticException a) {
			System.out.println(a); /* print type of exception, exception description 
			 instead of hashcode as toString() is overridden in ArithmeticException class */
		}
	}
}
