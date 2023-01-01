package in.demo.fundamentalClasses;

public class Test07_CloneExample {

	int x =10;
	int y = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		Test07_CloneExample  e1 = new Test07_CloneExample();
		Test07_CloneExample  e2 = (Test07_CloneExample) e1.clone();
		Test07_CloneExample  e3 = e1;
		System.out.println(e3==e1);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
