//program to retriving the element from vector object by using enumeration
package in.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test01_ArrayList {

	public static void main(String[] args) {
	ArrayList  v = new ArrayList();
	v.add(1);
	v.add(2);
	v.add(3);
	System.out.println(v);
	Enumeration e =Collections.enumeration(v);
	
	while(e.hasMoreElements()) {
		Object nextElement = e.nextElement();
		System.out.println(nextElement);
	}
	}


}
