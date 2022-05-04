package com.testBank.ABC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="account")
public class Account {
	
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
	private int accountID;
    private int userID;
	private Float accountBalance;
    @ManyToOne
    @JoinColumn(name="userID",insertable=false,updatable=false,nullable=false,referencedColumnName="userID")
    @JsonIgnoreProperties("accont")
    private User owner;
    
    
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int accountID, int userID, Float accountBalance, User owner) {
		super();
		this.accountID = accountID;
		this.userID = userID;
		this.accountBalance = accountBalance;
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", userID=" + userID + ", accountBalance=" + accountBalance
				+ ", owner=" + owner + "]";
	}


	public int getAccountID() {
		return accountID;
	}


	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public Float getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(Float accountBalance) {
		this.accountBalance = accountBalance;
	}


	public User getOwner() {
		return owner;
	}


	public void setOwner(User owner) {
		this.owner = owner;
	}
    
    
}
