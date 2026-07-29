package bHighlevel;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert1pgm {
	
	
public WebDriver driver;

  @Test
  public void fun() {
	  
	  
	 // correct title  "welcome : mercury  Tours "
	//  we are taking the title "mercury tours"make test fail
	  
	  
	//  String Actualtitle = "Mercury Tours"  ;
	//  String Expectedtitle = driver.getTitle();      // we want to fail test we use this sysntax 
	//  System.out.println(Expectedtitle);
	  
	  
	  String Expectedtitle = "Welcome: Mercury Tours";
	  String Actualtitle = driver.getTitle();               // we want to pass we use this   sysntax 
	  System.out.println(Actualtitle);
	  
	
	  
	  // 1 statement 
	  
	  System.out.println("Welcome to Selenium");
	  
	  // 2 statement 
	  Assert .assertEquals(Actualtitle, Expectedtitle);
	  
	  // 3 statement 
	  System.out.println(" Assertion starts here..");
	  
	  // 4 statement 
	  System.out.println("A blog software testers");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   
	   
	   driver.get("http://demo.guru99.com/test/newtours");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
