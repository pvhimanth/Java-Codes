package stringpgms;

public class Day19pgm11 {
public static void main(String[] args) {
	String s1="Java";
	String s2="Python";
	String s3="Java".concat("Python");
	String s4="Java".concat("Python");
	
	if(s3==s4) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Unequal"); /* prints unequal as s3&s4 have different references 
                                           as concat() method creates memory in heap area*/
	}
	if(s3.equals(s4)) {
		System.out.println("Equal Values"); // prints equal has same values
	}
}
}