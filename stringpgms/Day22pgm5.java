package stringpgms;

import java.util.StringTokenizer;

public class Day22pgm5 {
	public static void main(String[] args) {
		// using StringTokenizer to split the string with using while loop

		StringTokenizer st = new StringTokenizer("Himanth 21 Nellore 6302702694", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());	
	}
		
		
	StringTokenizer s = new StringTokenizer("commmmmmmmmmmmmmmmmmmmmunication", "m");
	while (s.hasMoreTokens()) {
		System.out.println(s.nextToken());
	}
	}
}
