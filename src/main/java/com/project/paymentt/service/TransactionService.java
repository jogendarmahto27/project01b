package com.project.paymentt.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.paymentt.model.Customer;
import com.project.paymentt.model.Transaction;
import com.project.paymentt.repository.CustomerRepository;
import com.project.paymentt.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired 
	private CustomerRepository custRepo;
	@Autowired 
	private TransactionRepository transRepo;
	
	
	public boolean checkTransaction(Transaction ts) {
		System.out.println("checking the feasibility of transaction occurance");
		Customer c = ts.getCustomer();
		double remainingBalance = c.getClearBalance() - ts.getCurrencyAmount() - (ts.getCurrencyAmount()*0.0025);
		boolean overdraft = c.isOverdraftFlag();
		if(remainingBalance>=0 || overdraft) {
			return updateINR(ts);
		}
		return false;
	}
	

	
	public boolean updateINR(Transaction ts) {
		double transferFee = ts.getCurrencyAmount()*0.0025;
		double total = ts.getCurrencyAmount() + transferFee;
		LocalDate d1 = LocalDate.now();
		ts.setTranferFees(transferFee);
		ts.setTotalAmount(total);
		ts.setTransferDate(d1);
		String c = ts.getCustomer().getCustomerId();
		
		Customer cus = custRepo.findById(c).get();
		double balance = cus.getClearBalance();
		cus.setClearBalance(balance - total);
		

		System.out.println(ts);
		try {
			System.out.println("inside try of transrepo");
			transRepo.save(ts);
			System.out.println("updating a transaction in database");
			
		}catch(Exception e) {
			System.out.println("error inserting in database transaction");
			return false;
		}
		return true;
	}
	
	public Optional<Transaction> findTransactionById(Integer id) {
		System.out.println("insert in transaction table");
		Optional<Transaction> trans = transRepo.findById(id);
		return trans;
	}
	
	public List<Transaction> getTransactions(){
		List<Transaction> transactions = new ArrayList<>();
		transRepo.findAll().forEach(trans->transactions.add(trans));
		return transactions;
	}
	
	public String save(Transaction transaction) {
		transRepo.save(transaction);
		return "Transaction saved";
	}

	 
}
