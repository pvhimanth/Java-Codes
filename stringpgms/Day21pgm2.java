package stringpgms;

import java.util.Scanner;

public class Day21pgm2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Scanning String values using next() method - space encounters not prints string after space
		System.out.println("Enter the string");
		String s = sc.next();

		sc.nextLine(); /*
						 * After reading the first string using next(), the cursor remains
						 * on the same line just after the first word. When you call nextLine(), it
						 * reads the rest of the current line, which is empty if there were no
						 * additional words after the first word.
						 * 
						 * To fix this, you should add an extra nextLine() call after the next() call to
						 * consume the rest of the line where the cursor is currently positioned.
						 * 
						 */
		
		// Scanning string values using nextLine() method - space string even space encounters			 
		System.out.println("Enter the string");
		String s2 = sc.nextLine();

		System.out.println(s);
		System.out.println(s2);

	}
}
