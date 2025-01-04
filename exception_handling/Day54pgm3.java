package exception_handling;
import java.util.Scanner;

/* getMessage() ---> overridden method of throwable class in ArithmeticException class
   to print exception description */
public class Day54pgm3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println(scan.nextInt() / scan.nextInt());
		} 
		catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}
	}
}
