package in.demo.fundamentalClasses;

public class Test10_CloneExample  extends Test07_CloneExample{

	int x =10;
	int y = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test10_CloneExample  e1 = new Test10_CloneExample();
		Test10_CloneExample  e2 = (Test10_CloneExample) e1.clone();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
