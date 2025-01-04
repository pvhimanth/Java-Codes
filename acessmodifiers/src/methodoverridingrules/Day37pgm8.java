package methodoverridingrules;

//Accessing parent class methods from child class methods using super keyword

class Demor{
	void disp() {
		System.out.println("Hi");
	}
}

class Demos extends Demor{
	@Override
	void disp() {
		System.out.println("Hello");
		super.disp();
	}
}

public class Day37pgm8 {
public static void main(String[] args) {
	Demos d=new Demos();
	d.disp();
}
}
