package com.java.util.thread.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestMap1 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("HemAnt","VasanT");
		//List<String> res = names.stream().map(String::toLowerCase).collect(Collectors.toList());
		List<String> res = names.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
		
		System.out.println("Result :: " + res);
		
		 List<String> res1 = names
			      .stream()
			      .map(str -> str.substring(0, 3))
			      .collect(Collectors.toList());
			    System.out.println(res1);
	}
	
	
}
