package pgms;

import java.util.Scanner;
public class Day22pgm2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	// 2 ways to give values to StringBuffer() 
	
	//1-way using append() method
	StringBuffer sb=new StringBuffer();
	sb.append("Himanth");
	System.out.println(sb);
	
	//2-way giving values directly
	StringBuffer s=new StringBuffer("Himanth");
	System.out.println(s);

}
}
