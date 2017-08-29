package com.fourstay.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {
	WebDriver driver;

	// You can implement missing steps with the snippets below:

	@Given("^the user is on fourstay home page$")
	public void the_user_is_on_fourstay_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		
		System.out.println("The user is on the Home Page");
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/huseyin.ag/Documents/Libraries/drivers/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://fourstay.herokuapp.com/");
	}

	@When("^the user clicks on the login link$")
	public void the_user_clicks_on_the_login_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		
		System.out.println("The user is clicking on the link");
		
		driver.findElement(By.cssSelector(".not-login")).click();;
	
	}

	@Then("^the email field should be displayed$")
	public void the_email_field_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		
		// System.out.println("Email field is now displayed");
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
	}

}
