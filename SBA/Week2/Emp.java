package sba.ust;

abstract class Employee {
	int empid;
	String emp_name;
	String dept;
	float salary;
	abstract public void calculateSalary();
	abstract public void fetchDepartment();

}

class Engineer extends Employee{
	
	public void calculateSalary() {
		System.out.println("Salary in Engineer class");
	}
	public void fetchDepartment() {
		System.out.println("Department in Engineer class");
	}
}
class Doctor extends Employee{
	
	public void calculateSalary() {
		System.out.println("Salary in Doctor class");
	}
	public void fetchDepartment() {
		System.out.println("Department in Doctor class");
	}
}
public class Emp {
	public static void main(String args[]) {
		Engineer e=new Engineer();
		e.calculateSalary();
		e.fetchDepartment();
		Doctor d=new Doctor();
		d.calculateSalary();
		d.fetchDepartment();
	}
}
