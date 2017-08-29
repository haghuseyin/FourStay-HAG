#@regression 
Feature: Login functionality for different user types 
	As a user, when I go to the FourStay home page,
    I should be able to login as host or guest
	#@login
Scenario: Login as a host 
	Given I am on the fourstay homepage 
	When I login as a host 
	Then I should be able verify I am logged in 
	#@login	
Scenario: Login as a guest 
	Given I am on the fourstay homepage 
	When I login as a guest 
	Then I should be able verify I am logged in 
	
@login 
Scenario Outline: Login as a guest 
	Given I am on the fourstay homepage 
	When I login as a <type>
	Then I should be able verify I am logged in 
	
	Examples: 
		|type|
		|host|
		|guest|