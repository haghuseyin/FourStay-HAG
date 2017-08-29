package com.fourstay.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
	
	//waitForPageLoad after login
	public static void waitForPageLoad(){
		WebDriverWait wait=new WebDriverWait(Driver.getInstance(), 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(
				By.cssSelector("div.se-pre-con")));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchTabs(String url){
		String defaultTab=Driver.getInstance().getWindowHandle();
		for (String windowhandle : Driver.getInstance().getWindowHandles()) {
			Driver.getInstance().switchTo().window(windowhandle);
			if (Driver.getInstance().getCurrentUrl().contains(url)) {
				return;
			}
		}
		Driver.getInstance().switchTo().window(defaultTab);
	}

}
