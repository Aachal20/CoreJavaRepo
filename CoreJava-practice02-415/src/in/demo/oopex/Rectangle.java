package in.demo.oopex;

public class Rectangle implements Shape{

	private double l;
	private double b;
	
	public Rectangle(double l, double b) {
	this.l=l;
	this.b=b;
	}
	
	public void area() {
		System.out.println("Rectangle Area ::" +l*b);
	}
	
	public void printlb() {
		System.out.println("Rectangle lenggth::" +l);
		System.out.println("Rectangl breadth ::" +b);
	}
	@Override
	public void perimeter() {
		System.out.println("Rectangle perimeter ::" +(2*(l+b)));
		
	}

}
