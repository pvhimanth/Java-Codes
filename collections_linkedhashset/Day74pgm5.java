package collections_linkedhashset;

import java.util.LinkedHashSet;

/* LinkedHashSet can store heterogeneous elements, can't store duplicate values,
 * only stores single null value (as duplicates not allowed)
 */
public class Day74pgm5 {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(100);
		lhs.add("Himanth");
		lhs.add(18.0f);
		lhs.add(null);
		lhs.add(null);
		lhs.add(175);
		System.out.println(lhs);
	}
}
