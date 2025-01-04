package methodoverloading;

//Implementing method with same name,no of parameters,type of parameters,datatype - gives error


class Calculator3{
	
	/*  
	 *error 
	 
		void add(int a, int b) {
		System.out.println(a + b);
		}

		void add(int a, int b) {
		System.out.println(a + b);
		}
	 
	*/
}
public class Day24pgm1 {
public static void main(String[] args) {
	Calculator3 cal = new Calculator3();
	//cal.add(12,50); ----error
}
}
