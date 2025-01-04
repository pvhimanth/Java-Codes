package collections_arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

// traversing using ListIterator --> traverse forwards and backwars
public class Day68pgm3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		//traversing forward using listIterator()
		ListIterator cursor = al.listIterator();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		System.out.println("--------------------");
		
		//traversing backward using listIterator()
		ListIterator cursorr = al.listIterator(al.size());
		while (cursor.hasPrevious()) {
			System.out.println(cursor.previous());
		}
	}
}
