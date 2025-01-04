package stringpgms;

public class Day21pgm8 {
public static void main(String[] args) {
	
	// Creating mutable strings using StringBuilder()
	
	/* using delete() method which is of StringBuilder methods to delete 
	  characters ranged from 1to9 indexed characters (------>like substring) */
	
	StringBuilder st=new StringBuilder();
	st.append("Himanth");
	st.append(" Graduated in 2024");
	st.append(" with Computer Science Degree");
	
	st.delete(1, 9);
	System.out.println(st);
	
}
}
