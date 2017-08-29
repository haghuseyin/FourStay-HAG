Feature: Verify that first name, last name, and the phone number 
	for each user is correctly displayed in General Account Settings 
	in Four Stay for the users you are given.
	
Background: 
	Given I am on the fourstay login dialog 
	
@Assignment
Scenario Outline: FourStay db testing 

	And I enter email "<email>" 
	And I enter password "<password>"
	And I click on the login button
	When the user goes the account details page
	Then the user account details should match with db
	
	
	Examples: 
		| email                 | password |
		| sking@testmail.com    | password |
#		| dlorentz@testmail.com | password |
#		| daustin@testmail.com  | password |
#		| isciarra@testmail.com | password |	
#		| imikkili@testmail.com | password |
#		| jnayer@testmail.com	| password |
		| shiggins@testmail.com | password |
#		| acabrio@testmail.com  | password |
#		| rperkins@testmail.com | password |
#		| doconnel@testmail.com | password |