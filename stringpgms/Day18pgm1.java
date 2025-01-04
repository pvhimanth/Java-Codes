package stringpgms;

public class Day18pgm1 {

	public static void main(String[] args) {
    
		// 3 ways to create strings
		
		String s=new String("Himanth"); // 1
		
		String s1="Himanth"; // 2
		
		char[] arr= {'M','A','P'}; // 3
		 
		String s2 =new String(arr);
		
		System.out.println(s);
		System.out.println(s1);
		//System.out.println(arr);
		System.out.println(s2);

	}
}
