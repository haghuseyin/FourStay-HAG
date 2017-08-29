package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class EditProfile {
	public EditProfile() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//input[@ng-model='$parent.other.FirstName']")
	public WebElement accountFirstName;
	
	@FindBy(xpath="//input[@ng-model='$parent.other.LastName']")
	public WebElement accountLastName;
	
	@FindBy(xpath="//input[@ng-model='$parent.other.email']")
	public WebElement accountEmail;
	
	@FindBy(xpath="//input[@ng-model='$parent.profile.general.phone']")
	public WebElement accountPhoneNumber;

}
