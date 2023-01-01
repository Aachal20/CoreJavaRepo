package in.arr;

public class Company {

	public static void main(String[] args) {
	
		Employee[] e =new Employee[2];
		e[0]=new Employee(101,"Raja");
		e[1]=new Employee(102,"Ramesh");
		
	//	System.out.println(e[0]);
		Employee employee1 = e[0];
		System.out.println(employee1.toString());
		
		Employee employee2= e[1];
		System.out.println(employee2.toString());
		

	}

}
