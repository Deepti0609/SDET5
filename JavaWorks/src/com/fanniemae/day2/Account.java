package com.fanniemae.day2;

public class Account {

	private int accId;
	private double balance;
	private String custName;
	
	private static int count = 100;
	public Account(double balance, String custName) {
		super();
		this.accId= count++;
		this.balance = balance;
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public String getCustName() {
		return custName;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", balance=" + balance + ", custName=" + custName + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Finalize of Account called");
	}
	
	}
	
	

