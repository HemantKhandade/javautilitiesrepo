package com.java.util.thread.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTestMap {

	public static void main(String[] args) {
		//list size
		List<Employee> employeeList = EmployeeDatabase.getEmployeeList().stream().collect(Collectors.toList());
		System.out.println("No of Employees :: " + employeeList.size());
		// Accumulate names into a List
	     List<String> list = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
	     //list of employees
	     list.forEach(e -> System.out.println("x:"+e));
	  // Compute sum of salaries of employee
	     double total = employeeList.stream()
	                          .collect(Collectors.summingDouble(Employee::getSalary));
	     System.out.println("Result :: sum5 :: " + total);
		//highest salary
		Double maxSalary = employeeList.stream().map(e->e.getSalary()).collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("Max Salary :: " + maxSalary);
		
		
		
		// Group employees by department
	   Map<String, List<Employee>> byDept
	         = employeeList.stream()
	                    .collect(Collectors.groupingBy(Employee::getGrade));
	   System.out.println(byDept);
	    Set keys = byDept.keySet();
	    keys.stream().forEach(System.out::println);
		
	 // To print the keys and values
	    byDept.forEach((K,V) -> {
	    	System.out.println(K + ", Stock : " + V);
	    	Employee e = V.getFirst();
	    	System.out.println(e.getName());
	    });
		 
	    
		//Name of employees with grade A
		/*List<Employee> employeeList1 = EmployeeDatabase.getEmployeeList().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A")).collect(Collectors.toList());
		employeeList1.forEach(employee -> System.out.println(employee.name));
		
		//Average salary of employees with grade A
		double averageSalary = EmployeeDatabase.getEmployeeList().stream()
		.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
		.map(employee -> employee.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
		
		System.out.println(" AverageSalary :: " + averageSalary);
			*/
		}
}
