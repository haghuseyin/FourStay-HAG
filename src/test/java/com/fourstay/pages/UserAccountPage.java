package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class UserAccountPage {

	public UserAccountPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(css=".user-name")
	public WebElement accountHolder;
	
	@FindBy(css=".user-name.ng-binding")
	public WebElement nameValue;
	
	@FindBy(xpath="//img[@class='ng-scope']")
	public WebElement logoutButton;
	
	@FindBy(xpath="//a[@href='#/profile/general']")
	public WebElement editProfileButton;
	
}
