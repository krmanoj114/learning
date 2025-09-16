package com.test.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SkipAndLimit {
	
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,6,6,7,8);
		 
		  HashSet<Integer> set = new HashSet<Integer>();
		
		    list.stream().filter(s-> !set.add(s)).skip(1).forEach(System.out::println);
	}

}
