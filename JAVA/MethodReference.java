package lamdda;



interface Sayable1{
	void say1();
}

public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello,this is static method.");
	}
		public static void main(String args[]) {
			Sayable1 sayable=MethodReference::saySomething;
		
			sayable.say1();
		}
}
