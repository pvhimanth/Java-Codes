package stringpgms;

public class Day19pgm3 {
public static void main(String[] args) {
		
		/* comparing 2 string values using .equals() method which is in heap area 
	       and string constant pool (case sensitive) */
	
		String s1="Java";
		String s2=new String("JAVA");
		
		if(s1.equals(s2)) {
			System.out.println("Equal"); 
		}
		else {
			System.out.println("Unequal"); //prints unequal as different values(case-sensitive)
		}
	}
}
