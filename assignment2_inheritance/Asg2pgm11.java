package assignment2_inheritance;

class FoodItem {
	String name;
	int calories;

	void prepare() {
		System.out.println("Preparation of food");
	}

	void consume() {
		System.out.println("Consuming the food");
	}

	void digest() {
		System.out.println("Digestion of food");
	}

}

class Fruit extends FoodItem {
	@Override
	void prepare() {
		System.out.println("Cutting the fruits");
	}
}

class Vegetables extends FoodItem {
	@Override
	void prepare() {
		System.out.println("Chopping the vegetables");
	}
}

class DairyProduct extends FoodItem {
	@Override
	void prepare() {
		System.out.println("Making the tea with Diary Product");
	}
}

public class Asg2pgm11 {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		Vegetables v = new Vegetables();
		DairyProduct dp = new DairyProduct();

		f.prepare();
		f.consume();
		f.digest();

		v.prepare();
		v.consume();
		v.digest();

		dp.prepare();
		dp.consume();
		dp.digest();
	}
}
