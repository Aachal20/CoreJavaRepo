package in.demo.methodoverriding;
//method overriding

class Vehicle{  
	//defining a method  
	void run(){
		System.out.println("Vehicle is running");
		}  
}  

public class Bike extends Vehicle{  
	//defining the same method as in the parent class  
	void run(){
		System.out.println("Bike is running ");
	}  

	public static void main(String args[]){  
		Bike obj = new Bike();
		obj.run();
	}  
}  


 class Car extends Vehicle{  
	//defining the same method as in the parent class  
	void run(){
		System.out.println("car is running ");
	}  

	public static void main(String args[]){  
		Bike obj = new Bike();
		obj.run();
	}  
}  