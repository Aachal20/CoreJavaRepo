package in.demo.fundamentalClasses;

public class Test12_Student implements Cloneable{

	int sno =1;
	String sname = "StudentOne";
	String course = "course1";
	double fee = 1000;
	Address add = new Address();


	public static void main(String[] args) throws CloneNotSupportedException {
		Test12_Student  s1 = new Test12_Student();
		Test12_Student s2 = (Test12_Student) s1.clone();  //here s1.clone() does shallow cloning,So == operator returns true
		System.out.println(s1==s2);   //false
		System.out.println(s1.add==s2.add);  //true
	}


}
