package assignment2_inheritance;

import java.util.Scanner;

class Shape {
	public void area() {

	}
}

class Square extends Shape {
	Scanner scan = new Scanner(System.in);

	float side;

	void acceptInput() {
		System.out.println("Enter the Side");
		side = scan.nextFloat();
	}

	@Override
	public void area() {
		System.out.println(side * side);
	}

}

class Rectangle extends Shape {
	Scanner scan = new Scanner(System.in);

	public float length;
	public float breadth;

	void acceptInput() {
		System.out.println("Enter the length");
		length = scan.nextFloat();
		System.out.println("Enter the breadth");
		breadth = scan.nextFloat();
	}

	@Override
	public void area() {
		System.out.println(length * breadth);
	}
}

class Circle extends Shape {
	Scanner scan = new Scanner(System.in);
	final float PI = 3.142f;
	public float radius;

	void acceptInput() {
		System.out.println("Enter the radius");
		radius = scan.nextFloat();
	}

	public void area() {
		System.out.println(PI * radius * radius);
	}
}

public class Asg2pgm2 {
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();

		s.acceptInput();
		s.area();
		r.acceptInput();
		r.area();
		c.acceptInput();
		c.area();
	}
}
