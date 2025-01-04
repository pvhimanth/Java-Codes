package pgms;

import java.util.Scanner;

public class Day15pgm3 {
	public static void main(String[] args) {
		// 2D Regular Array of class and students ages

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][5];

		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("class " + i + " student " + j);
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The ages are:");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
