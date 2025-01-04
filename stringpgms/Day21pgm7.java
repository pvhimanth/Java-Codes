package stringpgms;

public class Day21pgm7 {
public static void main(String[] args) {
	
	/* using delete() method which is of StringBuffer methods to delete 
	  characters ranged from 1to9 indexed characters (------>like substring) */
	StringBuffer st=new StringBuffer();
	st.append("Himanth");
	st.append(" Graduated in 2024");
	st.append(" with Computer Science Degree");
	
	st.delete(1, 9);
	System.out.println(st);
}
}
