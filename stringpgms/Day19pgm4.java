package stringpgms;

public class Day19pgm4 {
public static void main(String[] args) {
		
		/* comparing 2 string values using .equalsIgnoreCase() method which is in heap area 
	       and string constant pool (case sensitive)  */
	
		String s1="Java";
		String s2=new String("JAVA");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal"); //prints equal as we use IgnoreCase() method to solve case-sensitivity 
		}
		else {
			System.out.println("Unequal"); 
		}
	}
}
