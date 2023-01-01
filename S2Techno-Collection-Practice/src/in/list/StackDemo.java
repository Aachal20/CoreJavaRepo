package in.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(1);
		s1.push(2);
		s1.push("Raja");
		s1.push(22);
		s1.push(66);
		
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		s1.peek();
		System.out.println(s1);
		

	}

}
