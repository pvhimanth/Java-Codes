package assignment2_inheritance;

class Plant {
	String name;
	String species;

	void photosynthesize() {
		System.out.println("Plant started photosynthesize");
	}

	void absorbNutrients() {
		System.out.println("Plant absorbing nutrients");
	}
}

class FloweringPlant extends Plant {
	void grow() {
		System.out.println("FloweringPlant starts to grow");
	}
}

class NonFLoweringPlant extends Plant {
	void grow() {
		System.out.println("NonFloweringPlant starts to grow");
	}
}

class FruitBearingPlant extends Plant {
	void grow() {
		System.out.println("FruitBearingPlant starts to grow ");
	}
}

public class Asg2pgm9 {
	public static void main(String[] args) {
		FloweringPlant fp = new FloweringPlant();
		NonFLoweringPlant nfp = new NonFLoweringPlant();
		FruitBearingPlant fbp = new FruitBearingPlant();

		fp.photosynthesize();
		fp.absorbNutrients();
		fp.grow();

		nfp.photosynthesize();
		nfp.absorbNutrients();
		nfp.grow();

		fbp.photosynthesize();
		fbp.absorbNutrients();
		fbp.grow();
	}
}
