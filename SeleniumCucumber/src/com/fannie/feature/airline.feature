Feature: Travel between to locations 


Background: 
	Given Chrome Browser 
	When airline pom
	
Scenario Outline: 
	Given click on flights tab 
	And enter "<flyfrom>" the src location 
	And enter "<flyto>" the dest location 
	And enter depature date "<deaprtdate>" 
	And enter arrival date "<returning>"
	When click on search button 
	Then show the flight information 
	
	
Examples: 
|flyfrom		|flyto			|deaprtdate					|returning			|
|Washington, DC (WAS-All Airports)| San Francisco, CA (QSF-All Airports)| 06/17/2017|06/30/2017| 
|Washington, DC (WAS-All Airports)| San Francisco, CA (QSF-All Airports)| 07/17/2017|07/31/2017|