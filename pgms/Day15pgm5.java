package pgms;

import java.util.Scanner;

public class Day15pgm5 {
	public static void main(String[] args) {
		// 1D Regular Array of students ages with length property
		
		Scanner sc =new Scanner(System.in);
		int[] a=new int[5];
		int i;
		
		for(i=0;i<a.length;i++) {
			System.out.println("Enter the age of student "+ i +":");
			a[i]=sc.nextInt();
		}
		
		System.out.println("The ages are:");

		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
