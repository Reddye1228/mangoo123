package bHighlevel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScrollBar_Elementpgm20 {
	
	
	public WebDriver driver;
	
  @Test
  public void Scrollbutton () {
  
	 // Find element by link text and store in variable "Element" WebElement
  JavascriptExecutor js = (JavascriptExecutor)  driver;
  
  WebElement  element =  driver.findElement(By.linkText("Linux"));
  
  
  js.executeScript("arguments[0].scrollIntoView();", element);
  
  
  
  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
