package com.test.java8;

import java.util.Arrays;
import java.util.List;

public class DuplicateCharExample {
	
	public static void main(String args[]) {
		
		
		List<Integer> myList = Arrays.asList(8,34,12,78,18,89,11,5,10,117,5);
		
		myList.stream().map(s-> s +"").filter(n-> n.startsWith("1")).forEach(System.out::println);
		
		
		
		List<String>  list = Arrays.asList("Dhananjay","Shivansh","Devyansh","Deepak","Yogendra");
		
		
		list.stream().filter(s-> s.startsWith("D")).forEach(System.out::println);
		
	}
	
	
	

}
