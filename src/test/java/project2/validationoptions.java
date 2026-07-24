package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class validationoptions  {
	
	
	
	public WebDriver driver; 
	
  @Test
  public void options () {
	  
	  

List<WebElement> allvalues = new Select(driver.findElement(By.id("daybox"))).getOptions();

System.out.println(allvalues.get(10).getText());

//Print all values from A to Z(Starting to ending)
for (int i = 12 ; i < allvalues.size(); i++) {

  System.out.println(allvalues.get(i).getText());
 
 
  //Checking comparison with equalIgnoreCase or Contains(ValidationProspective)
if (allvalues.get(i).getText().contains("Day")) {
 
  System.out.println(allvalues.get(i).getText());
  System.out.println("DAY its There Passed");
 
  }

 else {
 
 System.out.println("Not matches");
 
 }

  }
}
	 
  @BeforeTest
  public void beforeTest() {
	  
	 WebDriverManager.chromedriver().setup();
	  
	driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
