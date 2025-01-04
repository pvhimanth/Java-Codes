package oops_inheritance;

//overriding toString() method which is inherited from object class
class Employee1{
	@Override
	public String toString() {
		return "Hi";
	}
}
public class Day38pgm2 {
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		System.out.println(e);
	}
}
