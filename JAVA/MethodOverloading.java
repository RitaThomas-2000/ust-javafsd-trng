package Interface.ust;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("Got Integer data");
	}
	private static void display(String a) {
		System.out.println("Got String data");
	}
	public static void main(String args[]) {
		display(1);
		display("Hello");
	}
}
