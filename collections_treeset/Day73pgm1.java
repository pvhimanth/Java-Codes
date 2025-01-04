package collections_treeset;

import java.util.TreeSet;

/* Methods of TreeSet which are present in both ArrayList and LinkedList --->
 * 1. add(), 2. addAll(reference), 3. retainAll(reference), 4. removeAll(reference),
 * 5. isEmpty(), 6. contains(data), 7. size(), 8. getFirst(), 9. getLast(),
 * 10. removeFirst(), 11. removeLast() 
 */
public class Day73pgm1 {
	public static void main(String[] args) {

		// 1. add() method
		TreeSet ts1 = new TreeSet();
		ts1.add(10);
		ts1.add(20);
		ts1.add(30);
		System.out.println(ts1);
		System.out.println("--------------------------");

		// 2. addAll(reference) method
		TreeSet ts2 = new TreeSet();
		ts2.add(10);
		ts2.add(20);
		ts2.add(30);

		TreeSet ts3 = new TreeSet();
		ts3.add(100);
		ts3.add(200);
		ts3.add(300);

		ts2.addAll(ts3);
		System.out.println(ts2);
		System.out.println("--------------------------");

		// 3. retainAll(reference) method
		TreeSet ts4 = new TreeSet();
		ts4.add(6);
		ts4.add(7);
		ts4.add(8);

		TreeSet ts5 = new TreeSet();
		ts5.add(6);
		ts5.add(8);
		ts5.add(9);

		ts4.retainAll(ts5); // Keeps only common elements
		System.out.println(ts4); // Output: [6, 8]
		System.out.println("--------------------------");

		// 4. removeAll(reference) method
		TreeSet ts6 = new TreeSet();
		ts6.add(6);
		ts6.add(7);
		ts6.add(8);

		TreeSet ts7 = new TreeSet();
		ts7.add(6);
		ts7.add(8);
		ts7.add(9);

		ts6.removeAll(ts7); // Removes common elements
		System.out.println(ts6); // Output: [7]
		System.out.println("--------------------------");

		// 5. isEmpty() method
		System.out.println(ts7.isEmpty()); // Output: false
		System.out.println("--------------------------");

		// 6. contains(data) method
		System.out.println(ts7.contains(8)); // Output: true
		System.out.println("--------------------------");

		// 7. size() method
		System.out.println(ts7.size()); // Output: 3
		System.out.println("--------------------------");

		// 8. getFirst() method
		TreeSet ts8 = new TreeSet();
		ts8.add(10);
		ts8.add(2);
		ts8.add(3);
		System.out.println(ts8.getFirst());
		System.out.println("--------------------------");

		// 9. getLast() method
		System.out.println(ts8.getLast());
		System.out.println("--------------------------");

		// 10. removeFirst() method
		TreeSet ts9 = new TreeSet();
		ts9.add(11);
		ts9.add(2);
		ts9.add(30);
		System.out.println(ts9);

		ts9.removeFirst();
		System.out.println(ts9);
		System.out.println("--------------------------");

		// 11. removeLast() method
		TreeSet ts10 = new TreeSet();
		ts10.add(21);
		ts10.add(1);
		ts10.add(2);

		System.out.println(ts10);
		ts10.removeLast();
		System.out.println(ts10);
		System.out.println("--------------------------");

	}
}
