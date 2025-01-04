package stringpgms;

public class Day19pgm9 {
public static void main(String[] args) {
		
		// combining 2 string values with references 
		
		String s1="Java";
		String s2="Python";
		String s3=s1+s2;
		String s4=s1+s2;

		
		if(s3==s4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Unequal"); /* prints unequal as s3&s4 have different references 
                                               as in heap area can store duplicate values*/
		}
		if(s3.equals(s4)) {
			System.out.println("Equal Values"); // prints equal has same values
		}
	}
}
