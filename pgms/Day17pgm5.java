package pgms;

public class Day17pgm5 {
	public static void main(String[] args) {

		// 2D Regular Array - Initialization while Declaration

		int[][] a = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 } };

		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
