package com.project.paymentt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_id",length=15)
	private String customerId;
	private String accountHolderName;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="bic_customer",referencedColumnName="bic")
//	private Bank bicCustomer;
	private boolean overdraftFlag;
	private double clearBalance;
//	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="customerid")
//	@OneToMany(targetEntity = Transaction.class,cascade=CascadeType.ALL,mappedBy="customer")
//	@JoinColumn(name="hello",referencedColumnName="customer_id")
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String accountHolderName, boolean overdraftFlag, double clearBalance) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.overdraftFlag = overdraftFlag;
		this.clearBalance = clearBalance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isOverdraftFlag() {
		return overdraftFlag;
	}
	public void setOverdraftFlag(boolean overdraftFlag) {
		this.overdraftFlag = overdraftFlag;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", overdraftFlag="
				+ overdraftFlag + ", clearBalance=" + clearBalance + "]";
	}
	



}