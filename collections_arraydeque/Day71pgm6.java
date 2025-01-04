package collections_arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

//Traversing ArrayDeque using Iterator
public class Day71pgm6 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);

		Iterator cursor = ad.iterator();

		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

	}
}
