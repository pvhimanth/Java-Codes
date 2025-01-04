package stringpgms;

public class Day19pgm5 {
public static void main(String[] args) {
	//comparing 2 values of string which are in heap area (Not case-sensitive)
	
	String s1=new String("JAVA");
	String s2=new String("JAVA");
	
	if(s1==s2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Unequal"); // prints unequal as s1&s2 have different references in heap area
	}
	if(s1.equals(s2)) {
		System.out.println("Equal Values");
	}
}
}
