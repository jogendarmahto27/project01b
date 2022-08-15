package com.project.paymentt.controller;

import java.util.List;
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

import com.project.paymentt.model.Transaction;
import com.project.paymentt.service.TransactionService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionRestController {
	@Autowired
	private TransactionService transService;
	
	@PostMapping("/new")
	public String addTransaction(@RequestBody Transaction transaction) {
		System.out.println(transaction);
		if(transService.checkTransaction(transaction)) {
			return "transaction success";
		}
		return "transaction failed";
	}
	
	@GetMapping("/all")
	public List<Transaction> getAllTransactions(){
		List<Transaction> t = transService.getTransactions();
		return t;
	}
	
	@GetMapping("/{id}")
	public Optional<Transaction> getTransactionById(@PathVariable Integer id){
		return transService.findTransactionById(id);
	}

}
