package stringpgms;

public class Day19pgm8 {
public static void main(String[] args) {
		
		// combining 2 string values which of string constant pool type
		
		String s1="Java";
		String s2="Python";
		String s3="Java"+"Python";
		String s4="Java"+"Python";

		
		if(s3==s4) {
			System.out.println("Equal");/* prints equal as s3&s4 have same references 
                                           as scp can't store duplicate values*/
		}
		else {
			System.out.println("Unequal"); 
		}
		if(s3.equals(s4)) {
			System.out.println("Equal Values");
		}
	}
}
