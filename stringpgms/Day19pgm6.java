package stringpgms;

public class Day19pgm6 {
	public static void main(String[] args) {
		
		//comparing 2 values of string which are in String Constant pool (case-sensitive)
		
		String s1=new String("Java");
		String s2=new String("JAVA");
		
		if(s1==s2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal"); /* prints unequal as s1&s2 have different refernces 
			                                  as values are different due to case sensitivity */
		}
		if(s1.equals(s2)) {
			System.out.println("Equal Values");
		}
	}
}
