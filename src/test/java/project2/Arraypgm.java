package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Arraypgm {
	
	
	
	public WebDriver driver;
  @Test
  public void  functionality ()  throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  Thread.sleep(3000); 
	  
	  String str = driver.findElement(By.xpath("//ul[@role='listbox'][1]")).getText();
//	  String str = driver.findElement(By.xpath("//ul[@role='listbox']")).getText();
	  System.out.println(str);
	  System.out.println(str.length());
	  
	  String a[] = str.split("\n");          // in this string value include as str.split 
	                                          
	  
	  for (int i = 0; i < a.length; i++) {  // inthis array index start from 0t01  
		  
		if (a[i] .equalsIgnoreCase("selenium rich foods")) {
			
			driver.findElement(By.name("q")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(a[i]);
			Thread.sleep(3000);
			System.out.println(a[i]);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			break;
		}
		driver.findElement(By.name("q")).clear();

		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys(a[i]);
		Thread.sleep(3000);
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(" https://www.google.com/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
