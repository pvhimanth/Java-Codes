package oops_encapsulation;

//using nextLine() after nextInt() without dummynextLine() ---> not scans values after nextInt()
import java.util.Scanner;
public class Day28pgm4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the integer");
	int a=scan.nextInt();
	System.out.println("Enter the String");
	String b=scan.nextLine();
	System.out.println("Integer: "+a);
	System.out.println("String: "+b);

	
}
}
