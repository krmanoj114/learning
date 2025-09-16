package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String args[]) {
		//System.out.println("test");
		
		
		List<Integer> list = Arrays.asList(2,22,33,44,55,2222,20,80);
		
		List<String>  list1 = list.stream().map(s-> s+"").filter(a-> a.startsWith("2")).collect(Collectors.toList());
		System.out.println("LIst::"+list1);
		
		
	}

}
