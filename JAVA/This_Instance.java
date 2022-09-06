package Interface.ust;


class This_Instance {
	int a;
	int b;
	This_Instance(){
		a=10;
		b=20;
	}
	This_Instance get(){
		return this;
	}
	void display() {
		System.out.println("a= "+a+" b= "+b);
	}
	public static void main(String args[]) {
		This_Instance obj=new This_Instance();
		obj.get().display();
	}
}
