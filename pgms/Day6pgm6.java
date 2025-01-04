package pgms;

public class Day6pgm6 {
	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print(j);
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
