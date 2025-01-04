package multithreading;

/*join() method is used to halt the execution until thread execution is completed
 * isAlive() method is used to check is thread is executed if executed return false otherwise true
 * if thread is executing
 * 
 * in here main thread completion it execution first
 */
class DemoJ extends Thread {
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

class DemoK extends Thread {
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

public class Day63pgm2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is started to execute");
		try {
			DemoJ d1 = new DemoJ();
			DemoK d2 = new DemoK();

			d1.start();
			d2.start();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is completed its execution");
	}
}
