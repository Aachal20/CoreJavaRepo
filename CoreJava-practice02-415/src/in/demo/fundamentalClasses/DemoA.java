package in.demo.fundamentalClasses;

public class DemoA {
	
  static void m1(Object obj) {
	
	  Class<? extends Object>  name = obj.getClass();
	  System.out.println(name);
			  //getName();
	  
	  System.out.println("The passed object is of type::" +name);
	  
  }
}
