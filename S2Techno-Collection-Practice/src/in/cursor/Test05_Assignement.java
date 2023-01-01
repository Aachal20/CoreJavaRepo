package in.cursor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Test05_Assignement {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		HashSet s = new HashSet();
		//add 3 Integer elemet
		al.add(1);
		al.add(2);
		al.add(3);
		//add three string element
		al.add("abc");
		al.add("bbc");
		al.add("mno");
		int count=1;
		System.out.println("AL element before Iteration ::" +al);

		ListIterator i = al.listIterator();
	

		while(i.hasNext()) {
			Object obj  = i.next();
			if(obj instanceof String) {
				String str = ((String) obj).toUpperCase();
				i.set(str);
				System.out.println("Modified String ::" +str);
			
			}
			else if(obj instanceof Integer) {
				if(count==1) {
					i.add(20);
					count++;
				}//else if
			
			}//while
		
			
	}
		System.out.println("AL Element AFter Iteration::" +al);
	}

}
