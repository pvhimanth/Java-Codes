package multithreading;
import java.util.Scanner;

class Demo1P extends Thread {
	@Override
	public void run() {
		System.out.println("Divding numbers started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2");
		int num2 = scan.nextInt();
		System.out.println(num1 / num2);  /* if we divide by number by 0 executing thread
		                                terminates abruptly and remaining threads executes */
		System.out.println("Dividing numbers completed");
	}
}

class Demo2P extends Thread {
	@Override
	public void run() {
		System.out.println("Printing characters started");
		for (int i = 65; i < 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(3000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters completed");
	}
}

class Demo3P extends Thread {
	@Override
	public void run() {
		System.out.println("Printing numbers started");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing numbers completed");
	}
}

public class Day59pgm2 {
	public static void main(String[] args) {
		Demo1P d1 = new Demo1P();
		Demo2P d2 = new Demo2P();
		Demo3P d3 = new Demo3P();
		d1.start();
		d2.start();
		d3.start();
	}
}
