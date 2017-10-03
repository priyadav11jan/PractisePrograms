

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login {
	
	WebDriver driver;
	
  @Test
  public void loginsuccess1() {
	  
	  
	  System.out.println("login is successfull");
	  
  }
  
  
  @Test
 public void loginfail() {
	  
	  
	  System.out.println("login is fail");
	  
  }
  
  
  @BeforeMethod
  public void precondition() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //setting path to the driver
	     
		driver =new ChromeDriver();//launching chrome
    
		
	  //Browser specific actions	
		driver.manage().window().maximize();
		driver.get("https://test.salesforce.com/");
	  System.out.println("Running Before Method");
	  
  }

  @AfterMethod
  public void postcondition() {
	  
	  driver.close();
	  
  }

}
