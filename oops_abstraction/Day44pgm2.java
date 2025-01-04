package oops_abstraction;

/*program to calculate area using Encapsulation, Inheritance, Polymorphism, Abstraction to calculate area
 * of Square, Rectangle, Circle 
 */
import java.util.Scanner;

abstract class Shape {
	float area;

	abstract void acceptInput();

	abstract void calcArea();

	void dispArea() {
		System.out.println(area);
	}
}

class Square extends Shape {
	private float side; 
	/* Here no need to create getters and setters
	 * as the acceptInput() method acts as setter and
	 * calcArea() method acts as getter 
	 * if you want to use use getter and setter have to modify the program
	 */

	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side");
		side = scan.nextFloat();
	}

	@Override
	void calcArea() {
		area = side * side;
	}
}

class Rectangle extends Shape {
	private float length;
	private float breadth;

	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		length = scan.nextFloat();
		System.out.println("Enter the breadth");
		breadth = scan.nextFloat();
	}

	@Override
	void calcArea() {
		area = length * breadth;
	}
}

class Circle extends Shape {
	private float radius;

	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scan.nextFloat();
	}

	@Override
	void calcArea() {
		area = (float) 3.142 * radius * radius;
	}
}

class Geometry {
	void maths(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}

public class Day44pgm2 {
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Geometry g = new Geometry();

		g.maths(s);
		g.maths(r);
		g.maths(c);
	}
}
