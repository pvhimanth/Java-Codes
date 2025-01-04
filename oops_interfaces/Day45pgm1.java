package oops_interfaces;

import java.util.Scanner;

/* creating interface and implementing by classes to use methods of interface.....
 * have to use same name of methods in interface in classes but method body can be different.....
 * can't create object to interface....
 */
interface Calculator {
	public abstract void add();

	public abstract void sub();
}

class MyCalculator1 implements Calculator { // implementing class
	@Override
	public void add() { // implementing methods
		System.out.println(100 + 200);
	}

	@Override
	public void sub() {
		System.out.println(200 - 100);
	}
}

class MyCalculator2 implements Calculator {
	@Override
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scan.nextInt();
		System.out.println("Enter number 2");
		int b = scan.nextInt();
		System.out.println(a + b);
	}

	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scan.nextInt();
		System.out.println("Enter number 2");
		int b = scan.nextInt();
		System.out.println(a - b);
	}
}

class MyCalculator3 implements Calculator {
	@Override
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scan.nextInt();
		System.out.println("Enter number 2");
		int b = scan.nextInt();
		if (a > b) {

			System.out.println(a + b);
		} else {
			System.out.println("Invalid input");
		}
	}

	@Override
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = scan.nextInt();
		System.out.println("Enter number 2");
		int b = scan.nextInt();
		if (b > a) {
			System.out.println(a - b);
		} else {
			System.out.println("Invalid input");
		}
	}
}

class Casio {
	public void cal(Calculator ref) { // we can create reference to interface not object
		ref.add();
		ref.sub();
	}
}

public class Day45pgm1 {
	public static void main(String[] args) {
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		MyCalculator3 mc3 = new MyCalculator3();

		Casio c = new Casio(); // achieved polymorphism through interface reference
		c.cal(mc1);
		c.cal(mc2);
		c.cal(mc3);

	}
}
