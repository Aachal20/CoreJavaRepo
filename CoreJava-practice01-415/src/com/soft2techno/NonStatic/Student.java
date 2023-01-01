package com.soft2techno.NonStatic;

public class Student {

	int sno ;
	String  sname;
	String addrs;

	//overriding toString() method to print object data
	

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno = 101;
		s1.sname="Raja";
		s1.addrs = "Mumbai";

		System.out.println(s1);

	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + "]";
	}

	

}
