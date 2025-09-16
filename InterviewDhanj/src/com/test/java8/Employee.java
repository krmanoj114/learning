package com.test.java8;

public class Employee {
	
	 public String empId;
     public String empName;
     public int salary;
     public int age;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Employee(String empId, String empName, int i, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = i;
		this.age = age;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
