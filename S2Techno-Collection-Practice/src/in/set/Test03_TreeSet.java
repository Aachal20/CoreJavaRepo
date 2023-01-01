package in.set;

import java.util.TreeSet;

public class Test03_TreeSet {
public static void main(String[] args) {
	
	TreeSet ts = new TreeSet();
	/*ts.add(1);
	ts.add(2);
	ts.add(5);
	ts.add(3);*/
	
	ts.add("A");
	ts.add("Z");
	ts.add("B");
	ts.add("A");
	//ts.add(null);
	
	ts.add("Ravi");
	ts.add("zena");
	ts.add("Balaya");
	ts.add("Aarush");
	ts.add("zana");
	System.out.println(ts);
}
}
