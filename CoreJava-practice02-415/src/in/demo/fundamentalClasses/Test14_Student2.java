package in.demo.fundamentalClasses;

public class Test14_Student2  implements Cloneable {

	int sno =1;
	String sname = "StudentOne";
	String course = "course1";
	double fee = 1000;
	Address add = new Address();
	
	@Override
	protected Test14_Student2  clone() throws CloneNotSupportedException {
	
		Test14_Student2  stud =  (Test14_Student2) super.clone();
		//stud.add=this.add.clone();
		return stud;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Test14_Student2  s1 = new Test14_Student2();
		Test14_Student2 s2 = s1.clone();  //here s1.clone() does shallow cloning,So == operator returns true
		System.out.println(s1==s2);
		System.out.println(s1.add==s2.add); 
	}


}
