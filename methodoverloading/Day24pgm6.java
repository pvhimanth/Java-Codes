package methodoverloading;

//Main method overloading to print 1,2,3,4,5
public class Day24pgm6 {
	public static void main(String[] args) {
		System.out.println("1");
		main();
	}
	public static void main() {
		System.out.println("2");
		main(10);
	}
	public static void main(int a) {
		System.out.println("3");
		main(10,20);
	}
	public static void main(int a,int b) {
		System.out.println("4");
		main(new int[] {10,20,30});
	}
	public static void main(int[] a) {
		System.out.println("5");
	}
}
