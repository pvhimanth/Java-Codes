package multithreading;

// Changing information of Thread of Demo class
class DemoP extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Himanth");
		t.setPriority(2);
		System.out.println(t);
	}
}

public class Day59pgm6 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
	}
}
