package assignment2_inheritance;

class Instrument {
	String type;
	String brand;

	void tune() {
		System.out.println("Make a tune with Instrument");
	}

	void clean() {
		System.out.println("Clean the instrument");
	}

	void play() {
		System.out.println("Play the Instrument");
	}
}

class Guitar extends Instrument {
	@Override
	void play() {
		System.out.println("Play the Guitar");
	}
}

class Piano extends Instrument {
	@Override
	void play() {
		System.out.println("Play the Piano");
	}
}

class Drums extends Instrument {
	@Override
	void play() {
		System.out.println("Play the Drums");
	}
}

public class Asg2pgm10 {
	public static void main(String[] args) {
		Guitar g = new Guitar();
		Piano p = new Piano();
		Drums d = new Drums();

		g.clean();
		g.tune();
		g.play();

		p.clean();
		p.tune();
		p.play();

		d.clean();
		d.tune();
		d.play();
	}
}
