@Staytest_36 
Feature: As a guest I should be able to see prices on the stay 
	So that stay meets my price requirements And I can decide 
	which property I should rent based on price shown on result page

Scenario: Whenguest searches for a stay, guest should be able to see 
	pricing of the stay on the result page. The result page contains only 
	one stay that has a price tag on it.

	#Step to reproduce:
	Given Navigate to http://fourstay.herokuapp.com/ 
	And Login using valid username and password 
	When Input search criteria and click on search button 
	Then Result page will be opened with stays meeting search criteria 
	
	#	Expected result:
	#	All stays on result list have price tag
	#	Actual result:
	#	Only some of the listings have price tag.
	
