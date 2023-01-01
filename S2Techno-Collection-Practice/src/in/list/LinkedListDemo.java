package in.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	
public static void main(String[] args) {
	List<Employee>  li = new LinkedList<>();
   
	Employee e1 = new Employee(1, "Enemy");
	Employee e2 = new Employee(2, "Tinku");
	Employee e3 = new Employee(3, "Sham");
	Employee e4 = new Employee(4, "Ramesh");
	Employee e5 = new Employee(5, "Johny");
	li.add(e1);
	li.add(e2);
	li.add(e3);
	li.add(e4);
	li.add(e5);

	System.out.println(li);
	
	ListIterator<Employee> listIterator = li.listIterator();
	while(listIterator.hasNext()) {
		System.out.println("Employee Object" +listIterator.next());
		listIterator.add(e5);
	
	}
   
	 Iterator<Employee> iterator = li.iterator();
	while(iterator.hasNext()) {
		System.out.println("Employee Object" +iterator.next());
		//iterator.add(e5);
	
	}
}
}
