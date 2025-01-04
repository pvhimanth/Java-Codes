package oops_interfaces;

//4..implementing functional interface using lambda expression (in main method)

@FunctionalInterface
interface Displayp {
	public abstract void disp();
}

public class Day49pgm5 {
	public static void main(String[] args) {
	Displayp d = () -> {System.out.println("Hello");};
		d.disp();
	}
}
