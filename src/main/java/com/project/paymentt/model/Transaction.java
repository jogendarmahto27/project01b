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
	@Column(name="senderbic",length=50)
	private String senderBIC;
	@Column(name="receiverbic",length=50)
	private String receiverBIC;
	private String receiverAccountHolderNumber;
	private String receiverAccountHolderName;
	@Column(length=50)
	private String transferTypeCode;
	@OneToOne
	@JoinColumn(name="messagecode")
	private Message message;
	private double currencyAmount;
	private double tranferFees;
	private double totalAmount;
	private LocalDate transferDate;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(int transactionId, Customer customer, String senderBIC, String receiverBIC,
			String receiverAccountHolderNumber, String receiverAccountHolderName, String transferTypeCode,
			Message message, double currencyAmount, double tranferFees, double totalAmount, LocalDate transferDate) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.senderBIC = senderBIC;
		this.receiverBIC = receiverBIC;
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
		this.receiverAccountHolderName = receiverAccountHolderName;
		this.transferTypeCode = transferTypeCode;
		this.message = message;
		this.currencyAmount = currencyAmount;
		this.tranferFees = tranferFees;
		this.totalAmount = totalAmount;
		this.transferDate = transferDate;
	}

	public int TransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiverAccountHolderNumber() {
		return receiverAccountHolderNumber;
	}
	public void setReceiverAccountHolderNumber(String receiverAccountHolderNumber) {
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
	}
	public String getReceiverAccountHolderName() {
		return receiverAccountHolderName;
	}
	public void setReceiverAccountHolderName(String receiverAccountHolderName) {
		this.receiverAccountHolderName = receiverAccountHolderName;
	}
	public String getTransferTypeCode() {
		return transferTypeCode;
	}
	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	

	public double getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(double currencyAmount) {
		this.currencyAmount = currencyAmount;
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
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", senderBIC=" + senderBIC
				+ ", receiverBIC=" + receiverBIC + ", receiverAccountHolderNumber=" + receiverAccountHolderNumber
				+ ", receiverAccountHolderName=" + receiverAccountHolderName + ", transferTypeCode=" + transferTypeCode
				+ ", message=" + message + ", currencyAmount=" + currencyAmount + ", tranferFees=" + tranferFees
				+ ", inrAmount=" + totalAmount + ", transferDate=" + transferDate + "]";
	}
}
	