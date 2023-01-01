package in.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test01_HashMap {
	public static void main(String[] args) {

		HashMap hm = new HashMap<>();

		hm.put("John", new Integer(10));
		hm.put("Smith", new Integer(20));
		hm.put("Tom", new Integer(30));
		hm.put("Rani", new Integer(40));
		hm.put("zone", new Integer(10));

		System.out.println("HashMap Element :: " +hm);
	}
}