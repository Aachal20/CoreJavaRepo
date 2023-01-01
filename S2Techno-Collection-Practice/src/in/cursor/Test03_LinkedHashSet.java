//program to retriving the element from vector object by using enumeration
package in.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test03_LinkedHashSet {

	public static void main(String[] args) {
	LinkedHashSet  v = new LinkedHashSet();
	v.add(1);
	v.add(2);
	v.add(3);
	System.out.println(v);
	
	Iterator iterator = v.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}

}
}
