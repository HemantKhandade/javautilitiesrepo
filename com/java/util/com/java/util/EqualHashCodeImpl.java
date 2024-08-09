package com.java.util;

import java.util.ArrayList;

import com.java.util.model.Address;
import com.java.util.model.Person;

public class EqualHashCodeImpl {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> ar = new ArrayList<>();
		//Test with String Class
		String str1 = new String("Hemant");
		String str2 = new String("Hemant");
		
		System.out.println("Hash 1 :: " + str1.hashCode());
		System.out.println("Hash 2 :: " + str2.hashCode());
		System.out.println("Hash 2 :: " + str2.equals(str2));
		
		//Test with class not implementing equals and hashCode
		Address a1 = new Address("Hemant", "Khandade", "1800 ESpringCreek"); 
		Address a2 = new Address("Hemant", "Khandade", "1800 ESpringCreek"); 
		
		System.out.println("Address 1 :: " + a1.hashCode());
		System.out.println("Address 2 :: " + a2.hashCode());
		System.out.println("Address is same? :: " + a1.equals(a2) + " even though the data is same");
		
		//Test with class implementing equals and hashCode
		Person p1 = new Person("Hemant", "Khandade", 50);
		Person p2 = new Person("Hemant", "Khandade", 50);
		
		System.out.println("Person 1 :: " + p1.hashCode());
		System.out.println("Person 2 :: " + p2.hashCode());
		
		
		System.out.println("Person are same? :: " + p1.equals(p2));
		//str2 = new String("Hemant");
		//System.out.println("str2 :: " +str2);
	}
	
}
