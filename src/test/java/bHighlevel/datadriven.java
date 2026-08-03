package bHighlevel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class datadriven {
	
	public WebDriver driver ;
	
  public void f() throws Exception {
	  
	  

		FileInputStream fi =  new FileInputStream("C:\\Users\\stini\\OneDrive\\Desktop\\mangoo1.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Reddy");
		
		
		driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());
	Thread.sleep(10000);
	driver.findElement(By.name("commit")).click();

		
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://github.com/login?return_to=%2Flogins");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
