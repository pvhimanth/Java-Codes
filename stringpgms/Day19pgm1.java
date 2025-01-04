package stringpgms;

public class Day19pgm1 {
public static void main(String[] args) {
	
	// comparing 2 string references which is in heap area and string constant pool
	String s1="JAVA";
	String s2=new String("JAVA");
	
	if(s1==s2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Unequal"); //prints unqual as different references
	}
}
}
