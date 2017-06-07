package com.fanniemae;

// reusable component
public class Loan {
    private int loanId;
    private double loanAmount;
    private double rateOfInterest;
    private String borrowerName;
	
    //setters and getters
    
    public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		if(loanAmount<5000){
			System.out.println("sorry loan cannot be processed");
			this.loanAmount = 10000;
		}else{
			this.loanAmount = loanAmount;
		}
		}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		if(borrowerName.length()<5){
			System.out.println("Sorry name cannot be less than 5 chars");
			this.borrowerName="No Name";
		}else
		this.borrowerName = borrowerName;
	}
      
    }
