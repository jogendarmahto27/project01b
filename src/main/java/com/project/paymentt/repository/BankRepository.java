package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Bank;

public interface BankRepository extends JpaRepository<Bank, String > {

}
