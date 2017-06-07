package com.fanniemae.day4;

public class AccountTest implements Runnable{

	
    Account account;
    int amt;
    
	
	public static void main(String[] args) {
		
		Account account = new Account(1000);
		new AccountTest(500,account,"Harry");
		new AccountTest(750,account,"Larry");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// synchronizing on the object
		synchronized (account){
		account.withdraw(amt);
		}
	}
	
	public AccountTest(int amount, Account account,String name){
		
		Thread t = new Thread(this,name);
		this.amt = amount;
		this.account = account;
		// this will invoke run method
		t.start();
	}
}
