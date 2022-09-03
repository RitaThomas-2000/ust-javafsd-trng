package com.ust;

public class Employee {
	int emp_id;
	String emp_name;
	float salary;
	String designation;
	String location;
	
	int salary(int a) {
		return a;
	}
	float salary(float a) {
		return a;
	}
	void salary1(int a) {
		System.out.println("Salary is "+ a);
	}
	
	
	public static void main(String args[]) {
		Employee e=new Employee();
		//e.salary=20000;
		System.out.println(e.salary(2000));
		System.out.println(e.salary(3000f));
	}
}

class Engineer extends Employee {
	void salary1(int a) {
		System.out.println("Salary is "+ a);
	}
	
	
}
