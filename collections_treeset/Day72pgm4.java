package collections_treeset;

import java.util.TreeSet;

public class Day72pgm4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(30);
		ts.add(20);
//		ts.add("Himanth"); CastCatchException--> can't store heterogeneous elements in TreeSet
		ts.add(20); // can't store duplicates in TreeSet
//		ts.add(null); NullPointerException--> can't store null in TreeSet
		System.out.println(ts);
	}
}
