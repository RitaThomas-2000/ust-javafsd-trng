package package_thread.ust;
import java.lang.*;

public class Thread_Join implements Runnable {
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		System.out.println("Is Alive? "+t.isAlive());
	}

	public static void main(String[] args) throws Exception {
		Thread t=new Thread(new Thread_Join());
		t.start();
		t.join(1000);
		System.out.println("\nJoining after 1000"+" milliseconds:\n");
		System.out.println("Current thread: "+t.getName());
		System.out.println("Isalive? "+t.isAlive());
	}
}


