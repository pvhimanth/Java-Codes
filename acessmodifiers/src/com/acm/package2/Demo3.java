package com.acm.package2;

import com.acm.package1.Demo1;

public class Demo3 extends Demo1 {
	void disp() {
		System.out.println(a);// public members can access in another package
		System.out.println(b);// has to extends parent class to use access protected members
		//System.out.println(c); can't access default members in another package
		//System.out.println(d); can't access private members in another package
	}
}
