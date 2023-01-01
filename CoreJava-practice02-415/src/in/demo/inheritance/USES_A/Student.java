package in.demo.inheritance.USES_A;

public class Student {
	int sno;
	String sname;
	String course;
	
	void goingToColleger(Bike b) {
		System.out.println(this.sname+ " going to college by "+b.bikeNAme );
	}
}
