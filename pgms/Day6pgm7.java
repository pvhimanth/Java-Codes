package pgms;

public class Day6pgm7 {
	public static void main(String[] args) {
		int i,j;
		int count=1;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
