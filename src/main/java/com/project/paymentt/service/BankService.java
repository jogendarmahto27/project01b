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
	
	public Optional<Bank> getBank(String id) throws Exception {
		Optional<Bank> b = null;
		try {
			b = bankRepository.findById(id);
			return b;
			
		}catch(Exception e) {
			throw new Exception(e);
		}

	}
	
	public void postDetails(Bank bank) throws Exception{
		try {
			bankRepository.save(bank);
		}catch(Exception e) {
			throw new Exception(e);
		}
		
	}

}
