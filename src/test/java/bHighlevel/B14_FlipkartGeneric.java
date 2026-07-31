package bHighlevel;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class  B14_FlipkartGeneric {
	
	
	public WebDriver driver;




	

	
	


   

	
	public void generic (String str)  throws Exception {
		
		driver.findElement(By.xpath(str)).click();
		Thread .sleep(3000);
	}
  @Test
  public void clickable () throws Exception {
	  
	 for (int i = 1; i <= 14; i++) {
		 

		    String str =
		    "//*[@id='container']/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[" 
		    + i +
		    "]/div/div/div/a/div/div/div[2]";
		
		    generic(str);
	//generic("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[+ i +]/div/div/div/a/div/div/div[2]");	 
		
	 }
	}  
	  
	  

  @BeforeTest
  public void beforeTest()  throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/?pageUID=1773461471572");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
	  // absoult xpath: /html[1]/body[1]/div[5]/div[1]/span[1]
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
  }

}
