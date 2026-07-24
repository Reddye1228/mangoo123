package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationcc {
	
	
	
	public WebDriver driver ;
	
	
	
	
	
  @Test(priority = 1)
  public void  gmail ()   {
	  
// gmail button 
	 String str1  = driver.findElement(By.linkText("Gmail")).getText();
	System.out.println(str1);
	//Thread.sleep(3000);
  }  
  
  
  
	@Test (priority = 2)
  public void suchbutton () {
		
		String str2 = driver.findElement(By.name("btnK")).getAttribute("value");
	  System.out.println(str2);
  }
  
  @BeforeTest
  public void beforeTest()    {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  
	 // Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
