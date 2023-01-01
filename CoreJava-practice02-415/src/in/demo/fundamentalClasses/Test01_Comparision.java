package in.demo.fundamentalClasses;


class Test{

}

class Example{
	int x =10;
	int y =20;

}

public class Test01_Comparision {

	public static void main(String[] args) {
		//comparing primitive value using'==' operator
		//Primitive Variable
		int x = 10;
		int y = 20;
		int z = 10;

		//System.out.println(x==y);
		//System.out.println(x==z);

		//Rule ::  we can not use '==' operator to compare incompatible values
		boolean bo = true;
		//System.out.println(x==bo); //CE :Incompatible Type :int and Boolean

		//--------------------------------------------------------------------------------------------


		//comparing  object reference (not a object state) using'==' operator 
		//it return true if both variable store same object reference ,else return false

		//Non-Primitive Variable / Reference variable
		Example e1 = new Example();
		Example e2= new Example();
		Example e3 = e2;

		//System.out.println(e1==e2);       //false
		//System.out.println(e3==e2);       //true

		//Rule ::  we can not use '==' operator to compare incompatible referenced type
		//Test  t1 = new Test();
		//System.out.println(e1==t1);       ////CE :Incompatible Type


		//-----------------------------------equals()-------------------------------------------
		System.out.println("----------------------------------equlas() method--------------------------");
		/*In Object class we have equals method to compare two objects
		It also compare two object with their reference like == operator
		Inside the method logic they used == operator

		  public boolean equals(Object obj) {
		        return (this == obj);
		    }


		 */


		//--
		//Test  t2 = new Test();
		//System.out.println(e1.equals(e2));
		//System.out.println(e2.equals(e3));
		//System.out.println(e1.equals(t2));      //No compile time error & no RE



		/*Note : equals method return false for incompatible types comparision
				It does not throw CE, because compiler check only equals() method 
				can be  invoked on e1 object by passing t1 object as a argument ,
				since it is possible , so no CE
				JVM return false beacause only check the value(ref) not type */





		//--
		//----------------------------------==  operator-------------------------------------
		System.out.println("-------------------------'=='  operator--------------------------------------");
		/*
		//comparing two nulls using == operator

		//comparing null with other null return true
		System.out.println(null==null);

		//comparing null with  null reference variable  return true
		Example e4 = null;
		System.out.println(e4==null);
		 */ 
		//comparing null with  object reference variable  return false
		Example e5 = new Example();
		//System.out.println(e5.hashCode());
		//System.out.println(e5==null);   




		//--
		//----------------------------------------------equals()----------------------------
		System.out.println("----------------------------------equals()--------------------------");
		//we cannot invokes the method using null leads to CTE
		//	System.out.println(null.equals(null));

		//we can not invoked the method with null reference variable leads to exception
		//Example e6 = null;
		//System.out.println(e6.equals(null));        //canon be deferenced  RE -->NPE


		//Example e7 = new Example();
		//System.out.println(e7.equals(null));               //No CE & NO RE      return false only


	}

}
