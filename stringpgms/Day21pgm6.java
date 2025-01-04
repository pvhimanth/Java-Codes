package stringpgms;

public class Day21pgm6 {
public static void main(String[] args) {
	// Creating mutable Strings using StringBuffer()
	
	StringBuffer st=new StringBuffer();
	st.append("Himanth");
	st.append(" Graduated in 2024");
	st.append(" with Computer Science Degree");
	
	System.out.println(st.capacity()); // prints 70 as new locations add when size not sufficient
	System.out.println(st);
}
}
