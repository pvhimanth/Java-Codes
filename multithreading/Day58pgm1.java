package multithreading;

import java.util.Scanner;

// Achieving MultiThreading by implementing runnable Interface

class Demo11 implements Runnable {
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

class Demo22 implements Runnable {
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

class Demo33 implements Runnable {
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

public class Day58pgm1 {
	public static void main(String[] args) {
		Demo11 d1 = new Demo11();
		Demo22 d2 = new Demo22();
		Demo33 d3 = new Demo33();

		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);

		t1.start();
		t2.start();
		t3.start();
	}
}
