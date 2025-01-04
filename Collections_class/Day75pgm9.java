package Collections_class;

import java.util.ArrayList;
import java.util.Collections;

/* Methods of Collections Class --> 1. min() method, 2. max() method,
 * 3. frequency() method, 4. replaceAll() method, 5. shuffle() method
 * 6. sort() method
 */
public class Day75pgm9 {
	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(2);
		al1.add(5);

		// 1. min() method
		System.out.println(Collections.min(al1));
		System.out.println("-------------------------------");

		// 2. max() method
		System.out.println(Collections.max(al1));
		System.out.println("-------------------------------");

		// 3. frequency() method
		System.out.println(Collections.frequency(al1, 10));
		System.out.println(Collections.frequency(al1, 5));
		System.out.println("-------------------------------");

		// 4. shuffle() method
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.println(al2);
		Collections.shuffle(al2);
		System.out.println(al2);
		System.out.println("-------------------------------");

		// 5. replaceAll() method
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(11);
		al3.add(11);
		al3.add(20);
		al3.add(30);
		System.out.println(al3);
		Collections.replaceAll(al3, 11, 10);
		System.out.println(al3);
		System.out.println("-------------------------------");

		// 6. sort() method
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(90);
		al4.add(2);
		al4.add(100);
		al4.add(7);
		System.out.println(al4);
		Collections.sort(al4);
		System.out.println(al4);
		System.out.println("-------------------------------");

		// sorting string objects in ArrayList using Collections class
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Ram");
		al5.add("Sam");
		al5.add("Tom");
		al5.add("John");
		System.out.println(al5);
		Collections.sort(al5);
		System.out.println(al5);

	}
}
