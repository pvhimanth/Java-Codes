package collections_linkedlist;

import java.util.LinkedList;

public class Day70pgm4 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
// traversing LinkedList using traditional for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
    System.out.println("-----------------");
    
// traversing LinkedList using enhanced for loop		
		for(Object x:ll) {
			System.out.println(x);
		}
	}
}
