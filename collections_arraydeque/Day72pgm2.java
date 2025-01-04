package collections_arraydeque;

import java.util.ArrayDeque;

// ArrayDeque is used to create Stack with help of push() & pop() methods using FILO or LIFO principle
public class Day72pgm2 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.push(10);
		ad.push(20);
		ad.push(30);
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad);
	}
}
