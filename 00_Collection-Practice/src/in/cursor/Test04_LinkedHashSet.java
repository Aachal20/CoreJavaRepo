//Program to retriving elements from LinkedHashSet   object  by  using iterator


package in.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test04_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();	
		lhs.add(1);
		lhs.add(2);
		lhs.add("abc");
		lhs.add("bbc");
		
		Iterator iterator = lhs.iterator();
		 while(iterator.hasNext()) {
			 Object element = iterator.next();
			 System.out.println(element);
		 }
	}

}
