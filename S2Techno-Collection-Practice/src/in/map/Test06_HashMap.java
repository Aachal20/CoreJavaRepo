package in.map;
//Map store element without following an Insertion order
import java.util.HashMap;

public class Test06_HashMap {

	public static void main(String[] args) {
		HashMap  hs = new HashMap();
		hs.put("John", new Integer(10));
		hs.put("Smith",new Integer(20));
		hs.put("Tom",new Integer(30));
		hs.put("Raja",new String("aa"));
		System.out.println("HashMap Elements are ::: " +hs);
		

	}

}
