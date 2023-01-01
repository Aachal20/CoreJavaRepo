package in.demo.encapsulation;

public class College {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println("S1 object value ::");
		System.out.println("sno value :: "+s1.getSno());
		System.out.println("sname value ::" +s1.getSname());
		System.out.println("===========================================");
		
		s1.setSno(101);
		s1.setSname("Raja");
		
		System.out.println("S1 object value ::");
		System.out.println("sno value :: "+s1.getSno());
		System.out.println("sname value ::" +s1.getSname());
		
		Student s2 = new Student();
		s2.setSno(102);
		s2.setSname("Rani");
		
		System.out.println("===========================================");
		System.out.println("S2 object value ::");
		System.out.println("sno value :: "+s2.getSno());
		System.out.println("sname value ::" +s2.getSname());
		

	}

}
