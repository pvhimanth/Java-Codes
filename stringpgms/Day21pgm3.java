package stringpgms;

public class Day21pgm3 {

	public static void main(String[] args) {

		// Immutable strings(Created with String keyword)

		String s1 = "Tap";
		System.out.println(s1); // prints Tap

		s1.concat("Academy");
		System.out.println(s1); /*
								 * prints Tap as s1 in immutable we can't able to concat the s1 with Academy ,
								 * so tap is attached with academy stores in hap area but with no reference so it
								 * collected b garbage collector
								 * 
								 */
		
		//to print the concated string we have to give the reference to s1.concat("Academy");


	}

}
