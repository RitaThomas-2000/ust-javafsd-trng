package exceptions.ust;

class SuperException{
	void display() {
		System.out.println("display test");
	}
}

public class Exceptions3 extends SuperException{
	public static void main(String args[]) {
		SuperException s=new SuperException();
		
		Exceptions3 e=new Exceptions3();
		SuperException s1=new Exceptions3();
		Exceptions3 e1=(Exceptions3) new SuperException();
	}
}
