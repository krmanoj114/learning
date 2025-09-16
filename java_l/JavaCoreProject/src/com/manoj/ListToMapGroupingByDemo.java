package com.manoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapGroupingByDemo {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "ManojK", 50000.00));
        emp.add(new Employee(102, "Sunita", 100000.00));
        emp.add(new Employee(103, "Shreya", 150000.00));
        emp.add(new Employee(104, "Ananya", 250000.00));

        emp.add(new Employee(101, "ManojK", 50000.00));
        emp.add(new Employee(102, "Sunita", 100000.00));
        emp.add(new Employee(103, "Shreya", 150000.00));
        emp.add(new Employee(104, "Ananya", 250000.00));

        emp.add(new Employee(101, "ManojK", 50000.00));
        emp.add(new Employee(102, "Sunita", 100000.00));
        emp.add(new Employee(103, "Shreya", 150000.00));
        emp.add(new Employee(104, "Ananya", 250000.00));

        emp.add(new Employee(101, "ManojK", 50000.00));
        emp.add(new Employee(102, "Sunita", 100000.00));
        emp.add(new Employee(103, "Shreya", 150000.00));
        emp.add(new Employee(104, "Ananya", 250000.00));

        Map<Integer, List<NewEmployee>> collect = emp.stream().collect(Collectors.groupingBy(e -> e.getEmployeeId(), Collectors.mapping(e -> new NewEmployee(e.getEmployeeId(), e.getEmployeeName(), e.getSalary()), Collectors.toList())));

        System.out.println("collect = " + collect);

    }
}
