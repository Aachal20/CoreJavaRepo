package in.list;

import java.util.Stack;
import java.util.Vector;

public class Test03_STack{

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push("a");
		s.push("b");

		System.out.println(s);

		//retriving and removing a top item
		s.pop();
		System.out.println(s);

		//retriving and removing a top item
		s.pop();
		System.out.println(s);

		//only retriving top item
		s.peek();
		System.out.println(s);

		//searching for an item
		System.out.println(s.search("10")); //return -1
		//searching for an item
		System.out.println(s.search(10));     //return 1
		
		/*	//creating an instance of Stack class  
			Stack<Integer> stk= new Stack<>();  
			// checking stack is empty or not  
			boolean result = stk.empty();  
			System.out.println("Is the stack empty? " + result);  
			// pushing elements into stack  
			stk.push(78);  
			stk.push(113);  
			stk.push(90);  
			stk.push(120);  
			//prints elements of the stack  
			System.out.println("Elements in Stack: " + stk);  
			result = stk.empty();  
			System.out.println("Is the stack empty? " + result);  */

	}

}
