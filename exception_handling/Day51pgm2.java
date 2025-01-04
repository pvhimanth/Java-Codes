package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Some catch blocks creation some type of exceptions , generic exception created at last 
 * to handle any type of exceptions that can't be handled
 */
public class Day51pgm2 {
	public static void main(String[] args) {
		try {

			// division operation
			System.out.println("Connection established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number1");
			int num1 = scan.nextInt();
			System.out.println("Enter the number2");
			int num2 = scan.nextInt();
			System.out.println(num1 / num2);
			System.out.println("Connection terminated");

			// array operation
			System.out.println("Enter the size of an array");
			int size = scan.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the element");
			int element = scan.nextInt();
			System.out.println("Enter the index");
			int index = scan.nextInt();
			arr[index] = element;
			System.out.println(arr[index]);
		} 
		catch (ArithmeticException a) {
			System.out.println("Provide non-zero denominator");
		} 
		catch (NegativeArraySizeException na) {
			System.out.println("Provide +ve array size");
		} 
		catch (InputMismatchException im) {
			System.out.println("Provide only integer");
		} 
		catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Provide valid index");
		} 
		catch (Exception e) {
			System.out.println("Provide valid input");
		}
		System.out.println("Connection terminated");
	}
}
