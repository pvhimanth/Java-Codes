package collections_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//traversing LinkedList using Iterator --> traverse only forwards
public class Day70pgm5 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		Iterator cursor = ll.iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
}
