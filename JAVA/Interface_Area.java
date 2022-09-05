package Abstract.ust;

interface Polygon{
	 void getArea(int length,int breadth);
}
class Rectangle implements Polygon{
	public void getArea(int length,int breadth) {
		System.out.println("The area of the rectangle is "+(length*breadth));
	}
}

public class Interface_Area {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		r1.getArea(5, 6);
	}
}
