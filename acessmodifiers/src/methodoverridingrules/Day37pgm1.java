package methodoverridingrules;

import java.util.Scanner;

// method can return primitive data types,objects

class Dog{
	
}

class Demo{
	Scanner disp(){
		Scanner scan=new Scanner(System.in);
		return scan;
	}
	
	Dog displ() {
		Dog d=new Dog();
		return d;
	}
}

public class Day37pgm1 {

	public static void main(String[] args) {
          Demo d=new Demo();
          d.disp();
	}

}
