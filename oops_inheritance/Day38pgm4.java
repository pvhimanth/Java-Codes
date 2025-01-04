package oops_inheritance;

import java.util.Arrays;

/* In Array class toString() method is inherited not overridden so we get hashcode
 * 
 * But in Arrays class toString() method is overridden so we get data
 */

public class Day38pgm4 {
public static void main(String[] args) {
	int[] arr=new int[] {10,20,30};
	System.out.println(arr); //printing using Array class
	
	System.out.println(Arrays.toString(arr)); //printing using Arrays class
}
}
