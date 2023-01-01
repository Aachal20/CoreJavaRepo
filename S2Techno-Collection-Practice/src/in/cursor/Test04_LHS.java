package in.cursor;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test04_LHS {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		//two string element
		lhs.add("abc");
		lhs.add("bbc");
		//two Integer element added
		lhs.add(1);
		lhs.add(2);

		System.out.println(lhs);
		
		Iterator iterator = lhs.iterator();
		 
		while(iterator.hasNext()) {
			
			Object next = iterator.next();
			 if(next instanceof String) {
				  String  obj = (String) next;
				  String upperCase = obj.toUpperCase();
				 System.out.println("Modified String::" +upperCase);
				 
			 }
			 else {
				 System.out.println(next);
			 }
		}
	}

}
