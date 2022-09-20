package lamdda;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
	
}

public class InterfaceExample {
	public static void main(String args[]) {
		MyInterface ref;
		ref=()->3.1415;
		System.out.println("value of Pi="+ref.getPiValue());
	}
}
