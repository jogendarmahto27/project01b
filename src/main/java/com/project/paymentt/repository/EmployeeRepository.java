package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
