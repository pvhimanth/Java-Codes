package collections_arraydeque;

import java.util.ArrayDeque;

// ArrayDeque is used to create Queue using FIFO or LILO principle
public class Day72pgm1 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad);
	}
}
