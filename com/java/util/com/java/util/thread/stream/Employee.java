package com.java.util.thread.stream;

public class Employee {
	
	int i;
	String name;
	String grade;
	double salary;
	
	public Employee(int i, String name, String grade, double salary) {
		super();
		this.i = i;
		this.name = name;
		this.grade = grade;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
