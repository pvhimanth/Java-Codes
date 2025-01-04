package collections_linkedlist;

import java.util.LinkedList;

// LinkedList is used to create queue follows FIFO or LILO Principle
public class Day71pgm1 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println(ll);
	}
}
