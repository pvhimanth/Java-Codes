package collections_linkedlist;

import java.util.LinkedList;

/*Methods of LinkedList which are present in ArrayList--> 1. add(), 2. add(index,data),
 * 3. addAll(reference), 4. addAll(index,reference),5. retainAll(reference), 6. removeAll(reference),
 * 7. isEmpty(), 8. set(index,data), 9. get(index), 10. indexOf(data)
 * 11. contains(data),  12. remove(index), 13.size()
 */
public class Day70pgm2 {
	public static void main(String[] args) {

		// 1. add() method
		LinkedList ll1 = new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		System.out.println(ll1);
		System.out.println("----------------");

		// 2. add(index,data) method
		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		ll2.add(1, 20);
		System.out.println(ll2);
		System.out.println("----------------");

		// 3. addAll(reference) method
		ll1.addAll(ll2);
		System.out.println(ll1);
		System.out.println("----------------");

		// 4. addAll(index,reference) method
		LinkedList ll3 = new LinkedList();
		ll3.add(1);
		ll3.add(2);
		ll3.add(3);

		LinkedList ll4 = new LinkedList();
		ll4.add(100);
		ll4.add(200);
		ll4.add(300);

		ll3.addAll(1, ll4);
		System.out.println(ll3);
		System.out.println("----------------");

		// 5. retainAll(reference) method
		LinkedList ll5 = new LinkedList();
		ll5.add(6);
		ll5.add(7);
		ll5.add(8);

		LinkedList ll6 = new LinkedList();
		ll6.add(6);
		ll6.add(8);
		ll6.add(9);

		ll5.retainAll(ll6);
		System.out.println(ll5);
		System.out.println("----------------");

		// 6. removeAll(reference);
		LinkedList ll7 = new LinkedList();
		ll7.add(6);
		ll7.add(7);
		ll7.add(8);

		LinkedList ll8 = new LinkedList();
		ll8.add(6);
		ll8.add(8);
		ll8.add(9);

		ll7.removeAll(ll8);
		System.out.println(ll7);
		System.out.println("----------------");

		// 7. isEmpty() method
		System.out.println(ll8.isEmpty());
		System.out.println("----------------");

		// 8. set(index,data) method
		LinkedList ll9 = new LinkedList();
		ll9.add(11);
		ll9.add(22);
		ll9.add(33);

		ll9.set(1, 78);
		System.out.println(ll9);
		System.out.println("----------------");

		// 9. get(index) method
		LinkedList LL10 = new LinkedList();
		LL10.add(101);
		LL10.add(102);
		LL10.add(103);

		System.out.println(LL10.get(1));
		System.out.println("----------------");

		// 10. indexOf(data) method
		System.out.println(LL10.indexOf(102));
		System.out.println("----------------");

		// 11. contains(data) method
		System.out.println(LL10.contains(103));
		System.out.println("----------------");

		// 12. remove(index) method
		LinkedList LL12 = new LinkedList();
		LL12.add(41);
		LL12.add(42);
		LL12.add(43);

		LL12.remove(2);
		System.out.println(LL12);
		System.out.println("----------------");

		// 13.size() method
		System.out.println(LL12.size());
	}
}
