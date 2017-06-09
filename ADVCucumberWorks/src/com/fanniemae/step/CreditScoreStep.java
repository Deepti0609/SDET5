package com.fanniemae.step;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreStep {

	// step defn
	@Before
	public void conn_to_db(){
		
		System.out.println("--------Connecting to the database--------");
	 
	}
		
	@Given("^load chrome browser$")
	public void load_chrome_browser(){
	    System.out.println(":::::::::::::::CHROME BROWSER Loading::::::::::::::::::::");
	}


	@Given("Employee has a credit score")
	public void employee_has_a_credit_score() {

		System.out.println("Employee has a credit score >>>>>>> ");
	}

	@And("according to bank standard")
	public void according_to_bank_standard() {
		System.out.println("according to bank standard >>>>>>>>");
	}

	// this method shall be generic method
	// which will take one work anyting

	@When("^customer has (\"[a-zA-Z]{1,}\") time work$")
	public void customer_full_time_work(String workTime) {
		System.out.println("Customer has -" + workTime + " - time work  >>>>>>>>");
	}

	@And("^in the (\"[a-zA-Z]{1,}\") office$")
	public void in_govt_off(String officetype) {
		System.out.println("In " + officetype + " the govt office  >>>>>>>>>");

	}

	@Then("sanction Loan")
	public void sanction_loan() {
		System.out.println("Sanction Loan  >>>>>>>>>");
	}

	
	 
	 @Then("^should repay within \"([0-9]{1,})\" years$") public void
	 repay_within_years(String noofyears) {
	 System.out.println("should repay within" + noofyears + "years  >>>>>>>");
	 }


}
