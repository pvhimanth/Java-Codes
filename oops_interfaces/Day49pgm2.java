package oops_interfaces;

//2..implementing functional interface using inner class (in main method)
@FunctionalInterface
interface Display1 {
	public abstract void disp();
}

public class Day49pgm2 {
	public static void main(String[] args) {
		class Vision1 implements Display1 {
			@Override
			public void disp() {
				System.out.println("Hello");
			}
		}
		Vision1 v = new Vision1();
		v.disp();
	}
}
