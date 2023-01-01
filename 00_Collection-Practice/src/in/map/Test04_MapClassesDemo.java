package in.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test04_MapClassesDemo {

	public static void main(String[] args) {
		 HashMap hm = new HashMap<>();
		 LinkedHashMap lhm = new  LinkedHashMap();
		 TreeMap tm = new TreeMap();
		 
		 hm.put("John", new Integer(10));
		 hm.put("Smith", new Integer(20));
		 hm.put("Tom", new Integer(30));
		 hm.put("Aachal", new Integer(40));
		 hm.put("zone", new Integer(10));
		 
		 
		 lhm.put("John", new Integer(10));
		lhm.put("Smith", new Integer(20));
		 lhm.put("Tom", new Integer(30));
		 lhm.put("Aachal", new Integer(40));
		 lhm.put("zone", new Integer(10));
		 
		 
		 tm.put("Abc", new Integer(10));
		 tm.put("Bcc", new Integer(20));
		 tm.put("Koc", new Integer(30));
		 tm.put("Aac", new Integer(30));
		
		
		 System.out.println("HashMap Element :: " +hm);
		 System.out.println("LinkedMap Element :: " +lhm);
		 System.out.println("treeMap Element :: " +tm);
	}

}
