package in.demo.fundamentalClasses;

public class Test09_CloneExample implements Cloneable{

	int x =10;
	int y = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test09_CloneExample  e1 = new Test09_CloneExample();
		e1.x = 10;
		e1.y = 20;
		
		Test09_CloneExample  e2 = (Test09_CloneExample) e1.clone();
		
		System.out.println(e1==e2);
		System.out.println(e1.hashCode()==e2.hashCode());
	
		System.out.println(e1.x +"...... " +e1.y);
		System.out.println(e2.x+"...... "+e2.y);
		
	//	e2.x = 50;
		//e2.y= 60;
		
		//System.out.println();
		//System.out.println(e1.x +"...... " +e1.y);
		//System.out.println(e2.x+"...... "+e2.y);
		

	}

}
