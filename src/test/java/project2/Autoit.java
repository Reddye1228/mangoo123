package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Autoit {
	
	
	public WebDriver driver;
	
  @Test
  public void operation () throws Exception {
	  
	 // WebElement ele1 = (driver.findElement(By.xpath("//input[@id='uploadPicture']"))) ;
	      //       ele1.sendKeys("\"C:\\Users\\stini\\OneDrive\\Desktop\\data 1.xlsx\"");
	  
	  
	  WebElement ele1 = driver.findElement(By.id("uploadPicture"));

	  ele1.sendKeys("C:\\Users\\stini\\OneDrive\\Desktop\\data 1.xlsx");
	  Thread.sleep(2000);
	  
	  
  }
  @BeforeTest
  public void beforeTest()  throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
