package assignment2_inheritance;

class Furniture {
	String material;
	String colour;

	void assemble() {
		System.out.println("Assembling the Furniture");
	}

	void disassemble() {
		System.out.println("Diassemble the furniture");
	}
}

class Chair extends Furniture {
	void sitOn() {
		System.out.println("Sit on the Chair");
	}
}

class Table extends Furniture {
	void sitOn() {
		System.out.println("Sit on the Table");
	}
}

class Sofa extends Furniture {
	void sitOn() {
		System.out.println("Sit on the Sofa");
	}
}

public class Asg2pgm8 {
	public static void main(String[] args) {
		Chair c = new Chair();
		Table t = new Table();
		Sofa s = new Sofa();

		c.disassemble();
		c.assemble();
		c.sitOn();

		t.disassemble();
		t.assemble();
		t.sitOn();

		s.disassemble();
		s.assemble();
		s.sitOn();
	}
}
