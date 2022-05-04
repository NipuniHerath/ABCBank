package com.testBank.ABC.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="transaction")
public class Transaction {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionID;
	private int accountNumber;
	private float amount;
	private Timestamp date_time;
	private String type;
	private int destinationAccID;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(int transactionID, int accountNumber, float amount, Timestamp date_time, String type, int destinationAccID ) {
		super();
		this.transactionID = transactionID;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.date_time = date_time;
		this.type = type;
		this.destinationAccID =destinationAccID;
	}
	
	

	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Timestamp getDate_time() {
		return date_time;
	}
	public void setDate_time(Timestamp date_time) {
		this.date_time = date_time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getdestinationAccID() {
		return destinationAccID;
		
	}
	public void setdestinationAccID(int destinationAccID) {
		this.destinationAccID = destinationAccID;
	}
	

	

	

}
