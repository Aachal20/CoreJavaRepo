//Program to retriving elements from ArrayList  object 
//by using Enumeration

package in.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test02_ArrayList {

	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add(1);
		v.add(2);
		 Enumeration e = Collections.enumeration(v);
     while(e.hasMoreElements()) {
			 Object element = e.nextElement();
			 System.out.println(element);
		 }
	}

}
