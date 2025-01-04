package collections_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Day70pgm6 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		// traversing LinkedList forward using listIterator()
		ListIterator cursor = ll.listIterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}

		System.out.println("--------------------");

		// traversing LinkedList backward using listIterator()
		ListIterator cursorr = ll.listIterator(ll.size());
		while (cursor.hasPrevious()) {
			System.out.println(cursor.previous());
		}
	}
}
