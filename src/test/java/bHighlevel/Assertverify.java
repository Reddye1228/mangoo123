package bHighlevel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.desktop.QuitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assertverify {
	//b[normalize-space()='$398']
	
	public WebDriver driver;
  @Test
  public void f() {
	  
	  
	  String  Actucalvalue ="$3";
		String Expectedvalue =
			
	driver.findElement(By.xpath("//b[normalize-space()='$398']")) .getText();
	  System.out.println(Expectedvalue);
	//  String  Actucalvalue ="$3";
			  
	  try {
		  
		  
		  //  1 statement  
		  
		  System.out.println("Assertation starts here.....");
		  //  2 statement 
		  System.out.println("Reddy");
		  // 3 ststement 
		  
		  Assert.assertEquals(Actucalvalue,Expectedvalue);
		//  4 statement 
		  System.out.println("beetroot");
		  // 5 ststement
		  
		System.out.println("Ablog starts here ");
	} catch (Throwable e) {
		 System.out.println("Inside Catch Block"); 
  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new  ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}



// output : aseert values given same  assert pass  it excute all steps 
//$398
//Assertation starts here.....
//Reddy
//beetroot
//Ablog starts here
//PASSED: bHighlevel.Assertverify.f

//output : aseert  values given different  assert fail 
//but it goes into catch and excute the code  & wont print  step 4&5 
//$398
//Assertation starts here.....
//Reddy
//Inside Catch Block
//PASSED: bHighlevel.Assertverify.f
//
//

