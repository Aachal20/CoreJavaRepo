package in.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
 
	public static void main(String[] args) {
		Vector v = new Vector();
	
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(null);
		v.add(null);
		v.add("Raja");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains(10));
		
		
		Vector v1 = new Vector();
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(null);
		
		v1.addAll(v);
		System.out.println(v1);
		Object clone = v1.clone();
		System.out.println(clone);
		
		v1.ensureCapacity(15);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
		Object[] array = v1.toArray();
		System.out.println(array.toString());
		
		
		 Iterator iterator = v.iterator();
		 while(iterator.hasNext()) {
			 System.out.println("Vector Element ::" +iterator.next());
		 }
	}
}
