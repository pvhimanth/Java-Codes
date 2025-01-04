package assignment2_inheritance;

class Device1 {
	String brand;
	String model;

	void powerOn() {
		System.out.println("On the device");
	}

	void powerOff() {
		System.out.println("Off the device");
	}

}

class Phone1 extends Device1 {
	void browseInternet() {
		System.out.println("Browsing the internet");
	}
}

class Laptop1 extends Device1 {
	void browseInternet() {
		System.out.println("Browsing the internet");
	}
}


class Mobile1 extends Device1 {
	void browseInternet() {
		System.out.println("Browsing the internet");
	}
}

public class Asg2pgm6 {
	public static void main(String[] args) {
		Phone1 p = new Phone1();
		Laptop1 l = new Laptop1();
		Mobile1 m = new Mobile1();

		p.powerOn();
		p.browseInternet();
		p.powerOff();

		l.powerOn();
		l.browseInternet();
		l.powerOff();

		m.powerOn();
		m.browseInternet();
		m.powerOff();
	}
}
