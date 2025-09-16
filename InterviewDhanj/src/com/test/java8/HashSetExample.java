package com.test.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String args[]) {
		
		EmployeeEntity emp = new EmployeeEntity(101, "Dhananjay", 2000, "IT");
		EmployeeEntity emp1 = new EmployeeEntity(101, "Dhananjay", 2000, "IT");
		EmployeeEntity emp2 = new EmployeeEntity(101, "Dhananjay", 2000, "IT");
		
		Set set =  new HashSet();
		
		Map<EmployeeEntity, String> map = new HashMap();
		
		set.add(new EmployeeEntity(101, "Dhananjay", 2000, "IT"));
		set.add(new EmployeeEntity(101, "Dhananjay", 2000, "IT"));
		set.add(new EmployeeEntity(101, "Dhananjay", 2000, "IT"));
		
		System.out.println(set.size());
		
		map.put(emp, "test1");
		map.put(emp, "test2");
		map.put(emp1, "test3");
		
		System.out.println("Size of map:::"+map.size());
		
		for(Entry<EmployeeEntity, String>  p: map.entrySet()) {
			
			System.out.println("Key::"+p.getKey()+"  Value:::"+p.getValue());
		}
		
		
		
	}

}
