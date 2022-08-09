package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
