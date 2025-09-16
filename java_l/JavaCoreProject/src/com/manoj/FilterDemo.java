package com.manoj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Employee> emplList = new ArrayList<>();
        List<Department> deptList = new ArrayList<>();
        populate(emplList, deptList);
        System.out.println("Start");
        //Filter list of employees from PreSales or Sales department.
        System.out.println("Filter list of employees from PreSales or Sales department");
        emplList.stream()
                .filter(emp -> deptList.stream()
                        .anyMatch(dept -> (dept.getDepartment().equals("Sales") ||
                                dept.getDepartment().equals("PreSales")) &&
                                emp.getEmployeeId().equals(dept.getEmployeeId())))
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println("employee = " + employee.getEmployeeId()+" : "+employee.getEmployeeName()));

        //find the employee whose salary is greater than 150000 and employee name start with A or S
        System.out.println("find the employee whose salary is greater than 150000 and employee name start with A or S");
        emplList.stream()
                .filter(emp ->emp.getSalary()>150000.0)
                .filter(emp->(emp.getEmployeeName().startsWith("A") ||
                        emp.getEmployeeName().startsWith("S")))
                .collect(Collectors.toList()).forEach(employee -> System.out.println("employee = " + employee));
        //Add bonus to employee salary whose salary is below 200000
        System.out.println("Add bonus to employee salary whose salary is below 200000");
        emplList.stream().filter(emp -> emp.getSalary() <= 200000.0)
                .map(emp -> emp.getSalary() + 20000).collect(Collectors.toList()).forEach(emp-> System.out.println(emp));


    }

    private static void populate(List<Employee> emplList, List<Department> deptList) {
        emplList.add(new Employee(1001, "Manoj Kumar", 150000.0));
        emplList.add(new Employee(1002, "Sanoj Kumar", 200000.0));
        emplList.add(new Employee(1003, "Ananya Kumar1", 300000.0));
        emplList.add(new Employee(1004, "Shreya Kumari", 350000.0));
        emplList.add(new Employee(1005, "Sunita Kumari", 500000.0));
        deptList.add(new Department(1001, "Admin"));
        deptList.add(new Department(1002, "HR"));
        deptList.add(new Department(1003, "PreSales"));
        deptList.add(new Department(1004, "Sales"));
        deptList.add(new Department(1005, "Admin"));
  }
}


