package com.cvmanik.Runtimepolymorhism;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A object=new A();
		object.display(10, 20);
		//BASE CLASS OBJECT POINTING TO DERIVED CLASS//
		A object1=new B();
		object1.display(10, 20);
	}

}
