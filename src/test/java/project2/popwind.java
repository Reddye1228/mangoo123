package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class popwind {
	
	public WebDriver driver;
	
	
	
	
	
	
	
  @Test
  public void windospop   ()  throws Exception {
	  
	  //click seperate window 
	  driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	  
	  // click a button 
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  
	  
	  
	  // come back to parent window 
	  String backtoParentwinow = driver.getWindowHandle();
	  
	 // handling child window 
	 
	  for(String childwindowandle : driver.getWindowHandles()) {
		  
		  //Switch to Child window 
		 driver.switchTo().window(childwindowandle);
		  
		 
		  }
	  
	  driver.manage().window().maximize(); 	 	
	  
	 Thread.sleep(3000);

		// Clicks on Blog_Button
		driver.findElement(By.xpath("//span[normalize-space()='Blog']")).click();
      Thread.sleep(3000);
     
      //Child window closed
		driver.close();
		
		Thread.sleep(3000);

		// Again Switch focus back to Parent window
		driver.switchTo().window(backtoParentwinow);
        Thread.sleep(10000);

		// Clicks on Home_Button
       driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(3000);
 
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(4000);
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
