package collections_linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Day74pgm7 {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);

		// traversing LinkedHashSet using enhanced for loop
		for (Object value : lhs) {
			System.out.println(value);
		}
		System.out.println("---------------------------------------");

		// traversing LinkedHashSet using iterator
		Iterator cursor = lhs.iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
}
