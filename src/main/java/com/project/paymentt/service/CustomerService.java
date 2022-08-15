//package com.project.paymentt.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.project.paymentt.model.Customer;
//import com.project.paymentt.repository.CustomerRepository;
//@Service
//public class CustomerService {
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	public Optional<Customer> findById(String id) {
//		Optional<Customer> c = customerRepository.findById(id);
//		return c;
//	}
//	
//	
//
//}

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
	
	public Optional<Customer> getById(String id) throws Exception {
		Optional<Customer> c = null;
		try {
			c = customerRepository.findById(id);
			return c;
		}catch(Exception e) {
			throw new Exception(e);
		}
	}
	
	

}
