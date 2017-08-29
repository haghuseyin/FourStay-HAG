package com.fourstay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class SearchPage {
	
	public SearchPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(id = "iLocName")
	public WebElement schoolName;	
	
	@FindBy(id = "rentoutfrom2")
	public WebElement startDate;	
	
	@FindBy(id = "rentoutto2")
	public WebElement endDate;	
	
	@FindBy(css="#search")
	public WebElement searchBtn;

}
