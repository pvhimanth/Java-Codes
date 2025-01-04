package collections_linkedhashset;

import java.util.LinkedHashSet;

/* Methods of ArrayList, LinkedList, TreeSet, HashSet that present in LinkedHashSet --->
 * 1. add(), 2. addAll(reference), 3. retainAll(reference), 4. removeAll(reference),
 * 5. isEmpty(), 6. contains(data), 7. size(), 8. addFirst(), 9. addLast(),
 * 10. getFirst(), 11. getLast(), 12. removeFirst(), 13. removeLast()
 */
public class Day74pgm6 {
	public static void main(String[] args) {

		// 1. add() method
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);
		System.out.println(lhs1);
		System.out.println("-----------------------------------");

		// 2. addAll(reference)
		LinkedHashSet lhs2 = new LinkedHashSet();
		lhs2.add(1);
		lhs2.add(2);
		lhs2.add(3);

		LinkedHashSet lhs3 = new LinkedHashSet();
		lhs3.add(100);
		lhs3.add(200);
		lhs3.add(300);

		lhs2.addAll(lhs3);
		System.out.println(lhs2); // [1, 2, 3, 100, 200, 300]
		System.out.println("-----------------------------------");

		// 3. retainAll(reference) method
		LinkedHashSet lhs4 = new LinkedHashSet();
		lhs4.add(6);
		lhs4.add(7);
		lhs4.add(8);

		LinkedHashSet lhs5 = new LinkedHashSet();
		lhs5.add(6);
		lhs5.add(8);
		lhs5.add(9);

		lhs4.retainAll(lhs5); // Keeps only common elements
		System.out.println(lhs4); // [6, 8]
		System.out.println("-----------------------------------");

		// 4. removeAll(reference) method
		LinkedHashSet lhs6 = new LinkedHashSet();
		lhs6.add(6);
		lhs6.add(7);
		lhs6.add(8);

		LinkedHashSet lhs7 = new LinkedHashSet();
		lhs7.add(6);
		lhs7.add(8);
		lhs7.add(9);

		lhs6.removeAll(lhs7); // Removes all matching elements
		System.out.println(lhs6); // [7]
		System.out.println("-----------------------------------");

		// 5. isEmpty() method
		System.out.println(lhs7.isEmpty()); // false
		System.out.println("-----------------------------------");

		// 6. contains(data) method
		System.out.println(lhs7.contains(9)); // true
		System.out.println("-----------------------------------");

		// 7. size() method
		System.out.println(lhs7.size()); // 3
		System.out.println("-----------------------------------");

		// 8. addFirst() method since jdk21
		LinkedHashSet lhs8 = new LinkedHashSet();
		lhs8.add(10);
		lhs8.add(20);
		lhs8.add(30);

		System.out.println(lhs8); // [10, 20, 30]
		lhs8.addFirst(100);
		System.out.println(lhs8); // [100, 10, 20, 30]
		System.out.println("-----------------------------------");

		// 9. addLast() method since jdk21
		LinkedHashSet lhs9 = new LinkedHashSet();
		lhs9.add(10);
		lhs9.add(20);
		lhs9.add(30);

		System.out.println(lhs9); // [10, 20, 30]
		lhs9.addLast(100);
		System.out.println(lhs9); // [10, 20, 30, 100]
		System.out.println("-----------------------------------");

		// 10. getFirst() method since jdk21
		System.out.println(lhs9.getFirst()); // 10
		System.out.println("-----------------------------------");

		// 11. getLast() method since jdk21
		System.out.println(lhs9.getLast()); // 100
		System.out.println("-----------------------------------");

		// 12. removeFirst() method since jdk21
		LinkedHashSet lhs10 = new LinkedHashSet();
		lhs10.add(10);
		lhs10.add(20);
		lhs10.add(30);
		System.out.println(lhs10); // [10, 20, 30]

		lhs10.removeFirst();
		System.out.println(lhs10); // [20, 30]
		System.out.println("-----------------------------------");

		// 13. removeLast() method since jdk21
		LinkedHashSet lhs11 = new LinkedHashSet();
		lhs11.add(1);
		lhs11.add(2);
		lhs11.add(3);
		System.out.println(lhs11); // [1, 2, 3]

		lhs11.removeLast();
		System.out.println(lhs11); // [1, 2]
		System.out.println("-----------------------------------");

	}
}
