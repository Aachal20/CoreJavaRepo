package in.demo.methodoverloding;

class Addition {
	void add(){}
	
	void add(int i){}
	void add(double d1){}
	void add(int i1,int i2){}
	void add(int i1,int i2,int i3){}
	void add(int i1 ,float f1){}
	void add(float f1 ,int i1){}
}

public class Test01 {
	public static void main(String[] args) {
		Addition a =new Addition();
		a.add();
		a.add(5);
		a.add(5.0);
		a.add(5,6);
		a.add(5,6,8);
		a.add(5,6.3f);
		a.add(5.3f,6);
	}
}




