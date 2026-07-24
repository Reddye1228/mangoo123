package project2;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail {

 	public WebDriver driver ;
 	
@Test (priority = 1)
  public void accountcreate () throws InterruptedException  {
	  
	Thread.sleep(2000 );
	  driver.findElement(By.xpath("//div[@class='dropdown-gws-button variant-primary size-small align-right valign-below']//span[@class='button-label'][normalize-space()='Create an account']")) .click();
	  
	  driver.findElement(By.xpath("//div[@class='dropdown-gws-button variant-primary size-small align-right valign-below']//a[@aria-label='Gmail - For my personal use'][normalize-space()='For my personal use']")) .click();
	  
	  driver.findElement(By.id("firstName")).sendKeys("Srinivas");
	 
	  driver.findElement(By.id("lastName")).sendKeys("Reddy");
	 
	 driver.findElement(By.xpath("//span[normalize-space()='Next']")) .click();
	 
	Thread.sleep(3000); 
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div")) .click() ; // month 
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[2]/ul/li[12]")) .click(); // december 
		driver.findElement(By.id("day")) .sendKeys("12") ;
		driver.findElement(By.id("year")).sendKeys("1999") ;
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div[2]/div[1]/div[1]/div/div[1]/div")) .click(); // gender 
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div/span/section/div/div/div[2]/div[1]/div[1]/div/div[2]/ul/li[2]")) .click(); // male 
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[3]/div/div/div/div/button/span")) .click() ;
	  
		Thread .sleep(3000) ;
		           driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("esreddy4512"); 
		           driver.findElement(By.xpath("//span[normalize-space()='Next']")) .click() ;
		           
		       Thread .sleep(2000);
		           
	  driver.findElement(By.xpath("//input[@name='Passwd']")) .sendKeys("Reddy1228") ; // enter password field .
	
	 driver.findElement(By.xpath("//input[@name='PasswdAgain']")) .sendKeys("Reddy1228");
	 
	 driver.findElement(By.xpath("//span[normalize-space()='Next']")) .click();
		       
		       
		   
		       }
	  
  
  
  @Test (priority = 2)
	  public void login () {
	  
  }
	  
  
  @BeforeTest
  public void openurl () throws InterruptedException {
	  
	  Thread.sleep(2000);
	  WebDriverManager .chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://workspace.google.com/intl/en-US/gmail/"); 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
