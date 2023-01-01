//Program to retriving elements from vector object  by using Enumeration
//by using Enumeration

package in.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Test01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		 Enumeration e = v.elements();
		 while(e.hasMoreElements()) {
			 Object element = e.nextElement();
			 System.out.println(element);
		 }
	}

}
