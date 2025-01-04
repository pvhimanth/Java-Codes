package multithreading;

// changing Thread name,priority
public class Day59pgm4 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("Himanth");
		t.setPriority(2);
		System.out.println(t);
	}
}
