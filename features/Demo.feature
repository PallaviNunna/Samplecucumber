@tag
Feature: I want to use this template for google actions 

@tag6
Scenario Outline: Validate google actions
	Given I want to write a step for demoqa
	When I want step for  "<fname>" "<lname>"
	Then I verify and validate demoqa
	
	Examples: 
		|fname|lname|
		|pallavi|nunna|
		|ashok|mallela|
		
		