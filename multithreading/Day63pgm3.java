package multithreading;

/*join() method is used to halt the execution until thread execution is completed
 * isAlive() method is used to check is thread is executed if executed return false otherwise true
 * if thread is executing
 * 
 * in here main thread is executed at last 
 */
class DemoX extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is started to execute");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is completed its execution");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class DemoY extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is started to execute");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is executing");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is completed its execution");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Day63pgm3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is started to execute");
		try {
			DemoX d1 = new DemoX();
			DemoY d2 = new DemoY();

			d1.start();
			d1.join();
			System.out.println(d1.isAlive());
			d2.start();
			d2.join();
			System.out.println(d2.isAlive());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is completed its execution");
	}
}
