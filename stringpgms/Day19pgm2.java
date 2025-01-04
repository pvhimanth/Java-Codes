package stringpgms;

public class Day19pgm2 {
	public static void main(String[] args) {
		
		// comparing 2 string values using .equals() method which is in heap area and string constant pool
		String s1="JAVA";
		String s2=new String("JAVA");
		
		if(s1.equals(s2)) {
			System.out.println("Equal"); //prints equal as same values
		}
		else {
			System.out.println("Unequal"); 
		}
	}
}
