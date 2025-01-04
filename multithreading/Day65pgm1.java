package multithreading;

//Producer-Consumer Problem where Producer produces different values Consumer Consumes same value
class Queue {
	private int data;

	public void setData(int data) {
		this.data = data;
		System.out.println("Producer produced the value " + data);
	}

	public void getData() {
		System.out.println("Consumer consumed the value " + data);
	}
}

class Producer extends Thread {
	Queue q;

	@Override
	public void run() {
		int i = 1;
		for (;;) {
			q.setData(i++);
		}
	}

	public Producer(Queue q) {
		this.q = q;
	}
}

class Consumer extends Thread {

	Queue q;

	@Override
	public void run() {
		for (;;) {
			q.getData();
		}
	}

	public Consumer(Queue q) {
		this.q = q;
	}
}

public class Day65pgm1 {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.setName("Producer");
		c.setName("Consumer");

		p.start();
		c.start();

	}
}
