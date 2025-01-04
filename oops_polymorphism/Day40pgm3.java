package oops_polymorphism;


/* Achieved polymorphism by call passing child object address to parent ref 
 * through separate method with parent reference 
 */
class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("Tiger eats meat");
	}
	@Override
	void sleep() {
		System.out.println("TIger sleeps in field");
	}
}

class Monkey extends Animal{
	@Override
	void eat() {
		System.out.println("Monkey eats bananas");
	}
	@Override
	void sleep() {
		System.out.println("Monkey sleeps on trees");
	}
}

class Forest{
	
	public void routine(Animal ref) {
		ref.eat();
		ref.sleep();
	}
}
public class Day40pgm3 {
public static void main(String[] args) {
	Tiger t=new Tiger();
	Monkey m=new Monkey();
	
	Forest f=new Forest();
	
	f.routine(t);
	f.routine(m);
	
}
}
