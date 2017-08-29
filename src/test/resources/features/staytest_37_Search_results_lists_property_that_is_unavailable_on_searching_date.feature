@Staytest_37
Feature: As a user I should be able to search stay for the a specified date range 
	So that the result lists only stays that are available of those days
	
Scenario: User specifies location, day in, day out and number of beds while searching for 
	the stay. The result page gives a list of stays based on search criteria. 
	Only those stays that meet all searching criteria should be listed on result page
	
	#Steps to reproduce:
	Given Navigate to http://fourstay.herokuapp.com/ 
	When Input search criteria, specify date in(03/01/2018) and date out(03/02/2018) and click search 
	Then Result page will give a list of stays that meet searching criteria 
	
	#	Expected result:
	#	There should be no stay listed due to date range not meeting the searching criteria
	#	Actual result:
	#	Result list contains stays that are not available for specified date range