package com.project.paymentt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banks")
public class Bank {
	@Id
	@Column(length=15)
	private String bic;
	private String bankName;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bic, String bankName) {	
		this.bic = bic;
		this.bankName = bankName;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Bank [bic=" + bic + ", bankName=" + bankName + "]";
	}
	
	
	

}
