package collections_arraydeque;

import java.util.ArrayDeque;

/*Methods of ArrayDeque which are present in ArrayList and LinkedList--> 1. add(),2. addAll(reference), 
 *3. retainAll(reference), 4. removeAll(reference), 5. isEmpty(), 6. contains(data), 
 *7.size(), 8.addFirst(data), 9.addLast(data), 10.getFirst(), 11.getLast(), 12.removeFirst(),
 * 13.removeLast(), 14.offer(data), 15.offerFirst(data), 16.offerLast(data)
 */
public class Day71pgm4 {
	public static void main(String[] args) {

		// 1. add() method
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		System.out.println(ad1);
		System.out.println("----------------");

		// 2. addAll(reference) method
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add(100);
		ad2.add(200);
		ad2.add(300);
		ad1.addAll(ad2);
		System.out.println(ad1);
		System.out.println("----------------");

		// 3. retainAll(reference) method
		ArrayDeque ad3 = new ArrayDeque();
		ad3.add(6);
		ad3.add(7);
		ad3.add(8);

		ArrayDeque ad4 = new ArrayDeque();
		ad4.add(6);
		ad4.add(8);
		ad4.add(9);

		ad3.retainAll(ad4);
		System.out.println(ad3);
		System.out.println("----------------");

		// 4. removeAll(reference) method
		ArrayDeque ad5 = new ArrayDeque();
		ad5.add(6);
		ad5.add(7);
		ad5.add(8);

		ArrayDeque ad6 = new ArrayDeque();
		ad6.add(6);
		ad6.add(8);
		ad6.add(9);

		ad5.removeAll(ad6);
		System.out.println(ad5);
		System.out.println("----------------");

		// 5. isEmpty() method
		System.out.println(ad6.isEmpty());
		System.out.println("----------------");

		// 6. contains(data) method
		System.out.println(ad6.contains(6));
		System.out.println("----------------");

		// 7. size() method
		System.out.println(ad6.size());
		System.out.println("----------------");

		// 8. addFirst(data) method
		ArrayDeque ad7 = new ArrayDeque();
		ad7.add(10);
		ad7.add(20);
		ad7.add(30);
		ad7.addFirst(100);
		System.out.println(ad7);
		System.out.println("----------------------");

		// 9. addLast(data) method
		ArrayDeque ad8 = new ArrayDeque();
		ad8.add(10);
		ad8.add(20);
		ad8.add(30);
		ad8.addLast(100);
		System.out.println(ad8);
		System.out.println("----------------------");

		// 10.getFirst() method
		System.out.println(ad8.getFirst());
		System.out.println("----------------------");

		// 11.getLast() method
		System.out.println(ad8.getLast());
		System.out.println("----------------------");

		// 12. removeFirst() method 
		ArrayDeque ad9 = new ArrayDeque();
		ad9.add(10);
		ad9.add(20);
		ad9.add(30);
		System.out.println(ad9);

		ad9.removeFirst();
		System.out.println(ad9);
		System.out.println("----------------------");

		// 13. removeLast() method
		ArrayDeque ad10 = new ArrayDeque();
		ad10.add(1);
		ad10.add(2);
		ad10.add(3);

		System.out.println(ad10);
		ad10.removeLast();
		System.out.println(ad10);
		System.out.println("----------------------");

		// 14. offer(data) method
		ArrayDeque ad11 = new ArrayDeque();
		ad11.offer(1);
		ad11.offer(2);
		ad11.offer(3);

		System.out.println(ad11);
		System.out.println("----------------------");

		// 15. offerFirst(data) method
		ArrayDeque ad12 = new ArrayDeque();
		ad12.offer(11);
		ad12.offer(12);
		ad12.offer(13);
		ad12.offerFirst(1000);
		System.out.println(ad12);
		System.out.println("----------------------");

		// 16. offerLast(data) method
		ArrayDeque ad13 = new ArrayDeque();
		ad13.offer(11);
		ad13.offer(12);
		ad13.offer(13);
		ad13.offerLast(2000);
		System.out.println(ad13);
		System.out.println("----------------------");

	}
}
