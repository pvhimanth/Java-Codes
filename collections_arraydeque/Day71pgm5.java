package collections_arraydeque;

import java.util.ArrayDeque;

// Traversing ArrayDeque using enhanced for loop
public class Day71pgm5 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);

		for (Object value : ad) {
			System.out.println(value);
		}
	}
}
