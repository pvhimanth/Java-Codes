package oops_interfaces;

// 1..implementing functional interface using implementing class
@FunctionalInterface
interface Display {
	public abstract void disp();
}

class Vision implements Display {
	@Override
	public void disp() {
		System.out.println("Hello");
	}
}

public class Day49pgm1 {
	public static void main(String[] args) {
		Vision v = new Vision();
		v.disp();
	}
}
