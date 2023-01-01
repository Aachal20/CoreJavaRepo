package in.demo.fundamentalClasses;


class Student111 {

	private int sno;
	private String sname;
	private String whichClass;

	//define constructor to intialize object with user given values
	public Student111(int sno, String sname, String whichClass) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.whichClass = whichClass;
	}

}
public class Test04 {

	public static void main(String[] args) {
		
		System.out.println("-------------------");
		Student111 s1 = new Student111(2,"Ram" , "12");
		Student111 s2 = new Student111(1,"Ram" ,"12");
		Student111 s3  = s2;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
	//	System.out.println(s1.hashCode()==s2.hashCode());
		
		
	}

}
