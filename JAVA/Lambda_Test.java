package lamdda;

public class Lambda_Test {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}
}
