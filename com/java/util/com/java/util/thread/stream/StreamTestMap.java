package com.java.util.thread.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTestMap {

	public static void main(String[] args) {
		//list size
		List<Employee> employeeList = EmployeeDatabase.getEmployeeList().stream().collect(Collectors.toList());
		System.out.println("No of Employees :: " + employeeList.size());
		//highest salary
		Double maxSalary = employeeList.stream().map(e->e.getSalary()).collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("Max Salary :: " + maxSalary);
		
		Employee e = employeeList.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList()).get(0);
		System.out.println("Max Salary 1 :: " + e.getSalary());
		
		//Name of employees with grade A
		List<Employee> employeeList1 = EmployeeDatabase.getEmployeeList().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A")).collect(Collectors.toList());
		employeeList1.forEach(employee -> System.out.println(employee.name));
		
		//Average salary of employees with grade A
		double averageSalary = EmployeeDatabase.getEmployeeList().stream()
		.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
		.map(employee -> employee.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
		
		System.out.println(" AverageSalary :: " + averageSalary);
			
		}
}
