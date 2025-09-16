package com.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFilterExample {
	
	
	  public void printEmployeeName(String ageLimit, Map<String, Employee> empMap ){
	        
		//  empMap.entrySet().stream().filter(s-> s.getValue().getAge() > ageLimit).map(Map.Entry::getKe)).forEach(System.out::println);
		  
		  empMap.values().stream().filter(employee-> employee.getAge() > Integer.valueOf(ageLimit)).forEach(employee-> System.out.println(employee.getEmpName()));
		  
		//  empMap.values().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 System.out.println("***********************************");
		 // empMap.values().stream().collect(Collectors.groupingBy(Collectors.toList());
		  System.out.println("***********************************");
	    }
	
	public static void main(String[] args) {
		
	
	
	List<EmployeeEntity>  empList = new ArrayList<>();
	
	empList.add(new EmployeeEntity(101, "Dhananjay", 2000, "IT"));
	empList.add(new EmployeeEntity(102, "Devyansh", 3000, "Admin"));
	empList.add(new EmployeeEntity(103, "Dheeraj", 5000, "Finance"));
	empList.add(new EmployeeEntity(104, "Dharmendra", 10000, "Admin"));
	//empList.add(new EmployeeEntity(105, "Deepak", 20000, "IT"));
	//empList.add(new EmployeeEntity(106, "Deepu", 20000, "Admin"));
	
	
//	empList.stream().filter(s-> s.getSalary() > 5000).map(EmployeeEntity::getName).forEach(System.out::println);
	
	Map<String, Long> el = empList.stream().filter(s-> s.getSalary() > 5000).collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors.counting()));
	System.out.println(el);
	
		EmployeeFilterExample empObj = new EmployeeFilterExample();
		
                  Employee e1 = new Employee("e1", "Dhananjay", 1000, 40);
                  Employee e2 = new Employee("e2", "Devyansh", 1050, 13);
                  Employee e3 = new Employee("e3", "Shreya", 1100, 17);
                  Employee e4 = new Employee("e4", "Priyanka", 1200, 39);
                  Employee e5 = new Employee("e5", "Priya", 1200, 39);
                  
                  
                  Map<String, Employee> empMap = new HashMap<String, Employee>();
                  empMap.put("e1", e1);
                  empMap.put("e2", e2);
                  empMap.put("e3", e3);
                  empMap.put("e4", e4);
                  empMap.put("e5", e5);
                  
                  String ageLimit = "25";
                  
                  
                 empObj.printEmployeeName(ageLimit, empMap);
		
	}
	

}
