package in.set;
//Not maintaine theninsertion order
//not allow duplicates
import java.util.HashSet;
import java.util.Iterator;

import in.list.Employee;

public class Test01_HashSet {

	public static void main(String[] args) {

		HashSet set=new HashSet();  
		set.add(1);
		set.add(2);
		set.add(null);
		set.add(null);
		set.add(new String("a"));
		set.add(new String("a"));
		set.add(new String("A"));
		
		Iterator iterator1 = set.iterator();

		while(iterator1.hasNext())
		{
			Object  next =  iterator1.next();
			System.out.println(next);
		}

		//------------------------------------------------------------------------------------------
		/*		HashSet<Employee> s=new HashSet<Employee>();  
				Employee e1 = new Employee(101,"Raja");
				Employee e2 = new Employee(102,"Ravi");
				s.add(e1);
				s.add(e2);


				Iterator iterator = s.iterator();
				while(iterator.hasNext())
				{
					Employee  next = (Employee) iterator.next();
					next.display();

				}*/
		//-------------------------------------------------------------------------------




		/*//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet();  
		//adding element
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five");  
		set.add(null);

		//displaying the HashSet
		System.out.println(set);
		System.out.println("==============================");
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		} 
		
		
		//removing the element
		System.out.println("Elemet removed or not ??" +set.remove("One"));
		System.out.println("After removing an element from set::" +set);


		HashSet<String> set1=new HashSet();  
		set1.add("Six");  
		set1.add("Seven");
		set1.addAll(set);

		//display the Updated  HashSet
		System.out.println("Updated HasSet :: "  +set1);
		set.remove(set1);
		System.out.println("Updated HasSet :: "  +set);


		//Removing elements on the basis of specified condition  
		set.removeIf(str->set.contains("Two"));    
		System.out.println("After removeIf() method: "+set);  
		//Removing all the elements available in the set  
		//  set.clear();  
		//    System.out.println("After invoking clear() method: "+set);  


		System.out.println("size" +set.size());
		 */

	}
}
