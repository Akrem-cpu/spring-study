package com.example.demo.repository;

import com.example.demo.enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee,Long> {
}
