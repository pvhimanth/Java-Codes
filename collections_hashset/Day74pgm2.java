package collections_hashset;

import java.util.HashSet;

/* Methods of ArrayList, LinkedList, ArrayDeque & TreeSet present in HashSet
 * 1. add(), 2. addAll(reference), 3. retainAll(reference) , 4. removeAll(reference),
 * 5. isEmpty(), 6. contains(data), 7. size()
 */
public class Day74pgm2 {
	public static void main(String[] args) {

		// 1. add() method
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		System.out.println(hs1); // [20, 10, 30]
		System.out.println("----------------------------------");

		// 2. addAll(reference) method
		HashSet hs2 = new HashSet();
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);

		HashSet hs3 = new HashSet();
		hs3.add(10);
		hs3.add(20);
		hs3.add(30);

		hs2.addAll(hs3);
		System.out.println(hs2); // [1, 2, 3, 20, 10, 30]
		System.out.println("----------------------------------");

		// 3. retainAll(reference) method
		HashSet hs4 = new HashSet();
		hs4.add(6);
		hs4.add(7);
		hs4.add(8);

		HashSet hs5 = new HashSet();
		hs5.add(6);
		hs5.add(8);
		hs5.add(9);

		hs4.retainAll(hs5);
		System.out.println(hs4); // Output: [6, 8]
		System.out.println("----------------------------------");

		// 4. removeAll(reference) method
		HashSet hs6 = new HashSet();
		hs6.add(6);
		hs6.add(7);
		hs6.add(8);

		HashSet hs7 = new HashSet();
		hs7.add(6);
		hs7.add(8);
		hs7.add(9);

		hs6.removeAll(hs7);
		System.out.println(hs6); // Output: [7]
		System.out.println("----------------------------------");

		// 5. isEmpty() method
		System.out.println(hs7.isEmpty()); // Output: false
		System.out.println("----------------------------------");

		// 6. contains(data) method
		System.out.println(hs7.contains(8)); // Output: true
		System.out.println("----------------------------------");

		// 7. size() method
		System.out.println(hs7.size()); // Output: 3

	}
}
