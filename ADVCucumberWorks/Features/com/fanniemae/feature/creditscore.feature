@Smoke
Feature: To Sanction Loan for the custormer


Background:

#all back grounds are pre condition
Given load chrome browser
# this is my comment

Scenario Outline: To issue the loan for the customer who is full time govt emp

	Given Employee has a credit score 
	And according to bank standard
	# we say full,part,contractor,consultant with timed variable
	When customer has "<timed>" time work
	# it shall be like govt,private or semigovt with officetype variable
	And in the "<officetype>" office
	Then sanction Loan
	#number of years to repay
	But should repay within "<noofyears>" years
	
	
Examples:
| timed | officetype |  noofyears   |
| full  | govt       |  25          |
| full  | private    |  22          |
| part  | govt       |  14          |
| part  | private    |  7           |




