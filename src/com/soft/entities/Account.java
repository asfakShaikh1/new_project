package com.soft.entities;

public class Account {
  
	private String accNo;
	private String accHoldeName;
	private String accType;
	private int balance;
	
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccHoldeName() {
		return accHoldeName;
	}
	public void setAccHoldeName(String accHoldeName) {
		this.accHoldeName = accHoldeName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		System.out.println("System.out.println");
	}
	
}
