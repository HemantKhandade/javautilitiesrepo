package com.java.util.thread.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployeeList(){
		
		/*ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1001, "Hemant", "A", 5000));
		employeeList.add(new Employee(1002, "Vasant", "A", 7000));
		employeeList.add(new Employee(1003, "Laxman", "B", 10000));
		employeeList.add(new Employee(1004, "Ashok", "B", 12000));
		employeeList.add(new Employee(1005, "Bandu", "C", 15000));
		employeeList.add(new Employee(1006, "Kishor", "C", 17000));
		employeeList.add(new Employee(1007, "Bali", "D", 19000));
		employeeList.add(new Employee(1008, "Chhabu", "D", 21000));
		employeeList.add(new Employee(1009, "Uttara", "E", 23000));*/
		//return employeeList;
		
		return Stream.of(new Employee(1001, "Hemant", "A", 50000),
					new Employee(1002, "Vasant", "A", 70000),
					new Employee(1003, "Laxman", "B", 100000),
					new Employee(1004, "Ashok", "B", 120000),
					new Employee(1005, "Bandu", "C", 150000),
					new Employee(1006, "Kishor", "C", 170000)
				).collect(Collectors.toList());
	}

	/*public static void main(String[] args) {
		EmployeeDatabase ed = new EmployeeDatabase();
		ArrayList<Employee> employees = ed.getEmployeeList();
		System.out.println( employees.toString());
	}*/
}
