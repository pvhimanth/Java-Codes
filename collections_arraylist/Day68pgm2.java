package collections_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// traversing ArrayList using Iterator --> traverse only forwards
public class Day68pgm2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		Iterator cursor = al.iterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
}
