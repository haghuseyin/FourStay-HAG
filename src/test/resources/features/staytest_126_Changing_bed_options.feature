@Staytest_125
Feature: Changing bed options

Scenario: Whenguest is looking at the search results, 
the search results should update if the user changes the number of beds

	And I enter school name "Georgetown university" 
	And I enter dates "07/29/2017" and "09/22/2017" 
	And I click the search button 
	When I change the number of beds
	Then the search results should update