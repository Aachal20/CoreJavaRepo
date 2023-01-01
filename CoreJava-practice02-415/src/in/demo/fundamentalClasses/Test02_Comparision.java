package in.demo.fundamentalClasses;


class Address {

}


class Student {

	private int sno;
	private String sname;
	private String whichClass;

	//define constructor to intialize object with user given values
	public Student(int sno, String sname, String whichClass) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.whichClass = whichClass;
	}


}

public class Test02_Comparision {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Ram" , " 11 class");
		Student s2 = new Student(2,"Debas" , "11 class");
		Student s3 = new Student(1,"Ram" , "11 class");
		Student s4 = s2;

		System.out.println(s1==s2);              //diff references 
		System.out.println(s1.equals(s2));  //diff state & diff refereneced
		System.out.println("------------------------------");


			System.out.println(s1==s3);              //diff references 
			System.out.println(s1.equals(s3));  //same state but object are different
			System.out.println("------------------------------");
		
		
		
		
				System.out.println(s2==s4);       //true
				System.out.println(s2.equals(s4));   //both reference variable has same object referenece
		

		/*Address addrs = new Address();
		// System.out.println(s1==addrs);        //CE : Incomp Types : Address and Student
		System.out.println(s1.equals(addrs));
		*/

	/*	//comparing two null
		System.out.println(null==null);
		// System.out.println(null.equals(null));      //CE " nulltype

		Address ad1 = null;
		Address ad2 = null;

		System.out.println(ad1==ad2);
		System.out.println(ad1.equals(ad2));   //NPE


		//comparing object ref and null value
		Address a3 = new Address();
		System.out.println(a3==ad2); 
		System.out.println(a3.equals(ad2));   
	}
*/
	}
}
