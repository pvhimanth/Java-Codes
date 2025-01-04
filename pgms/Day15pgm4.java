package pgms;

import java.util.Scanner;
public class Day15pgm4 {
	// 3D Regular Array of school ,class and students ages

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int[][][] a=new int[2][3][5];
	int i,j,k;
	for(i=0;i<2;i++) {
		for(j=0;j<3;j++){
			for(k=0;k<5;k++) {
				System.out.println("school " + i + " class " + j + " Student " + k);
				a[i][j][k]=sc.nextInt();
			}
		}
	}
	
	System.out.println("The ages are:");
	
	for(i=0;i<2;i++) {
		for(j=0;j<3;j++){
			for(k=0;k<5;k++) {
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	System.out.println();
}
}
