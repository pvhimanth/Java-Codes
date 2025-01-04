package collections_linkedlist;

import java.util.LinkedList;

// LinkedList is used to create stack using push() and pop() methods follows FILO or LIFO Principle
public class Day71pgm2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		System.out.println(ll.pop()); // pops 30
		System.out.println(ll.pop()); // pops 20
		System.out.println(ll.pop()); // pops 10
		System.out.println(ll);
	}
}
