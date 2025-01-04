package stringpgms;

public class Day20pgm4 {
	public static void main(String[] args) {
		String s = "RajaRamMohanRoy";
		
		
		// String method to split the string using some character(,) and store the values in array ----------> .split()
		
		String s3 = "Raja,Ram,Mohan,Roy";
		String[] arr = s3.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// String method to split the string using some character(" ")-space and store the values in array ----------> .split()
		String s4 = "Raja Ram Mohan Roy";
		String[] ar = s4.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
