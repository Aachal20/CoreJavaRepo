package com.soft2techno.demo;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("Create First  Employee object===");

		Employee e1 = new Employee();
		e1.eno         = 101;
		e1.ename    = "Rajesh";
		e1.eaddrs    = "Amravati";
		e1.mobNo    =  999999999L;
		e1.salary      = 25000;
		System.out.println("=====================");
		Employee e2 = new Employee();
		e2.eno         = 102;
		e2.ename    = "Ram";
		e2.eaddrs    = "Delhi";
		e2.mobNo    =  8888888888L;
		e2.salary      = 35000;
		System.out.println("First Student object values ::::::");
		System.out.println("Employee Number ::"  +e1.eno);
		System.out.println("Employee Name ::" +e1.ename);
		System.out.println("Employee Mobile Number ::" +e1.mobNo);
		System.out.println("Employee Address::" +e1.eaddrs);
		System.out.println("Employee Salaray::" +e1.salary);

		System.out.println("=====================");
		System.out.println("Second Student object values ::::::");
		System.out.println("Employee Number ::"  +e2.eno);
		System.out.println("Employee Name ::" +e2.ename);
		System.out.println("Employee Mobile Number ::" +e2.mobNo);
		System.out.println("Employee Address::" +e2.eaddrs);
		System.out.println("Employee Salaray::" +e2.salary);
	}
}
