package com.java.util.thread.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTestReduce {

	public static void main(String[] args) {
		/*
		 * Integer[] intList = {1,2,3,4,5}; Integer sum1 =
		 * Stream.of(1,2,3,4,5).reduce(0, (a,b) -> a + b);
		 * System.out.println("Result :: SUM 1 :: " + sum1);
		 */
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum2 = numList.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Result :: SUM 2 :: " + sum2);
		
		Integer sum3 = numList.stream().mapToInt(e ->e).sum();
		System.out.println("Result :: SUM 3 :: " + sum3);
		
		int sum4 = numList.stream().reduce(0,Integer::sum);
		System.out.println("Result :: sum4 :: " + sum4);
		
		
		int maxNum = numList.stream().reduce(0,(a,b) -> a > b? a:b);
		System.out.println("Result :: maxNum  :: " + maxNum);
		
		int maxNum1 = numList.stream().reduce(0,Integer::max);
		System.out.println("Result :: maxNum 1 :: " + maxNum1);
				
		
		

		
		/*
		 * List<Integer> numList1 = Arrays.asList(5,7,4,1,2,3,4,5); Stream<Integer>
		 * numList2 = numList1.stream().sorted(); numList2.forEach(System.out::println);
		 */
		 

	}

}
