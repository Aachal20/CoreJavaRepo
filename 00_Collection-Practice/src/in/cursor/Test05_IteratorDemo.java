//Program  shows adding element in  LinkedHashSet   and retriving and printing all String objects 
//in uppercase and remaining object as it is.

package in.cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test05_IteratorDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();	
		lhs.add("abc");
		lhs.add("bbc");
		lhs.add(10);
		lhs.add(20);

		Iterator iterator = lhs.iterator();
		while(iterator.hasNext()) {
			String obj  = (String) iterator.next();
			String upperCase = obj.toUpperCase();
			System.out.println(upperCase);
		}

	}//while
	/*	
			while(iterator.hasNext()) {

				Object obj  = iterator.next();

				if(obj instanceof String) {
					String str = ((String) obj).toUpperCase();
					System.out.println("Modified String :: " +str);
				}
				
				else {
					System.out.println(obj);
				}
				
			}//while
	 */	}

