package com.manoj;

public class Department {
    Integer employeeId;
    String department;

    public Department() {
    }

    public Department(Integer employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DEpartment{" +
                "employeeId=" + employeeId +
                ", department='" + department + '\'' +
                '}';
    }
}
