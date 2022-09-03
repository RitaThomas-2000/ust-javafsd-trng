package com.ust;
class A{}

class B extends A{}

public class Instance{
	public static void main(String args[]) {
		B objOfClassB=new B();
		
		System.out.println("objOfClasssB is an instance of Instance: "+(objOfClassB instanceof B));
		
		System.out.println("objOfClasssB is an instance ofthe parent class A: "+(objOfClassB instanceof A));
	}
}

