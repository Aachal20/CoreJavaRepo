//Diff types of traverse techneques in collections
//for each loop
//Iterator
//ListIterator
//Enumeration

package in.traverse;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
	
		
		//for each loop
		for(Object obj : l) {
			System.out.println(obj);
		}
		
		//Iterator
		Iterator iterator = l.iterator();
      System.out.println("Iterator Technuque ");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		//ListIterator
		ListIterator  iterator1 = l.listIterator();
		iterator1.hasPrevious();
		System.out.println("ListIterator Technuque ");
		while(iterator1.hasNext()){
			System.out.println(iterator1.next());
		}
		
		//Enumeration- only in Vector
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		
		Enumeration elements = v.elements();
		System.out.println("Enumeration Technuque ");
		while(elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
	}

}
