package ppl.ust;

class Animal1{
	//overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog1 extends Animal1{
	//overriding method
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	
	public void printMessage() {
		display();
		
		super.display();
	}
}

public class With_Super {
	public static void main(String args[]) {
		Dog1 dog1=new Dog1();
		dog1.printMessage();
	}
}
