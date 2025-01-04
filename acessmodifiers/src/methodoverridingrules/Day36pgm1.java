package methodoverridingrules;

//Can increase the visibility of members but can't decrease during method overriding
public class Day36pgm1 {
	
	protected void disp() {
		System.out.println("Hi");
	}
}

class A extends Day36pgm1{
	public void disp() {
		System.out.println("Hello");
	}
}
