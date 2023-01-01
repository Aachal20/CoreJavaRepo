package com.soft2techno.demo;

public class Institute {
	
public static void main(String[] args) {
	System.out.println("create two student object::");
	Student s1 =  new Student();
	s1.name = " Raja";
	s1.course="Java";
	s1.fees = 5000;

	
	System.out.println("create two student object::");
	Student s2 =  new Student();
	s2.name = " Rani";
	s2.course="Java";
	s2.fees = 5000;
	
	
	System.out.println("name ::"  +s1.name);
	System.out.println("fee ::"  +s1.fees);
	System.out.println("couse::"  +s1.course);
  
	System.out.println("==================");
	
	System.out.println("Student first object value ::");
	System.out.println("name ::"  +s2.name);
	System.out.println("fee ::"  +s2.fees);
	System.out.println("couse::"  +s2.course);
}

}
