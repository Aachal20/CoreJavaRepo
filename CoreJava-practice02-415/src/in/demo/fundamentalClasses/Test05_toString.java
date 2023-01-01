package in.demo.fundamentalClasses;
//Here toString method is not overidden in class A
class A{
	int x;
	public A(int x) {
		this.x = x;
		
	}
}
public class Test05_toString {

	public static void main(String[] args) {
          A a1 = new A(5);
          A a2 = new A(6);
          
          System.out.println(a1);
          System.out.println(a2);

	}

}
