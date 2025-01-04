package pgms;

public class Day17pgm1 {
public static void main(String[] args) {
	
	// Drawbacks of arrays - can't store different data types (values)
	
		int[] a=new int[5];
		a[0]=1;
		
		
		// a[1]=5.66f; can't store float, as array is declared to store integers
		// a[2]=true;  can't store boolean, as array is declared to store booleans
		
		a[3]='A'; // prints 65 as it is ascii value
		
		System.out.println(a[0]);
		System.out.println(a[3]);

}
	
	
}
