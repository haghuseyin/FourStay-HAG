package actionsAndJavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/huseyin.ag/Documents/Libraries/drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*File Upload*/
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement el=driver.findElement(By.id("file-upload"));	
		el.sendKeys("/Users/huseyin.ag/Documents/dunya.jpg");	
		WebElement btn=driver.findElement(By.id("file-submit"));
		btn.click();
		
		/*
		 * Actions
		 */
		
		/*Mouse Hover*/
		driver.get("https://www.amazon.com/");		
		WebElement menu=driver.findElement(By.id("nav-link-accountList"));	
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		
		/*Double Click*/
		driver.get("http://primefaces.org/showcase/ui/misc/effect.xhtml");
		WebElement dclk=driver.findElement(By.id("puff_content"));	
		actions.doubleClick(dclk).perform();
		
		/*Drag and Drop*/
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));	
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));	
		actions.dragAndDrop(source, target).perform();
		
		/* or you can do:
		actions.moveToElement(source).clickAndHold().
								moveToElement(target).release().build();
		*/
		
		
		/*Scroll to Element*/
		driver.get("https://the-internet.herokuapp.com/");
		WebElement scroll=driver.findElement(By.linkText("Elemental Selenium"));
		//actions.moveToElement(scroll).perform();
		
		/* or you can use JavaScript: */
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		//higlighting element using javascript
		js.executeScript("arguments[0].style.border='3px solid red'", scroll);
		
		
		Thread.sleep(8000);
		driver.quit();

	}

}
