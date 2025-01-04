package stringpgms;

import java.util.Scanner;

public class Day22pgm1 {
	public static void main(String[] args) {

		// Converting immutable string to mutable string and reversing a string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
