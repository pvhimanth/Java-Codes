package pgms;

public class Day17pgm6 {
	public static void main(String[] args) {

		// 3D Regular Array - Initialization while Declaration

		int[][][] a = { { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } },
				{ { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } } };

		int i, j, k;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				for (k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();

	}
}
