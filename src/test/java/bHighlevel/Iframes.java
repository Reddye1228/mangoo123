package bHighlevel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Iframes {
	
	public WebDriver driver ;
	public Actions action ;
	
  @Test
  public void clickable ()  throws Exception {
	  
	  // iframe concept 
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	 // web element 
	 WebElement dragfrom =  driver.findElement(By.id("draggable"));
	 // web element
	 WebElement dragto = driver.findElement(By.id("droppable")) ;
	 
	 // using action class 
	 action = new Actions(driver);
	 action.dragAndDrop(dragfrom, dragto).build().perform();
	 
	 //back to frame 
	 driver.switchTo().parentFrame();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Demos")).click();
  }
  
  @BeforeTest
  public void beforeTest()  throws Exception {
	  
	  
	  WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/droppable/");
	 Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
