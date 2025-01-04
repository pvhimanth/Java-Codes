package stringpgms;

public class Day20pgm1 {
	public static void main(String[] args) {

		// Comparing strings using compareTo() method s1<s2 prints negative value

		String s1 = "SACHIN";
		String s2 = "SAURAV";
		int a = s1.compareTo(s2);
		System.out.println(a);
		if(a>0) {
			System.out.println("s1>s2");
		}
		else if(a<0) {
			System.out.println("s1<s2");
		}
		else {
			System.out.println("s1 equal to s2");
		}

		// Comparing strings using compareTo() method s3>s4 prints positive value

		String s3 = "SAUMRAJ";
		String s4 = "SANDEEP";
		int b = s3.compareTo(s4);
		System.out.println(b);

		// Comparing strings using compareTo() method s5==s4 prints 0 value

		String s5 = "HIMANTH";
		String s6 = "HIMANTH";
		int c = s5.compareTo(s6);
		System.out.println(c);

		// Comparing strings which are unqual length of characters using compareTo()
		// method prints -1 value

		String s7 = "JAVA";
		String s8 = "JAVAC";
		int d = s7.compareTo(s8);
		System.out.println(d);

		/*
		 * Comparing strings which are unequal length of characters using compareTo()
		 * method prints 1 value as after N have P in s9 where as in s10 no P after no p
		 */

		String s9 = "PYTHONP";
		String s10 = "PYTHON";
		int e = s9.compareTo(s10);
		System.out.println(e);

		/*
		 * Comparing strings which are unequal length of characters using compareTo()
		 * method prints 10 value as after P have ROGRAMMING in s11 where as in s12 no
		 * ROGRAMMING after no P
		 */

		String s11 = "PYTHONPROGRAMMING";
		String s12 = "PYTHONP";
		int f = s11.compareTo(s12);
		System.out.println(f);

		// comparing 2 unequal strings returns difference value when the unmatched
		// character encounters
		String s13 = "HIMANTHSGHS";
		String s14 = "HIMALAYA";

		int S = s13.codePointAt(4);
		System.out.println(S);
		int A = s14.codePointAt(4);
		System.out.println(A);

		int g = s13.compareTo(s14);
		System.out.println(g);

	}
}
