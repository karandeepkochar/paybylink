package com.hcltech.paybylink.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="accountdetails-table")
public class Accountdetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountno;
	
	@ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Long customerid;
	private double balance;
	
	@OneToMany(fetch = FetchType.LAZY) 
   @JoinColumn(name = "accountno", referencedColumnName = "transactionEntitiy")

	private List<transactionEntitiy> entity;
	 
	 private LocalDate accountCreationDate;
	 private LocalDate lastTransactions;
	 private String transactiontype;
	public Accountdetails(Long accountno, double balance, LocalDate accountCreationDate, LocalDate lastTransactions,
			String transactiontype,Long customerid) {
		super();
		this.accountno = accountno;
		this.balance = balance;
		this.accountCreationDate = accountCreationDate;
		this.lastTransactions = lastTransactions;
		this.transactiontype = transactiontype;
		this.customerid = customerid;

	}
	public Accountdetails(int i, double balance2, LocalDate minusYears, LocalDate minusDays, String transactiontype2,Long customerid) {
		// TODO Auto-generated constructor stub
	}
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public Long getAccountno() {
		return accountno;
	}
	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getAccountCreationDate() {
		return accountCreationDate;
	}
	public void setAccountCreationDate(LocalDate accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	public LocalDate getLastTransactions() {
		return lastTransactions;
	}
	public void setLastTransactions(LocalDate lastTransactions) {
		this.lastTransactions = lastTransactions;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
		  
	 
}
