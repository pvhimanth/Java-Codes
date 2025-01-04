package multithreading;
import java.util.Scanner;

/* when we execute thread with run() method instead of start() cause sequential execution
 */
class Demo111 extends Thread {
	@Override
	public void run() {
		System.out.println("Adding numbers started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2");
		int num2 = scan.nextInt();
		System.out.println(num1 + num2);
		System.out.println("Adding numbers completed");
	}
}

class Demo222 extends Thread {
	@Override
	public void run() {
		System.out.println("Printing characters started");
		for (int i = 65; i < 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters completed");
	}
}

class Demo333 extends Thread {
	@Override
	public void run() {
		System.out.println("Printing numbers started");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing numbers completed");
	}
}

public class Day59pgm1 {
	public static void main(String[] args) {
		Demo111 d1 = new Demo111();
		Demo222 d2 = new Demo222();
		Demo333 d3 = new Demo333();
		d1.run();
		d2.run();
		d3.run();
	}
}
