package hello.ust;

class GenericsClass1<T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics class.");
	}
}

public class Generics5 {
	public static void main(String args[]) {
		GenericsClass1<Integer>obj=new GenericsClass1<>();
		obj.display();
	}
}
