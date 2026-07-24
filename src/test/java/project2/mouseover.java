package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mouseover {
	
	
	public WebDriver driver ;
	
	
	
  @Test
  public void handling () throws Exception {
	  
	  Actions action = new Actions(driver);
	 
	   WebElement  ele = driver.findElement(By.linkText("SwitchTo"));
	  Thread.sleep(2000);
	  // action command 
	  
	 
	   action.moveToElement(ele) .build().perform();
	  
	  driver.findElement(By.linkText("Windows")).click();
	  
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest()  throws Exception {
	  
	 
	  WebDriverManager .chromedriver().setup();
	  driver = new ChromeDriver() ;
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(4000);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
