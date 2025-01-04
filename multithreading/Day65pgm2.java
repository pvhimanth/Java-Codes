package multithreading;

//Producer-Consumer Problem where Producer produces different values Consumer Consumes Different value
class Queuee {
	private int data;
	boolean dataIsPresent = false;

	synchronized void setData(int data) {
		if (dataIsPresent == false) {
			this.data = data;
			System.out.println("Producer produced the value " + data);
			dataIsPresent = true;
			notify();
		} else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	synchronized void getData() {
		if (dataIsPresent == true) {
			System.out.println("Consumer consumed the value " + data);
			dataIsPresent = false;
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Producerr extends Thread {
	Queuee q;

	@Override
	public void run() {
		int i = 1;
		for (;;) {
			q.setData(i++);
		}
	}

	public Producerr(Queuee q) {
		this.q = q;
	}
}

class Consumerr extends Thread {

	Queuee q;

	@Override
	public void run() {
		for (;;) {
			q.getData();
		}
	}

	public Consumerr(Queuee q) {
		this.q = q;
	}
}

public class Day65pgm2 {
	public static void main(String[] args) {
		Queuee q = new Queuee();
		Producerr p = new Producerr(q);
		Consumerr c = new Consumerr(q);

		p.setName("Producer");
		c.setName("Consumer");

		p.start();
		c.start();

	}
}

/*
 * The values in your producer-consumer problem are skipping because of a race
 * condition between the producer and the consumer threads. Here's what's
 * happening:
 * 
 * 1. The producer and consumer are both running in parallel. The `setData`
 * method is called by the producer, and the `getData` method is called by the
 * consumer.
 * 
 * 2. When the producer produces a value (let's say `i=1`), it sets the data and
 * then calls `notify()`, which wakes up the consumer if it's waiting. The
 * consumer then consumes that value.
 * 
 * 3. However, the next time the producer gets to produce a new value (let's say
 * `i=2`), the consumer might not have finished consuming the previous value
 * (`i=1`) yet.
 * 
 * 4. As a result, both `setData` and `getData` may interfere with each other,
 * causing the producer to set data twice before the consumer has a chance to
 * consume the previous value. Thus, the consumer "skips" some values.
 * 
 * This can happen because `wait()` and `notify()` are not always perfectly
 * synchronized if you don’t use them properly in a while-loop. This while-loop
 * is important because, after waking up, a thread may not find the condition it
 * expects (due to race conditions).
 * 
 * ### Fixing the Issue To fix this issue, you should use a `while` loop to
 * check the condition inside `setData` and `getData` methods, instead of `if`.
 * This ensures that the threads will continue waiting if the condition is not
 * met after being notified.
 * 
 * Here’s how you can adjust your code:
 * 
 * class Queuee {
    private int data;
    boolean dataIsPresent = false;

    synchronized void setData(int data) {
        while (dataIsPresent) { // Use while loop instead of if
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("Producer produced the value " + data);
        dataIsPresent = true;
        notify();
    }

    synchronized void getData() {
        while (!dataIsPresent) { // Use while loop instead of if
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed the value " + data);
        dataIsPresent = false;
        notify();
    }
  }
 * 
 * ### Explanation: - The `while` loop ensures that when a thread wakes up from
 * `wait()`, it checks the condition again. This way, even if there’s a race
 * condition or a spurious wakeup, the thread won’t proceed until the condition
 * is actually met.
 * 
 * This should prevent values from being skipped and ensure proper
 * synchronization between producer and consumer.
*/
