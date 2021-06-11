@Bank&Chash
Feature: Techfios bank and cash New Account Functionality

Background:
 	Given User is on Techfios login page   
 
 	Scenario Outline: User should be able login with valid credentials
 	When User enter "<userName>" and "<password>"  
 	And User clicks on signin button   
 	Then User will land on Dashboard page      
	When User clicks on bank and cash  
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>"
	And clicks on submit  
	Then User should be able to see validate   
 	
 	Examples:
 	|    userName     | password| accountTitle    |description|initialBalance|accountNumber|contactPerson|   phone    | internetBankingUrl |
 	|demo@techfios.com| abc123|Money Market Account |  Personal |$ 15,00,000.00|  1345845613 |  Mr.Vikani  |459-137-1313|  www.BOA.com |
 	
 	
 	
 	