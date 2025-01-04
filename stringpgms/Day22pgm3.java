package stringpgms;

public class Day22pgm3 {
public static void main(String[] args) {
	/* converting mutable string to immutable string this can be done in 2 ways 
	 * 1.using giving reference of mutable string
	 * 2.using .toString() method 
	 */
	
	/* 
	 2-way : .toString() method(mutable string method)
	  and converting to uppercase(immutable string method)
	*/
	
	StringBuffer sb=new StringBuffer("Himanth");
	String s=sb.toString();
	
	System.out.println(s.toUpperCase());
}
}
