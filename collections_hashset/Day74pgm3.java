package collections_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Day74pgm3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);

		// traversing HashSet using enhanced for loop
		for (Object value : hs) {
			System.out.println(value);
		}
		System.out.println("--------------------------------");

		// traversing HashSet using iterator
		Iterator cursor = hs.iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

	}
}
