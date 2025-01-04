package collections_treeset;

import java.util.TreeSet;

public class Day73pgm2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);

		// ceiling() method
		System.out.println(ts.ceiling(145)); // 150
		System.out.println(ts.ceiling(150)); // 150

		// floor() method
		System.out.println(ts.floor(145)); // 125
		System.out.println(ts.floor(150)); // 150

		// higher() method
		System.out.println(ts.higher(145)); // 150
		System.out.println(ts.higher(150)); // 175

		// lower() method
		System.out.println(ts.lower(145)); // 125
		System.out.println(ts.lower(150)); // 125

		// headSet() method
		System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]
		System.out.println(ts.headSet(100)); // [25, 50, 75]

		// tailSet() method
		System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]
		System.out.println(ts.tailSet(100)); // [100, 125, 150, 175]

		// subSet() method
		System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]
		System.out.println(ts.subSet(75, 150)); // [75, 100, 125]
	}

}
