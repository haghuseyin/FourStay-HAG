package com.fourstay.step_definitions;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.fourstay.pages.SearchPage;
import com.fourstay.pages.SearchResultPage;
import com.fourstay.utilities.BrowserUtilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAcrossStatesStepDef {
	SearchPage searchPage = new SearchPage();

	@Given("^I enter school name \"([^\"]*)\"$")
	public void i_enter_school_name(String school) throws Throwable {
		searchPage.schoolName.sendKeys(school);
	}

	@Given("^I enter dates \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_dates_and(String start, String end) throws Throwable {
		searchPage.startDate.sendKeys(start);
		searchPage.endDate.sendKeys(end);
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
//		WebDriverWait wait=new WebDriverWait(Driver.getInstance(), 50);	
//		wait.until(ExpectedConditions.elementToBeClickable(searchPage.searchBtn));
		searchPage.searchBtn.click();
		
	}

	@Then("^the results should contain$")
	public void the_results_should_contain(List<String> states) throws Throwable {
		BrowserUtilities.switchTabs("search");
		BrowserUtilities.waitForPageLoad();
		
		SearchResultPage result=new SearchResultPage();
		Set<String> actualStates=new HashSet<>();
		for (WebElement element : result.allstates) {
			actualStates.add(element.getText());
		}
		
		Assert.assertTrue(actualStates.containsAll(states));
				
	}
	
	@When("^I enter this search criteria$")
	public void i_enter_this_search_criteria(
					List<Map<String,String>> searchCriteria) throws Throwable {
		
	    Map<String, String> input=searchCriteria.get(0);
	    
	    searchPage.schoolName.sendKeys(input.get("school"));
	    searchPage.startDate.sendKeys(input.get("start"));
	    searchPage.endDate.sendKeys(input.get("end"));
	    searchPage.searchBtn.click();
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
