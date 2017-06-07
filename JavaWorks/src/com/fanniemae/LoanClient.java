package com.fanniemae;

public class LoanClient {
  public static void main(String[] args) {
	Loan loanScott = new Loan();
	loanScott.setLoanId(101);
	loanScott.setLoanAmount(4444);
	loanScott.setBorrowerName("Sco");
	loanScott.setRateOfInterest(5);
	System.out.println("Loan ID: "+ loanScott.getLoanId());
	System.out.println("Loan Amount: "+loanScott.getLoanAmount());
	System.out.println("Loan Borrower Name: "+ loanScott.getBorrowerName());
	System.out.println("Rate of Interest: "+ loanScott.getRateOfInterest());
}
}
