package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean_oneway {
	
	
	public WebDriver driver;
	
	
	
  @Test
  public void options ()  throws Exception {
	  
	// switch to round trip 
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	  Thread.sleep(2000);
	  
	  //given condition true or false 
	  boolean printcondition = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
	  
	  System.out.println(printcondition);
	  
      WebElement ele1 =  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	  
	  
	  if (ele1.isEnabled()) {
		  
		  System.out.println("Round trip enable");
		
	} else {
		System.out.println("trip not passed ");

	}
    	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
