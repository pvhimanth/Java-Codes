package multithreading;
import java.util.Scanner;

// Achieving MultiThreading using single run() method instead of n run() methods
class DemoM extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();

		if (name.equals("ADD")) {
			adding();
		} 
		else if (name.equals("CHAR")) {
			printChar();
		} 
		else {
			printNum();
		}
	}

	public void adding() {
		System.out.println("Adding numbers started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = scan.nextInt();
		System.out.println("Enter the num2");
		int num2 = scan.nextInt();
		System.out.println(num1 + num2);
		System.out.println("Adding numbers completed");
	}

	public void printChar() {
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

	public void printNum() {
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

public class Day60pgm1 {
	public static void main(String[] args) {
		DemoM d1 = new DemoM();
		DemoM d2 = new DemoM();
		DemoM d3 = new DemoM();

		d1.setName("ADD");
		d2.setName("CHAR");
		d3.setName("NUM");

		d1.start();
		d2.start();
		d3.start();
	}
}
