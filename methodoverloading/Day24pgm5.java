package methodoverloading;

// Main method overloading to print 1,2,3,4,5
public class Day24pgm5 {
	public static void main(String[] args) {
		System.out.println("1");
		main();
		main(10);
		main(10,20);
	    main(new int[] {10,20,30});
	}
	public static void main() {
		System.out.println("2");
	}
	public static void main(int a) {
		System.out.println("3");
	}
	public static void main(int a,int b) {
		System.out.println("4");
	}
	public static void main(int[] a) {
		System.out.println("5");
	}
}
