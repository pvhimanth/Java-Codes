package collections_arraylist;

import java.util.Arrays;

public class Day68pgm4 {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 100, 2, 30 }; //array can store primitive data
		String[] arr2 = new String[] { "TAP", "ACAD", "BGR" }; /*array can store object
																as String is an object*/
		
		/* Array class is only to create array object
		 * Arrays class contains inbuilt methods helps array object to use 
		 */
		
		Arrays.sort(arr1); // sorting array using sort() method of Arrays class
		
		System.out.println(Arrays.toString(arr1)); /* printing array in single line using
		 											toString() method of Arrays class*/
	}
}
