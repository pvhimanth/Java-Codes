package pgms;

public class Day7pgm4 {
	public static void main(String[] args) {
		int i,j,n=5;
		int count=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
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
