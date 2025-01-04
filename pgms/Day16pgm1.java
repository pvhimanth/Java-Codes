package pgms;

import java.util.Scanner;
public class Day16pgm1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	// 2D jagged array of 2 classes where class 1 contains 3students , class 2 contains 7students
	int[][] a=new int[2][];
	a[0]=new int[3];
	a[1]=new int[7];
	
	int i,j;
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[i].length;j++) {
			System.out.println("class " + i + " student" + j);
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("The ages are:");
	
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
