package com.java.util.thread.parallelstream;

import java.util.stream.Collector;
import java.util.stream.IntStream;

public class ParallelStreamImpl {

	public static void main(String[] args) {
		
		/*long start = System.currentTimeMillis();
		IntStream.range(0, 10000).forEach(System.out::print);
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time Taken To Process :: " + (end - start) + " millisecond" );
		
		System.out.println();
		long pstart = System.currentTimeMillis();
		IntStream.range(0, 10000).parallel().forEach(System.out::print);
		long pend = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time Taken by Parallel Stream To Process :: " + (pend - pstart) + " millisecond" );

		System.out.println();
		IntStream.range(0, 1000).forEach(
					x -> {
						System.out.println("Thread :: " + Thread.currentThread().getName() + " : " + x);
					}
				);
		
		System.out.println();
		IntStream.range(0, 1000).parallel().forEach(
					x -> {
						System.out.println("Thread :: " + Thread.currentThread().getName() + " : " + x);
					}
				);
		*/
		
		/*System.out.println();
		long pstart1 = System.currentTimeMillis();
		EmployeeDatabase.getEmployeeList().stream().forEach(e -> System.out.println(e.name));
		long pend1 = System.currentTimeMillis();
		System.out.println("Time Taken by Regular Stream To Process :: " + (pend1 - pstart1) + " millisecond" );
		
		System.out.println();
		long pstart2 = System.currentTimeMillis();
		EmployeeDatabase.getEmployeeList().parallelStream().forEach(e -> System.out.println(e.name));
		long pend2 = System.currentTimeMillis();
		System.out.println("Time Taken by Parallel Stream To Process :: " + (pend2 - pstart2) + " millisecond" );
		*/
		System.out.println();
		long pstart3 = System.currentTimeMillis();
		double average1 = EmployeeDatabase.getEmployeeList().stream().map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		long pend3 = System.currentTimeMillis();
		System.out.println("Time Taken by Regular Stream To Process :: " + (pend3 - pstart3) + " millisecond : Average : " + average1);
		
		System.out.println();
		long pstart4 = System.currentTimeMillis();
		double average2 = EmployeeDatabase.getEmployeeList().parallelStream().map(e -> e.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		long pend4 = System.currentTimeMillis();
		System.out.println("Time Taken by Regular Stream To Process :: " + (pend4 - pstart4) + " millisecond : Average : " + average2);
		
	}
}
