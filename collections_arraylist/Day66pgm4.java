package collections_arraylist;
import java.util.ArrayList;

/*we can give capacity(size) of ArrayList if we know exact capacity before
 *  with help of constructor that takes initial capacity as parameter
 */
public class Day66pgm4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(11); // setting initial capacity of ArrayList before
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(90);
		al.add(100);
		al.add(110);
		System.out.println(al);
	}
}
