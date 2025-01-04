package pgms;

import java.util.Scanner;

public class Day15pgm6 {
	public static void main(String[] args) {
		// 2D Regular Array of class and students ages with length property

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][5];

		int i, j;
		for (i = 0; i <a.length; i++) {
			for (j = 0; j <a[i].length; j++) {
				System.out.println("class " + i + " student " + j);
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The ages are:");

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
