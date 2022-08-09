package com.project.paymentt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paymentt.model.Customer;
import com.project.paymentt.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public Optional<Customer> findById(String id) {
		Optional<Customer> c = customerRepository.findById(id);
		return c;
	}
	
	

}
