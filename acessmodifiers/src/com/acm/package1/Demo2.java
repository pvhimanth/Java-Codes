package com.acm.package1;

public class Demo2 extends Demo1{
	void disp() {
		System.out.println(a); //public members can access in another class
		System.out.println(b); //protected members can access in another class
		System.out.println(c); //default members can access in another class
		//System.out.println(d); error as private members can't access in another class
	}
}
