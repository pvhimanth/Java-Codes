package oops_encapsulation;

/*
// Accessing the instance variable(or secure variable) without security---prints null
class Ac{
	String coolant;
}
public class Day25pgm2 {
public static void main(String[] args) {
	Ac a=new Ac();
	System.out.println(a.coolant);
}
}

*/

//proving security using private keyword
class Ac{
	private String coolant;
}
public class Day25pgm2 {
public static void main(String[] args) {
	Ac a=new Ac();
	//System.out.println(a.coolant);  -->error can't access private variables
}
}

