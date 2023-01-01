//Program to retriving elements from ArrayList  object 
//bu using iterator


package in.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test03_ArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add("abc");
		al.add("bbc");
		
		Iterator iterator = al.iterator();
		 while(iterator.hasNext()) {
			 Object element = iterator.next();
			 System.out.println(element);
		 }
	}

}
