package stringpgms;

public class Day20pgm3 {
	public static void main(String[] args) {
		String s = "RajaRamMohanRoy";

		
		
		// String method to check string empty or not ----------> .isEmpty()
		System.out.println(s.isEmpty()); // prints false

		String s1 = "";
		System.out.println(s1.isEmpty()); // prints true

		String s2 = " ";
		System.out.println(s2.isEmpty()); // prints false as space is present

		
		
		
		// String method to check string blank or not ----------> .isBlank()
		System.out.println(s.isBlank()); // prints false
		System.out.println(s1.isBlank()); // prints true
		System.out.println(s2.isBlank()); // prints true as blank is present

	}
}
