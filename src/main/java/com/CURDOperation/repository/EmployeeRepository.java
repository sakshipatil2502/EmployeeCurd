package com.CURDOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CURDOperation.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	

}
