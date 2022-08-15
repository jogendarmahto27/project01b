package com.project.paymentt.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.paymentt.model.Bank;
import com.project.paymentt.repository.BankRepository;
import com.project.paymentt.service.BankService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/bank")
public class BankRestController {
	
	@Autowired
	private BankService bankService;
	
	@GetMapping("/{bic}")
	public Optional<Bank> getBankDetails(@PathVariable String bic) throws Exception {
		return bankService.getBank(bic);
		
	}
	
	@PostMapping("/save")
	public void saveBank(@RequestBody Bank bank) throws Exception {
		bankService.postDetails(bank);
	}

}

