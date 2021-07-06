@logintesting
Feature: validate Techfios login functionality 

Background: 
	Given User is on the "Techfios" login page 
@otherscenario1
Scenario Outline: User should be able to login with the valid credentials 
	When user enters "<username>" and "<password>"  
	And user clicks signin button 
	Then User should land on Dashboard page  
	Examples:
	|username         |password|
	|demo@techfios.com|abc123  |
	
	
	
	
