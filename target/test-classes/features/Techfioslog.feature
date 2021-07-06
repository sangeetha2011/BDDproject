@tests12
Feature: validate Techfios login functionality 

Background: 
	Given User is on the "TechfiosNewAccount" login page 
@scenario1
Scenario: User should be able to login with the valid credentials 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc123" 
	And user clicks signin button 
	Then User should land on Dashboard page 
	@scenario2
Scenario: User should be able to login with the valid credentials 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc124" 
	And user clicks signin button 
	Then User should land on Dashboard page 
	@scenario3
Scenario: User should be able to login with the valid credentials 
	When user enters username as "demo2@techfios.com" 
	When user enters password as "abc124" 
	And user clicks signin button 
	Then User should land on Dashboard page 