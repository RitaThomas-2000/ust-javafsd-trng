package Abstract.ust;

abstract class Language{
	public void display() {
		System.out.print("This is Java Programming");
	}
}

public class Lang extends Language {
	public static void main(String args[]) {
		Lang obj=new Lang();
		obj.display();
		
	}

}
