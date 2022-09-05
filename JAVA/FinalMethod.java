package ppl.ust;

class FinalClass{
	public void display() {
		System.out.println("This is a final method.");
	}
}
//try to extend the final class

public class FinalMethod extends FinalClass{
	public void display() {
		System.out.println("The final method is overridden.");
	}
	
	public static void main(String args[]) {
		FinalMethod obj=new FinalMethod();
		obj.display();
	}

}
