package com.fanniemae.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreStep {

	//step defn
 
	@Given("Employee has a credit score")
	public void employee_has_a_credit_score(){
		
		System.out.println("Employee has a credit score >>>>>>> ");
	}
	
	@And("according to bank standard")
	public void according_to_bank_standard(){
		System.out.println("according to bank standard >>>>>>>>");
	}
	
	
	//this method shall be generic method
	//which will take one work anyting
	
	@When("customer has ([a-zA-Z]{1,}) time work")
	public void customer_full_time_work(String workTime){
		System.out.println("Customer has -" +workTime+ " - time work  >>>>>>>>");
	}
	
	@And("in the govt office")
	public void in_govt_off(){
		System.out.println("In the govt office  >>>>>>>>>");
		
	}
	
	@Then("sanction Loan")
	public void sanction_loan(){
		System.out.println("Sanction Loan  >>>>>>>>>");
	}
	
	@But("should repay within 5 years")
	public void repay_within_5_years(){
		System.out.println("But should repay within 5 years  >>>>>>>");
		
	}
	
	@And("in the private office")
	public void in_private_office(){
		System.out.println("in the private office >>>>>>>");
	}
}
