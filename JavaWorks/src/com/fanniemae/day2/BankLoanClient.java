package com.fanniemae.day2;

public class BankLoanClient {
public static void main(String[] args) {
	BankLoan b1;
	
	b1 = new CarLoan();
	b1.loanAmount(100000);
	b1.repay(3000);
	b1.foreclosure();
	
	System.out.println("-------------------------------");
	b1 = new PersonalLoan();
	b1.repay(2000);
	b1.loanAmount(20000 );
	b1.foreclosure();
}
	
}

