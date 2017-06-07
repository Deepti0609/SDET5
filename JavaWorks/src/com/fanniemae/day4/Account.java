package com.fanniemae.day4;

public class Account {

	int money;
	public Account(int money){
		this.money = money;
	}
	
	//public synchronized void withdraw(int amount)
	  public void withdraw(int amount){
		if(amount<money){
			try{
				Thread.sleep(1000);
				money = money - amount;
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Withdraw successfull by" + Thread.currentThread().getName());
		}else{
			System.out.println("Sorry No Balance: " + Thread.currentThread().getName());
		}
		
		System.out.println("Current Balance " + money);
	}
}
