package in.list;

import java.util.Vector;

public class Test01_Vector{

	public static void main(String[] args) {
//creating the vector
		Vector v = new Vector ();
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		System.out.println();
//adding element to vector
		v.add(1);
		v.add(2);
		v.add("Raja");
		v.add("aaa");
			System.out.println(v.capacity());
			System.out.println(v.size());
			//displaying the vector
		System.out.println(v);
		System.out.println();
		
		v.add(2);
		v.add("Raja");
		v.add("aaa");
		
		v.add(2);
		v.add("Raja");
		v.add("aaa");
		v.add(null);
		
		
		v.add(2);
		v.add("Raja");
		v.add("aaa");
			System.out.println(v.capacity());
			System.out.println(v.size());
		System.out.println(v);
		System.out.println();
	System.out.println("==========");
	//retriving element from index 3rd 
	System.out.println(v.get(3));
	}

}
