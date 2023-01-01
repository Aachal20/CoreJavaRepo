package in.array;

public class ArryaDemo {

	public static void main(String[] args) {
		
		Example[]  e = new Example[3];
	    e[0] = new Example(101,"raja"); 
	     e[1] = new Example(102,"ramesh");
	     
	 Example example = e[0];
	 System.out.println(example);
	 
	 Example example1 = e[1];
	 System.out.println(example1);
	 
	}

}
