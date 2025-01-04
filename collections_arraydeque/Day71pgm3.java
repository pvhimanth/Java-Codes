package collections_arraydeque;

import java.util.ArrayDeque;

public class Day71pgm3 {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add("Himanth"); // ArrayDeque can store heterogeneous elements
		ad.add(30); // ArrayDeque can store duplicates
//		ad.add(null); ArrayDeque can't store null value
		System.out.println(ad);
	}
}
