package collections_arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

// Traversing ArrayDeque from backwards using descendingIterator() method
public class Day73pgm3 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);

		Iterator cursor = ad.descendingIterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

	}
}
