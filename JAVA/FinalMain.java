package ppl.ust;

class Final{
	//create a final method
	public final void display() {
		System.out.println("This is a final method.");
	}
}



class FinalMain extends Final {
	//try to override final method
	public final void display() {
		System.out.println("The final method is overridden.");
	}
	
	public static void main(String args[]) {
		FinalMain obj=new FinalMain();
		obj.display();
	}

}
