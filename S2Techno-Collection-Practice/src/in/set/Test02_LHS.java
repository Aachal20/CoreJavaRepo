package in.set;

import java.util.LinkedHashSet;

public class Test02_LHS {
public static void main(String[] args) {
	LinkedHashSet  lhs = new LinkedHashSet<>();
	lhs.add(1);
	lhs.add(3);
	lhs.add(2);
	lhs.add("AA");
	lhs.add("BC");
	lhs.add("BB");
	lhs.add("Ram");
	lhs.add("gg");
	
	System.out.println(lhs);
	System.out.println(lhs.contains("AA"));
	System.out.println(lhs.remove("AA"));
	
	System.out.println(lhs);
}
}
