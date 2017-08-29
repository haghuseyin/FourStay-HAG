package com.herokuapp.tables;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fourstay.utilities.ConfigurationReader;
import com.fourstay.utilities.Driver;

public class EmployeesTableTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		driver=Driver.getInstance();
		driver.get(ConfigurationReader.getProperty("herokuUrl"));
	}
	
	//@Test
	public void test() {
		WebElement webtable1=driver.findElement(By.id("table1"));
		List<WebElement> rows1=webtable1.findElements(By.tagName("tr"));
		System.out.println("Rows1: "+rows1.size());
		
		WebElement webtable2=driver.findElement(By.id("table2"));
		List<WebElement> rows2=webtable2.findElements(By.tagName("tr"));
		System.out.println("Rows2: "+rows2.size());
		
		List<WebElement> cells1=rows1.get(0).findElements(By.tagName("th"));
		System.out.println(cells1.get(0).getText());
		System.out.println(cells1.get(1).getText());
		
		WebElement firstCell=driver.findElement
				(By.xpath("//table[@id='table1']//tr[1]/th[1]"));
		System.out.println(firstCell.getText());
		
	}
	
	/***************************************************************/
	
	//@Test
	public void loopWebTables(){
		
		WebElement tablex=driver.findElement(By.id("table1"));
		
		List<WebElement> rowsx=tablex.findElements(By.tagName("tr"));	
			for (WebElement row : rowsx) {
				List<WebElement> cellsx=row.findElements(By.tagName("td"));
				for (WebElement cell : cellsx) {
					System.out.print(cell.getText()+" | ");
				}
				System.out.println();
			}
			
	}
	
	/***************************************************************/
		
	//@Test
	public void xpathloop(){
		
		for (int rownum = 0; rownum <=4; rownum++) {
			
			for (int cellnum=0; cellnum<=6; cellnum++) {
				String cellValue=driver.findElement(By.xpath(
						"//table[@id='table2']/tbody/tr["+rownum+"]/td["+cellnum+"]")).getText();
				System.out.println(cellValue+" | ");
			}
			System.out.println();
		}
		
	}
	
	@Test
	public void greyHoundCalendar() throws InterruptedException{
		
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker-from")).click();
		Thread.sleep(1234);
		WebElement augustFirst=driver.findElement(
		By.xpath("//div[@id='datefrom-datepicker']//table//td[@data-speak-value='Tuesday August 1 2017']"));
		augustFirst.click();
		
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
