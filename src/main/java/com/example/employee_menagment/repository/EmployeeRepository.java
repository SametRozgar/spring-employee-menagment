package com.example.employee_menagment.repository;

import com.example.employee_menagment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findByEmail(String email);
    Boolean existByEmail(String email);
}
