package stringpgms;

public class Day20pgm2 {
	public static void main(String[] args) {
		
		// String Methods
		
		String s="RajaRamMohanRoy";
		
		// String method to get unicode value with index ----------> .codePointAt();
		System.out.println(s.codePointAt(4));
		
		// String method to convert string to uppercase ----------> .toUpperCase();
		System.out.println(s.toUpperCase());	
		
		// String method to convert string to lowercase ----------> .toLowerCase();
		System.out.println(s.toLowerCase());	
		
		// String method to print specific character at index of string ----------> .charAt();
		System.out.println(s.charAt(5));
		
		// String method to print first index of a character in string ----------> .indexOf();
		System.out.println(s.indexOf('R'));
		
		// String method to print Last index of a character in string ----------> .lastIndexOf();
		System.out.println(s.lastIndexOf('R'));
		
		// String method to print length of the string ----------> .length()
		System.out.println(s.length());
		
		// String method to print substring ----------> .substring()
		System.out.println(s.substring(7));
		System.out.println(s.substring(7,11)); // 1st index inclusive, 2nd index is exclusive
		System.out.println(s.substring(7,12));

		
		
		
		// String method to know substring present in original string or not ----------> .contains()
		System.out.println(s.contains("Raja")); //prints true as Raja present in string
		

	}
}
