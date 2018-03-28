@tag
Feature: I want to use this template for google actions 

@tag1
Scenario Outline: Validate google actions
	Given I want to write a step with google actions "<value>"
	When I want step for google actions "<value>"
	Then I verify the search word "<value>"
	
	Examples: 
		|value|
        |Selenium|
		|Cucumber|
		|TestNg|
		