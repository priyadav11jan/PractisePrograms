package ProgTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
	
	@Test
	public void Loginsuccess{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("");
		
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("");
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("");
		
		}
	
	@DataProvider
	public Object[][] fromexcel{
		
		
		
		
		
	}
	
}