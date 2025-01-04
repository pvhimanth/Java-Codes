package oops_polymorphism;

//Giving parent reference to child object
class Planes {
	void fly() {
		System.out.println("Planes fly");
	}
}

class CargoPlanes extends Planes {
	@Override
	void fly() {
		System.out.println("Cargo Planes files at lower heights");
	}
	
	void carryCargo() {
		System.out.println("Cargo planes carries goods");
	}
}
public class Day41pgm1 {
public static void main(String[] args) {
	
	/*
	 * one way to create parent reference to child object
	CargoPlanes cp = new CargoPlanes();
	Planes ref; // parent reference
	ref=cp;
	ref.fly();
	*/
	
	//Another way to create parent reference to child object
	
	Planes cp=new CargoPlanes(); //upcasting - parent reference to child object
	cp.fly();
	
	((CargoPlanes)(cp)).carryCargo(); //accessing specialized methods through down casting
	
}
}
