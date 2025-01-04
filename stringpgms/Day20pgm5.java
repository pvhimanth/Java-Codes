package stringpgms;

public class Day20pgm5 {
	public static void main(String[] args) {
		
		
		// String method to convert string to array ----------> .toCharArray()
		String s5 = "HIMANTH";
		char[] arr1 = s5.toCharArray();
		System.out.println(arr1[2]); // prints M as arr1 is array

		// System.out.println(s5[2]); print error as s5 is string
		System.out.println(s5.charAt(2)); // prints M as s5 is string

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
