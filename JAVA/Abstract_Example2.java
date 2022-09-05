package Abstract.ust;

abstract class Animal{
	
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("Bark bark");
	
	}
}
public class Abstract_Example2 {
	public static void main(String args[]) {
		Dog d1=new Dog();
		d1.makeSound();
		d1.eat();
	}
}
