package sba.ust;

interface Employee1{
	public abstract void calculateSalary();
	public abstract void fetchDepartment();
}

class Engineer1 implements Employee1 {
	public void calculateSalary() {
		System.out.println("Salary in Engineer class");
	}
	public void fetchDepartment() {
		System.out.println("Department in Engineer class");
	}

}
class Doctor1 implements Employee1{
	public void calculateSalary() {
		System.out.println("Salary in Doctor class");
	}
	public void fetchDepartment() {
		System.out.println("Department in Doctor class");
	}
}

public class Emp2{
	public static void main(String args[]) {
		Engineer1 e=new Engineer1();
		e.calculateSalary();
		e.fetchDepartment();
		Doctor1 d=new Doctor1();
		d.calculateSalary();
		d.fetchDepartment();
	}
}
