//package com.project.paymentt.controller;
//
//import java.util.Optional;
//
//import javax.persistence.EntityNotFoundException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.project.paymentt.model.Customer;
//import com.project.paymentt.repository.CustomerRepository;
//import com.project.paymentt.service.CustomerService;
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/v1")
//public class CustomerRestController {
//	@Autowired
//	private CustomerService service;
//	
//	@GetMapping("/customer/{id}")
//	public ResponseEntity<Customer> getCustomer(@PathVariable String id) throws Exception {
//		try{
//			return ResponseEntity.ok(service.findById(id).get());
//		}catch(EntityNotFoundException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//}
package com.project.paymentt.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.paymentt.model.Customer;
import com.project.paymentt.repository.CustomerRepository;
import com.project.paymentt.service.CustomerService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerRestController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomer(@PathVariable String id) throws Exception {
		return service.getById(id);
		
	}

}