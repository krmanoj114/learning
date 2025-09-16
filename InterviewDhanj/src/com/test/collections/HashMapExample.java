package com.test.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empMap= new HashMap<Integer, String>();
		
		empMap.put(1, "dhananjay");
		empMap.put(5, "amit");
		empMap.put(null, "sanket");
		empMap.put(null, "subhash");
		
	System.out.println("empmap:::"+empMap);
	
	for(Integer empId: empMap.keySet()) {
		
		System.out.println("EmpID::"+ empId + "EmpName:::"+empMap.get(empId));
	}
		
		

	}

}
