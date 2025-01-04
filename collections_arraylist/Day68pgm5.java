package collections_arraylist;

/* Boxing---> converting primitive data to objects using wrapper class
 * with help of valueOf() method
 * 
 * Auto Boxing---> converting primitive data to objects using wrapper class
 * without using valueOf() method
 */
public class Day68pgm5 {
	public static void main(String[] args) {
		
		// Boxing
		int a=10; //Primitive data of int type
//		Integer i=new Integer(a); --> this approach is omitted
		Integer i=Integer.valueOf(a); //Integer object
		
		System.out.println(a);
		System.out.println(i);
		
		
		// Auto Boxing
		int b=10; //Primitive data of int type
		Integer j=b; //Integer object 
		
		System.out.println(b);
		System.out.println(j);
		
	}
}
