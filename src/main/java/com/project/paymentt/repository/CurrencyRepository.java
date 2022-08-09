package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency,String> {

}
