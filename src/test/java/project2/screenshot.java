package project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class screenshot {
	
	
	public WebDriver driver;
	@Test
  public void alertscreen () throws Exception {
	  
	 
      
		String ATM1 = "YSR"; 
			 
	 File scrfFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(scrfFile1,new File("C:\\Users\\stini\\OneDrive\\Desktop\\testing java\\"+ATM1+".png"));
	// FileHandler.copy(scrfFile,
		   //     new File("C:\\Users\\stini\\OneDrive\\Desktop\\testing java\\ycp.png"));
	 
	 
	// click button
	driver.findElement(By.id("alertButton")).click();
	
	String str = driver.switchTo().alert().getText();
	System.out.println(str);
	
	 Thread.sleep(2000);
	 //handlingalert 
	 
	 driver.switchTo().alert().accept();
	 
	 
	 String ATM2 = "Esreddy"; 
	 
	 File scrfFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(scrfFile2,new File("C:\\Users\\stini\\OneDrive\\Desktop\\testing java\\"+ATM2+".png"));
	
	
	
	String ATM3 = "JaganReddy"; 
	 
	 File scrfFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(scrfFile3,new File("C:\\Users\\stini\\OneDrive\\Desktop\\testing java\\"+ATM3+".png"));
	  
  }
	
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	 driver.get("https://demoqa.com/alerts"); 
	 Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  
	  
	  
	  String ATM4 = "Maheshbabu"; 
		 
		 File scrfFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrfFile4,new File("C:\\Users\\stini\\OneDrive\\Desktop\\testing java\\"+ATM4+".png"));
  }

}
