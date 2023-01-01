package in.demo.fundamentalClasses;
//Java Program to show Deep Cloning

//Importing java input/output libraries
import java.io.*;


public class GFG  implements Cloneable {

	// Defining a method as clone method is protected
	// Defining within the class called cloneable interface
	public Object clone() throws CloneNotSupportedException
	{
		return (GFG)super.clone();
	}


	public static void main(String[] args) throws CloneNotSupportedException
	{
		// Creating first object of GFG class
		GFG t1 = new GFG();

		// Using clone()  method to create duplicate object
		// of t1 reference variable
		// else for every object manually object needs
		// to be copied in deep copying
		// clone() ease this manual effort
		GFG t2 = (GFG)t1.clone();

		// Comparing two objects just after deep copying
		// Returning true for shallow(by default) copying
		// Returning false for deep copying
		System.out.println(t1 == t2);
	}
}

/*Output explanation:

Here, there are two reference variables t1, t2.
 When the object of GFG class is created, the t1 (reference variable) is pointing to one object.
Afterward, t1 is assigned as a reference variable and calls clone() method into a new reference variable t2 
of the same class. 
Both t1 and t2 reference variables are pointing to different objects. Here t2 has created a new duplicate object 
and t1 also.
The above two statements prove that both t1 and t2 reference variable are point 
difference object if t1 point to O1 object than t2 point to O2 object.
*/