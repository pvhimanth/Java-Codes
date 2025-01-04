package assignment2_inheritance;

class Animal {
	String name;
	int age;

	void eat() {
		System.out.println("Animals eats food from forest");
	}

	void sleep() {
		System.out.println("Animals sleeps on trees");
	}
}

class Mammal extends Animal {
	
	void makeSound() {
		System.out.println("Mammal sounds loud");
	}
}
class Bird extends Animal {
	
	void makeSound() {
		System.out.println("Bird chirps");
	}
}
class Reptile extends Animal {
	
	void makeSound() {
		System.out.println("Reptile sounds like ssss");
	}
}



public class Asg2pgm5 {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		Bird b = new Bird();
		Reptile r = new Reptile();

		m.eat();
		m.sleep();
		m.makeSound();
		
		b.eat();
		b.sleep();
		b.makeSound();
		
		r.eat();
		r.sleep();
		r.makeSound();
	}
}
