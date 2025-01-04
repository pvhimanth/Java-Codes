package stringpgms;

import java.util.StringTokenizer;
public class Day22pgm4 {

	public static void main(String[] args) {
    
		/* using StringTokenizer to split the string 
		 without using loops (has to print the statement as many as strings ) */
		
		StringTokenizer st=new StringTokenizer("Himanth 21 Nellore 6302702694"," ");
		
		st.hasMoreTokens(); // cursor to point string use .hasMoreTokens() as there is no index
		System.out.println(st.nextToken()); //to print string use .nextToken
		
		st.hasMoreTokens();
		System.out.println(st.nextToken());
		
		st.hasMoreTokens();
		System.out.println(st.nextToken());
		
		st.hasMoreTokens();
		System.out.println(st.nextToken());
	}

}
