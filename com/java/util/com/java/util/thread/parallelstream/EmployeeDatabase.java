package com.java.util.thread.parallelstream;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeDatabase {
	
	public static ArrayList<Employee> getEmployeeList(){
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		for(int i = 1; i <=10; i++ ) {
			employeeList.add(new Employee(i, "Employee"+i, Double.valueOf(new Random().nextInt(1000*100))));
		}
		return employeeList;
	}

	/*public static void main(String[] args) {
		EmployeeDatabase ed = new EmployeeDatabase();
		ArrayList<Employee> employees = ed.getEmployeeList();
		System.out.println( employees.toString());
	}*/
}
