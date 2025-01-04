package statickeyword;

//instance members can only execute by creating object 

class Test4 {
	int a = 100;

	{
		System.out.println("Inside instance block");
	}

	void disp() {
		System.out.println("Inside instance method");
	}
}

public class Day31pgm4 {
	public static void main(String[] args) {
       Test4 t=new Test4();
       t.disp();
	}
}
