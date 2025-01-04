package stringpgms;

public class Day19pgm7 {
public static void main(String[] args) {
		
		//comparing 2 values of string, which one is in heap area and one is in String Constant pool (case-sensitive)
		
		String s1="Java";
		String s2=new String("JAVA");
		
		if(s1==s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal"); /* prints unequal as s1&s2 have different references 
			                                  as values are different due to case sensitivity  
			                                  and different areas in heap */
		}
		if(s1.equals(s2)) {
			System.out.println("Equal Values");
		}
	}
}
