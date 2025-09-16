package com.test.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SecondHighestSalary {
	
	
	static Map.Entry<Integer, List<String>>  getNthHighestSalary(int num, Map<String, Integer> map){
		
		return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry :: getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num-1);
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
//		map.put("ram", 10000);
//		map.put("shyam", 11000);
//		map.put("pawan", 5000);
//		map.put("jp", 2000);
//		map.put("dev", 20000);
		
		//Second highest salary
		
//		Map.Entry<String, Integer> result = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//		                 .collect(Collectors.toList()).get(1);
		
	//	Map.Entry<String, Integer> results = getNthHighestSalary(3, map);
		
	//	System.out.println("Result::::"+results);
		
		
		
Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ram", 11000);
		map.put("shyam", 11000);
		map.put("pawan", 5000);
		map.put("jp", 2000);
		map.put("dev", 20000);
		map.put("dp", 20000);
		map.put("shiv", 20000);
		
		
		Map.Entry<Integer, List<String>> salaryResult = getNthHighestSalary(3, map);
				                                  
				                            
		
		System.out.println(salaryResult);
		
		
		
	}

}
