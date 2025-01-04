package collections_hashset;

import java.util.HashSet;
import java.util.LinkedList;

public class Day74pgm0 {
	public static void main(String[] args) {

		/* passing LinkedList object reference to HashSet to copy elements of LinkedList
		 * to HashSet
		 */
		LinkedList ll = new LinkedList();
		ll.add("Hi");
		ll.add(5);

		HashSet hs1 = new HashSet(ll);
		hs1.add(100);
		hs1.add("Himanth");
		hs1.add(18.0f);
		hs1.add(null);
		hs1.add(175);
		System.out.println(hs1);

		// creating HashSet with user defined initial capacity
		HashSet hs2 = new HashSet(5);
		hs2.add("Sam");
		hs2.add(21);
		hs2.add(5.10f);
		hs2.add(80.0);
		hs2.add(null);
		System.out.println(hs2);

		// creating HashSet with user defined initial capacity and load factor
		HashSet hs3 = new HashSet(5, 40);
		hs3.add("John");
		hs3.add(23);
		hs3.add(6.30f);
		hs3.add(70.0);
		hs3.add(null);
		System.out.println(hs3);

	}
}
