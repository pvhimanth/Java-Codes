package multithreading;

// Getting information of Thread of Demo class
class Demo extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class Day59pgm5 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
	}
}
