package com.ust;

public class Final1 extends Super1 {
	final int x=5;
	int y;
	
/**	void display() {
		System.out.println("In final");
	}**/
	
	public static void main(String args[]) {
		Final1 f=new Final1();
		//f.x=7;
		f.y=10;
		System.out.println(f.z);
	//	System.out.println(s.display());
		f.display();
	}

}


class Super1{
	final int z=10;
	final void display() {
		System.out.println("In display");
	}
	
	void display(int x) {
		System.out.println("*");
		
	}
}