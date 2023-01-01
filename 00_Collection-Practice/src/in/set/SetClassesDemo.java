package in.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassesDemo {

	public static void main(String[] args) {

		HashSet hs=new HashSet();  
		LinkedHashSet lhs=new LinkedHashSet();  
		TreeSet  ts=new TreeSet();  


			//printing intial size of coll obj
			System.out.println("Hs length " +hs.size());
			System.out.println("LinkedHashSet length " +lhs.size());
			System.out.println("TreeSet length " +ts.size());
		
			//adding ele to hs
			hs.add(new Employee(101,"raja"));
			hs.add(new Employee());
			hs.add("abc");
			hs.add("abc");
			hs.add("Abc");
			hs.add(1);
			hs.add(2);
			//add null to hs
		
			hs.add(null);
			hs.add(null);
			System.out.println("=====================");
			//printing hs modified size and elements
			System.out.println("Hs length " +hs.size());
			System.out.println("hs:: "+hs);
		
			System.out.println("=======================================================");
		
		

		//adding ele to lhs
		lhs.add(new Employee(101,"raja"));
		lhs.add(new Employee());
		lhs.add("abc");
		lhs.add("abc");
		lhs.add("Abc");
		lhs.add(1);
		lhs.add(3);
		lhs.add(2);

		//add null to lhs
		lhs.add(null);
		lhs.add(null);
		System.out.println("=====================");

		//printing hs modified size and elements
		System.out.println("lHs length " +lhs.size());
		System.out.println("lhs:: "+lhs);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


		//adding homogenous element to ts
		/*	System.out.println("is abc added :: " +ts.add("abc"));
			System.out.println("is xyz added :: " +ts.add("xyz"));
			System.out.println("is bbc added :: " +ts.add("bbc"));
			System.out.println("is pqr added :: " +ts.add(new String("pqr")));
		*/

			System.out.println("is pqr added :: " +ts.add(10));
				System.out.println("is pqr added :: " +ts.add(20));
				System.out.println("is pqr added :: " +ts.add(30));
				System.out.println("is pqr added :: " +ts.add(40));
			//adding heterogenous element
			System.out.println("is Integer  added :: " +ts.add(new Integer(10)));
		 
		//adding null to ts
		System.out.println("is abc added :: " +ts.add(null));
		//System.out.println("is abc added :: " +ts.add(null));

		//printing hs modified size and elements
		System.out.println("ts length " +ts.size());
		System.out.println("ts:: "+ts);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	
}
