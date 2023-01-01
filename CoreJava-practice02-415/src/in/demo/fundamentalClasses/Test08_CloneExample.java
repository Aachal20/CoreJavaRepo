package in.demo.fundamentalClasses;

public class Test08_CloneExample implements Cloneable{

	int x =10;
	int y = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test08_CloneExample  e1 = new Test08_CloneExample();
		Test08_CloneExample  e2 = (Test08_CloneExample) e1.clone();
		//Test08_CloneExample  e3 = e1;
		//System.out.println(e3==e1);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
