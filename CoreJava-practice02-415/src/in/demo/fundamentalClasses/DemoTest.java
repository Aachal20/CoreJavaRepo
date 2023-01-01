package in.demo.fundamentalClasses;

public class DemoTest {

	public static void main(String[] args) {
		String s1 = "abc";
		Integer i = 10 ;
		Float f = 2.5f ;

		Object obj = new DemoA();
		
		DemoB  b  =  new DemoB();
		DemoC c = new DemoC();

		DemoA.m1(s1);
		DemoA.m1(i);
		//DemoA.m1(obj);
		//DemoA.m1(b);
		//DemoA.m1(c);
		//DemoA.m1(f);



	}

}
