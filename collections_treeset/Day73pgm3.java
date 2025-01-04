package collections_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Day73pgm3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);

		// Traversing TreeSet using enhanced for loop
		for (Object o : ts) {
			System.out.println(o);
		}
		System.out.println("---------------------------------------");

		// Traversing TreeSet using iterator
		Iterator cursor = ts.iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		System.out.println("---------------------------------------");

		// Traversing TreeSet form backwards using descendingIterator
		Iterator cursorr = ts.descendingIterator();
		while (cursorr.hasNext()) {
			System.out.println(cursorr.next());
		}
	}
}
