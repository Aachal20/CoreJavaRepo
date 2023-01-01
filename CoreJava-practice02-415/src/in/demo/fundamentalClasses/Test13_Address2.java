package in.demo.fundamentalClasses;

public class Test13_Address2 implements Cloneable {

  int flatNo =1;
  String colony = "Gadage Nagar";
  String city = "Amravati";
  
@Override
	protected Address clone() throws CloneNotSupportedException {
	
		return (Address) super.clone();
	}
}
