package collections_hashset;

import java.util.HashSet;

/* HashSet can store heterogeneous elements, can't store duplicate values,
 * only stores single null value (as duplicates not allowed)
 */
public class Day74pgm1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(100);
		hs.add("Himanth");
		hs.add(18.0f);
		hs.add(null);
		hs.add(null);
		hs.add(175);
		System.out.println(hs);
	}
}
