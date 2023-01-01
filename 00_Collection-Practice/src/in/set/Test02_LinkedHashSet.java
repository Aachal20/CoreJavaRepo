package in.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import in.list.Employee;

public class Test02_LinkedHashSet {
	public static void main(String args[]){  

		Set<Employee> set2 = new LinkedHashSet<Employee>();  

		Employee e1 = new Employee(101,"Raja");
		Employee e2 = new Employee(102,"Ravi");

		set2.add(e1);
		set2.add(e2);


		for(Employee se : set2) {
			// se.display();
			// se.toString();
			Employee obj = se;
			obj.display();
	}

		//--------------------------------------------------------------------------------------
		/*	 Set  set1 = new LinkedHashSet<>();  
					 set1.add("a");
					 set1.add("b");
					 set1.add("a");
					 set1.add(1);
					 set1.add(3);
					 set1.add(2);
		System.out.println(set1);
		
					 for(Object  se : set1) {
						 System.out.println(se);
					 }
		 */


		//----------------------------------------------------------------------------------
		/*	  LinkedHashSet<String> al=new LinkedHashSet<String>();  
				  al.add("Ravi");  
				  al.add("Vijay");  
				  al.add("Ravi");  
				  al.add("Ajay");  
				  System.out.println("size" +al.size());
				  Iterator<String> itr=al.iterator();  
				  while(itr.hasNext()){  
				   System.out.println(itr.next());  
				  }  */

		//----------------------------------------------------------------------------------

	}
}  