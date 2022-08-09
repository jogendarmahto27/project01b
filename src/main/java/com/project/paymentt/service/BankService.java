package com.project.paymentt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.paymentt.model.Bank;
import com.project.paymentt.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public Optional<Bank> getBank(String id) {
		Optional<Bank> c = bankRepository.findById(id);
		return c;
	}
	
	public Bank postDetails(Bank bank){
		return bankRepository.save(bank);
	}

}
