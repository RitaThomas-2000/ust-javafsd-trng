package com.ust;

public class Employee {
	int emp_id;
	String emp_name;
	float salary;
	String designation;
	String location;
	
	// Overloading
	int salary(int a) {
		return a;
	}
	float salary(float a) {
		return a;
	}
	
	//Overriding
	void salary1() {
		System.out.println("Salary in Employee");
	}
	
	
	
	
	public static void main(String args[]) {
		Employee e=new Employee();
		Engineer1 e1=new Engineer1();
		//e.salary=20000;
		System.out.println(e.salary(2000));
		System.out.println(e.salary(3000f));
		e1.salary1();
		e.salary1();
	}
}

class Engineer1 extends Employee {
	void salary1() {
		super.salary1();
		System.out.println("Salary in Engineer");
	}
}


	
	

