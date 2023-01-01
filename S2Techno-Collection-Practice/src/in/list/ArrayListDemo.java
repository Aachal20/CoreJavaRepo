package in.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//creating an arryList
		List  list1 = new ArrayList();
		//adding element to arrylist
		list1.add("raja");
		list1.add("ramesh");
		list1.add("Nitesh");
		list1.add("john");
		list1.add(null);
		list1.add(null);
		list1.add(1);
		list1.add(2.5f);
		list1.add('a');
		list1.add(true);
		
		System.out.println(list1);
		System.out.println("**********************");
		
		
		Employee e1 = new Employee(101, "Raja");
		Employee e2 = new Employee(102, "Ramesh");
		Employee e3 = new Employee(103, "Radha");
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		System.out.println(list1);
		
		
		
		
		/*
				System.out.println(list1);
				System.out.println(list1.isEmpty());
		
				System.out.println("++++++++++++++++++++++++");
				List list2 = new ArrayList();
				list2.add(1);
				list2.add(2);
				list2.add(3);
				System.out.println(list2);
				list2.set(0,10);
				System.out.println(list2);
				System.out.println(list2.indexOf(3));
		
				ListIterator listIterator = list2.listIterator();
				while(listIterator.hasNext()) {
					System.out.println("Iterator Element " +listIterator.next());
				}
		
				System.out.println("++++++++++++++++++++++++");
		
		
		
				list1.addAll(list2);
				System.out.println(list1);
		
				Object object = list1.get(3);
				System.out.println(object);
		
				//	boolean remove = (boolean) list1.remove(5);
				System.out.println(list1);
		
				list2.clear();
				System.out.println(list2);
				System.out.println("------------------------------");
		
				Iterator iterator = list1.iterator();
				while(iterator.hasNext()) {
					System.out.println("Iterator Element " +iterator.next());
				}
		
		
		
		
				Object[] array = list1.toArray();
		
				for(int i=0 ;i<array.length;i++){  
					System.out.println( array[i]);  
				}  
				*/
		
	}

}
