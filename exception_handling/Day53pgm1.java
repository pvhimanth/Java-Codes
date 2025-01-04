package exception_handling;

import java.util.Scanner;

// Statements which are wanted to execute must put in finally block
public class Day53pgm1 {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int a = scan.nextInt();
		} 
		finally {
			scan.close(); // scanner object has to close for security issues
		}
	}
}
