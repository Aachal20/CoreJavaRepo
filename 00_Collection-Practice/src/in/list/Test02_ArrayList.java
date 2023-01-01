package in.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test02_ArrayList {

	public static void main(String[] args) {

		// -------------------------------------------------------------------------------------------------------
		List l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add(1);
		l.add(4,2);


		List l2 = new ArrayList<>();
		l2.add("raja");
		l2.add("rani");

		l.addAll(l2);
		l.set(0,"ramesh");
		int indexOf = l.lastIndexOf("c");
		System.out.println("---");
		System.out.println(indexOf);

		System.out.println(l);
		
		
		System.out.println("-----");
		System.out.println("2 index to 4 idex" + l.subList(2, 4));
			System.out.println(l);
			
			
		Iterator iterator = l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		 ListIterator listIterator = l.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}

		//get the element
		Object object = l.get(0);
		//System.out.println(object);

		//-----------------------------------------------------------------------------------------------------
		/*	List l1 = new ArrayList<>();

				Employee e1 = new Employee(101,"Raja");
				Employee e2 = new Employee(102,"Ravi");
				l1.add(e1);
				l1.add(e2);


				Iterator iterator = l1.iterator();
				while(iterator.hasNext())
				{
					Employee  next = (Employee) iterator.next();
					next.display();

				}*/

		/*//Creating an Arraylist  
		 ArrayList list=new ArrayList();
		  list.add("Mango");

		  //Adding element to the  arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  list.add("aaaaa");

			 list.add("Mango");//Adding object in arraylist    
			 list.add("Apple");    
			 list.add("Banana");    
			 list.add("Grapes");    
			 list.add("aaaaa");

		  //Display the Arryalist
		  System.out.println(list);

		  //size of Arryalist
		  System.out.println(list.size());

		  //remove the 4th index element of ArrayList
		  list.remove(4);
		  System.out.println(list);

		  //Remove Mango from arrylist
		  list.remove("Mango");
		  System.out.println(list);

		  //retrive the first element
		  Object object = list.get(0);
		  System.out.println(object);

		  //inserting at second index
		  list.add(2,"aaaafffff");
		  System.out.println(list);

		  Object clone = list.clone();
		  System.out.println("--------------");
		  System.out.println(clone);

		 // ((Object) list).copyOf(list);

		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  

		 */

	}
}

/*
import java.util.LinkedList;
import java.util.List;
public class JavaListSubListExample1 {
public static void main(String[] args) {
int fromIndex=2;
int toIndex=7;
        List<Integer> list= new LinkedList<>();
for (int i=1;i<=10;i++){
list.add(i);
        }
System.out.println("List : "+list);
//it will return the elements present from index 2 to elements at index 7
list.subList(fromIndex,toIndex);
System.out.println("Elements from 2 index position to 7 index position : "+list.subList(2,7));
    }
}
 */
