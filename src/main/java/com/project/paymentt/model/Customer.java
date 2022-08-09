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
	private String customerAddress;
	private String customerCity;
//	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="customerid")
	@OneToMany(targetEntity = Transaction.class,cascade=CascadeType.ALL,mappedBy="customer")
//	@JoinColumn(name="hello",referencedColumnName="customer_id")
	private List<Transaction> transactions;
	//	@JoinColumn(name="customer_id_ref",referencedColumnName="customer_id")
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
//	public void setTransactions(Transaction ts) {
//		this.transactions = (List<Transaction>) ts;
//	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String accountHolderName, boolean overdraftFlag, double clearBalance,
			String customerAddress, String customerCity) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.overdraftFlag = overdraftFlag;
		this.clearBalance = clearBalance;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
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
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", overdraftFlag="
				+ overdraftFlag + ", clearBalance=" + clearBalance + ", customerAddress=" + customerAddress
				+ ", customerCity=" + customerCity + "]";
	}
	
	
}
