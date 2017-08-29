package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class HomePage {
	
	public HomePage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(css=".btn.menu.btn-log.zl-margin.not-login")
	public WebElement loginLink;
	
	@FindBy(css="#email")
	public WebElement email;
	
	@FindBy(css="#key")
	public WebElement password;
	
	@FindBy(css="#btn-login")
	public WebElement loginBtn;
	
	@FindBy(css=".page-btn.list-your-stay")
	public WebElement logoutBtn;
	
	@FindBy(xpath="//li[@class='btn menu btn-log zl-margin not-login'][2]")
	public WebElement signUp;
	
	//@FindBy(css="#FirstName")
	public WebElement FirstName;
	
	public WebElement LastName;
	
	@FindBy(xpath="(//input[@type='Email'])[3]")
	public WebElement signUpEmail;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	public WebElement signUpPassword;
	
	@FindBy(css="#btn-signup")
	public WebElement signUpButton;
	
	
	
	

}
