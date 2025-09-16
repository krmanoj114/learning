package com.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeDeparmentSorting {
	
	public static void main(String args[]) {
		
		List<EmployeeEntity>  empList = new ArrayList<>();
		
		empList.add(new EmployeeEntity(101, "Dhananjay", 2000, "IT"));
		empList.add(new EmployeeEntity(102, "Devyansh", 3000, "Admin"));
		empList.add(new EmployeeEntity(103, "Dheeraj", 5000, "Finance"));
		empList.add(new EmployeeEntity(104, "Dharmendra", 10000, "Admin"));
		empList.add(new EmployeeEntity(105, "Deepak", 20000, "IT"));
		empList.add(new EmployeeEntity(106, "Deepu", 20000, "Admin"));
		
		
		empList.stream().filter(s-> s.getSalary() > 5000).map(EmployeeEntity::getName).forEach(System.out::println);
//		Map<String, Long>  empList1=  empList.stream().filter(s->s.getSalary() > 30000).collect(Collectors.groupingBy(EmployeeEntity::getName, Collectors.counting()));
//		System.out.println(empList1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		empList3.forEach((key, value)-> {
//			System.out.println("Employee Name:::"+value.toString());
//		});
		
		//Map<Integer, List<String>> empList3 = empList.stream().filter(s-> s.getSalary() > 5000).collect(Collectors.groupingBy(EmployeeEntity::getSalary, Collectors.mapping(EmployeeEntity::getName, Collectors.toList())));
//		List<String> empName = new ArrayList<String>();
//		empList3.forEach((k,v)-> {
//			empName.add(v.toString());
//		});
		//System.out.println("Employee Name:::"+empName);
	//	System.out.println("Emp List:::"+empList3);
		//Emp details working in each department
		
		Map<String, List<EmployeeEntity>> empListBasedOnDepartment = empList.stream().collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors.toList()));
		
		
		empListBasedOnDepartment.forEach((key, value) -> System.out.println(
				
				key+""+value));
		
		//employee count working in each department
		
		Map<String, Long> empCountByDepartment = empList.stream().collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors.counting()));
		
		empCountByDepartment.entrySet().forEach(entry -> {
			System.out.println("Department "+entry.getKey()+"--"+entry.getValue());
		});
		
		// employee name start with D
		
		//empList.stream().collect(Collectors.groupingBy(EmployeeEntity::getName, Collectors.))
		
		//Max/Min salary of emp in department
		
		//Employee salary in decending order
		List<EmployeeEntity> sortedSalaryList = empList.stream().sorted(Comparator.comparingInt(EmployeeEntity::getSalary).reversed()).collect(Collectors.toList());
 		
		System.out.println("sortedSalaryList::"+sortedSalaryList);
		
		//Optional<EmployeeEntity> salaray = empList.stream().collect(Collectors.groupingBy(EmployeeEntity::getSalary, Collectors.reducing()));
		
		Optional<EmployeeEntity> empMaxSalary = empList.stream().max(Comparator.comparing(EmployeeEntity::getSalary));
		
		Optional<EmployeeEntity> minSalary = empList.stream().min(Comparator.comparing(EmployeeEntity::getSalary));
		
		System.out.println("Max Salary:::"+empMaxSalary);

		System.out.println("Min Salary:::"+minSalary);
		
		//max salary department wise
		Map<String, Optional<EmployeeEntity>> topSalaryEmpDepWise = empList.stream().collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(EmployeeEntity::getSalary)))));
	  topSalaryEmpDepWise.entrySet().forEach(entry -> {
		  System.out.println("dept "+entry.getKey()+"  Salary  "+entry.getValue());
	  });
	  
	  //*********************************ToMap************************
	  
	  Map<Integer, String> empIdNameMapList = empList.stream().collect(Collectors.toMap(EmployeeEntity::getId, EmployeeEntity::getName));
	  
	  empIdNameMapList.entrySet().forEach(entry -> {
		  System.out.println(entry.getKey()+":"+entry.getValue());
	  });
	}

}
