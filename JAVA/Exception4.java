package exceptions.ust;

public class Exception4 {
	
	public double calculate(int a, int b) throws Exception {
		
		//throw new Exception("abc");
		return (a+b);
	}
	void display(int x) throws Exception {
		if(x==5) throw new Exception();
		else
			System.out.println("n");
	}
	public static void main(String args[]) {
		Exception4 e=new Exception4();
		try {
			e.calculate(5, 6);
			e.display(5);
		}
		catch(Exception f) {
			f.printStackTrace();
		}
		
	}
}
