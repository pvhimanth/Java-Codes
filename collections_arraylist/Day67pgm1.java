package collections_arraylist;

import java.util.ArrayList;

/*Methods of ArrayList--> 1. add(), 2. add(index,data),3. addAll(reference),
 * 4. addAll(index,reference),5. retainAll(reference), 6. removeAll(reference),
 * 7. trimToSize(),  8. isEmpty(), 9. set(index,data), 10. get(index), 11. indexOf(data)
 * 12. contains(data),  13. remove(index) 14. size()
 */
public class Day67pgm1 {
	public static void main(String[] args) {

		// 1. add() method
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		System.out.println("----------------");

		// 2. add(index,data) method
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(2, 20);
		System.out.println(al2);
		System.out.println("----------------");

		// 3. addAll(reference) method
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("----------------");

		// 4. addAll(index,reference) method
		ArrayList al3 = new ArrayList();
		al3.add(1);
		al3.add(2);
		al3.add(3);

		ArrayList al4 = new ArrayList();
		al4.add(100);
		al4.add(200);
		al4.add(300);

		al3.addAll(1, al4);
		System.out.println(al3);
		System.out.println("----------------");

		// 5. retainAll(reference) method
		ArrayList al5 = new ArrayList();
		al5.add(6);
		al5.add(7);
		al5.add(8);

		ArrayList al6 = new ArrayList();
		al6.add(6);
		al6.add(8);
		al6.add(9);

		al5.retainAll(al6);
		System.out.println(al5);
		System.out.println("----------------");

		// 6. removeAll(reference);
		ArrayList al7 = new ArrayList();
		al7.add(6);
		al7.add(7);
		al7.add(8);

		ArrayList al8 = new ArrayList();
		al8.add(6);
		al8.add(8);
		al8.add(9);

		al7.removeAll(al8);
		System.out.println(al7);
		System.out.println("----------------");

		// 7. trimToSize() method
		ArrayList al9 = new ArrayList();
		al9.add(11);
		al9.add(22);
		al9.add(33);
		
		al9.trimToSize();
		System.out.println(al9);
		System.out.println("----------------");

		// 8. isEmpty() method
		System.out.println(al9.isEmpty());
		System.out.println("----------------");

		// 9. set(index,data) method
		ArrayList al10 = new ArrayList();
		al10.add(11);
		al10.add(22);
		al10.add(33);

		al10.set(1, 78);
		System.out.println(al10);
		System.out.println("----------------");

		// 10. get(index) method
		ArrayList al11 = new ArrayList();
		al11.add(101);
		al11.add(102);
		al11.add(103);

		System.out.println(al11.get(1));
		System.out.println("----------------");

		// 11. indexOf(data) method
		System.out.println(al11.indexOf(102));
		System.out.println("----------------");

		// 12. contains(data) method
		System.out.println(al11.contains(103));
		System.out.println("----------------");

		// 13. remove(index) method
		ArrayList al12 = new ArrayList();
		al12.add(41);
		al12.add(42);
		al12.add(43);

		al12.remove(2);
		System.out.println(al12);
		System.out.println("----------------");
		
		// 14. size() method
		System.out.println(al12.size());
	}
}
