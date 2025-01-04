package oops_abstraction;

//abstract methods has to complete compulsory in anyway
abstract class Bird {
	abstract void eat();

	abstract void fly();
}

abstract class Eagle extends Bird {
	@Override
	void fly() {
		System.out.println("Eagle flies at greater heights");
	}
}

class SerpentEagle extends Eagle {
	@Override
	void eat() {
		System.out.println("SerpentEagle eats snakes");
	}
}

class GoldenEagle extends Eagle {
	@Override
	void eat() {
		System.out.println("GoldenEagle eats fishes");
	}
}

class EagleFamily {
	void family(Eagle ref) {
		ref.fly();
		ref.eat();
	}
}

public class Day44pgm1 {
	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		EagleFamily ef = new EagleFamily();

		ef.family(se);
		ef.family(ge);

	}
}
