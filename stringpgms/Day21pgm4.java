package stringpgms;

public class Day21pgm4 {
	public static void main(String[] args) {

		/* Immutable strings(Created with String keyword) and giving reference to print
		   concated string which is in heap area */

		String s = "Tap";
		System.out.println(s); // prints Tap

		String s2 = s.concat("Academy");
		System.out.println(s2); // prints Tap Academy
	}
}
