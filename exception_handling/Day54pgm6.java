package exception_handling;
import java.util.Scanner;

public class Day54pgm6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println(scan.nextInt() / scan.nextInt());
		} 
		catch (Exception a) { /* parent(Exception) reference is referring to child 
			                     object(ArithmeticException object)*/
			
			System.out.println(a); /* print type of exception, exception description 
			 instead of hashcode as toString() is overridden in ArithmeticException class */
		}
	}
}
