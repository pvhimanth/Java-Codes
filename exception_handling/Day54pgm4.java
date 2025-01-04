package exception_handling;
import java.util.Scanner;

/* printStackTrace() ---> overridden method of throwable class in ArithmeticException class
   to print exception type, exception description, exception line*/
public class Day54pgm4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println(scan.nextInt() / scan.nextInt());
		} 
		catch (ArithmeticException a) {
			a.printStackTrace();
		}
	}
}
