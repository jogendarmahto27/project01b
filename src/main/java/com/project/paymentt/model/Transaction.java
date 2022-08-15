package com.project.paymentt.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	@ManyToOne
	@JoinColumn(name="customer")
	private Customer customer;
	@Column(name="receiverbic",length=50)
	private String receiverBIC;
	private String receiverAccountNumber;
	private String receiverAccountName;
	@Column(length=50)
	private String transferType;
	@Column(length=150)
	private String message;
	private double amount;
	private double tranferFees;
	private double totalAmount;
	private LocalDate transferDate;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionId, Customer customer, String receiverBIC, String receiverAccountNumber,
			String receiverAccountName, String transferType, String message, double amount, double tranferFees,
			double totalAmount, LocalDate transferDate) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.receiverBIC = receiverBIC;
		this.receiverAccountNumber = receiverAccountNumber;
		this.receiverAccountName = receiverAccountName;
		this.transferType = transferType;
		this.message = message;
		this.amount = amount;
		this.tranferFees = tranferFees;
		this.totalAmount = totalAmount;
		this.transferDate = transferDate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(String receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}
	public String getReceiverAccountName() {
		return receiverAccountName;
	}
	public void setReceiverAccountName(String receiverAccountName) {
		this.receiverAccountName = receiverAccountName;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTranferFees() {
		return tranferFees;
	}
	public void setTranferFees(double tranferFees) {
		this.tranferFees = tranferFees;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(LocalDate transferDate) {
		this.transferDate = transferDate;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customer=" + customer + ", receiverBIC=" + receiverBIC
				+ ", receiverAccountNumber=" + receiverAccountNumber + ", receiverAccountName=" + receiverAccountName
				+ ", transferType=" + transferType + ", message=" + message + ", amount=" + amount + ", tranferFees="
				+ tranferFees + ", totalAmount=" + totalAmount + ", transferDate=" + transferDate + "]";
	}
	
}