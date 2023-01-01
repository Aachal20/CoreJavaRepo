package in.demo.oopex;

public class square implements Shape{

	private double s;
	
	public square(double s) {
	this.s=s;
	}
	public void area() {
		System.out.println("square Area ::" +(s*s));
	}
	
	public void prints() {
		System.out.println("square lenggth::" +s);
	
	}
	@Override
	public void perimeter() {
		System.out.println("square perimeter ::" +(4*s));
		
	}

}
