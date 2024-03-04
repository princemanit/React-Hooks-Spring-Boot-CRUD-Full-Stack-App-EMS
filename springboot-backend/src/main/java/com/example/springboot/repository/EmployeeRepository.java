package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Employee;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// all crud database methods

}
