package Interface.ust;

class This_Constructor{
	int a;
	int b;
	This_Constructor(){
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	This_Constructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
		
	}


public static void main(String args[]) {
	This_Constructor object=new This_Constructor();
}

}
