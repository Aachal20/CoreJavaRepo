package in.map;
//LinkedHashMap store element in Insertion order
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test07_MapClasssesDemo {

	public static void main(String[] args) {
		LinkedHashMap<String ,Object>  lhs = new LinkedHashMap();
		HashMap<String ,Object>   hs = new HashMap();
		TreeMap<String ,Object>  tm = new TreeMap();

		System.out.println("LHM SIze " +lhs.size());
		System.out.println("LHM SIze " +hs.size());
		System.out.println("LHM SIze " +tm.size());

		hs.put("John", new Integer(10));
		hs.put("Smith",new Integer(20));
		hs.put("Tom",new Integer(30));
		hs.put("Raja",new String("aa"));
		System.out.println("HashMap Elements are ::: " +hs);

		System.out.println("++++++++++++++++++++++++");
		lhs.put("John", new Integer(10));
		lhs.put("Smith",new Integer(20));
		lhs.put("Tom",new Integer(30));
		lhs.put("Raja",new String("aa"));
		System.out.println("LHM Elements are ::: " +lhs);


		System.out.println("++++++++++++++++++++++++");
		tm.put("John", new Integer(10));
		tm.put("Smith",new Integer(20));
		tm.put("Tom",new Integer(30));
		tm.put("Raja",new String("aa"));
		System.out.println("TreeMap  Elements are ::: " +tm);

		System.out.println("LHM SIze " +lhs.size());
		System.out.println("LHM SIze " +hs.size());
		System.out.println("LHM SIze " +tm.size());


		Set<String> set = hs.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String key = i.next();
			Object object = hs.get(key);
			System.out.println(key+ "=>" +object);
		}
	}

}
