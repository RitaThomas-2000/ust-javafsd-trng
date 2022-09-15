package enumeration.ust;

public class Method_Local {
	void display() {
		int x=5;
		
		class MethodInner{
			void display1() {
				System.out.println("In method class");
			}
		}
		MethodInner i=new MethodInner();
		i.display1();
	}//method ends
	public static void main(String[] args) {
		Method_Local m=new Method_Local();
		m.display();
		System.out.println("Calling outer class");
	}
}
