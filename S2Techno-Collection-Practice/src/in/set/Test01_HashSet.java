package in.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01_HashSet {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add("a");
		set.add(null);
		//set.add(null);
		//set.add(new Employee(101,"Raja"));
		
		
		Employee e1 = new Employee(101,"Raja");
		Employee e2 = new Employee(102,"Rajesh");
		Employee e3 = new Employee(103,"Kiran"); //1010
		Employee e4 = e3;   //1010
		Employee e5 = new Employee(103,"Kiran");
		
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		System.out.println(e3.hashCode()==e5.hashCode());
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println(set);
		
	for(Object e :set) {
		 System.out.println(e);
	}
		
		
		
		
		
		
		
		
		
		
		
		/*	set.add(1);
			set.add(2);
			set.add(3);
		
			System.out.println(set);
			
			set.add(3);
			set.add(null);
			set.add(new String("a"));
			set.add(new String("a"));
			set.add(new String("A"));
			set.add(new String("B"));
			set.add("Raja");
			set.add("Raja");
			set.add(new Employee(101,"raja"));
			set.add(new Employee(101,"raja"));
			System.out.println(set);
			// System.out.println(set);
		*/



		/*
				set.add("Ram");
				set.add("Balay");
				set.add("Allen");
				set.add("Zina");

				System.out.println(set);

				Iterator iterator = set.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}*/

		System.out.println("++++++++++++++++++++++++++++++++++++++");
		/*	Employee e1 = new Employee(101,"Ram");
			Employee e2 = new Employee(102,"Sita");
			Employee e3 = new Employee(103,"Rajesh");
			Employee e4 = new Employee(104,"Raja");
			Employee e5 = new Employee(104,"Raja");
			//Employee e5 = e2;
		
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			set.add(e5);*/


		/*Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			Employee emp = (Employee) obj;   //type casting
			emp.display();
		}*/

	}

}
