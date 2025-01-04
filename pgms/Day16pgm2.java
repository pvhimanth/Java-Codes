package pgms;

import java.util.Scanner;

public class Day16pgm2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/* 3D jagged array ages of 2 schools and 1st schools contains 2 classes 
		   where class 1 contains 5students , class 2 contains 3students
		   and in 2nd school contains 3 classes where class 1 contains 4 students,
		   class 2 contains 2 students, class 3 contains 6 students
		   
		   
		*/
		int[][][] a = new int[2][][];
		a[0] = new int[2][];
		a[1] = new int[3][];
		a[0][0] = new int[5];
		a[0][1] = new int[3];
		a[1][0] = new int[4];
		a[1][1] = new int[2];
		a[1][2] = new int[6];

		
		int i,j,k;
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("school " + i + " class " + j + " student" + k);
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		
		System.out.println("The ages are:");
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}
	
}
