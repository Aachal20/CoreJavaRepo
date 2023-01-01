package in.demo.fundamentalClasses;

class Example1{
	
}

class Student1 {

	private int sno;
	private String sname;
	private String whichClass;

	//define constructor to intialize object with user given values
	public Student1(int sno, String sname, String whichClass) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.whichClass = whichClass;
	}

}
public class Test03_HashCodeDemo {

	public static void main(String[] args) {
		Example1 e1 = new Example1();
		Example1 e2 = new Example1();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("---------------");
		
		
		//checking contract between equals and hashcode() method 
		//If equals method return true .hashcode of both objects must be same
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		Example1 e3 = e2;
		System.out.println(e3.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("---------------");
		
		System.out.println(e3==e2);
		System.out.println(e3.equals(e2));
		System.out.println(e3.hashCode()==e2.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		// equals() method in Student class compare the state of object
		
		System.out.println("-------------------");
		Student1 s1 = new Student1(1,"Ram" , "11");
		Student1 s2 = new Student1(1,"Ram" ,"12");
		Student1 s3 = s2;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("------------------");
		System.out.println(s3.equals(s2));          //true
		System.out.println(s3.hashCode()==s2.hashCode());
		
		
		System.out.println(s1.equals(s2));          //false
		System.out.println(s1.hashCode()==s1.hashCode());
		
		
		
		
	}

}
