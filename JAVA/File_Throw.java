package exceptions.ust;

public class File_Throw {
	static void fun() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside fun().");
		}
	}
	public static void main(String args[]) {
		try {
			fun();
		}
		catch(NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}
}
