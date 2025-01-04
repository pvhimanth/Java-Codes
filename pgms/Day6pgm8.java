package pgms;

public class Day6pgm8 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++) {
				if((i*j)<10) {
					System.out.print("0");
				}
				System.out.print((i*j)+" ");
				
			}
			System.out.println();
		}
	}
}
