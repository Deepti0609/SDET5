package com.fanniemae.day2;

class Car {}
public class CarLoan extends Car implements BankLoan {

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("CarLoan Amount is " + amount);
		
	}

	@Override
	public void repay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("CarLoan You Repay: " + amount);
		
	}

	@Override
	public void foreclosure() {
		// TODO Auto-generated method stub
		System.out.println("CarLoan You opted for foreclosure");
		
	}

}
