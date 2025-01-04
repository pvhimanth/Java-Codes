package oops_encapsulation;

//using nextLine() after nextInt() with dummynextLine() ---> scans values after nextInt()
import java.util.Scanner;
public class Day28pgm5 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the integer");
	int a=scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the String");
	String b=scan.nextLine();
	System.out.println("Integer: "+a);
	System.out.println("String: "+b);
}
}
