package pgms;

public class Day17pgm7 {
public static void main(String[] args) {
	
	// 2D Jagged Array - Initialization while Declaration

	int[][] a= {{1,2,3},{4,5,6,7,8},{9}};
	
	int i,j;
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
