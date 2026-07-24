package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class selectoption {
	
  public WebDriver driver;

  @Test
  public void Firstselectedop()  {
	  
	  WebElement  ele =  new Select (driver.findElement(By.id("daybox"))) .getFirstSelectedOption(); // defaut options we can use getfristselectionoption 
	  
	  System.out.println(ele.getText());
	  
	  
	  if (ele.getText().equalsIgnoreCase("Day")) {
		  
		  System.out.println("passsed");
		
	} else {
		System.out.println("not pass");

	}
	 
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
	  driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
