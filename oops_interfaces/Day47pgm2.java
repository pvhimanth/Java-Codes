package oops_interfaces;

//program with default methods in interface
interface SeaAnimals {
	void swim();

	void eat();

	default void communicate() {
		System.out.println("SeaAnimals can communicate");
	}
}

class Dolphin implements SeaAnimals {
	@Override
	public void swim() {
		System.out.println("Dolphin swims beautifully");
	}

	@Override
	public void eat() {
		System.out.println("Dolphin eats fishes");
	}
}

class Shark implements SeaAnimals {
	@Override
	public void swim() {
		System.out.println("Shark swims fast");
	}

	@Override
	public void eat() {
		System.out.println("Shark eats humanbeings");
	}
}

class Seal implements SeaAnimals {
	@Override
	public void swim() {
		System.out.println("Seal swims slowly");
	}

	@Override
	public void eat() {
		System.out.println("Seal eats small fishes");
	}
}

public class Day47pgm2 {
	public static void main(String[] args) {
		Dolphin d = new Dolphin();
		Shark s = new Shark();
		Seal se = new Seal();

		d.swim();
		d.eat();
		d.communicate();

		s.swim();
		s.eat();
		s.communicate();

		se.swim();
		se.eat();
		se.communicate();

	}
}
