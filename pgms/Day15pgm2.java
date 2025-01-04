package pgms;

import java.util.Scanner;
public class Day15pgm2 {
public static void main(String[] args) {
	// 1D Regular Array of students ages
	
	Scanner sc=new Scanner(System.in);
	int[] a=new int[5];
	
	for(int i=0;i<5;i++) {
		System.out.println("Enter the age of student :");
		a[i]=sc.nextInt();
	}
	
	System.out.println("The ages are:");

	for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
	}
}
}
