@login
Feature: Validates TechFios Login functionality

Background:
 	Given User is on the Techfios login page  

 	Scenario Outline: User should be able to with login with valid credentials
 	When User enters "<userName>" and "<password>"   
 	Then User clicks on the signin button  
 	And User will land on the Dashboard page     
 	
 	Examples:
 	|    userName      |password|
 	|demo@techfios.com|abc123|