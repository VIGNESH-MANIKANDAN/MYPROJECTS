package com.cvmanik.overriding;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A object=new A();
		object.display(10, 20);
		//BASE CLASS OBJECT POINTING TO DERIVED CLASS//
		B object1=new B();
		object1.display(10, 20);
		//EVEN BOTH THE BASE CLASS AND DERIVED HAS SAME OBJECT ALWAYS DERIVED IS CALLED IN PREFERENCE//
	}

}
