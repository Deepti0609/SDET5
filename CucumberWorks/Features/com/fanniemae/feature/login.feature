@Sanity
Feature: Login Feature

Scenario: login scenario for success 

	Given username and password
	# there shall be values which can be passed
	|login | pwd |accesslevel|
	|larry |larrypwd|manager|
	|harry |harrypwd|Admin|
	|peter |peterpwd|Associate|
	When login successful
	Then show inbox