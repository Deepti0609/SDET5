package com.fanniemae.day2;

public class PersonalLoan implements BankLoan{
	
	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan Amount is " + amount);
		
	}

	@Override
	public void repay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Personal Loan You Repay: " + amount);
		
	}

	@Override
	public void foreclosure() {
		// TODO Auto-generated method stub
		System.out.println("PersonalLoan You opted for foreclosure");
		
	}

}
