package exception_handling;

import java.util.Scanner;

public class Day54pgm2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(scan.nextInt() / scan.nextInt()); integer/0 cause exception
		System.out.println(scan.nextFloat() / scan.nextInt());// real number/0 is infinity
		System.out.println(scan.nextFloat() / scan.nextFloat()); // real number/0 is infinity
	}
}
