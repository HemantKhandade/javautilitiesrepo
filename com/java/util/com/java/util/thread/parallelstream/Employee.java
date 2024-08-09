package com.java.util.thread.parallelstream;

public class Employee {
	
	int i;
	String name;
	double salary;
	
	public Employee(int i, String name, double salary) {
		super();
		this.i = i;
		this.name = name;
		this.salary = salary;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [i=" + i + ", name=" + name + ", salary=" + salary + "]";
	}
}
