package methodoverridingrules;

//changing return types of method during method overriding of objects
class Animal{
	
}

class Tiger extends Animal{
	
}

class Demo11{
	
	Animal disp() {
		System.out.println("Hi");
		Animal a=new Animal();
		return a;
	}
}

class Demo22 extends Demo11{
	@Override
	Tiger disp() {
		System.out.println("Hello");
		Tiger t=new Tiger();
		return t;
	}
	
}
public class Day37pgm2 {

	public static void main(String[] args) {
		Demo22 d=new Demo22();
		d.disp();
		}

}
