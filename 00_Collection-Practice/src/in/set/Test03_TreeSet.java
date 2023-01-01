package in.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test03_TreeSet {

	public static void main(String[] args) {
		 //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add("zad");
		  al.add("bbb");
		  al.add("zae");
		  System.out.println("size" +al.size());
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  System.out.println("===================");
		  TreeSet<String> set=new TreeSet<String>();  
	         set.add("A");  
	         set.add("B");  
	         set.add("C");  
	         set.add("D");  
	         set.add("E");  
	         System.out.println("Initial Set: "+set);  
	           
	         System.out.println("Reverse Set: "+set.descendingSet());  
	           
	         System.out.println("Head Set: "+set.headSet("C", true));  
	          
	         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
	           
	         
	 }  
	}  
