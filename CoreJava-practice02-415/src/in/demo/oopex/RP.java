package in.demo.oopex;

public class RP {

	public static void main(String[] args) {
		// normal object creation
		Rectangle r = new Rectangle(10, 20);
		r.area();
		r.perimeter();
		r.printlb();
		
		square s = new square(10);
		s.area();
		s.perimeter();
		s.prints();
		
		Circle c = new Circle(20);
		c.area();
		c.perimeter();
		c.prints();
		

	}

}
