package in.demo.fundamentalClasses;
//Here toString method is   overidden in class A with object state
class A1{
	int x;
	public A1(int x) {
		this.x = x;
		
	}
	
	@Override
	public String toString() {
	
		return ""+x;
	}
}
public class Test06_toString {

	public static void main(String[] args) {
          A1 a1 = new A1(5);
          A1 a2 = new A1(6);
          
          System.out.println(a1);
          System.out.println(a2);

	}

}
