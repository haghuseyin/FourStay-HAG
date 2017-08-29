package com.fourstay.step_definitions;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.fourstay.pages.HomePage;
import com.fourstay.pages.UserAccountPage;
import com.fourstay.utilities.BrowserUtilities;
import com.fourstay.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FullNameDisplayStepDef {
	WebDriver driver=Driver.getInstance();
	HomePage hp=new HomePage();
	UserAccountPage uap=new UserAccountPage();
	String firstName;
	String lastName;
	
	@Given("^the user is on the FourStay sign up dialog$")
	public void the_user_is_on_the_FourStay_sign_up_dialog() 
			throws Throwable {
		hp.signUp.click();
	   
	}

	@Given("^the user enters enter first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
	public void the_user_enters_enter_first_name_and_last_name(String firstname, String lastname) 
			throws Throwable {
		firstName=firstname;
		lastName=lastname;
		
		hp.FirstName.sendKeys(firstname);
		hp.LastName.sendKeys(lastname);
	}

	@Given("^the user enters any unregistered email and password$")
	public void the_user_enters_any_unregistered_email_and_password() 
			throws Throwable {
		hp.signUpEmail.sendKeys(randomEmail());
		hp.signUpPassword.sendKeys("password123");
		
		Thread.sleep(3000);
	}

	@Given("^click on the Sign up button$")
	public void click_on_the_Sign_up_button() throws Throwable {
	    hp.signUpButton.click();
	}

	@When("^the user goes the account details page$")
	public void the_user_goes_the_account_details_page() throws Throwable {
		BrowserUtilities.waitForPageLoad();
		//Assert.assertTrue(uap.nameValue.isDisplayed());
		uap.logoutButton.click();
		Thread.sleep(2000);
		uap.editProfileButton.click();
		
	   
	}

	@Then("^first name \"([^\"]*)\" and last name \"([^\"]*)\" should be displayed in the right fields$")
	public void first_name_and_last_name_should_be_displayed_in_the_right_fields(String arg1, String arg2) 
			throws Throwable {
		String fullName=firstName+" "+lastName;
		Assert.assertEquals(fullName, uap.nameValue.getText());
	}
	
	
	
	public static String randomEmail(){
		String myEmail=LocalDateTime.now().toString().
						replaceAll("-", "").replaceAll(":", "").replaceAll("\\.", "");
		return myEmail+"JohnSmith@gmail.com";
	}


}
