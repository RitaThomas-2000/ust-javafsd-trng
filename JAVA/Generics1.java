package hello.ust;

public class Generics1<T> {
	T t;
	
	public T get() {
		return t;
	}
	
	
	public void set(T t) {
		this.t=t;
		
	}
	public static void main(String args[]) {
		Generics1<String> g=new Generics1<>();
		g.set("Hi");
		System.out.println(g.get());
		
		Generics1<Integer> h=new Generics1<>();
		h.set(100);
		System.out.println(h.get());
		
	}
}
