package assignment2_inheritance;

class Computer {
	public void playGames() {

	}
}

class Laptop extends Computer {
	@Override
	public void playGames() {
		System.out.println("We can play games in laptop");
	}
}

class Desktop extends Computer {
	@Override
	public void playGames() {
		System.out.println("We can play games in Desktop");
	}
}

class Mobile extends Computer {
	@Override
	public void playGames() {
		System.out.println("We can play games in Mobile");

	}
}

public class Asg2pgm3 {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Desktop d = new Desktop();
		Mobile m = new Mobile();

		l.playGames();
		d.playGames();
		m.playGames();
	}
}
