@Smoke
Feature: To Sanction Loan for the custormer

# this is my comment

Scenario: To issue the loan for the customer who is full time govt emp

	Given Employee has a credit score 
	And according to bank standard
	When customer has full time work
	And in the govt office
	Then sanction Loan
	But should repay within 5 years
		



Scenario: To issue the loan for the customer who is part time govt emp

	Given Employee has a credit score 
	And according to bank standard
	When customer has part time work
	And in the govt office
	Then sanction Loan
	But should repay within 5 years
	
	
	

Scenario: To issue the loan for the customer who is full time private emp

	Given Employee has a credit score 
	And according to bank standard
	When customer has full time work
	And in the private office
	Then sanction Loan
	But should repay within 5 years