package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{

}
