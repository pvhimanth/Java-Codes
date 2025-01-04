package oops_interfaces;

//3...implementing functional interface using anonymous inner class (in main method)

@FunctionalInterface
interface Displayd {
	public abstract void disp();
}

public class Day49pgm4 {
	public static void main(String[] args) {
		Displayd d = new Displayd() {
			@Override
			public void disp() {
				System.out.println("Hello");
			}
		};
		d.disp();
	}
}
