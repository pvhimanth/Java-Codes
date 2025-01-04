package assignment2_inheritance;

class Clothing {
	String type;
	float size;

	void iron() {
		System.out.println("Iron the clothes");
	}

	void wear() {
		System.out.println("Wear the clothes");
	}

	void remove() {
		System.out.println("Removing the clothes");
	}
}

class Shirt extends Clothing {
	@Override
	void iron() {
		System.out.println("Iron the shirt");
	}
}

class Pants extends Clothing {
	@Override
	void iron() {
		System.out.println("Iron the pants");
	}
}

class Dress extends Clothing {
	@Override
	void iron() {
		System.out.println("Iron the dress");
	}
}

public class Asg2pgm12 {
	public static void main(String[] args) {
		Shirt s = new Shirt();
		Pants p = new Pants();
		Dress d = new Dress();

		s.iron();
		s.wear();
		s.remove();

		p.iron();
		p.wear();
		p.remove();

		d.iron();
		d.wear();
		d.remove();
	}
}
