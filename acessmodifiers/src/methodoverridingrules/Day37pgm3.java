package methodoverridingrules;

//changing return types of method during method overriding of objects
class Animal1{
	
}

class Tiger1 extends Animal1{
	
}

class Lion{
	
}

class Demo111{
	
	Animal1 disp() {
		System.out.println("Hi");
		Animal1 a=new Animal1();
		return a;
	}
}

class Demo222 extends Demo111{
	/* ERROR  as Lion not extends Animal during method overriding of changing return type
	 * 
	@Override
	Lion disp() {
		System.out.println("Hello");
		Lion l=new Lion();
		return l;
	}
	
	 */
}
public class Day37pgm3 {

	public static void main(String[] args) {
		Demo222 d=new Demo222();
		d.disp();
		}

}
