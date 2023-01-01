//program to retriving the element from vector object by using enumeration
package in.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Test01_Vector {

	public static void main(String[] args) {
	Vector  v = new Vector();
	v.add(1);
	v.add(2);
	v.add(3);
	System.out.println(v);
	Enumeration elements = v.elements();
	while(elements.hasMoreElements()) {
		Object nextElement = elements.nextElement();
		System.out.println(nextElement);
	}
	}

}
