package in.map;
//LinkedHashMap store element in Insertion order
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test07_LHMap {

	public static void main(String[] args) {
		LinkedHashMap<String ,Object>  hs = new LinkedHashMap();
		hs.put("John", new Integer(10));
		hs.put("Smith",new Integer(20));
		hs.put("Tom",new Integer(30));
		hs.put("Raja",new String("aa"));
		System.out.println("HashMap Elements are ::: " +hs);
		

	}

}
