package com.codeclan.example.Employee_Lab.repositories;

import com.codeclan.example.Employee_Lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}