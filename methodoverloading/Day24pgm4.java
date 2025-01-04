package methodoverloading;


// Main method overloading(print only 1) as for remaining methods don't have reference in main(string[] args) methos
public class Day24pgm4 {
public static void main(String[] args) {
	System.out.println("1"); 
}
public static void main() {
	System.out.println("2");
}
public static void main(int a) {
	System.out.println("3");
}
public static void main(int a,int b) {
	System.out.println("4");
}
public static void main(int[] a) {
	System.out.println("5");
}

}
