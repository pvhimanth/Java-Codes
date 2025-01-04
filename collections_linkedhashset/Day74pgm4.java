package collections_linkedhashset;

import java.util.LinkedHashSet;

/* creating LinkedHashSet(child class of HashSet) and inserting data using add() method 
 * -->preserves the order of insertion and don't sort the data
 */
public class Day74pgm4 {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
		System.out.println(lhs);
	}
}
