//Program to retriving elements from ArrayList  object 
//bu using iterator


package in.cursor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test06_Assignement {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add("abc");
		al.add("bbc");
		al.add("kgf");
		
		System.out.println("AL Element before Iteration :: "+al);
		int count = 1;
		
		ListIterator iterator = al.listIterator();
		
		 while(iterator.hasNext()) {
			 Object obj = iterator.next();
			 if(obj instanceof String) {
			 String str = ((String) obj).toUpperCase();
			 iterator.set(str);
			 System.out.println("Modifet String Value :: " +str);
		 }
			 else if(obj instanceof Integer) {
				 if(count==1) {
					 iterator.add(20);
					 count++;
				 }
			 }//else if
			
		 }//while
			System.out.println("AL Element After  Iteration :: "+al); 
	}

}
