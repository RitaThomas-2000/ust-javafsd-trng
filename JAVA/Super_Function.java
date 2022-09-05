package ppl.ust;

class Animal3{
	Animal3(){
		System.out.println("I am an animal");
	}
}
class Dog3 extends Animal3{
	Dog3(){
		//calling default constructor of class Dog
		super();
		
		System.out.println("I am a dog");
	}
}

public class Super_Function {
	public static void main(String args[]) {
		Dog3 dog1=new Dog3();
	}
}
