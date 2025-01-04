package pgms;

public class Day6pgm4 {
	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
