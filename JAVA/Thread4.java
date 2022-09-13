package package_thread.ust;

public class Thread4 implements Runnable {
	public static void main(String[] args) {
		Thread Thread4=new Thread("Guru");
		Thread Thread5=new Thread("Guru2");
		Thread4.start();
		Thread5.start();
		System.out.println("Thread names are following:");
		System.out.println(Thread4.getName());
		System.out.println(Thread5.getName());
	}
	public void run() {
		
	}

}
