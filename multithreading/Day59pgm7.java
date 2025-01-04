package multithreading;

class DemoA extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("2ndThread");
		t.setPriority(2);
		System.out.println(t);
	}
}

class DemoB extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("3rdThread");
		t.setPriority(3);
		System.out.println(t);
	}
}

class DemoC extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("4thThread");
		t.setPriority(4);
		System.out.println(t);
	}
}

class DemoD extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("5thThread");
		t.setPriority(5);
		System.out.println(t);
	}
}

public class Day59pgm7 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("MainThead");
		t.setPriority(1);
		System.out.println(t);

		DemoA a = new DemoA();
		DemoB b = new DemoB();
		DemoC c = new DemoC();
		DemoD d = new DemoD();

		a.start();
		b.start();
		c.start();
		d.start();

	}
}
