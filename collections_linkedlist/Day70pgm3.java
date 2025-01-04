package collections_linkedlist;

import java.util.LinkedList;

/* Methods which are present in LinkedList not in ArrayList: ----->
 * 1.addFirst(data), 2.addLast(data), 3.getFirst(), 4.getLast(), 
 * 5.removeFirst(), 6.removeLast(), 7.offer(data), 8.offerFirst(data),
 * 9.offerLast(data)
 */

public class Day70pgm3 {
	public static void main(String[] args) {

		// 1.addFirst(data) method
		LinkedList LL1 = new LinkedList();
		LL1.add(10);
		LL1.add(20);
		LL1.add(30);
		LL1.addFirst(100);
		System.out.println(LL1);
		System.out.println("----------------------");

		// 2.addLast(data) method
		LinkedList LL2 = new LinkedList();
		LL2.add(10);
		LL2.add(20);
		LL2.add(30);
		LL2.addLast(100);
		System.out.println(LL2);
		System.out.println("----------------------");

		// 3.getFirst() method
		System.out.println(LL2.getFirst());
		System.out.println("----------------------");

		// 4.getLast() method
		System.out.println(LL2.getLast());
		System.out.println("----------------------");

		// 5.removeFirst() method
		LinkedList LL3 = new LinkedList();
		LL3.add(10);
		LL3.add(20);
		LL3.add(30);
		System.out.println(LL3);
		
		LL3.removeFirst();
		System.out.println(LL3);
		System.out.println("----------------------");
		
		// 6.removeLast() method
		LinkedList LL4 = new LinkedList();
		LL4.add(1);
		LL4.add(2);
		LL4.add(3);
		
		System.out.println(LL4);
		LL4.removeLast();
		System.out.println(LL4);
		System.out.println("----------------------");
		
		// 7.offer(data) method
		LinkedList LL5 = new LinkedList();
		LL5.offer(1);
		LL5.offer(2);
		LL5.offer(3);
		
		System.out.println(LL5);
		System.out.println("----------------------");
		
		// 8.offerFirst(data) method
		LinkedList LL6 = new LinkedList();
		LL6.offer(11);
		LL6.offer(12);
		LL6.offer(13);
		LL6.offerFirst(1000);
		System.out.println(LL6);
		System.out.println("----------------------");
		
		// 9.offerLast(data) method
		LinkedList LL7 = new LinkedList();
		LL7.offer(11);
		LL7.offer(12);
		LL7.offer(13);
		LL7.offerLast(2000);
		System.out.println(LL7);
		System.out.println("----------------------");
		
	}
}
