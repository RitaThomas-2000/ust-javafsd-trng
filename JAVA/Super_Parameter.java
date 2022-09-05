package ppl.ust;

class Animal4 {
	Animal4(){
		System.out.println("I am animal");
	}
	Animal4(String type){
		System.out.println("Type:"+type);
	}
}
class Dog4 extends Animal4{
	Dog4(){
		//calling parameterized constructor of the superclass
		super("Animal");
		
		System.out.println("I am a dog");
		
	}
}

public class Super_Parameter {
	public static void main(String args[]) {
		Dog4 dog1=new Dog4();
	}
}
