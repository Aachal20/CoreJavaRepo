package in.demo.oopex;

public class Circle implements Shape{

	private double radius;
	public static final float PI = 3.14f;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("Circle Area ::" +(PI*radius*radius));
	}
	
	public void prints() {
		System.out.println("Radius :" +radius);
	
	}
	@Override
	public void perimeter() {
		System.out.println("circle  perimeter ::" +(2*PI*radius));
		
	}

}
