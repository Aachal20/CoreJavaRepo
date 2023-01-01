package in.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Test04_LinkedList {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  al.add(11);
		  al.add(11.5f);
		  System.out.println(al);
		  
		  LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanumat");  
          
          al.addAll(ll2);
          System.out.println(al);
          al.remove(0);
          System.out.println(al);
         System.out.println( al.contains("Rassvi"));
         System.out.println(al.size());
         
         
         
         //Adding an element at the specific position  
         al.add(1, "Gaurav");  
         System.out.println("After invoking add(int index, E element) method: "+al);  
    //     LinkedList<String> ll2=new LinkedList<String>();  
         ll2.add("Sonoo");  
         ll2.add("Hanumat");  
         //Adding second list elements to the first list  
         al.addAll(ll2);  
         System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
         LinkedList<String> ll3=new LinkedList<String>();  
         ll3.add("John");  
         ll3.add("Rahul");  
         //Adding second list elements to the first list at specific position  
         al.addAll(1, ll3);  
         System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
         //Adding an element at the first position  
         al.addFirst("Lokesh");  
         System.out.println("After invoking addFirst(E e) method: "+al);  
         //Adding an element at the last position  
         al.addLast("Harsh");  
         System.out.println("After invoking addLast(E e) method: "+al);  
           
         Iterator iterator = al.iterator();
         while(iterator.hasNext()) {
        	 System.out.println("ALl Element in List::" +iterator.next());
         }
	}

}
