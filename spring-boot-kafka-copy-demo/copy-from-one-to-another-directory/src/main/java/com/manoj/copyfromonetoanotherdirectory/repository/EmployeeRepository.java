package com.manoj.copyfromonetoanotherdirectory.repository;

import com.manoj.copyfromonetoanotherdirectory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
