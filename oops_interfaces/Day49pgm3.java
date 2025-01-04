package oops_interfaces;


/*Accessing method of inner class(Present in outer class, not in class of main method) 
 * in main method
 */


/* 	1 way.. making inner class as static an creating object of inner class with outer class
 * 
 * class Outer {
		static class Inner {
			void disp() {
				System.out.println("Hello");
			}
		}
	}

	public class Day49pgm3 {
		public static void main(String[] args) {
			Outer.Inner i = new Outer.Inner();
			i.disp();
		}
	}
*/


/* 2 Way... making inner class method as static and accessing through outer.inner.method()

	class Outer {
		class Inner {
			static void disp() {
				System.out.println("Hello");
			}
		}
	}

	public class Day49pgm3 {
		public static void main(String[] args) {
			Outer.Inner.disp();
		}
	}
 */


/* 3 Way.......
 * create an instance of the outer class, then create an instance of the
 * inner class and call its disp() method.
 */

class Outer {
    class Inner {
        void disp() { 
            System.out.println("Hello");
        }
    }
}

public class Day49pgm3 {
    public static void main(String[] args) {
        // Creating instance of Outer class
        Outer outer = new Outer();
        
        // Creating instance of Inner class using Outer class instance
        Outer.Inner inner = outer.new Inner();
        
        inner.disp();
    }
}














