package collections_arraylist;

/* UnBoxing---> converting objects to primitive data using with 
 * help of intValue() method(for Integer object , for to convert Double object--> doubleValue() method
 * like for all objects
 * 
 * Auto UnBoxing---> converting objects to primitive data without using 
 * intValue() method(for Integer object)
 */
public class Day68pgm6 {
	public static void main(String[] args) {
		
		// UnBoxing
		Integer i=Integer.valueOf(10); //Integer object
		int a=i.intValue(); //Primitive data of int type
		
		System.out.println(i);
		System.out.println(a);
		
		
		// Auto UnBoxing
		Integer j=Integer.valueOf(10); //Integer object
		int b=j; //Primitive data of int type
		
		System.out.println(j);
		System.out.println(b);
		
		//for double data
		Double k=Double.valueOf(10.99); //Double object
		double c=k.doubleValue(); //Primitive data of double type
		
		System.out.println(k);
		System.out.println(c);
	}
}
