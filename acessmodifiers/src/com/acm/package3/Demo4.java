package com.acm.package3;

import com.acm.package1.Demo1;
public class Demo4 {

	void disp() {
		
		Demo1 d1=new Demo1();
		System.out.println(d1.a); /* has to create object and with reference has to access public members,
								     can't access directly
	                              */
		
		//System.out.println(b); can't access protected members in another package without extending parent class
		//System.out.println(c); can't access default members in another package
		//System.out.println(d); can't access private members in another package
	}
}
